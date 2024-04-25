package com.example.rhsalhuman.services;

import com.example.rhsalhuman.entities.Employee;

import java.util.List;

public interface EmployeService {
    Employee saveEmployee(Employee employee);

    Employee updateEmployee(Long id, Employee employee);

    void deleteEmployeeById(Long id);
    Employee getEmployeeById(Long id);
    List<Employee> getAllEmployee();


}
