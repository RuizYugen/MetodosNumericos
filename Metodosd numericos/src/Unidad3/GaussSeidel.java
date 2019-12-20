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
public class GaussSeidel {
    public static void main(String[] args) {
        Scanner leer=new Scanner(System.in);
        System.out.println("GAUSS-SEIDEL");
        System.out.println("INTRODUCE EL NUMERO DE CIFRAS SIGNIFICATIVAS");
        int cifras=leer.nextInt();
        double errorPrevio=.5*Math.pow(10,2-cifras);
        int iteracion=0;
        double w=0;
        double wA=0;
        double x=0;
        double xA=0;
        double y=0;
        double yA=0;
        double z=0;
        double zA=0;
        System.out.println("error previo="+errorPrevio);
        for(;;){
            iteracion++;
            w=-((2*x+4*y+8*z+1)/3.0);
            x=(-w-5*y-2*z+2)/3.0;
            y=-((2*w+x+6*z+3)/9.0);
            z=(x-3*y)/4.0;
            double errorX1=(Math.abs((w-wA))/w)*100;
            double errorX2=(Math.abs(x-xA)/x)*100;
            double errorX3=(Math.abs(y-yA)/y)*100;
            double errorX4=(Math.abs(z-zA)/z)*100;
            System.out.println(iteracion+".- w="+w+" x="+x+" y="+y+" z="+z +" %Ew="+errorX1+" %Ex="+errorX2+" %Ey="+errorX3+" %Ez="+errorX4);
            if(errorX1<=errorPrevio&&errorX2<=errorPrevio&&errorX3<=errorPrevio&&errorX4<=errorPrevio){
                break;
            }
            wA=w;
            xA=x;
            yA=y;
            zA=z;
        }
        
    }
}
