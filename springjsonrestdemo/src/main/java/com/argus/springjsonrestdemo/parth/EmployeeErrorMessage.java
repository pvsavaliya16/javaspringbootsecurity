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
public class EmployeeErrorMessage {
    
    private int ststusCode;
    private String message;
    private long timeStamp;

    public EmployeeErrorMessage() {
    }

    public EmployeeErrorMessage(int ststusCode, String message, long timeStamp) {
        this.ststusCode = ststusCode;
        this.message = message;
        this.timeStamp = timeStamp;
    }

    public void setStstusCode(int ststusCode) {
        this.ststusCode = ststusCode;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public void setTimeStamp(long timeStamp) {
        this.timeStamp = timeStamp;
    }

    public int getStstusCode() {
        return ststusCode;
    }

    public String getMessage() {
        return message;
    }

    public long getTimeStamp() {
        return timeStamp;
    }
    
}
