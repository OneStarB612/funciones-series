/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;

import java.awt.CardLayout;
import java.math.BigDecimal;
import javax.swing.JOptionPane;
import modelo.Series;
import vista.Vista;

/**
 *
 * @author steve
 */
public class logica {
    
    
    
    public logica(Vista vista){
        this.vista = vista;
        
        //se agrega el evento click para iniciar
        this.vista.labelIniciar.addMouseListener(new java.awt.event.MouseAdapter() {
            @Override
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                labelIniciarMouseClicked();
            }
        });
        
        this.vista.btnBack.addMouseListener(new java.awt.event.MouseAdapter() {
            @Override
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                labelBackMouseClicked();
            }
        });
        
        this.vista.labelSalir.addMouseListener(new java.awt.event.MouseAdapter() {
            @Override
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                labelSalirMouseClicked();
            }
        });
        
        this.vista.labelSin.addMouseListener(new java.awt.event.MouseAdapter() {
            @Override
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                labelSinMouseClicked();
            }
        });
        
        this.vista.btnBackSin.addMouseListener(new java.awt.event.MouseAdapter() {
            @Override
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                backSinMouseClicked();
            }
        });
        
        this.vista.btnSin.addMouseListener(new java.awt.event.MouseAdapter() {
            @Override
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnSinMouseClicked();
            }
        });
        
        this.vista. btnLimpiarSin.addMouseListener(new java.awt.event.MouseAdapter() {
            @Override
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnLimpiarSinMouseClicked();
            }
        });
        
        this.vista. btnAsin.addMouseListener(new java.awt.event.MouseAdapter() {
            @Override
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnAsinMouseClicked();
            }
        });
        
        this.vista.btnBackASin.addMouseListener(new java.awt.event.MouseAdapter() {
            @Override
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnBackASinMouseClicked();
            }
        });
        
        this.vista.btnASin.addMouseListener(new java.awt.event.MouseAdapter() {
            @Override
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnASinMouseClicked();
            }
        });
        
        this.vista.btnLimpiarASin.addMouseListener(new java.awt.event.MouseAdapter() {
            @Override
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnLimpiarASinMouseClicked();
            }
        });
        
        this.vista.txtAreaSin.setLineWrap(true);
        
        this.vista.txtAreaSin.setWrapStyleWord(true);
        
        this.vista.setVisible(true);
    }
    
    
    public static boolean isValidNumber(String input) {
        int dotCount = 0;
        int dotminus = 0;
        
         if(input.equals(".")){
                JOptionPane.showMessageDialog(null, "Entrada inválida: no se ingreso un numero");
                return false;
            } else{
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
    
    private void btnSinMouseClicked() {                                    
        // TODO add your handling code here:
        String input = this.vista.txtSin.getText();
        
        if (input.isEmpty()) {
                    JOptionPane.showMessageDialog(null, "La entrada está vacía");
                } else {
                    if (isValidNumber(input)) {
                        
                        this.vista.txtAreaSin.setText(Series.sin(Double.parseDouble(input)));
                       
                    }
                }
        
    }
    
    private void btnLimpiarSinMouseClicked() {                                           
        // TODO add your handling code here:
        
        this.vista.txtSin.setText("");
        this.vista.txtAreaSin.setText("");
    } 
    
     private void btnASinMouseClicked() {                                     
        // TODO add your handling code here:
        
         String input = this.vista.txtASin.getText();
        
        if (input.isEmpty()) {
                    JOptionPane.showMessageDialog(null, "La entrada está vacía");
                } else {
                    if (isValidNumber(input)) {
                        
                        this.vista.txtAreaASin.setText(Series.arcoSin(Double.parseDouble(input)));
                       
                    }
                }
    }
     
     private void btnLimpiarASinMouseClicked() { 
         
        // TODO add your handling code here:
        
        this.vista.txtASin.setText("");
        this.vista.txtAreaASin.setText("");
    } 
    
        

    
    /*
    codigo para el manejo de eventos del label iniciar, al presionar se pasara a la vista de elecciones
    */
     private void labelIniciarMouseClicked() {                                          
        // TODO add your handling code here:
        card = (CardLayout) this.vista.prinCard.getLayout();
        
        card.show(this.vista.prinCard, "eleccion");
    }
     
     private void labelBackMouseClicked() {                                       
        // TODO add your handling code here:
        card = (CardLayout) this.vista.prinCard.getLayout();
        
        card.show(this.vista.prinCard, "principal");
    }   
     
      private void labelSalirMouseClicked() {                                        
        // TODO add your handling code here:
        
        this.vista.dispose();
    }

      
      private void labelSinMouseClicked() {                                      
        // TODO add your handling code here:
        card = (CardLayout) this.vista.prinCard.getLayout();
        
        card.show(this.vista.prinCard, "vistaSin");
    } 
    
       private void backSinMouseClicked() {                                     
        // TODO add your handling code here:
        card = (CardLayout) this.vista.prinCard.getLayout();
        
        card.show(this.vista.prinCard, "eleccion");
        this.vista.txtSin.setText("");
        this.vista.txtAreaSin.setText("");
    }   
    
        private void btnAsinMouseClicked() {                                     
        // TODO add your handling code here:
        
        card = (CardLayout) this.vista.prinCard.getLayout();
        
        card.show(this.vista.prinCard, "vistaASin");
    }
        
        private void btnBackASinMouseClicked() {                                         
        // TODO add your handling code here:
        
        card = (CardLayout) this.vista.prinCard.getLayout();
        
        card.show(this.vista.prinCard, "eleccion");
        this.vista.txtASin.setText("");
        this.vista.txtAreaASin.setText("");
        
    }

        
        
    private Vista vista;
    private CardLayout card;
}
