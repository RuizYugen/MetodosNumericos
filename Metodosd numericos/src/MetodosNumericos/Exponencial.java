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
public class Exponencial {
    public static void main(String[] args) {
        Scanner leer=new Scanner(System.in);        
        System.out.println("Ingresa el exponente");        
        double iteracion=leer.nextDouble();
        System.out.println("Ingresa el numero de cibras significativas");
        int cifras=leer.nextInt();
        double errorsignificativo=0.5*(Math.pow(10, 2-cifras));
        double exp=1;   
        System.out.println("Error previo: "+errorsignificativo);
        int i=1;
        double valorAntiguo=0;
        double ErrorRelativo=0;
        double ter=0;
        System.out.println("1");
        do{
            ter=Math.pow(iteracion, i)/Factorial(i);
            exp+=ter;             
            ErrorRelativo=(exp-valorAntiguo)/exp*100;
            System.out.println(i+"-"+exp+" - "+ter+" - "+ErrorRelativo);
            valorAntiguo=exp;
            i++;
        }while(errorsignificativo<=ErrorRelativo);
        System.out.println("Respuesta: "+exp);
    }
    public static double Factorial(int no){
        double valor=1;
        for (int i = 1; i <= no; i++) {
            valor=valor*i;
        }
        return valor;
    }
}
