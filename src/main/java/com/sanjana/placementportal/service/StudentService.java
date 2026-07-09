package com.sanjana.placementportal.service;

import com.sanjana.placementportal.exception.StudentNotFoundException;
import com.sanjana.placementportal.model.Student;
import com.sanjana.placementportal.repository.StudentRepo;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService {

    private final StudentRepo repo;
    public StudentService(StudentRepo repo){
        this.repo=repo;
    }

    public Student getStudents(Integer id){
        return repo.findById(id).orElseThrow(() -> new StudentNotFoundException("Student not found"));
    }

    public List<Student> getStudent(){
        return repo.findAll();
    }

    public ResponseEntity<String> postStu(Student student){
        repo.save(student);
        return new ResponseEntity<>("Posted Successfully", HttpStatus.BAD_REQUEST);
    }

    public ResponseEntity<String> updateStudent(Integer id , Student update){
        Student exist= repo.findById(id).orElseThrow(() -> new StudentNotFoundException("Student not found with the id "+id));

        exist.setName(update.getName());
        exist.setDepartment(update.getDepartment());
        exist.setEmail(update.getEmail());

        repo.save(exist);

        return new ResponseEntity<>("Updated Successfully", HttpStatus.BAD_REQUEST);
    }

    public String deleteStudent(Integer id){
        if(repo.existsById(id)){
            repo.deleteById(id);
            return "Deleted Successfully";
        }

        return "No record found";
    }
}
