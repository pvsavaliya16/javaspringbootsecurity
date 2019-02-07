/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package springdemo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 *
 * @author parth
 */
public class Springdemo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ApplicationContext context;
        context = new ClassPathXmlApplicationContext("beans.xml");
        
        Coach myCoach = context.getBean("myCoach", Coach.class);
        Coach myTrackCoach = context.getBean("myTrackCoach", Coach.class);
        Coach myCricketCoach = context.getBean("myCricketCoach", Coach.class);
        
        System.out.println(myCoach.getDailyWorkout());
        
        System.out.println(myCoach.getDailyFortune());
        
        System.out.println(myTrackCoach.getDailyWorkout());
        
        System.out.println(myTrackCoach.getDailyFortune());
        
        System.out.println(myCricketCoach.getDailyWorkout());
        
        System.out.println(myCricketCoach.getDailyFortune());
    }
    
}
