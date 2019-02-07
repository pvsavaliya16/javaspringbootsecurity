/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.argus.springwithmaven;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

/**
 *
 * @author parth
 */
@Configuration
//  @ComponentScan("com.argus.springwithmaven")
@PropertySource("sports.properties")
public class SportsConfig {
    
    // define a method for sad fortuneservice
    
    @Bean
    public FortuneService sadFortuneService() {
        return new SadFortuneService();
    }
    
    //define bean for swim coach and inject dependencies
    
    @Bean
    public Coach swimCoach() {
        return new SwimCoach(sadFortuneService());
    }
}
