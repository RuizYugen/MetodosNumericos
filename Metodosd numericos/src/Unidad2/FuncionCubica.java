/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Unidad2;

/**
 *
 * @author RuizPc
 */
public class FuncionCubica {
    private double coeficienteCubico;
    private double coeficienteCuadratico;
    private double coeficienteUno;
    private double coeficienteCero;

    public FuncionCubica(double coeficienteCubico, double coeficienteCuadratico, double coeficienteUno, double coeficienteCero) {
        this.coeficienteCubico = coeficienteCubico;
        this.coeficienteCuadratico = coeficienteCuadratico;
        this.coeficienteUno = coeficienteUno;
        this.coeficienteCero = coeficienteCero;
    }
    
    public double evaluar(double i){
        return (coeficienteCubico*i*i*i+coeficienteCuadratico*i*i+coeficienteUno*i+coeficienteCero);
    } 
}
