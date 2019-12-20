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
public class DDFD {
    public static void main(String[] args) {
        Scanner leer=new Scanner(System.in);
        System.out.println("DIFERENCIAS DIVIDIDAS FINITAS");
        System.out.println("Ingresa x");
        double xi=leer.nextDouble();
        double h=0.001;
        System.out.println("DIFERENCIAS DIVIDIDAS FINITAS HACIA DELANTE");
        double mD=(-f(xi+h+h)+4*f(xi+h)-3*f(xi))/(2*h);
        System.out.println("Inclinacion= "+mD);
        System.out.println("DIFERENCIAS DIVIDIDAS FINITAS HACIA ATRAS");
        double mA=(3*f(xi)-4*f(xi-h)+f(xi-2*h))/(2*h);
        System.out.println("Inclinacion= "+mA);
        System.out.println("DIFERENCIAS DIVIDIDAS FINITAS CENTRADAS");
        double mC=(-f(xi+2*h)+8*f(xi+h)-8*f(xi-h)+f(xi-2*h))/(12*h);
        System.out.println("y="+f(xi));
        System.out.println("x1="+(xi-2*h));
        System.out.println("f(x1)="+f(xi-2*h));
        System.out.println("x2="+(xi-h));
        System.out.println("f(x2)="+f(xi-h));
        System.out.println("x3="+(xi+h));
        System.out.println("f(x3)="+f(xi+h));
        System.out.println("x4="+(xi+2*h));
        System.out.println("f(x4)="+f(xi+2*h));
        System.out.println("Inclinacion= "+mC);
    }
    
    public static double f(double x){
        return Math.cbrt(x*x*x-8)/(x+2);
    }
}