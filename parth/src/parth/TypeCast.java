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
public class TypeCast {
    public static void main(String[] args) {
        Double d = new Double(9.08);
        int i = d.intValue();
        System.out.println(i);
        
        long l;
        l = 654234223;
        int j = (int) l;
        System.out.println(j);
        
        double db = 23.0943;
        int k = (int) db;
        System.out.println(k);
    }
}
