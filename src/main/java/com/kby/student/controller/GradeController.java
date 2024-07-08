package com.kby.student.controller;

import com.kby.student.entity.Grade;
import com.kby.student.service.GradeService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.util.List;

/**
 * <p>
 *
 * @author jiang
 * @version 1.0
 * @since 2024/7/1 16:38
 */
@Controller
@RequestMapping("/grade")
@ResponseBody
public class GradeController {

    @Resource
    private GradeService gradeService;

    @RequestMapping(value = "/query", method = RequestMethod.GET)
    public List<Grade> query(){
        return gradeService.query();
    }

}
