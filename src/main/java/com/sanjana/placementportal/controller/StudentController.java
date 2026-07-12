package com.sanjana.placementportal.controller;

import com.sanjana.placementportal.model.Student;
import com.sanjana.placementportal.service.StudentService;
import jakarta.validation.Valid;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Sort;
import org.springframework.data.web.SortDefault;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/student")
public class StudentController {

    private final StudentService service;

    public StudentController(StudentService service){
        this.service=service;
    }

    @GetMapping("/{id}")
    public Student getStudents(@PathVariable int id){
        return service.getStudents(id);
    }

    @GetMapping("/page/sort")
    public Page<Student> getStudentPage(@RequestParam int page, @RequestParam int size , @SortDefault(sort="name", direction = Sort.Direction.ASC)Sort sort){
        return service.getStudentPage(page, size, sort);
    }

    @GetMapping("/count/{department}")
    public long getStudentCount(@PathVariable String department){
        return service.getStudentCount(department);
    }

    @GetMapping("/stu/department/{department}")
    public List<Student> getStudentByDepartment(@PathVariable String department){
        return service.getStudentByDepartment(department);
    }

    @GetMapping("/name/{name}")
    public Student getStudentByName(@PathVariable String name){
        return service.getStudentByName(name);
    }

    @GetMapping("/all")
    public List<Student> getStudent(){
        return service.getStudent();
    }

    @PostMapping("/post")
    public ResponseEntity<String> postStu(@Valid @RequestBody Student student){
        return service.postStu(student);
    }

    @PutMapping("/{id}")
    public ResponseEntity<String> updateStudent(@PathVariable Integer id ,@Valid @RequestBody Student update ){
        return service.updateStudent(id , update);
    }

    @DeleteMapping("/{id}")
    public String deleteStudent(@PathVariable Integer id){
        return service.deleteStudent(id);
    }
}
