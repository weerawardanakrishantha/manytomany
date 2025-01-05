package com.krishantha.student_course.service;

import com.krishantha.student_course.entity.Course;
import com.krishantha.student_course.entity.Student;
import com.krishantha.student_course.repository.CourseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CourseService {
    @Autowired
    CourseRepository courseRepository;

    public void saveCourse(Course course) {
        for (Student student : course.getStudents()) {
            student.getCourses().add(course);
        }
        courseRepository.save(course);
    }

    public List<Course> getAllCourses() {
        return courseRepository.findAll();
    }


}
