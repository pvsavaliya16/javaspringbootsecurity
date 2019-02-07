/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package parth;

class Base {
    public void display() {
        System.out.println("Base");
    }
}
/**
 *
 * @author parth
 */
public class Test extends Base{
    public static void main(String[] args) {
        Test test = new Test();
        test.display();
    }

    @Override
    public void display() {
        System.out.println("asdfasdf");
    }
}
