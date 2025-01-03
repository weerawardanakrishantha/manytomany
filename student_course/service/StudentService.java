package com.krishantha.student_course.service;

import com.krishantha.student_course.entity.Student;
import com.krishantha.student_course.repository.CourseRepository;
import com.krishantha.student_course.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService {
    @Autowired
    StudentRepository studentRepository;
    @Autowired
    CourseRepository courseRepository;

    public void saveStudent(Student student) {
        studentRepository.save(student);
    }

    public List<Student> getAllStudent() {
        return studentRepository.findAll();
    }
}
