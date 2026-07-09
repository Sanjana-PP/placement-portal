package com.sanjana.placementportal.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;

@Entity
public class Student{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @NotBlank(message = "Name can't be blank")
    private String name;

    @NotBlank(message = "Department can't be blank")
    private String department;

    @Email(regexp = "^[a-zA-Z0-9_!#$%&'*+/=?`{|}~^.-]+@[a-zA-Z0-9.-]+$", message = "Invalid email format")
    private String email;

    public Student(){}

    public Student(Integer id, String name, String department , String email){
        this.id=id;
        this.name=name;
        this.department=department;
        this.email=email;
    }

    public void setId(Integer id){
        this.id=id;
    }

    public void setName(String name){
        this.name=name;
    }

    public void setDepartment(String department){
        this.department=department;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Integer getId(){
        return id;
    }

    public String getName(){
        return name;
    }

    public String getDepartment(){
        return department;
    }

    public String getEmail() {
        return email;
    }
}