/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author steve
 */
public class TablaCasos {

    public static final String[] casos = {"pi", "pi*2", "pi*3", "pi*4", "pi*5", "pi*6", "pi*7", "pi*8", "pi*9", "pi*10", "pi*100",
        "pi/2", "pi/3", "pi/4", "pi/5", "pi/6", "pi/7", "pi/8", "pi/9", "pi/10", "pi/100",
        "1/pi", "2/pi", "3/pi", "4/pi", "5/pi", "6/pi", "7/pi", "8/pi", "9/pi", "10/pi", "100/pi",
        "pi*3/2", "pi*2/3", "pi*3/4", "pi*5/6", "pi*4/3", "pi*6/5", "pi*7/2", "pi*9/2", "pi*2/9", "pi*7/8", "pi*8/7", "pi*2/7",
        "2*pi", "3*pi", "4*pi", "5*pi", "6*pi", "7*pi", "8*pi", "9*pi", "10*pi", "100*pi",
        "3*pi/2", "2*pi/3", "3*pi/4", "5*pi/6", "4*pi/3", "6*pi/5", "7*pi/2", "9*pi/2", "2*pi/9", "7*pi/8", "8*pi/7", "2*pi/7",
        "e", "e*2", "e*3", "e*4", "e*5", "e*6", "e*7", "e*8", "e*9", "e*10", "e*100",
        "e/2", "e/3", "e/4", "e/5", "e/6", "e/7", "e/8", "e/9", "e/10", "e/100",
        "1/e", "2/e", "3/e", "4/e", "5/e", "6/e", "7/e", "8/e", "9/e", "10/e", "100/e",
        "e*3/2", "e*2/3", "e*3/4", "e*5/6", "e*4/3", "e*6/5", "e*7/2", "e*9/2", "e*2/9", "e*7/8", "e*8/7", "e*2/7",
        "2*e", "3*e", "4*e", "5*e", "6*e", "7*e", "8*e", "9*e", "10*e", "100*e",
        "3*e/2", "2*e/3", "3*e/4", "5*e/6", "4*e/3", "6*e/5", "7*e/2", "9*e/2", "2*e/9", "7*e/8", "8*e/7", "2*e/7"};

    public static boolean casoCoincide(String DatoEntrada) {
        for (String casoCoincide : casos) {
            if (DatoEntrada.equalsIgnoreCase(casoCoincide)) {
                return true;
            }
        } // fin for

        return false;
    }

}
