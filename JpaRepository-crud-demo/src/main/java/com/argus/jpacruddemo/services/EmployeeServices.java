/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.argus.jpacruddemo.services;

import com.argus.jpacruddemo.entity.Employee;
import java.util.List;

/**
 *
 * @author parth
 */
public interface EmployeeServices {
    
    public List<Employee> getAll();
    public Employee findById(int id);
    public void save(Employee employee);
    public void deleteEmployeeById(int id);
    
}
