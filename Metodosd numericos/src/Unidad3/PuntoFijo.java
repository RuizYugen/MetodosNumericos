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
public class PuntoFijo {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("PUNTO-FIJO");
        System.out.println("INTRODUCE EL NUMERO DE CIFRAS SIGNIFICATIVAS");
        int cifras = leer.nextInt();
        double errorPrevio = .5 * Math.pow(10, 2 - cifras);
        double x,y;
        double xA=0.5;
        double yA=0.5;
        int i=0;
        for(;;){
            i++;
            x=Math.sqrt(0.3-yA+xA);
            y=-((yA-xA*xA)/(3*xA));
            double errorX=Math.abs(((x-xA)/x)*100);
            double errorY=Math.abs(((y-yA)/y)*100);
            System.out.println(i+".- x="+x+" y="+y+" %Ex="+errorX+" %Ey="+errorY);
            if(errorX<=errorPrevio&&errorY<=errorPrevio){
                break;
            }
            xA=x;
            yA=y;
        }
    }
}
