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
//
//    @GetMapping
//    public String getStu(){
//        return "Hello students";
//    }
//
//    @GetMapping("/{id}")
//    public String getStudents(@PathVariable int id){
//        return "Student id: "+ id;
//    }
//
//    @GetMapping("/name/{name}")
//    public String getName(@PathVariable String name){
//        return "Student name: "+name;
//    }

    @GetMapping("/det")
    public List<Student> getStudent(){
        return service.getStudent();
    }

    @PostMapping("/stu")
    public String postStu(@RequestBody Student student){
        return service.postStu(student);
    }

    @PutMapping("/{id}")
    public String updateStudent(@PathVariable("id") Integer id , @RequestBody Student update ){
        return service.updateStudent(id , update);
    }

    @DeleteMapping("/{id}")
    public String deleteStudent(@PathVariable("id") Integer id){
        return service.deleteStudent(id);
    }
}
