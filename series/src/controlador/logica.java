/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;

import java.awt.CardLayout;
import javax.swing.JOptionPane;
import modelo.Series;
import modelo.TablaCasos;
import modelo.ValidarEntrada;
import modelo.ValorTabla;
import vista.Vista;

/**
 *
 * @author steve
 */
public class logica {

    public logica(Vista vista) {
        this.vista = vista;

        // Se agrega el evento click para el label de iniciar.
        this.vista.labelIniciar.addMouseListener(new java.awt.event.MouseAdapter() {
            @Override
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                labelIniciarMouseClicked();
            }
        });

        // Evento para el label back de la ventana de seleccion y regresar a inicio.
        this.vista.btnBack.addMouseListener(new java.awt.event.MouseAdapter() {
            @Override
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                labelBackMouseClicked();
            }
        });

        // Evento para el label salir que cierra el programa.
        this.vista.labelSalir.addMouseListener(new java.awt.event.MouseAdapter() {
            @Override
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                labelSalirMouseClicked();
            }
        });

        // Evento para el labelSinEleccion y cambiar a la ventana del vistaSin.
        // no confundir con el labelSinX
        this.vista.labelSinEleccion.addMouseListener(new java.awt.event.MouseAdapter() {
            @Override
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                labelSinMouseClicked();
            }
        });

        // Evento para el boton labelBackSin en la ventana vistaSin y volver a la ventana de eleccion.
        this.vista.labelBackSin.addMouseListener(new java.awt.event.MouseAdapter() {
            @Override
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                backSinMouseClicked();
            }
        });

        // Evento para el labelIgualSinx que esta en la ventana de vistaSin, al presionar mostrara el valor del sinx.
        // No confundir con el labelSinEleccion.
        this.vista.labelIgualSinX.addMouseListener(new java.awt.event.MouseAdapter() {
            @Override
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnSinMouseClicked();
            }
        });

        // Evento para el labelLimpiarSin que esta en el vistaSin.
        // Limpiara el interior del txtSin y txtAreaSin.
        this.vista.labelLImpiarSin.addMouseListener(new java.awt.event.MouseAdapter() {
            @Override
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnLimpiarSinMouseClicked();
            }
        });

        // evento para el labelASinEleccion que esta en la ventana de eleccion.
        // cambiara a la ventana de vistaASin
        this.vista.labelASinEleccion.addMouseListener(new java.awt.event.MouseAdapter() {
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

        this.vista.txtAreaSinOutput.setLineWrap(true);

        this.vista.txtAreaSinOutput.setWrapStyleWord(true);

        this.vista.setVisible(true);
    }

    private void btnSinMouseClicked() {
        
        String input = this.vista.txtSinInput.getText();

        if (input.isEmpty()) {
            JOptionPane.showMessageDialog(null, "La entrada está vacía");
        } else {
            input = input.replaceAll("\\s", "");

            if (TablaCasos.casoCoincide(input)) {
                this.vista.txtAreaSinOutput.setText(Series.sin(ValorTabla.obtenerValor(input)));
            } else {

                if (ValidarEntrada.isValidNumber(input)) {
                    this.vista.txtAreaSinOutput.setText(Series.sin(Double.parseDouble(input)));
                }
            }
        }
            
       /* String input = this.vista.txtSinInput.getText();

        if (input.isEmpty()) {
            JOptionPane.showMessageDialog(null, "La entrada está vacía");
        } else {
            /*
            if (ValidarEntrada.evaluaExpresion(input)) {

                this.vista.txtAreaSinOutput.setText(Series.sin(Double.parseDouble(input)));

            }
             
        }*/

    }

    private void btnLimpiarSinMouseClicked() {

        this.vista.txtSinInput.setText("");
        this.vista.txtAreaSinOutput.setText("");

    }

    private void btnASinMouseClicked() {

        String input = this.vista.txtASin.getText();

        if (input.isEmpty()) {
            JOptionPane.showMessageDialog(null, "La entrada está vacía");
        } else {
            input = input.replaceAll("\\s", "");

            if (TablaCasos.casoCoincide(input)) {
                this.vista.txtAreaASin.setText(Series.arcoSin(ValorTabla.obtenerValor(input)));
            } else {

                if (ValidarEntrada.isValidNumber(input)) {
                    this.vista.txtAreaASin.setText(Series.arcoSin(Double.parseDouble(input)));
                }
            }

            /*
           try {
              //  double value = convertStringToDouble(s);
                //System.out.println("El valor de '" + s + "' es: " + value);
            } catch (NumberFormatException e) {
               // System.out.println("No se pudo convertir '" + s + "' a double: " + e.getMessage());
            }
            
            try {
                this.vista.txtAreaSinOutput.setText(Series.sin(Double.parseDouble(input)));
            } catch (ScriptException e) {
                JOptionPane.showMessageDialog(null, "Entrada invalida "+ e.getMessage());
            }
             */
        }
    }

    private void btnLimpiarASinMouseClicked() {

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
        this.vista.txtSinInput.setText("");
        this.vista.txtAreaSinOutput.setText("");
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
