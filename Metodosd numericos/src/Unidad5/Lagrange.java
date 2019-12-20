/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Unidad5;

import java.util.Scanner;

/**
 *
 * @author RuizPc
 */
public class Lagrange {
    public static void main(String[] args) {
        Scanner leer=new Scanner(System.in);
        System.out.println("LAGRANGE");
        System.out.println("Ingresa el grado de la ecuacion");
        int n=leer.nextInt();
        System.out.println("Ingresa " +(n+1)+" puntos");        
        Punto[] puntos=new Punto[n+1];
        for (int i = 0; i < puntos.length; i++) {
            puntos[i]=new Punto(leer.nextDouble(), leer.nextDouble());
//            puntos[i].setX(leer.nextDouble());
//            puntos[i].setY(leer.nextDouble());
        }
        //System.out.println("Se realizara una ecuacion de grado "+(noPuntos-1));
        System.out.println("Ingresa x donde deseas calcular f(x)");
        double x=leer.nextDouble();
        
        System.out.println("n= "+n);
        System.out.println("x= "+x);
        double fx=0;
        for (int i = 0; i <= n; i++) {
            double li=1;
            for (int j = 0; j <= n; j++) {
                if(j!=i){
                    li*=(x-puntos[j].getX())/(puntos[i].getX()-puntos[j].getX());
                }
            }
            fx+=li*puntos[i].getY();
            System.out.println(fx);
            System.out.println("termino:"+li*puntos[i].getY());
        }
        System.out.println("f(x)="+fx);
    }
}