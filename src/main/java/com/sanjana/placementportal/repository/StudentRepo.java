package com.sanjana.placementportal.repository;

import com.sanjana.placementportal.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface StudentRepo extends JpaRepository<Student , Integer> {

    Optional<Student> findByName(String name);

    @Query(value = "SELECT * FROM student WHERE department= ?1" , nativeQuery = true)
    List<Student> getStudentByDepartment(String dep);

    @Query(value = "SELECT count(id) as count from student where department= ?1" ,nativeQuery = true)
    long getStudentCount(String department);
}
