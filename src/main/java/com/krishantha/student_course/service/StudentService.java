package com.krishantha.student_course.service;

import com.krishantha.student_course.entity.Student;
import com.krishantha.student_course.repository.CourseRepository;
import com.krishantha.student_course.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class StudentService {
    @Autowired
    StudentRepository studentRepository;

    public void saveStudent(Student student) {
        studentRepository.save(student);
    }

    public List<Student> getAllStudent() {
        return studentRepository.findAll();
    }
    public void updateStudent(int id,Student student) throws Exception {
        Optional<Student> studentById = studentRepository.findById(id);

        if (studentById.isPresent()) {
            Student exisStudent = studentById.get();

            exisStudent.setName(student.getName());
            exisStudent.setAddress(student.getAddress());

            studentRepository.save(exisStudent);
        } else {
            throw new Exception("Student Id not found : ID - " + id);
        }
    }
}
