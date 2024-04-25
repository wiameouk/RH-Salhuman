package com.example.rhsalhuman.servicesImpl;

import com.example.rhsalhuman.entities.Employee;
import com.example.rhsalhuman.repositories.EmployeeRepository;
import com.example.rhsalhuman.services.EmployeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class EmployeServiceImpl implements EmployeService {

    @Autowired
    private EmployeeRepository employeeRepository;
    @Override
    public Employee saveEmployee(Employee employee) {
        return employeeRepository.save(employee);
    }

    @Override
    public Employee updateEmployee(Long id, Employee employee) {

        Employee employeeFound = employeeRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Employee not found"));
        employeeFound = employee;
        return  employeeRepository.save(employeeFound);
    }

    @Override
    public void deleteEmployeeById(Long id) {
        Employee employeeFound = employeeRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Employee not found"));
        employeeRepository.deleteById(employeeFound.getId());

    }
    @Override
    public Employee getEmployeeById(Long id) {
        return employeeRepository.findById(id).get();
    }

    @Override
    public List<Employee> getAllEmployee() {
        return employeeRepository.findAll();
    }
}
