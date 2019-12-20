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
public class HiperTangente {
    public static void main(String[] args) {
        Scanner leer=new Scanner(System.in);
        System.out.println("Ingresa el valor");
        double valor=leer.nextDouble();
        if(valor>Math.PI*2){
            int v=(int) (valor/(2*Math.PI));
            valor=valor-v*(Math.PI*2);
        }
        System.out.println("Ingresa el numero de cifras significativas");
        int cifras=leer.nextInt();
        double errorPrevio=.5*Math.pow(10, 2-cifras);
        double valorAproximada=0;
        double errorRelativo=0;
        boolean flag=true;
        double antiguo=0;
        int i=1;
        int j=1;
        do{
            double termino=0;
            if(flag){
                termino=Math.pow(valor, i)/i;
                flag=false;
            }else{
                termino=-(Math.pow(valor, i))/i;
                flag=true;
            }
            errorRelativo=(termino-antiguo)/termino*100;
            valorAproximada+=termino;
            System.out.println(j+"-"+valorAproximada +" Termino: "+termino+" Error aproximado: "+errorRelativo);
            antiguo=termino;
            i+=2;
            j++;
        }while(errorPrevio<=errorRelativo);
        System.out.println(valorAproximada);
    }   
}
