/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.argus.springwithmaven;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 *
 * @author parth
 */
public class AnnotationDemo {

    public static void main(String[] args) {

        // read spring config file
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");

        // get the bean from container
        Coach myTennisCoach = context.getBean("tennisCoach", Coach.class);

        //call method
        System.out.println("Tennis coach: " + myTennisCoach.getDailyWorkout());

        System.out.println("Tennis coach: " + myTennisCoach.getDailyFortune());

        //close the container
    }
}
