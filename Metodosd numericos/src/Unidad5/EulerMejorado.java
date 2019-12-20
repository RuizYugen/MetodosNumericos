/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Unidad5;

import java.util.*;

/**
 *
 * @author RuizPc
 */
public class EulerMejorado {
    public static void main(String[] args) {
        Scanner leer=new Scanner(System.in);
        System.out.println("EULER MEJORADO");
        System.out.println("Ingresa el punto");
        double x0=leer.nextDouble();
        double y0=leer.nextDouble();
        System.out.println("Ingresar el paso(h)");
        double h=leer.nextDouble();
        System.out.println("Ingresa x");
        double xF=leer.nextDouble();
        double predictor=0;
        double corrector=0;
        int i=0;
        for(;;){
            predictor=y0+f(x0,y0)*h;
            corrector=y0+(((f(x0,y0)+f((x0+h),(predictor))))/2)*h;
            System.out.print(i+" x0="+x0+" y0="+y0);
            System.out.println("predictor="+predictor+"correctro="+corrector);
            System.out.println("pendiente="+f(x0,y0));
            System.out.println("desmadre="+f((x0+h),(predictor)));
            x0+=h;
            y0=corrector;
            if(x0==xF){
                break;
            }
        }
        System.out.println(x0+","+y0);
    }
    
    public static double f(double x,double y){
        return (y+(x*y));
    }
}
