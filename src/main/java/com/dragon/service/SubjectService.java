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
     * @return 是否添加成功
     */
    boolean addSubject(SubjectDTO subject);

    /**
     * 修改科目
     *
     * @param subject 科目实体类
     * @return 是否修改成功过
     */
    boolean updateSubject(SubjectDTO subject);

    /**
     * 删除科目
     *
     * @param id 科目实体类
     * @return 是否删除成功
     */
    boolean deleteSubject(Long id);
}
