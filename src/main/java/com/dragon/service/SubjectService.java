package com.dragon.service;

import com.dragon.model.dto.SubjectDTO;

import javax.security.auth.Subject;
import java.util.List;

/**
 * SubjectService
 *
 * @author : 龙万恒
 * @version :v1.0
 * @date : 2019-11-24 02:00
 */
public interface SubjectService {

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
    boolean addSubject(SubjectDTO subject);

    /**
     * 修改科目
     *
     * @param subject 科目实体类
     * @return 修改条数
     */
    boolean updateSubject(SubjectDTO subject);

    /**
     * 删除科目
     *
     * @param id 科目实体类
     * @return 删除条数
     */
    boolean deleteSubject(Integer id);
}
