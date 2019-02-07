/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.argus.jpacruddemo.dao;

import com.argus.jpacruddemo.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

/**
 *
 * @author parth
 */
@RepositoryRestResource(path = "people")
public interface EmployeeRepository extends JpaRepository<Employee, Integer> {
    
}
