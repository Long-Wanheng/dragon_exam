package com.dragon.controller;

import com.dragon.model.dto.ExamLogDTO;
import com.dragon.model.query.ExamLogQuery;
import com.dragon.model.vo.ExamLogVO;
import com.dragon.service.ExamLogService;
import com.dragon.utils.ResultSet;
import com.dragon.utils.TableData;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * ExamLogController
 *
 * @author : 龙万恒
 * @version :v1.0
 * @date : 2019-11-24 03:17
 */
@RestController
@RequestMapping("/examLog")
public class ExamLogController {

    @Autowired
    private ExamLogService examLogService;

    @RequestMapping("/list")
    public TableData<ExamLogVO> list(@RequestBody ExamLogQuery query) {
        return examLogService.queryExamLog(query);
    }

    @RequestMapping("/getById")
    public ResultSet selectById(Long id) {
        return ResultSet.view(examLogService.selectById(id));
    }

    @RequestMapping("/add")
    public ResultSet add(@RequestBody ExamLogDTO examLogDTO) {
        return ResultSet.view(examLogService.addExamLog(examLogDTO));
    }

    @RequestMapping("/update")
    public ResultSet update(@RequestBody ExamLogDTO examLogDTO) {
        return ResultSet.view(examLogService.updateExamLog(examLogDTO));
    }

    @RequestMapping("/delete")
    public ResultSet delete(@RequestBody ExamLogDTO examLogDTO) {
        return ResultSet.view(examLogService.deleteExamLog(examLogDTO.getId()));
    }
}
