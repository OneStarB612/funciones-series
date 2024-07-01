/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

import java.math.BigDecimal;
import java.math.MathContext;

/**
 *
 * @author steve
 */
public class Series {
    /*
    // metodo para calcular el factorial
    public static String sin(BigDecimal inp){ // recibe un bigdecimal del txt de la serie que lo llamo
        BigDecimal res = new BigDecimal(0); // el valor que retorna
        for(int k = 0; k <= 55; k++){
      // res.add(BigDecimal((String.format("%s", ((Factorial.calcularFactorial((2 * k + 1))) )))) );
       
       
        }
        return "";
    }
    
    public static String ciclo(int cic, BigDecimal base){
        
        
        
        return String.format("(%s)/(%s)", Potencia.potencia(base, cic), (Factorial.calcularFactorial((2 * cic + 1))));
    }
    */
    
    /*
    segun el valor en el campo de texto del sin(x) el metodo calculara su valor
    */
    public static String sin(double input) {
    
    // esto es lo que devolverá el método, empieza en cero porque es una suma
    double valorRetorno = 0.0;
    
    // esta es la suma parcial de cada ciclo
    double sumaParcial;
    
    // esto es para alternar el signo de cada suma parcial
    int alternar = 1;
    
    for (int k = 0; k <= 30; k++) {
        
        // Calcular el término de la serie de Taylor para sin(x)
        sumaParcial = Potencia.potencia(input, (2 * k) + 1) / Factorial.calcularFactorial((2 * k) + 1);
        sumaParcial *= alternar;
        valorRetorno += sumaParcial;
        alternar *= -1;
    }
    
    return Double.toString(valorRetorno);
}
    
    // inicio para calcular el cos(x)
    public static double cos(double input){
        
       double valorCos = 0;
        
        double sumaParcial;
        
        int alternar = 1;
        /*
        for(int k = 0; k <= 110; k++){
            
           sumaParcial = input.pow( (2 * k)).divide(Factorial.calcularFactorial((2 * k)), MathContext.DECIMAL128);
           sumaParcial = sumaParcial.multiply(BigDecimal.valueOf(alternar));
           valorCos = valorCos.add(sumaParcial);
           alternar *= -1;
            
        }
        */
        
        for(int k = 0; k <= 30; k++){
            
            sumaParcial = Potencia.potencia(input, (2 *k)) / Factorial.calcularFactorial(2 * k);
            
            sumaParcial *= alternar;
            
            valorCos += sumaParcial;
            
            alternar *= (-1);
                    
                    
        }
        
        return valorCos;
        
    } // fin del metodo cos
    
    // inicio para calcular el arcoseno(x)
    
    public static String arcoSin(double entrada) {
        /*
        BigDecimal valorASin = BigDecimal.ZERO;
        BigDecimal SumaParcial;
        
        for (int n = 0; n <= 110; n++) {
            
            BigDecimal coeficiente = Coeficientes.calcularCoeficiente(n);
            
            SumaParcial = coeficiente.multiply(entrada.pow((2 * n) + 1))
                    .divide(BigDecimal.valueOf( (2 * n) + 1), MathContext.DECIMAL128);
            
            valorASin = valorASin.add(SumaParcial);
        }
        
        return valorASin;
*/
        
    double valorASin = 0.0;
    double sumaParcial;
    
    if(entrada == 1){
        return ("1.5707963");
    }
    
    if(entrada == -1)
    {
        return ("-1.5707963");
    }
    
    if(entrada > 1 || entrada < -1)
    {
        return "Undefine";
    }
    
    for (int n = 0; n < 50; n++) {
        
        double coeficiente = Coeficientes.calcularCoeficiente(n);
        
        sumaParcial = (coeficiente * Potencia.potencia(entrada, (2*n) +1)) / ((2 * n) + 1);
        
        valorASin += sumaParcial;
    }
    
    return Double.toString(valorASin);
        
        
    }
    // fin del metodo arcoseno
}
