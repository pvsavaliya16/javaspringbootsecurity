/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.argus.springjsonrestdemo.parth;

/**
 *
 * @author parth
 */
public class Employee {
    private int id;

    public Employee(int id, String firstName, String lastName, boolean active) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.active = active;
    }
    private String firstName;
    private String lastName;
    private boolean active;
    
    public Employee() {}

    public void setId(int id) {
        this.id = id;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setActive(boolean active) {
        this.active = active;
    }

    public int getId() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public boolean isActive() {
        return active;
    }

    
}
