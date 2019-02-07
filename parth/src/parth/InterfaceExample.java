
package parth;

interface I1 {
    int a = 10;
    static void display() ;
}

public class InterfaceExample implements I1{
    public static void main(String[] args) {
        display();
    }

    @Override
    static public void display() {
        System.out.println("Hello");//To change body of generated methods, choose Tools | Templates.
    }
}
