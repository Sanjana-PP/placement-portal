package com.sanjana.placementportal.service;

import com.sanjana.placementportal.exception.StudentNotFoundException;
import com.sanjana.placementportal.model.Student;
import com.sanjana.placementportal.repository.StudentRepo;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService {

    private final StudentRepo repo;
    public StudentService(StudentRepo repo){
        this.repo=repo;
    }

//    public List<Student> getStudent(){
//        return List.of(
//                new Student(1,"Sanjana","CSE"),
//                new Student(2,"Sadhana", "AIDS")
//        );
//    }

    public List<Student> getStudent(){
        return repo.findAll();
    }
    public String postStu(Student student){
        repo.save(student);
        return "Posted Successfully";
    }

    public String updateStudent(Integer id , Student update){
        Student exist= repo.findById(id).orElseThrow(() -> new StudentNotFoundException("Student not found with the id "+id));

        exist.setName(update.getName());
        exist.setDepartment(update.getDepartment());

        repo.save(exist);

        return "Updated Successfully";
    }

    public String deleteStudent(Integer id){
        if(repo.existsById(id)){
            repo.deleteById(id);
            return "Deleted Successfully";
        }

        return "No record found";
    }
}
