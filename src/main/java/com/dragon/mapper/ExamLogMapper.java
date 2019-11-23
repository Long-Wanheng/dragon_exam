package com.dragon.mapper;

import com.dragon.model.dto.ExamLogDTO;
import com.dragon.model.query.ExamLogQuery;
import com.dragon.model.vo.ExamLogVO;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * ExamLogMapper
 *
 * @author : 龙万恒
 * @version :v1.0
 * @date : 2019-11-24 02:33
 */
public interface ExamLogMapper {

    /**
     * 根据查询条件查询考试记录
     *
     * @param query 查询条件
     * @return 考试记录集合
     */
    List<ExamLogVO> queryExamLog(@Param("log") ExamLogQuery query);

    /**
     * 根据id查询考试记录
     *
     * @param id 查询条件
     * @return 考试记录信息
     */
    ExamLogVO selectById(@Param("id") Long id);

    /**
     * 添加考试记录
     *
     * @param examLogDTO 考试记录
     * @return 添加条数
     */
    int addExamLog(@Param("log") ExamLogDTO examLogDTO);

    /**
     * 修改考试记录
     *
     * @param examLogDTO 考试记录
     * @return 修改条数
     */
    int updateExamLog(@Param("log") ExamLogDTO examLogDTO);

    /**
     * 根据id删除考试记录
     *
     * @param id 主键id
     * @return 删除条数
     */
    int deleteExamLog(@Param("id") Long id);
}
