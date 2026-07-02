package com.sanjana.placementportal.service;

import com.sanjana.placementportal.model.Student;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService {

    public List<Student> getStudent(){
        return List.of(
                new Student(1,"Sanjana","CSE"),
                new Student(2,"Sadhana", "AIDS")
        );
    }
//
//    public String postStu(Student student){
//        repo.save(student);
//        return "Student saved";
//    }
}
