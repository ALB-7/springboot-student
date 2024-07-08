package com.kby.student.service.impl;

import com.kby.student.entity.Grade;
import com.kby.student.mapper.GradeMapper;
import com.kby.student.service.GradeService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * <p>
 *
 * @author jiang
 * @version 1.0
 * @since 2024/7/1 16:41
 */
@Service
public class GradeServiceImpl implements GradeService {

    @Resource
    private GradeMapper gradeMapper;

    @Override
    public List<Grade> query() {
        return gradeMapper.query();
    }
}
