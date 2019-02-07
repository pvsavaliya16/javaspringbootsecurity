/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.argus.hibernatedemo.rest;

import com.argus.hibernatedemo.entity.Employee;
import com.argus.hibernatedemo.services.EmployeeService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
 import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author parth
 */
@RestController
@RequestMapping("/api")
public class HibernateEmployeeRestController {
    
    private EmployeeService employeeService;
    
    
    
    @Autowired
    public HibernateEmployeeRestController(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }
    
    @GetMapping("/employees")
    public List<Employee> getEmployees() {
        return employeeService.getAll();
    }
    
   
    
    @GetMapping("/employees/{empid}")
    public Employee getEmployeeById(@PathVariable int empid) {
        Employee emp = employeeService.findById(empid);
        
        if (emp == null) {
            throw new RuntimeException("Employee not found");
        }
        
        return emp;
    }
    
    @GetMapping("/employees/delete/{empid}")
    public void deleteEmployeeById(@PathVariable int empid) {
        employeeService.deleteEmployeeById(empid);
    }
    
    @PostMapping("/employees")
    public void addEmployee(@RequestBody Employee employee) {
        
        employee.setId(0);
        employeeService.save(employee);
    }
    
    @PutMapping("/employees")
    public void updateEmployee(@RequestBody Employee employee) {
        employeeService.save(employee);
    }
    
    
}
 