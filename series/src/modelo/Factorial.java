/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author steve
 */
public class Factorial {
    
    public static double calcularFactorial(double numero) {
        
        if (numero == 0 || numero == 1) {
            return 1;
        }

        double resultado = 1;
        for (int i = 2; i <= numero; i++) {
             resultado *= i;
        }
        
        return resultado;
    }
}
