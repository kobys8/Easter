/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package easter;

import javax.swing.JOptionPane;

/**
 *
 * @author kms080
 */
public class Easter {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int y = 2014;
        int a = y%19;
        int b = y/100;
        int c = y%100;
        int d = b/4;
        int e = b%4;
        int f = (b+8)/25;
        int g = (b-f+1)/3;
        int h = (19*a+b-d-g+15)%30;
        int i = c/4;
        int k = c%4;
        int r = (32+2*e+2*i-h-k)%7;
        int m = (a+11*h+22*r)/451;
        int n = (h+r-7*m+114)/31;
        int p = (h+r-7*m+114)%31;
        System.out.println("y = " + y);
        System.out.println("a = " + a);
        System.out.println("b = " + b);
        System.out.println("c = " + c);
        System.out.println("d = " + d);
        System.out.println("e = " + e);
        System.out.println("f = " + f);
        System.out.println("g = " + g);
        System.out.println("h = " + h);
        System.out.println("i = " + i);
        System.out.println("k = " + k);
        System.out.println("r = " + r); 
        System.out.println("m = " + m);
        System.out.println("n = " + n);
        System.out.println("p = " + p);
        JOptionPane.showMessageDialog(null, "Easter falls/will fall on " + n + "/" + (p+1) + " in the year " + y + ".");
    }
}
