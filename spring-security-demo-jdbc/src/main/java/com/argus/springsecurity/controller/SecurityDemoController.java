/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.argus.springsecurity.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 *
 * @author parth
 */
@Controller

public class SecurityDemoController {

    @GetMapping("/")
    public String showHome() {
        return "home";
    }
    
    @GetMapping("/leaders")
    public String showLeaders() {
        return "leaders";
    }
    
    @GetMapping("/system")
    public String showsystem() {
        return "system";
    }
    
    
}
