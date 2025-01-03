package com.krishantha.student_course.controller;

import com.krishantha.student_course.entity.Course;
import com.krishantha.student_course.service.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("courses/students")
public class CourseController {
    @Autowired
    CourseService courseService;


    @PostMapping("/")
    public void saveCourse(@RequestBody Course course){
        courseService.saveCourse(course);
    }
    @GetMapping("/")
    public List<Course> getAllCourses(){
        return courseService.getAllCourses();
    }
}
