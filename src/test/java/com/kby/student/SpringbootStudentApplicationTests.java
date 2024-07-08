package com.kby.student;

import com.kby.student.entity.Student;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.redis.core.RedisTemplate;

import javax.annotation.Resource;

@SpringBootTest
class SpringbootStudentApplicationTests {


    @Resource
    private RedisTemplate redisTemplate;

    @Test
    public void test() {
        Student zhangSan = Student.builder().studentNo(10000).studentName("张三").phone("123123123").build();
        redisTemplate.opsForValue().set("zs",zhangSan);

        System.out.println(redisTemplate.opsForValue().get("zs"));
    }
}
