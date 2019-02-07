/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.argus.springwithmaven;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

/**
 *
 * @author parth
 */
@Component
@Scope("prototype")
public class TennisCoach implements Coach {
    
    @Autowired
    @Qualifier("happyFortuneService")
    private FortuneService fortuneService;
    
    public TennisCoach() {
        System.out.println(">> Inside Tennis Coach constructor");
    }
    
  /*  @Autowired
    public void setFortuneService(FortuneService fortuneService) {
        System.out.println("Inside TennisCoach setter method!!!!");
        this.fortuneService = fortuneService;
    }
    
    @Autowired
    public void helloFortuneService(FortuneService fortuneService) {
        System.out.println("Inside TennisCoach helloFortuneService method!!!!");
        this.fortuneService = fortuneService;
    }
    public TennisCoach(FortuneService fortuneService) {
        this.fortuneService = fortuneService;
    }*/
 
    @Override
    public String getDailyWorkout() {
        return "Practive service volly!!!";//To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String getDailyFortune() {
        return  fortuneService.getFortuneService();
        
    }
    
}
