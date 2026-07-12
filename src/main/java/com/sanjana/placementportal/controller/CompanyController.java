//package com.sanjana.placementportal.controller;
//
//import com.sanjana.placementportal.model.Company;
//import com.sanjana.placementportal.service.CompanyService;
//import org.springframework.stereotype.Controller;
//import org.springframework.web.bind.annotation.*;
//
//import java.util.List;
//import java.util.Optional;
//
//@Controller
//@RequestMapping("/company")
//public class CompanyController{
//
//    private final CompanyService service;
//    public CompanyController(CompanyService service){
//        this.service=service;
//    }
//
//    @GetMapping("/all")
//    public List<Company> getCompany(){
//        return service.getCompany();
//    }
//
//    @PostMapping("/post")
//    public Company postCompany(Company company){
//        return service.postCompany(company);
//    }
//
//    @PutMapping("/update/{id}")
//    public Optional<Company> updateCompany(@PathVariable int id, @PathVariable Company update){
//        return service.updateCompany(id, update);
//    }
//
//    @DeleteMapping("/delete/{id}")
//    public Company deleteCompany(@PathVariable int id ){
//        return service.deleteCompany(id);
//    }
//}
