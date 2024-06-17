package com.example.crud.crud.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.example.crud.crud.dto.EmployeeTo;
import com.example.crud.crud.models.Employee;
import com.example.crud.crud.service.EmployeeService;
import org.springframework.web.bind.annotation.GetMapping;
// import org.springframework.web.bind.annotation.RequestParam;


@RestController
@RequestMapping("/api/emp")
public class EmployeeController {
 
    @Autowired
    private EmployeeService employeeService;

    @PostMapping("/create")
    @ResponseStatus(HttpStatus.CREATED)
    public String createEmployee(@RequestBody EmployeeTo emp){
        return employeeService.createEmployee(emp);
    }


    @GetMapping("/get/employees")
    @ResponseStatus(HttpStatus.OK)
    public List<Employee> getEmployee(){
        return employeeService.getEmployee();
    }

    @PostMapping("/update/employee")
    @ResponseStatus(HttpStatus.OK)
    public String updateEmployee(@RequestBody EmployeeTo emp){
            return employeeService.updateEmployee(emp);
    }

    @PostMapping("/delete/employee")
    @ResponseStatus(HttpStatus.OK)
    public String deleteEmployee(@RequestParam String id){
            return employeeService.deleteEmployee(id);
    }
}
