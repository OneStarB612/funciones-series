/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;



/**
 *
 * @author steve
 */
public class Coeficientes {
    
     public static double calcularCoeficiente(int n) {
         
       /* BigDecimal coeficiente = BigDecimal.ONE;
        for (int i = 0; i < n; i++) {
            
            coeficiente = coeficiente.multiply(BigDecimal.valueOf(2 * i + 1)).divide(BigDecimal.valueOf(2 * (i + 1)), MathContext.DECIMAL128);
        }
        
        return coeficiente;
*/
       
       double coeficiente = 1;
       
       for(int a = 0; a < n; a++){
           
           coeficiente = coeficiente * (2 * a + 1) / (2 * (a + 1));
       }
       return coeficiente;
                
    }
    
}
