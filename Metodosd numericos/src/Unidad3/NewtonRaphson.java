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
public class NewtonRaphson {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("NEWTON-RAPHSON");
        System.out.println("INTRODUCE EL NUMERO DE CIFRAS SIGNIFICATIVAS");
        int cifras = leer.nextInt();
        double errorPrevio = .5 * Math.pow(10, 2 - cifras);
        int iteracion = 0;
        double x = 0.5, xA = 0.5;
        double y = 0.5, yA = 0.5;
        System.out.println("error previo=" + errorPrevio);
        double errorY=0,errorX=0;
        for (;;) {
            iteracion++;
            double ui = x*x-x-0.3+y;
            System.out.println("ui "+ui);
            double vi = x*x-3*x*y-y;
            System.out.println("vi "+vi);
            double du_dx = 2*x-1;
            System.out.println("du_dx="+du_dx);
            double du_dy = 1;
            double dv_dx = 2*x-3*y;
            double dv_dy = -3*x-1;
            double j = du_dx * dv_dy - dv_dx * du_dy;
            System.out.println("j="+j);
            x = xA - (ui * dv_dy - vi * du_dy) / j;
            y = yA - (vi * du_dx - ui * dv_dx) / j;
            if (iteracion != 1) {
                errorX = (Math.abs(Math.abs(x) - Math.abs(xA)) / Math.abs(x)) * 100;
                errorY = (Math.abs(Math.abs(y) - Math.abs(yA)) / Math.abs(y)) * 100;
            } 
            System.out.println(iteracion + " x=" + x + " y=" + y + " %Ex=" + errorX + " %Ey=" + errorY);
            
            if (errorX <= errorPrevio && errorY <= errorPrevio&&iteracion>1) {
                break;
            }
            xA = x;
            yA = y;
        }

    }
}
