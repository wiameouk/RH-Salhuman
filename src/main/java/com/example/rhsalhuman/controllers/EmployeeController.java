package com.example.rhsalhuman.controllers;


import com.example.rhsalhuman.entities.Employee;
import com.example.rhsalhuman.servicesImpl.EmployeServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@CrossOrigin(origins = "*", maxAge = 3600)
@RequestMapping("/api/employee")
@RestController
public class EmployeeController {
    @Autowired
    private EmployeServiceImpl employeService;


    @GetMapping
    public ResponseEntity<List<Employee>> getEmployees()
    {
        return ResponseEntity.ok(employeService.getAllEmployee());
    }

    @GetMapping("/{id}")
    public ResponseEntity<Employee> getEmployee(@PathVariable("id") Long employeeId)
    {
        return ResponseEntity.ok(employeService.getEmployeeById(employeeId));
    }

    @PostMapping
    public ResponseEntity<Employee> createEmployee(@RequestBody Employee employee)
    {
        Employee employee1 = employeService.saveEmployee(employee);
        return new ResponseEntity<>(employee1, HttpStatus.CREATED);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Employee> updateEmployee(@PathVariable("id") Long employeeId , @RequestBody Employee employee)
    {
        Employee employee1 = employeService.updateEmployee(employeeId,employee);
        return new ResponseEntity<>(employee1, HttpStatus.CREATED);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<String> deleteEmployee(@PathVariable("id") Long employeeId)
    {
        employeService.deleteEmployeeById(employeeId);
        return ResponseEntity.ok("Employee deleted successfully !");
    }

}
