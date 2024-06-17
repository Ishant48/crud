package com.example.crud.crud.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.crud.crud.dto.EmployeeTo;
import com.example.crud.crud.models.Employee;
import com.example.crud.crud.repository.EmployeeRepository;

@Service
public class EmployeeService {
    @Autowired
    private EmployeeRepository employeeRepository;

    public String createEmployee(EmployeeTo employeeTo) {
        try {
            Employee emp = Employee.builder().empName(employeeTo.getEmpName()).salary(employeeTo.getSalary())
                    .location(employeeTo.getLocation()).build();
            employeeRepository.save(emp);
        } catch (Exception e) {
            // TODO: handle exception
        }

        return "Employee  Created Successfully";
    }

    public List<Employee> getEmployee() {
        List<Employee> empList = new ArrayList<>();
        try {
            empList = employeeRepository.findAll();
        } catch (Exception e) {
            // TODO: handle exception
        }
        return empList;
    }

    public String updateEmployee(EmployeeTo emp) {
        try {
            Employee employee = Employee.builder().id(emp.getId()).empName(emp.getEmpName()).location(emp.getLocation())
                    .salary(emp.getSalary())
                    .build();
            employeeRepository.save(employee);
        } catch (Exception e) {
            // TODO: handle exception
        }

        return "Employee Updated Successfully";
    }

    public String deleteEmployee(String id) {
        try {
            employeeRepository.deleteById(id);
        } catch (Exception e) {
            // TODO: handle exception
        }

        return "Employee deleted Successfully";
    }
}
