/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.argus.springwithmaven;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 *
 * @author parth
 */
public class SwimJavaConfigDemo {

    public static void main(String[] args) {

        // read spring config file
        ApplicationContext context = new AnnotationConfigApplicationContext(SportsConfig.class);

        // get the bean from container
        SwimCoach mySwimCoach = context.getBean("swimCoach", SwimCoach.class);

        //call method
        System.out.println("Swim coach: " + mySwimCoach.getDailyWorkout());

        System.out.println("Swim coach: " + mySwimCoach.getDailyFortune());

        // call our new swimcoach methods
        System.out.println("Swim coach email: " + mySwimCoach.getEmail());
        System.out.println("Swim coach team: " + mySwimCoach.getTeam());
        
        //close the container
    } 
}
