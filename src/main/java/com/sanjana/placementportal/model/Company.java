//package com.sanjana.placementportal.model;
//
//import jakarta.persistence.Entity;
//import jakarta.persistence.GeneratedValue;
//import jakarta.persistence.GenerationType;
//import jakarta.persistence.Id;
//
//@Entity
//public class Company{
//
//    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    private int id;
//
//    private String companyName;
//
//    private String location;
//
//    private String packageOffered;
//
//    public Company(){}
//
//    public Company(String companyName, String location, String packageOffered){
//        this.companyName=companyName;
//        this.location=location;
//        this.packageOffered=packageOffered;
//    }
//
//    public void setId(int id) {
//        this.id = id;
//    }
//    public void setCompanyName(String companyName) {
//        this.companyName = companyName;
//    }
//    public void setLocation(String location) {
//        this.location = location;
//    }
//    public void setPackageOffered(String packageOffered) {
//        this.packageOffered = packageOffered;
//    }
//
//    public int getId() {
//        return id;
//    }
//    public String getCompanyName() {
//        return companyName;
//    }
//    public String getLocation() {
//        return location;
//    }
//    public String getPackageOffered() {
//        return packageOffered;
//    }
//}
