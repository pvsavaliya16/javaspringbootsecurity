/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.argus.springjsonrestdemo.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author parth
 */
@RestController
@RequestMapping("/test")
public class DemoRestController {
    
    //add code for the "/test" endpoint
    @GetMapping("/hello")
    public String sayHello() {
        return "Hello Parth!!";
    }
    
    @GetMapping("/parth")
    public String sayParth() {
        return "<b>ABCD</b>";
    }
    
}
