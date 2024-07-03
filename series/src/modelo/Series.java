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
        
       

        for (int k = 0; k <= ConstantesMatematicas.contador; k++) {

            // Calcular el término de la serie de Taylor para sin(x)
            sumaParcial = Potencia.potencia(input, (2 * k) + 1) / Factorial.calcularFactorial((2 * k) + 1);
            sumaParcial *= alternar;
            valorRetorno += sumaParcial;
            alternar *= -1;
        }
       
        if(Double.toString(valorRetorno).equalsIgnoreCase("nan"))
        {
            return String.format("Entrada no soportable");
        }
        
        if(Double.toString(valorRetorno).equalsIgnoreCase("nan"))
        {
            return String.format("Entrada no soportable");
        }

        return String.format("%.8f", valorRetorno);
    }

    // inicio para calcular el cos(x)
    public static String cos(double input) {

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

        for (int k = 0; k <= ConstantesMatematicas.contador; k++) {

            sumaParcial = Potencia.potencia(input, (2 * k)) / Factorial.calcularFactorial(2 * k);

            sumaParcial *= alternar;

            valorCos += sumaParcial;

            alternar *= (-1);

        }
        
        if(Double.toHexString(valorCos).equalsIgnoreCase("nan"))
        {
            return String.format("Entrada no soportable");
        }
        
        if(Double.toHexString(valorCos).equalsIgnoreCase("nan"))
        {
            return String.format("Entrada no soportable");
        }

        return String.format("%.8f", valorCos);

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

        if (entrada == 1) {
            return ("1.5707963");
        }

        if (entrada == -1) {
            return ("-1.5707963");
        }

        if (entrada > 1 || entrada < -1) {
            return "Undefine";
        }

        for (int n = 0; n < ConstantesMatematicas.contador; n++) {

            double coeficiente = Coeficientes.calcularCoeficiente(n);

            sumaParcial = (coeficiente * Potencia.potencia(entrada, (2 * n) + 1)) / ((2 * n) + 1);

            valorASin += sumaParcial;
        }

        return String.format("%.8f", valorASin);

    }
    // fin del metodo ArcSin

    // Inicio del metodo ArcCos(x)
    public static String arcCos(double DatoEntrada) {
        if (DatoEntrada < -1 || DatoEntrada > 1) {
            return "Undefine";
        }

        if (DatoEntrada == 0) {
            return String.format("%.8f", (ConstantesMatematicas.pi / 2));
        }

        if (DatoEntrada == -1) {
            return String.format("%.8f", (ConstantesMatematicas.pi));
        }

        if (DatoEntrada == 1) {
            return String.format("0.0");
        }

        return String.format("%.8f", ((ConstantesMatematicas.pi / 2) - Double.parseDouble(arcoSin(DatoEntrada))));
    }

    public static String arcTg(double dato) {

        if (dato == 0) {
            return String.format("0.0");
        }
        
        if(dato == Double.MAX_VALUE)
        {
            return String.format("%.8f", (ConstantesMatematicas.pi / 2));
        }
        
        if(dato == -(Double.MAX_VALUE))
        {
            return String.format("%.8f", -(ConstantesMatematicas.pi / 2));
        }

        double sumaParcial;
        double valorArcTg = 0.0;
        int alternar = 1;
        

        if (dato == 1) {

            return String.format("%.8f", (ConstantesMatematicas.pi / 4));
        }
        if (dato == -1) {

            return String.format("%.8f", -(ConstantesMatematicas.pi / 4));
        }

        if (dato > -1 && dato < 1) {
            for (int a = 0; a < ConstantesMatematicas.contador; a++) {
                sumaParcial = (Potencia.potencia(dato, ((2 * a) + 1))) / ((2 * a) + 1);

                sumaParcial *= alternar;

                valorArcTg += sumaParcial;

                alternar *= (-1);
            }
            return String.format("%.8f", valorArcTg);
        } else {
            double datoInv = 1 / dato;

            for (int a = 0; a < ConstantesMatematicas.contador; a++) {

                sumaParcial = (Potencia.potencia(datoInv, ((2 * a) + 1))) / ((2 * a) + 1);

                sumaParcial *= alternar;

                valorArcTg += sumaParcial;

                alternar *= (-1);
            }

            return String.format("%.8f", (ConstantesMatematicas.pi / 2) - valorArcTg);
        }
    }
    // Fin del metodo de arctgx
    
    // inicio del metodo para calcular exp(x)
    
    public static String expx(double dato){
        
        if(dato == 0){
            return "1";
        }
        if(dato == 1){
            return String.format("%.8f", ConstantesMatematicas.e);
        }
        
        double valor = 0;
        double sumaParcial;
        
        for (int a = 0; a < ConstantesMatematicas.contador; a++){
            
            sumaParcial = (Potencia.potencia(dato, a)) / (Factorial.calcularFactorial(a));
            
            valor += sumaParcial;
        }
        
        if(Double.toHexString(valor).equalsIgnoreCase("nan"))
        {
            return String.format("Entrada no soportable");
        }
        
        if(Double.toString(valor).equalsIgnoreCase("nan"))
        {
            return String.format("Entrada no soportable");
        }
        
        return String.format("%.8f", valor);
    }
    
}
