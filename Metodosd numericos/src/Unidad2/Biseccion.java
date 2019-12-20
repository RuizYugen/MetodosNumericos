/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Unidad2;

import java.util.Scanner;

/**
 *
 * @author RuizPc
 */
public class Biseccion {
    public static void main(String[] args) {
        Scanner leer=new Scanner(System.in);
        System.out.println("Ingresa el delta de x");
        double delta=leer.nextDouble();
        System.out.println("Numero de cifras significativas");
        int cifra=leer.nextInt();
        double errorPrevio=.5*Math.pow(10,2-cifra);        
        double x1,x2,y1,y2;
        FuncionCubica fun=new FuncionCubica(0, 0, -2, 6);
        x1=0;
        x2=delta;
        int no=0;
        int iteracion=1;
        double raiz=0;
        double error=0;
        
        for(;;){            
            y1=fun.evaluar(x1);
            y2=fun.evaluar(x2);
            System.out.print(iteracion+" x1 "+x1+" x2 "+x2+" x1 "+y1+" y2 "+y2);
            if((y1*y2)<0){
                double xn=(x2-x1)/2.0;
                xn=x1+xn;
                if((fun.evaluar(x1)*fun.evaluar(xn))<0&&iteracion>1){
                    x2=xn;                      
                    error=Math.abs((xn-raiz)/xn*100);
                    System.out.print(" error:"+error);
                    if(error<=errorPrevio){                        
                        System.out.print(xn);
                        break;
                    }
                    raiz=xn;
                }else if((fun.evaluar(x2)*fun.evaluar(xn))<0&&iteracion>1){
                    x1=xn;   
                    
                    error=Math.abs((xn-raiz)/xn*100);
                    System.out.print(error+"-");
                    if(error<=errorPrevio){
                        //raiz=xn;
                        break;
                    }
                    raiz=xn;
                }else{                    
                }                    
            }else{
                x1=x2;
                x2=x1+delta;
                no++;
            }
            if(no==30){
                break;
            }
            iteracion++;
            System.out.println("");
        }
        System.out.println("\n"+raiz);
    }
}
