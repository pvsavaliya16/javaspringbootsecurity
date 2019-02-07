/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.argus.springwithmaven;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;

/**
 *
 * @author parth
 */
public class SwimCoach implements Coach{

    @Value("${foo.email}")
    private String email;
    
    @Value("${foo.team}")
    private String team;
    private FortuneService fortuneService;
    
    public SwimCoach(FortuneService fortuneService) {
        this.fortuneService = fortuneService;
    }
    
    @Override
    public String getDailyWorkout() {
        return "Swim a mile every day";
    }

    @Override
    public String getDailyFortune() {
        return fortuneService.getFortuneService();
    }
    
    public String getEmail() {
        return this.email;
    }
    
    public String getTeam() {
        return this.team;
    }
    
}
