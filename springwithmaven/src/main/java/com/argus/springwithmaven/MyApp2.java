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
public class MyApp2 {

    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("beans-scope.xml");
        Coach myCoach = context.getBean("myBaseballCoach", Coach.class);
        Coach alphaCoach = context.getBean("myBaseballCoach", Coach.class);

        System.out.println(alphaCoach == myCoach);

        System.out.println("My Coach    " + myCoach);

        System.out.println("Alpha Coach    " + alphaCoach);
    }
}
