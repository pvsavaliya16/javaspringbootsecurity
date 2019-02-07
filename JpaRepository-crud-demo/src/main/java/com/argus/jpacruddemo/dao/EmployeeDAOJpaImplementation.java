/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.argus.jpacruddemo.dao;

import com.argus.jpacruddemo.entity.Employee;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

/**
 *
 * @author parth
 */
@Repository 
public class EmployeeDAOJpaImplementation implements EmployeeDAO{

    private EntityManager entityManager;

    @Autowired
    public EmployeeDAOJpaImplementation(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    
    
    @Override
    public List<Employee> getAll() {
        Query getQuery = entityManager.createQuery("from Employee");
        
        List<Employee> result= getQuery.getResultList();
        
        return result;
    }

    @Override
    public Employee findById(int id) {
        Employee employee = entityManager.find(Employee.class, id);
        return employee;
    }

    @Override
    public void save(Employee employee) {
         Employee dbEmployee = entityManager.merge(employee);
         
         // update the id from db so we can get generated id for save /insert
         employee.setId(dbEmployee.getId());
    }

    @Override
    public void deleteEmployeeById(int theid) {
        
        // delete object with promary key
        
        Query deleteQuery =  entityManager.createQuery(
                             "DELETE FROM Employee where id=:employeeId");
        
        
        deleteQuery.setParameter("employeeId", theid);
        
        deleteQuery.executeUpdate(); 
        
    }
    
}
