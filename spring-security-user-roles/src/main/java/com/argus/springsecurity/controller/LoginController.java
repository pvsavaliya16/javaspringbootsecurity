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
public class LoginController {
    
    
    @GetMapping("/login-form")
    public String showLoginForm() {
        return "loginForm";
    }
    
    @GetMapping("/access-denied")
    public String accessDenied() {
        return "access-denied";
    }
}
