package com.krishantha.student_course.controller;

import com.krishantha.student_course.entity.Student;
import com.krishantha.student_course.service.CourseService;
import com.krishantha.student_course.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/students/")
public class StudentController {
    @Autowired
    private StudentService studentService;

    @Autowired
    private CourseService courseService;

    @PostMapping(consumes = "application/json")
    public void saveStudent(@RequestBody Student student){
        studentService.saveStudent(student);

    }
    @GetMapping(produces = "application/json")
    public List<Student> getAllStudents(){
        return studentService.getAllStudent();
    }
    @PatchMapping(value = "/editStudent/{id}")
    public void updateStudent(@RequestBody Student student,@PathVariable("id") Integer id) throws Exception {
        studentService.updateStudent(id,student);
    }
}
