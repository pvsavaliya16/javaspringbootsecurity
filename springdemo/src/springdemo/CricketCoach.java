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
public class CricketCoach implements Coach {

    private FortuneService fortuneService;

    public CricketCoach() {
        System.out.println("Inside CricketCoach no-arg!!");
    }
    
    
    
    public void setFortuneService(FortuneService fortuneService) {
        this.fortuneService = fortuneService;
    }
    
    @Override
    public String getDailyWorkout() {
        return "Run 20 Rounds of ground!!";
    }

    @Override
    public String getDailyFortune() {
        return "From Cricket coach: " + this.fortuneService.getFortuneService();
    }
    
}
