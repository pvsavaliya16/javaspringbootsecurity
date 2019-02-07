/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.argus.springjsonrestdemo.rest;

import com.argus.springjsonrestdemo.parth.Employee;
import com.argus.springjsonrestdemo.parth.EmployeeErrorMessage;
import com.argus.springjsonrestdemo.parth.EmployeeNotFoundException;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.PostConstruct;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author parth
 */
@RestController
@RequestMapping("/api")
public class EmployeeRestController {
    
        private List<Employee> employees;
    
    // define @PostConstruct annotation to load student data 
    @PostConstruct
    public void setEmployees() {
         
        employees = new ArrayList<>();
        employees.add(new Employee(1, "Parth", "Savaliya", true));
        employees.add(new Employee(2, "Rajan", "Vekariya", true));
        employees.add(new Employee(3, "Jijil", "Dudhatra", true));
        employees.add(new Employee(4, "Gopen", "Kanjiya", true));
        employees.add(new Employee(5, "Akash", "Vichhi", true));
        employees.add(new Employee(6, "Akash", "Patel", true));
        employees.add(new Employee(7, "Vaibhav", "Singala", true));
        
    }
    
    // define end point for "/employees" - return list of all employees

    @GetMapping("/employees")
    public List<Employee> getEmployees() {
        
        
       // String.valueOf(this);
        return employees;  
    }
    
    @GetMapping("/employees/{id}")
    public Employee getEmployee(@PathVariable int id) {
        
        if((id >= employees.size()) || (id<0)){
            throw new EmployeeNotFoundException("Employee not found with id - " + id);
        }
            
        return employees.get(id);
    }
    
    @ExceptionHandler
    public ResponseEntity<EmployeeErrorMessage> handleException(EmployeeNotFoundException enfe) {
        
        EmployeeErrorMessage error = new EmployeeErrorMessage();
        error.setStstusCode(HttpStatus.NOT_FOUND.value());
        error.setMessage(enfe.getMessage());
        error.setTimeStamp(System.currentTimeMillis());
        return new ResponseEntity<>(error, HttpStatus.NOT_FOUND);
        
    }
    
    @ExceptionHandler 
    public ResponseEntity<EmployeeErrorMessage> handleException(Exception e) {
        EmployeeErrorMessage error = new EmployeeErrorMessage();
        error.setStstusCode(HttpStatus.BAD_REQUEST.value());
        error.setMessage(e.getMessage());
        error.setTimeStamp(System.currentTimeMillis());
        return new ResponseEntity<>(error, HttpStatus.BAD_REQUEST);
    }
}
