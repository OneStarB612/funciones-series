/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;


/**
 *
 * @author steve
 */
public class Potencia {

    /*
    public static double potencia(dobule base, int exp){
        
         BigDecimal res = BigDecimal.ONE;
        
        if (exp == 0){
           return BigDecimal.ONE;
        }
        if(exp == 1){
            return base;
        }
        
        
         for (int i = 0; i < exp; i++) {
            res = res.multiply(base);
        }
        
        return res;
    }
     */

    public static double potencia(double base, int exp) {

        if (exp == 0) {
            return 1;
        }
        if (exp == 1) {
            return base;
        }

        double res = base;
        for (int i = 2; i <= exp; i++) {
            res *= base;
        }

        return res;
    }

}
