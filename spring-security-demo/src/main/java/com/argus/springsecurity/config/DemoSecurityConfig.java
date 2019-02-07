/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.argus.springsecurity.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.User.UserBuilder;

/**
 *
 * @author parth
 */
@Configuration
@EnableWebSecurity
public class DemoSecurityConfig extends WebSecurityConfigurerAdapter{

    @Override
    protected void configure(AuthenticationManagerBuilder auth) throws Exception {
        
      // add our users for in memory authentication
      
      UserBuilder users = User.withDefaultPasswordEncoder();
      
      auth.inMemoryAuthentication()
              .withUser(users.username("Parth").password("abcdefg").roles("ADMIN"))
              .withUser(users.username("Vaibhav").password("abcdefg").roles("VP"))
              .withUser(users.username("Jijil").password("abcdefg").roles("TEAMLEADER"))
              .withUser(users.username("Akash").password("abcdefg").roles("MANAGER"));
        
    }
    
}
