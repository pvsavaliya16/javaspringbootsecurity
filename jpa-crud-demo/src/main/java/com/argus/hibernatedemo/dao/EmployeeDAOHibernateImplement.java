/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.argus.hibernatedemo.dao;

import com.argus.hibernatedemo.entity.Employee;
import java.util.List;
import javax.persistence.EntityManager;
import org.hibernate.Session;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author parth
 */
@Repository
public class EmployeeDAOHibernateImplement implements EmployeeDAO{

    private EntityManager entityManager;

    @Autowired
    public EmployeeDAOHibernateImplement(EntityManager entityManager) {
        this.entityManager = entityManager;
    }
    
    @Override
    public List<Employee> getAll() {
        
        // get the current hibernate session
        Session currentSession = entityManager.unwrap(Session.class);
      
        // create a query
        Query<Employee> myQuery = currentSession.createQuery("from Employee", Employee.class);
        
        // execute query and get result list
        List<Employee> employees = myQuery.getResultList();
        
        // return the results
        return employees;
        
    }

    @Override
    public Employee findById(int id) {
        
        // get the current session
        Session currentSession = entityManager.unwrap(Session.class);
        
        // get the employee
        Employee employee = currentSession.get(Employee.class, id);
        
        // return the employee
        return employee;
    }

    @Override
    public void save(Employee employee) {
        
        // get the current hibernate session
        Session currentSession = entityManager.unwrap(Session.class);
        
        // save Employee
        currentSession.saveOrUpdate(employee);
        
        
    }

    @Override
    public void deleteEmployeeById(int id) {
        
        // get the current hibernate session
        Session currentSession = entityManager.unwrap(Session.class);   
        
        // delete the employee with primary key
        Query deleteQuery = currentSession.createQuery(
                            "delete from Employee where id=:empid");
        deleteQuery.setParameter("empid", id);
        deleteQuery.executeUpdate();
    }
    
}











