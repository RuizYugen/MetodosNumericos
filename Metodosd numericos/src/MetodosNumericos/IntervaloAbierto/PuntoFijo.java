/*
//        Punto fijo
//        tenemos x=f(x)
//        y la funcion y=x^2-2x+3
//        despejar la y
 */
package MetodosNumericos.IntervaloAbierto;

import Unidad2.FuncionCubica;
import java.util.Scanner;

/**
 *
 * @author RuizPc
 */
public class PuntoFijo {
    public static void main(String[] args) {
        Scanner leer=new Scanner(System.in);
        System.out.println("Valor de x donde comenzar");
        double inicia=leer.nextDouble();
        System.out.println("Numero de cifras significativas");
        int no=leer.nextInt();
        double error=.5*Math.pow(10,2-no);
        Unidad2.FuncionCubica fun=new FuncionCubica(-3, 0, 1, -2);
        Unidad2.FuncionCubica recta=new FuncionCubica(0, 0, 1, 0);
        double errorabsoluto=0;
        double anterior=0;       
        int i=1;
        double x=inicia;
        double y=0;
        for(;;){
            y=fun.evaluar(x);
            System.out.println(x+"-"+y+"\terror="+Math.abs((y-anterior)/y*100));
            if(Math.abs((y-anterior)/y*100)<=error&&i>1){
                break;
            }
            anterior=y;
            x=y;
            i++;
        }        
    }
}
