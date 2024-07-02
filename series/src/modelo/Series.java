/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author steve
 */
public class Series {
   
    public static String sin(double input) {
    
    // esto es lo que devolverá el método, empieza en cero porque es una suma
    double valorRetorno = 0.0;
    
    // esta es la suma parcial de cada ciclo
    double sumaParcial;
    
    // esto es para alternar el signo de cada suma parcial
    int alternar = 1;
    
    for (int k = 0; k <= 35; k++) {
        
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
        
        for(int k = 0; k <= 35; k++){
            
            sumaParcial = Potencia.potencia(input, (2 *k)) / Factorial.calcularFactorial(2 * k);
            
            sumaParcial *= alternar;
            
            valorCos += sumaParcial;
            
            alternar *= (-1);
                    
                    
        }
        
        return valorCos;
        
    } // fin del metodo cos
    
    
    // << Inicio para calcular el arcoseno(x). >>
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
