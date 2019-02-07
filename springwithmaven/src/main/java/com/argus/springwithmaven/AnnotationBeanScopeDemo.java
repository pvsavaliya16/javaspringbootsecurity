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
public class AnnotationBeanScopeDemo {

    public static void main(String[] args) {

        // read spring config file
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");

        // get the bean from container
        Coach myCoach = context.getBean("tennisCoach", Coach.class);
        Coach yourCoach = context.getBean("tennisCoach", Coach.class);

        System.out.println(myCoach == yourCoach);
        System.out.println(myCoach);
        System.out.println(yourCoach);
    }
}
