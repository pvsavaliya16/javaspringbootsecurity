/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package parth;

import java.util.Scanner;

class Subject {
    String subjectName;
}

class Student {
    Subject[] intrestArea = new Subject[5];
    void displaySubjects() {
        for(Subject subject : this.intrestArea) {
            System.out.println(subject.subjectName);
        }
    }
    void addSubjects() {
        Scanner s = new Scanner(System.in);
        for(int i=0; i<5; i++){
            System.out.println("Enter Subject " + (i+1));
            this.intrestArea[i].subjectName = s.nextLine();
        }
    }
}


public class AggregationExample {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.addSubjects();
        s1.displaySubjects();
    }
}
