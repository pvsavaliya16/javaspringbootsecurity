/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package parth;

/**
 *
 * @author parth
 */
class StaticNested {
    static int outer1 = 50;
    static int outer2 = 60;
    private static final int outerPrivate = 60;
    static class InnerStaticNested {
        private final int inner1 = 90;
        void displayData() {
            System.out.println("outer1 = " + outer1);
            System.out.println("outer2 = " + outer2);
            System.out.println("outerPrivate = " + outerPrivate);
            System.out.println("inner1 = " + this.inner1);
        }
    }
    class InnerNested {
        private final int nonStaticInner = 99;
        void displayData() {
            System.out.println("nonStaticInner = " + nonStaticInner);
            System.out.println("StaticNested.outer1 = " + StaticNested.outer1);
            System.out.println("StaticNested.outer2 = " + StaticNested.outer2);
            System.out.println("StaticNested.outerPrivate = " + StaticNested.outerPrivate);
        } 
    }
}

public class NestedClassExample {
    public static void main(String[] args) {
        
        StaticNested.InnerStaticNested innerClassObj = new StaticNested.InnerStaticNested();
        innerClassObj.displayData();
        
        StaticNested sn = new StaticNested();
        StaticNested.InnerNested in = sn.new InnerNested();
        in.displayData();
    }
}
