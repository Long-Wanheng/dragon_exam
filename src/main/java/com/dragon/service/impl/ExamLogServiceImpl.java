package com.dragon.service.impl;

import com.dragon.exception.DragonException;
import com.dragon.mapper.ExamLogMapper;
import com.dragon.model.dto.ExamLogDTO;
import com.dragon.model.dto.UserDTO;
import com.dragon.model.query.ExamLogQuery;
import com.dragon.model.vo.ExamLogVO;
import com.dragon.service.ExamLogService;
import com.dragon.utils.TableData;
import com.dragon.utils.UserUtils;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;
import java.util.Optional;

/**
 * ExamLogServiceImpl
 *
 * @author : 龙万恒
 * @version :v1.0
 * @date : 2019-11-24 03:06
 */
@Service
public class ExamLogServiceImpl implements ExamLogService {

    @Autowired
    private ExamLogMapper examLogMapper;

    @Override
    public TableData<ExamLogVO> queryExamLog(ExamLogQuery query) {
        TableData<ExamLogVO> result = new TableData<>();
        PageHelper.startPage(query.getPageNum(), query.getPageSize());
        List<ExamLogVO> data = examLogMapper.queryExamLog(query);
        result.setData(data);
        result.setCount(((Page) data).getTotal());
        result.setPageNum(query.getPageNum());
        result.setPageSize(query.getPageSize());
        return result;
    }

    @Override
    public ExamLogVO selectById(Long id) {
        if (null == id || id <= 0) {
            throw new DragonException("参数异常");
        }
        return examLogMapper.selectById(id);
    }

    @Override
    public boolean addExamLog(ExamLogDTO examLogDTO) {
        if (null == examLogDTO || examLogDTO.getStatus() == null || StringUtils.isBlank(examLogDTO.getStuName()) ||
                examLogDTO.getSubId() == null || examLogDTO.getSubId() <= 0 ||
                examLogDTO.getStatus() < 0 || examLogDTO.getExamTime() == null) {
            throw new DragonException("参数错误!");
        }
        if (StringUtils.isBlank(examLogDTO.getRemark())) {
            examLogDTO.setRemark("暂无");
        }
        Optional<UserDTO> optionalUser = UserUtils.getCurrentUser();
        UserDTO currentUser = optionalUser.get();
        examLogDTO.setCreateUser(currentUser.getNickName());
        examLogDTO.setCreateTime(new Date());
        examLogDTO.setUpdateTime(new Date());
        return examLogMapper.addExamLog(examLogDTO) > 0;
    }

    @Override
    public boolean updateExamLog(ExamLogDTO examLogDTO) {
        if (null == examLogDTO.getId() || examLogDTO.getId() <= 0) {
            throw new DragonException("参数错误!");
        }
        Optional<UserDTO> optionalUser = UserUtils.getCurrentUser();
        UserDTO currentUser = optionalUser.get();
        examLogDTO.setUpdateUser(currentUser.getNickName());
        examLogDTO.setUpdateTime(new Date());
        return examLogMapper.updateExamLog(examLogDTO) > 0;
    }

    @Override
    public boolean deleteExamLog(Long id) {
        if (null == id || id <= 0) {
            throw new DragonException("参数异常");
        }
        return examLogMapper.deleteExamLog(id) > 0;
    }
}
