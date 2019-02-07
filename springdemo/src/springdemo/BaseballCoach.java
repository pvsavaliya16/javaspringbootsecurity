/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package springdemo;

/**
 *
 * @author parth
 */
public class BaseballCoach implements Coach {

    private FortuneService fortuneService;

    public BaseballCoach() {
        System.out.println("Inside baseball coach no arg");
    }
    
    

    public BaseballCoach(FortuneService fortuneService) {
        this.fortuneService = fortuneService;
    }
    
    
    
    @Override
    public String getDailyWorkout() {
        return "Practice Batting!!";
        
    }

    @Override
    public String getDailyFortune() {
        return fortuneService.getFortuneService(); 
       
    }
}
