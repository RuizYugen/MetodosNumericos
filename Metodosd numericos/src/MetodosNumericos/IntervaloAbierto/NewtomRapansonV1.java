/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MetodosNumericos.IntervaloAbierto;

import Unidad2.FuncionCubica;
import java.util.Scanner;

/**
 *
 * @author RuizPc
 */
public class NewtomRapansonV1 {
    public static void main(String[] args) {
        Scanner leer=new Scanner(System.in);
       
        System.out.println("Newton Rapanson");
        System.out.println("valor de equis en donde empezar");
        double x0=leer.nextDouble();      
        double delta=0.001;
        System.out.println("Numero de cifras significativas");
        int cifra=leer.nextInt();
        double errorPrevio = .5 * Math.pow(10, 2 - cifra);        
        FuncionCubica fun = new FuncionCubica(3,0,0,2);
        double anterior=0;
        double raiz=0;
        double error;
        int i=1;
        for(;;){
            raiz=x0+(fun.evaluar(x0)*delta/(fun.evaluar(x0)-fun.evaluar(x0+delta)));
            error=Math.abs((raiz-anterior)/raiz*100);
            System.out.println(i+"\tDx:"+delta+"\tx0:"+x0+ "\tXr:"+raiz+"\terror:"+error);
            if(error<=errorPrevio){
                break;
            }
            anterior=raiz;
            x0=raiz;
            i++;            
        }
        
    }
}
