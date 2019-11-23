package com.dragon.controller;

import com.dragon.model.dto.SubjectDTO;
import com.dragon.service.SubjectService;
import com.dragon.utils.ResultSet;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * SubjectController
 *
 * @author : 龙万恒
 * @version :v1.0
 * @date : 2019-11-24 02:12
 */
@RestController
@RequestMapping("/subject")
public class SubjectController {
    @Autowired
    private SubjectService subjectService;

    @RequestMapping("/all")
    public ResultSet all() {
        return ResultSet.view(subjectService.getAllSubject());
    }

    @RequestMapping("/add")
    public ResultSet add(@RequestBody SubjectDTO subject) {
        return ResultSet.view(subjectService.addSubject(subject));
    }

    @RequestMapping("/update")
    public ResultSet update(@RequestBody SubjectDTO subject) {
        return ResultSet.view(subjectService.updateSubject(subject));
    }

    @RequestMapping("/delete")
    public ResultSet delete(Long id) {
        return ResultSet.view(subjectService.deleteSubject(id));
    }
}
