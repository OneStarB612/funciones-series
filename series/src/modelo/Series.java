/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author bryan, steve
 */
public class Series {

    public static String sin(double input) {
        
        if(ValorAbsoluto.abs(input) > 40.0){
            return "Valido solo para |x| < 40";
        }

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
        
        if(ValorAbsoluto.abs(input) > 40.0){
            return "Valido solo para |x| < 40";
        }

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

        if (ValorAbsoluto.abs(entrada) >= 1.0) {
            return "Undefined";
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
        
        if (ValorAbsoluto.abs(DatoEntrada) >= 1.0) {
            return "Undefined";
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
    // Fin del metodo arcosx
    
    // Inicio del metodo arctgx
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
    
    // inicio del metodo para calcular exp(x).
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
    
    
    // Inicio para el metodo ln(1+x)
    public static String ln(double dato){
        
        if(dato == 0){
            return "0.0";
        }
        
        if(dato == -1){
            
            return "Undefined";
        }
        
        if(dato == 1){
            
            return "0.69314718";
        }
        
        if(dato > 1){
            return "Valor fuera del intervalo de convergencia";
        }
        
        
        double sumaParcial;
        double valor = 0;
        double alternar = 1;
        /*
        
        if(dato > 1 || dato < -1){
            
            double datoMayor = ((dato));
            
            valor = -auxiliar(-datoMayor);
            
            return String.format("%.8f", (valor));
            
        }*/
        
        for(int a = 1; a < ConstantesMatematicas.contador; a++){
            
            sumaParcial = ((Potencia.potencia(dato, a)) / (a));
            
            sumaParcial *= alternar;
            
            valor += sumaParcial;
            
            alternar *= (-1);
        }
        
        return String.format("%.8f", valor);
    }
    
    /*
    public static double auxiliar(double dato){
        
        double sumaParcial;
        double valor = 0.0;
        double alternar = 1;
        
         for(int a = 1; a < ConstantesMatematicas.contador; a++){
            
            sumaParcial = ((Potencia.potencia(dato, a)) / (a));
            
           
            
            valor += sumaParcial;
            
            alternar *= (-1);
        }
         
         return valor;
         
        
    }
    
    */
    
    // Inicio del metodo para sinhx
    public static String sinh(double dato){
        
        double sumaParcial;
        double valor = 0;
        
        for(int a = 0; a < ConstantesMatematicas.contador; a++){
            
            sumaParcial = (Potencia.potencia(dato, (2 * a + 1))) / (Factorial.calcularFactorial((2*a +1)));
            
            valor += sumaParcial;
        }
        
        if(Double.toHexString(valor).equalsIgnoreCase("nan"))
        {
            return String.format("Entrada no soportable");
        }
        
        if(Double.toHexString(valor).equalsIgnoreCase("nan"))
        {
            return String.format("Entrada no soportable");
        }
        
        return String.format("%.8f", valor);
        
    }
    
    // fin del metodo sinhx
    
    // Inicio del del metodo coshx.
    public static String cosh(double dato){
        
        double sumaParcial;
        double valor = 0;
        
        for(int a = 0; a < ConstantesMatematicas.contador; a++){
            
            sumaParcial = (Potencia.potencia(dato, (2 * a))) / (Factorial.calcularFactorial((2*a)));
            
            valor += sumaParcial;
        }
        
        if(Double.toHexString(valor).equalsIgnoreCase("nan"))
        {
            return String.format("Entrada no soportable");
        }
        
        if(Double.toHexString(valor).equalsIgnoreCase("nan"))
        {
            return String.format("Entrada no soportable");
        }
        
        return String.format("%.8f", valor);
        
    }
    // Fin del metodo coshx
    
    // Inicio del metodo atanhx
    public static String atgh(double dato){
        
        if(ValorAbsoluto.abs(dato) >= 1.0){
            return "Undefined";
        }
        
        double sumaParcial;
        double valor = 0;
        
        for(int a = 0; a < ConstantesMatematicas.contador; a++){
            
            sumaParcial = (Potencia.potencia(dato, (2 * a + 1))) / (2*a +1);
            
            valor += sumaParcial;
        }
        
        if(Double.toHexString(valor).equalsIgnoreCase("nan"))
        {
            return String.format("Entrada no soportable");
        }
        
        if(Double.toHexString(valor).equalsIgnoreCase("nan"))
        {
            return String.format("Entrada no soportable");
        }
        
        return String.format("%.8f", valor);
        
    }
    // Fin del metodo atghx
    
    // Inicio del metodo acothx
    
    public static String acoth(double entrada){
        
        if (ValorAbsoluto.abs(entrada) <= 1){
            return "Undefined";
        }
        
        return atgh(1/entrada);
        /*
        double sumaParcial;
        double valor = 0;
        
        for(int n = 0; n < ConstantesMatematicas.contador; n ++){
            sumaParcial = 1 / ((2*n + 1) * (Potencia.potencia(valor, (2*n + 1))));
            valor += sumaParcial;
        }
        
        return String.format("%.8f", valor);*/
    }
    // fin del acoth
    
    // Inicio del metodo exp-sin
    public static String expSin(double entrada){
        
        if(entrada == 0){
            return "1";
        }
        
        if(ValorAbsoluto.abs(entrada) > 40.0){
            return "Entrada no soportable";
        }
        
        double sumaParcial;
        double salida = 0;
        
        for(int z = 0; z < ConstantesMatematicas.contador; z++){
            
            sumaParcial = ((Potencia.potencia(Double.parseDouble(sin(entrada)), z)) / (Factorial.calcularFactorial(z)));
            salida += sumaParcial;
        }
        
        return String.format("%.8f", salida);
    }
    // Fin del metodo expsinx
    
    // inicio del metodo expcosx
    public static String expCos(double entrada){
        
        if(entrada == 0){
            return String.format("%.8f", ConstantesMatematicas.e);
        }
        
        if(ValorAbsoluto.abs(entrada) > 40.0){
            return "Entrada no soportable";
        }
        
        double sumaParcial;
        double salida = 0;
        
        for(int z = 0; z < ConstantesMatematicas.contador; z++){
            
            sumaParcial = ((Potencia.potencia(Double.parseDouble(cos(entrada)), z)) / (Factorial.calcularFactorial(z)));
            salida += sumaParcial;
        }
        
        return String.format("%.8f", salida);
    }
    
    public static String w(double dato){
        
        if(ValorAbsoluto.abs(dato) >= 1/ConstantesMatematicas.e){
            return "Valor fuera Convergencia";
        }
        
        double suma;
        double alt =1;
        double lambert = 0;
        
        for(int a = 0; a < ConstantesMatematicas.contador; a++){
         suma = ((alt) * (Potencia.potencia(dato, a))) / (Factorial.calcularFactorial(a));
         
         lambert += suma;
         
         alt *= (-1);
        }
        
        return String.format("%.8f", lambert );
    }
    
    
    
}

