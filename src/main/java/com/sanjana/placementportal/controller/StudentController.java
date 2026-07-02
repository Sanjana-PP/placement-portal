package com.sanjana.placementportal.controller;

import com.sanjana.placementportal.model.Student;
import com.sanjana.placementportal.service.StudentService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/student")
public class StudentController {

    private final StudentService service;

    public StudentController(StudentService service){
        this.service=service;
    }

    @GetMapping
    public String getStu(){
        return "Hello students";
    }

    @GetMapping("/{id}")
    public String getStudents(@PathVariable int id){
        return "Student id: "+ id;
    }

    @GetMapping("/name/{name}")
    public String getName(@PathVariable String name){
        return "Student name: "+name;
    }

    @GetMapping("/det")
    public List<Student> getStudent(){
        return service.getStudent();
    }

    @PostMapping("/stu")
    public Student postStu(@RequestBody Student student){
        return student;
    }
}
