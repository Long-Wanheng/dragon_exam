package com.dragon.mapper;

import com.dragon.model.dto.SubjectDTO;
import org.apache.ibatis.annotations.Param;

import javax.security.auth.Subject;
import java.util.List;

/**
 * SubjectMapper
 *
 * @author : 龙万恒
 * @version :v1.0
 * @date : 2019-11-24 01:41
 */
public interface SubjectMapper {

    /**
     * 获取所有科目
     *
     * @return 科目信息集合
     */
    List<Subject> getAllSubject();

    /**
     * 添加科目
     *
     * @param subject 科目实体类
     * @return 添加条数
     */
    int addSubject(@Param("subject") SubjectDTO subject);

    /**
     * 修改科目
     *
     * @param subject 科目实体类
     * @return 修改条数
     */
    int updateSubject(@Param("subject") SubjectDTO subject);

    /**
     * 删除科目
     *
     * @param id 科目实体类
     * @return 删除条数
     */
    int deleteSubject(@Param("id") Integer id);

}
