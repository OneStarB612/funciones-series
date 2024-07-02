/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

import javax.swing.JOptionPane;

/**
 *
 * @author steve
 */
public class ValidarEntrada {

    public static boolean isValidNumber(String input) {
        int dotCount = 0;
        int dotminus = 0;

        if (input.equals(".")) {
            JOptionPane.showMessageDialog(null, "Entrada inválida: no se ingreso un numero");
            return false;
        } else {
            for (char c : input.toCharArray()) {
                if (!Character.isDigit(c) && c != '.' && c != '-') {
                    JOptionPane.showMessageDialog(null, "Entrada inválida: solo se permiten números y un punto decimal.");
                    return false;
                }
                if (c == '.') {
                    dotCount++;
                    if (dotCount > 1) {
                        JOptionPane.showMessageDialog(null, "Entrada inválida: solo se permite un punto decimal.");
                        return false;
                    }
                }

                if (c == '-') {
                    dotminus++;
                    if (dotminus > 1) {
                        JOptionPane.showMessageDialog(null, "Entrada inválida: solo se permite un signo menos.");
                        return false;
                    }
                }

            }
        }
        return true;
    }

    private static boolean verificarPuntosDecimales(String expresion) {
        char[] caracteres = expresion.toCharArray();
        boolean puntoAnterior = false;
        for (char c : caracteres) {
            if (c == '.') {
                if (puntoAnterior) {
                    return false;
                }
                puntoAnterior = true;
            } 
        }

           return true;
            
    }
}
