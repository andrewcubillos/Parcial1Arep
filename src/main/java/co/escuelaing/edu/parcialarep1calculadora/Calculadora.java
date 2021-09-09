/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.escuelaing.edu.parcialarep1calculadora;

/**
 *
 * @author Andrew
 */
public class Calculadora {
    public Double opera(Double valor, String funcion){
        
        if(funcion.contains("sin")){
           
            fn=Math.sin(fn);
        }
        else if (funcion.contains("cos")){
           
            fn=Math.cos(fn);
        }
        else if (funcion.contains("tan")){
           
            fn=Math.tan(fn);
        }
    }
}
