/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Unidad3;

import java.util.Scanner;

/**
 *
 * @author RuizPc
 */
public class Jacobi {
    public static void main(String[] args) {
        Scanner leer=new Scanner(System.in);
        System.out.println("Jacobi");
        System.out.println("INTRODUCE EL NUMERO DE CIFRAS SIGNIFICATIVAS");
        int cifras=leer.nextInt();
        double errorPrevio=.5*Math.pow(10,2-cifras);
        int iteracion=0;
        double x1=0;
        double x1A=0;
        double x2=0;
        double x2A=0;
        double x3=0;
        double x3A=0;
        System.out.println("error previo="+errorPrevio);
        for(;;){
            iteracion++;
            double temp1=(6-x2+4*x3)/12;
            double temp2 =(4-x3-4*x1)/5;
            double temp3 =(2-x1+3*x2)/6;
            x1=temp1;
            x2=temp2;
            x3=temp3;
            double errorX1=(Math.abs((x1-x1A))/x1)*100;
            double errorX2=(Math.abs(x2-x2A)/x2)*100;
            double errorX3=(Math.abs(x3-x3A)/x3)*100;
            System.out.println(iteracion+" x1="+x1+" x2="+x2+" x3="+x3+" %Ex1="+errorX1+" %Ex2="+errorX2+" %Ex3="+errorX3);
            if(errorX1<=errorPrevio&&errorX2<=errorPrevio&&errorX3<=errorPrevio){
                break;
            }
            x1A=x1;
            x2A=x2;
            x3A=x3;
        }
        
    }
}
