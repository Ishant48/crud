package com.example.crud.crud.dto;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class EmployeeTo {
    private String id;
    private String empName;
    private String location;
    private String salary;
}
