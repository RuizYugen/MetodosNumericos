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
public class Seno {
    public static void main(String[] args) {
//        Scanner leer=new Scanner(System.in);
//        System.out.println("Ingresa el valor");
//        double valor=leer.nextDouble();
//        if(valor>Math.PI*2){
//            int v=(int) (valor/(2*Math.PI));
//            valor=valor-v*(Math.PI*2);
//        }
//        System.out.println("Ingresa el numero de cifras significativas");
//        int cifras=leer.nextInt();
//        double errorPrevio=.5*Math.pow(10, 2-cifras);
//        double valorAproximada=0;
//        double errorRelativo=0;
//        boolean flag=true;
//        double antiguo=0;
//        int i=1;
//        int j=1;
//        do{
//            double termino=0;
//            if(flag){
//                termino=Math.pow(valor, i)/factorial(i);
//                flag=false;
//            }else{
//                termino=-(Math.pow(valor, i))/factorial(i);
//                flag=true;
//            }
//            errorRelativo=(termino-antiguo)/termino*100;
//            valorAproximada+=termino;
//            System.out.println(j+"-"+valorAproximada +" Termino: "+termino+" Error aproximado: "+errorRelativo);
//            antiguo=termino;
//            i+=2;
//            j++;
//        }while(errorPrevio<=errorRelativo);
        
        for (int i = 0; i < 60; i++) {
            System.out.println(i+"-"+(char)i+"-");
        }
    }
   public static double factorial(int no){
       if(no==0){
           return 1;
       }else{
           double fac=1;
           for (int i = 1; i <=no; i++) {
               fac=fac*i;
           }
           return fac;
       }
   }
}
