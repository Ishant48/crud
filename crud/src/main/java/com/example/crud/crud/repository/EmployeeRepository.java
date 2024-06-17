package com.example.crud.crud.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.example.crud.crud.models.Employee;

@Repository
public interface EmployeeRepository extends MongoRepository<Employee,String> {
    // You can define custom query methods here
}