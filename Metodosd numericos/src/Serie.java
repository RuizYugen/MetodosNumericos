
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author RuizPc
 */
public class Serie {
    public static void main(String[] args) {
        Scanner leer=new Scanner(System.in);
//        System.out.println("Ingresa el valor");
//        double valor=leer.nextDouble();        
        System.out.println("Ingresa el numero de cifras significativas");
        int cifras=leer.nextInt();
        double errorPrevio=.5*Math.pow(10, 2-cifras);
        double valorAproximada=0;
        double errorRelativo=0;        
        double antiguo=0;        
        int j=1;
        double termino=0;
        for(;;){
            termino=(3.0/factorial(j));
            valorAproximada+=termino;
            errorRelativo=((termino-antiguo))/termino*100;
            //valorAproximada+=termino;
            System.out.println(j+"-"+valorAproximada +" Termino: "+termino+" Error aproximado: "+errorRelativo);
            antiguo=termino;            
            if(errorRelativo<=errorPrevio && j!=1){
                break;
            }
            j++;            
        }
        System.out.println(valorAproximada);
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
