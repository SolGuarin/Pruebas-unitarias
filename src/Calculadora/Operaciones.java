/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Calculadora;

/**
 *
 * @author Usuario
 */
public class Operaciones {
    
    public long Sumar(long num1, long num2){
        return num1 + num2;
    }
    
    public long Sumar(long[] listaNumeros){
        long resultado = 0;
        for (long num : listaNumeros) {
            resultado += num;       
        }
        return resultado;
    }
    
    public long Restar(long num1, long num2){
        return num1 - num2; 
    }
    
    public long Multiplicar(long num1, long num2){
        return num1 * num2;
    }
    
    public long Multiplicar (long[] listaNumeros){
        long resultado = 1;
        for (long num : listaNumeros) {
            resultado *= num;       
        }
        return resultado;
    }
    
    public double Dividir(long num1, long num2){
        try{
           return num1 / num2; 
        }catch(ArithmeticException e){
            throw e;     
        }
    }
    
    public double Promedio(){
        long[] numeros = new GeneradorDeNumeros().listaNumeros;
        double promedio;
        long sumatoria = 0;
        for (long numero : numeros) {
            sumatoria += numero;    
        }
        promedio = this.Dividir(sumatoria, numeros.length);
        return promedio;
        
    }
    
}
