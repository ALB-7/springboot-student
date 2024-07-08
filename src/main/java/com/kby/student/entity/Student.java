package com.kby.student.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.*;

/**
 * <p>
 *
 * @author jiang
 * @version 1.0
 * @since 2024/6/24 15:55
 */
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@TableName("student")
public class Student {
@TableId(type = IdType.AUTO)
    private Integer studentNo;

    private String studentName;

    private String loginPwd;

    private String sex;

    private Integer gradeId;

    private String gradeName;

    private String phone;

    private String address;



}
