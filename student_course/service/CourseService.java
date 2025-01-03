package com.krishantha.student_course.service;

import com.krishantha.student_course.entity.Course;
import com.krishantha.student_course.repository.CourseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CourseService {
    @Autowired
    CourseRepository courseRepository;
    @Autowired
    StudentService studentService;

    public void saveCourse(Course course) {
        courseRepository.save(course);
    }

    public List<Course> getAllCourses() {
        return courseRepository.findAll();
    }


}
