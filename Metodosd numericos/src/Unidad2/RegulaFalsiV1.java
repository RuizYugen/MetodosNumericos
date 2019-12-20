/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Unidad2;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author RuizPc
 */
public class RegulaFalsiV1 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Metodo Regula Falsi");
        System.out.println("Numero de cifras significativas");
        int cifra = leer.nextInt();
        double delta = 1.0;  
        System.out.println("Con un delta de x de "+delta);
        double errorPrevio = .5 * Math.pow(10, 2 - cifra);
        double x1, x2, y1, y2;
        FuncionCubica fun = new FuncionCubica(3, 0, 0, 2);
        ArrayList<Intervalo> lista = new ArrayList<>();        
//        for (double i = -10; i <= 10; i = i + delta) {
//            y1 = fun.evaluar(i);
//            y2 = fun.evaluar(i+delta);
//            if (y1 == 0) {
//                System.out.println("raiz:" + i);
//            }else if ((y1 * y2) < 0) {
//                lista.add(new Intervalo(i,i+delta ));
//            }            
//        }
        lista.add(new Intervalo(-2,-.5));
        double raiz=0,error=0;
        int iteracion=0;
        double xn=0;
        for (Intervalo intervalo : lista) {
            x1=intervalo.getX1();
            x2=intervalo.getX2();   
            iteracion=1;
            for(;;){
//                double xn=(x2-x1)/2.0;
//                xn=x1+xn;
                y1=fun.evaluar(x1);
                y2=fun.evaluar(x2);
                xn=(y1*x2-y2*x1)/(y1-y2);
                System.out.print(iteracion+"\tx1="+x1+"\ty1="+y1+"\tx2="+x2+"\ty2="+y2+"\txn="+xn);
                if((y1*fun.evaluar(xn))<0){
                    x2=xn;                      
                    error=Math.abs((xn-raiz)/xn*100);
                    System.out.print("\terror:"+error);
                    if(error<=errorPrevio){                        
                        //System.out.print(xn);
                        break;
                    }
                    raiz=xn;
                }else if((fun.evaluar(x2)*fun.evaluar(xn))<0){
                    x1=xn;                       
                    error=Math.abs((xn-raiz)/xn*100);
                    System.out.print("\terror:"+error);
                    if(error<=errorPrevio){
                        //raiz=xn;
                        break;
                    }
                    raiz=xn;
                }else{
                    //x1=xn;                       
                    error=Math.abs((xn-raiz)/xn*100);
                    System.out.print("\terror:"+error);
                    if(error<=errorPrevio){
                        //raiz=xn;
                        break;
                    }
                }
                System.out.println("");
                iteracion++;
            }
            System.out.println("\nraiz="+raiz+"\n\n");
        }
    }
}
