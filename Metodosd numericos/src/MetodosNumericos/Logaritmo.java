/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MetodosNumericos;

import java.util.Scanner;

/**
 *
 * @author RuizPc
 */
public class Logaritmo {
    public static void main(String[] args) {
        Scanner leer=new Scanner(System.in);
        System.out.println("Ingresa el valor");
        double valor=leer.nextDouble();        
        System.out.println("Ingresa el numero de cifras significativas");
        int cifras=leer.nextInt();
        double errorPrevio=.5*Math.pow(10, 2-cifras);
        double valorAproximada=0;
        double errorRelativo=0;        
        double antiguo=0;        
        int j=1;
        double termino=0;
        do{
            termino=(1.0/j)*Math.pow(((valor-1)/valor),j);
            valorAproximada+=termino;
            errorRelativo=Math.abs((termino-antiguo)/termino*100);
            //valorAproximada+=termino;
            System.out.println(j+"-"+valorAproximada +" Termino: "+termino+" Error aproximado: "+errorRelativo);
            antiguo=termino;            
            j++;
        }while(errorPrevio<=errorRelativo);
        System.out.println(valorAproximada);
    }
}
