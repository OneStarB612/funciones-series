/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author steve
 */
public class ValorAbsoluto {
    
    public static double abs(double valor){
        
        if (valor >= 0){
            return valor;
        } else {
            return -(valor);
        }
    }
    
}
