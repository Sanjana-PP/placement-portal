//package com.sanjana.placementportal.service;
//
//import com.sanjana.placementportal.model.Company;
//import com.sanjana.placementportal.repository.CompanyRepo;
//import org.springframework.stereotype.Service;
//
//import java.util.List;
//import java.util.Optional;
//
//@Service
//public class CompanyService {
//
//    private final CompanyRepo repo;
//    public CompanyService(CompanyRepo repo){
//        this.repo=repo;
//    }
//
//    public List<Company> getCompany(){
//        return repo.findAll();
//    }
//
//    public Company postCompany(Company company){
//        return repo.save(company);
//    }
//
//    public Optional<Company> updateCompany(int id , Company update){
//        Optional<Company> exist= repo.findById(id);
//        return  exist;
//    }
//}
