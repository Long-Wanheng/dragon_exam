package com.dragon.service;

import com.dragon.model.dto.ExamLogDTO;
import com.dragon.model.query.ExamLogQuery;
import com.dragon.model.vo.ExamLogVO;
import com.dragon.utils.TableData;

/**
 * ExamLogService
 *
 * @author : 龙万恒
 * @version :v1.0
 * @date : 2019-11-24 03:06
 */
public interface ExamLogService {
    /**
     * 根据查询条件查询考试记录
     *
     * @param query 查询条件
     * @return 考试记录集合
     */
    TableData<ExamLogVO> queryExamLog(ExamLogQuery query);

    /**
     * 根据id查询考试记录
     *
     * @param id 查询条件
     * @return 考试记录信息
     */
    ExamLogVO selectById(Long id);

    /**
     * 添加考试记录
     *
     * @param examLogDTO 考试记录
     * @return 是否添加成功
     */
    boolean addExamLog(ExamLogDTO examLogDTO);

    /**
     * 修改考试记录
     *
     * @param examLogDTO 考试记录
     * @return 是否修改成功过
     */
    boolean updateExamLog(ExamLogDTO examLogDTO);

    /**
     * 根据id删除考试记录
     *
     * @param id 主键id
     * @return 是否删除成功
     */
    boolean deleteExamLog(Long id);
}
