package com.example.practice.serviceimpl;

import com.example.practice.model.CountryRegion;
import com.example.practice.model.Employees;
import com.example.practice.model.EmplyeeDetails;
import com.example.practice.repository.ShoppingRepo;
import com.example.practice.service.ShoppingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ShoppingServiceImpl implements ShoppingService {

    @Autowired
    ShoppingRepo shoppingRepo;

    @Override
    public Object getCountryById(String id) {
        return shoppingRepo.getCountryById(id);
    }

    @Override
    public CountryRegion getCountryDetailsById(String id) {
        return shoppingRepo.getCountryDetailsById(id);
    }

    @Override
    public List<CountryRegion> getAllCountriesDetails() {
        return shoppingRepo.getAllCountries();
    }

    @Override
    public List<EmplyeeDetails> getAllEmployees() {
        return shoppingRepo.getAllEmployees();
    }

    @Override
    public List<EmplyeeDetails> getNoofEmployeesinDepartment() {
        return shoppingRepo.noofEmployeeByDepartment();
    }

    @Override
    public List<Employees> getAllEmployeesbetweenID(Long startId, Long enId) {
        return shoppingRepo.getAllEmployeesbetweenID(startId,enId);
    }
}
