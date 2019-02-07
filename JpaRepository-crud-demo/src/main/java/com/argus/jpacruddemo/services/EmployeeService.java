/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.argus.jpacruddemo.services;

import com.argus.jpacruddemo.dao.EmployeeDAO;
import com.argus.jpacruddemo.entity.Employee;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author parth
 */
@Service
public class EmployeeService implements EmployeeServices{

    private EmployeeDAO employeeDAO;

    @Autowired
    public EmployeeService(@Qualifier("employeeDAOJpaImplementation") EmployeeDAO employeeDAO) {
        this.employeeDAO = employeeDAO;
    }
    
   
    @Override
    @Transactional
    public List<Employee> getAll() {
        return employeeDAO.getAll();
    }

    @Override
    @Transactional
    public Employee findById(int id) {
        return employeeDAO.findById(id);
    }

    @Override
    @Transactional
    public void save(Employee employee) {
        employeeDAO.save(employee);
    }

    @Override
    @Transactional
    public void deleteEmployeeById(int id) {
        employeeDAO.deleteEmployeeById(id);
    }
    
}
