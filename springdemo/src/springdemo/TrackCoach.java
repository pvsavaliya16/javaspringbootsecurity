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
public class TrackCoach implements Coach {

    private FortuneService fortuneService;
    
    public TrackCoach(){}
    
    public TrackCoach(FortuneService fortuneService) {
        this.fortuneService = fortuneService;
    } 

    @Override
    public String getDailyWorkout() {
        return "Run like Hell!!";
    }

    @Override
    public String getDailyFortune() {
        return "From Track Coach: " + fortuneService.getFortuneService();
    }
    
}
