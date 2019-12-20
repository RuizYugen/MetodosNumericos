/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Unidad4;

import java.util.Scanner;

/**
 *
 * @author RuizPc
 */
public class Simpson3_8 {
    public static void main(String[] args) {
        Scanner leer=new Scanner(System.in);
        System.out.println("SIMPSON 3/8");
        System.out.println("Ingresa a");
        double a=leer.nextDouble();
        System.out.println("Ingresa b");
        double b=leer.nextDouble();
        double h=(b-a)/3.0;
        System.out.println("h="+h);
        double area=(b-a)*(f(a)+3*f(a+h)+3*f(a+2*h)+f(b))/(8.0);
        System.out.println("f(x0)="+f(a));
        System.out.println("f(x1)="+f(a+h));
        System.out.println("f(x2)="+f(a+2*h));
        System.out.println("f(x3)="+f(b));
        System.out.println("El area es: "+area);
    }
    
    public static double f(double x){
        return (Math.pow(((x*x*x)-8), (1/3)))/(x+2);
    }
}
