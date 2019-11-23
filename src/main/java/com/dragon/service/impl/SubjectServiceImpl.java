package com.dragon.service.impl;

import com.dragon.exception.DragonException;
import com.dragon.mapper.SubjectMapper;
import com.dragon.model.dto.SubjectDTO;
import com.dragon.model.dto.UserDTO;
import com.dragon.service.SubjectService;
import com.dragon.utils.UserUtils;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.security.auth.Subject;
import java.util.Date;
import java.util.List;
import java.util.Optional;

/**
 * SubjectServiceImpl
 *
 * @author : 龙万恒
 * @version :v1.0
 * @date : 2019-11-24 02:00
 */
@Service
public class SubjectServiceImpl implements SubjectService {

    @Autowired
    private SubjectMapper subjectMapper;

    @Override
    public List<Subject> getAllSubject() {
        return subjectMapper.getAllSubject();
    }

    @Override
    public boolean addSubject(SubjectDTO subject) {
        if (null == subject || StringUtils.isBlank(subject.getName())) {
            throw new DragonException("参数错误");
        }
        if (StringUtils.isBlank(subject.getRemark())) {
            subject.setRemark("暂无");
        }
        if (null == subject.getPayment() || subject.getPayment() < 0) {
            subject.setPayment(0);
        }
        Optional<UserDTO> optionalUser = UserUtils.getCurrentUser();
        UserDTO currentUser = optionalUser.get();
        subject.setCreateUser(currentUser.getNickName());
        subject.setCreateTime(new Date());
        subject.setUpdateTime(new Date());
        return subjectMapper.addSubject(subject) > 0;
    }

    @Override
    public boolean updateSubject(SubjectDTO subject) {
        if (null == subject.getId() || subject.getId() <= 0) {
            throw new DragonException("参数异常");
        }
        Optional<UserDTO> optionalUser = UserUtils.getCurrentUser();
        UserDTO currentUser = optionalUser.get();
        subject.setUpdateUser(currentUser.getNickName());
        subject.setUpdateTime(new Date());
        return subjectMapper.updateSubject(subject) > 0;
    }

    @Override
    public boolean deleteSubject(Long id) {
        if (null == id || id <= 0) {
            throw new DragonException("参数异常");
        }
        return subjectMapper.deleteSubject(id) > 0;
    }
}
