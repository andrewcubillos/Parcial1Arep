
package co.escuelaing.edu.parcialarep1calculadora;


public class Calculadora {
    public Double opera(double numero, String funcion){
        double fn= 0; 
        if(funcion.contains("sin")){
           
            fn=Math.sin(numero);
        }
        else if (funcion.contains("cos")){
           
            fn=Math.cos(numero);
        }
        else if (funcion.contains("tan")){
           
            fn=Math.tan(numero);
        }
        return fn;
    }
}
