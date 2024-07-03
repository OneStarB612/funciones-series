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

        this.vista.btnASinIgual.addMouseListener(new java.awt.event.MouseAdapter() {
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
        
        this.vista.labelCosEleccion.addMouseListener(new java.awt.event.MouseAdapter() {
            @Override
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                labelCosEleccionMouseClicked();
            }
        });
        
         this.vista.btnBackCos.addMouseListener(new java.awt.event.MouseAdapter() {
            @Override
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnBackCosMouseClicked();
            }
        });
         
         this.vista.btnIgualCos.addMouseListener(new java.awt.event.MouseAdapter() {
            @Override
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnIgualCosMouseClicked();
            }
        });
         
        this.vista.btnLimpiarCos.addMouseListener(new java.awt.event.MouseAdapter() {
            @Override
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnLimpiarCosMouseClicked();
            }
        });
        
        this.vista.btnBackArcCos.addMouseListener(new java.awt.event.MouseAdapter() {
            @Override
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnBackArcCosMouseClicked();
            }
        });
        
        this.vista.labelArcCosEleccion.addMouseListener(new java.awt.event.MouseAdapter() {
            @Override
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                labelArcCosEleccionMouseClicked();
            }
        });
        
        this.vista.btnIgualArcCos.addMouseListener(new java.awt.event.MouseAdapter() {
            @Override
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnIgualArcCosMouseClicked();
            }
        });
        
        this.vista.btnLimpiarArcCos.addMouseListener(new java.awt.event.MouseAdapter() {
            @Override
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnLimpiarArcCosMouseClicked();
            }
        });
        
        this.vista.labelArcoTgEleccion.addMouseListener(new java.awt.event.MouseAdapter() {
            @Override
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                labelArcoTgEleccionMouseClicked();
            }
        });
        
        this.vista.btnBackArcTg.addMouseListener(new java.awt.event.MouseAdapter() {
            @Override
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnBackArcTgMouseClicked();
            }
        });
        
        this.vista.btnIgualArcTg.addMouseListener(new java.awt.event.MouseAdapter() {
            @Override
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnIgualArcTgMouseClicked();
            }
        });
        
        this.vista.btnLimpiarArcTg.addMouseListener(new java.awt.event.MouseAdapter() {
            @Override
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnLimpiarArcTgMouseClicked();
            }
        });
        
        

        this.vista.txtAreaSinOutput.setLineWrap(true);

        this.vista.txtAreaSinOutput.setWrapStyleWord(true);

        this.vista.setVisible(true);
    }
    
    private void labelSalirMouseClicked()
    {
        this.vista.dispose();
    }
    
    /*
    ********************************************************************************************
    ****Aqui comienzan los metodos para los eventos de click de aquellos labels encargados de***
    ****cambiar la vista de ventana del CardLayout actual por el de la serie seleccionada.******
    ****Ademas de los label de cada funcion que regresan de esa ventana a la vista de eleccion,*
    ****cada uno seguido por su correspondiente.************************************************
    ********************************************************************************************
    */
    
    // Metodo para pasar a la ventana de eleccion de series.
    private void labelIniciarMouseClicked()
    {
        card = (CardLayout) this.vista.prinCard.getLayout();

        card.show(this.vista.prinCard, "eleccion");
    }

    // Metodo para regresar de la ventana de eleccion a la ventana de inicio.
    private void labelBackMouseClicked()
    {
        card = (CardLayout) this.vista.prinCard.getLayout();

        card.show(this.vista.prinCard, "principal");
    }

    // Metodo para pasar de la ventana de eleccion a la ventana de Sin(x).
    private void labelSinMouseClicked() {
        
        card = (CardLayout) this.vista.prinCard.getLayout();

        card.show(this.vista.prinCard, "vistaSin");
    }

    private void backSinMouseClicked()
    {
        card = (CardLayout) this.vista.prinCard.getLayout();

        card.show(this.vista.prinCard, "eleccion");
        
        this.vista.txtSinInput.setText("");
        
        this.vista.txtAreaSinOutput.setText("");
    }
    
    private void labelCosEleccionMouseClicked()
    {
        card = (CardLayout) this.vista.prinCard.getLayout();

        card.show(this.vista.prinCard, "vistaCos");
    }
    
    private void btnBackCosMouseClicked()
    {
        card = (CardLayout) this.vista.prinCard.getLayout();

        card.show(this.vista.prinCard, "eleccion");
        
        this.vista.txtInputCos.setText("");
        
        this.vista.txtAreaOutputCos.setText("");
    }

    private void btnAsinMouseClicked()
    {
        card = (CardLayout) this.vista.prinCard.getLayout();

        card.show(this.vista.prinCard, "vistaASin");
    }

    private void btnBackASinMouseClicked()
    {
        card = (CardLayout) this.vista.prinCard.getLayout();

        card.show(this.vista.prinCard, "eleccion");
        
        this.vista.txtASinInput.setText("");
        
        this.vista.txtAreaASinOutput.setText("");

    }
    
    private void labelArcCosEleccionMouseClicked()
    {
        card = (CardLayout) this.vista.prinCard.getLayout();

        card.show(this.vista.prinCard, "vistaArcCos");
    } 
    
    private void btnBackArcCosMouseClicked()
    {
        card = (CardLayout) this.vista.prinCard.getLayout();

        card.show(this.vista.prinCard, "eleccion");
        
        this.vista.txtInputArcCos.setText("");
        
        this.vista.txtAreaOutputArcCos.setText("");
    }
    
    private void labelArcoTgEleccionMouseClicked()
    {
        card = (CardLayout) this.vista.prinCard.getLayout();

        card.show(this.vista.prinCard, "vistaArcTg");
    }
    
     private void btnBackArcTgMouseClicked()
    {
        card = (CardLayout) this.vista.prinCard.getLayout();

        card.show(this.vista.prinCard, "eleccion");
        
        this.vista.txtInputArcTg.setText("");
        
        this.vista.txtAreaOutputArcTg.setText("");
    }
    
    
    /*
    |------------------------------------------------------------------------------------------------|
    |----Aqui empiezan los metodos para los label de igual de cada vista de serie correspondiente,---|
    |----debajo de cada uno esta su label o boton para limpiar las entrada en el txt y txtArea.------|
    |------------------------------------------------------------------------------------------------|
    */
    
    
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

    private void btnLimpiarSinMouseClicked()
    {
        this.vista.txtSinInput.setText("");
        
        this.vista.txtAreaSinOutput.setText("");
    }
    
    private void btnIgualCosMouseClicked()
    {
       String input = this.vista.txtInputCos.getText();

       if (input.isEmpty()) {
           JOptionPane.showMessageDialog(null, "La entrada está vacía");
        } else {
            input = input.replaceAll("\\s", "");

            if (TablaCasos.casoCoincide(input)) {
                this.vista.txtAreaOutputCos.setText(Series.cos(ValorTabla.obtenerValor(input)));
            } else {

                if (ValidarEntrada.isValidNumber(input)) {
                    this.vista.txtAreaOutputCos.setText(Series.cos(Double.parseDouble(input)));
                }
            }
        }
    }
     
    private void btnLimpiarCosMouseClicked()
    {
       this.vista.txtInputCos.setText("");
        
       this.vista.txtAreaOutputCos.setText("");
    }

    private void btnASinMouseClicked()
    {

        String input = this.vista.txtASinInput.getText();

        if (input.isEmpty()) {
            JOptionPane.showMessageDialog(null, "La entrada está vacía");
        } else {
            input = input.replaceAll("\\s", "");

            if (TablaCasos.casoCoincide(input)) {
                this.vista.txtAreaASinOutput.setText(Series.arcoSin(ValorTabla.obtenerValor(input)));
            } else {

                if (ValidarEntrada.isValidNumber(input)) {
                    this.vista.txtAreaASinOutput.setText(Series.arcoSin(Double.parseDouble(input)));
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
    
    private void btnLimpiarASinMouseClicked()
    {
        this.vista.txtASinInput.setText("");
        
        this.vista.txtAreaASinOutput.setText("");
    }
    
    private void btnIgualArcCosMouseClicked()
    {
       String input = this.vista.txtInputArcCos.getText();

       if (input.isEmpty()) {
           JOptionPane.showMessageDialog(null, "La entrada está vacía");
        } else {
            input = input.replaceAll("\\s", "");

            if (TablaCasos.casoCoincide(input)) {
                this.vista.txtAreaOutputArcCos.setText(Series.arcCos(ValorTabla.obtenerValor(input)));
            } else {

                if (ValidarEntrada.isValidNumber(input)) {
                    this.vista.txtAreaOutputArcCos.setText(Series.arcCos(Double.parseDouble(input)));
                }
            }
        }
    }
    
    private void btnLimpiarArcCosMouseClicked()
    {
        this.vista.txtInputArcCos.setText("");
        
        this.vista.txtAreaOutputArcCos.setText("");
    }
    
    private void btnIgualArcTgMouseClicked()
    {
       String input = this.vista.txtInputArcTg.getText();

       if (input.isEmpty()) {
           JOptionPane.showMessageDialog(null, "La entrada está vacía");
        } else {
            input = input.replaceAll("\\s", "");

            if (TablaCasos.casoCoincide(input)) {
                this.vista.txtAreaOutputArcTg.setText(Series.arcTg(ValorTabla.obtenerValor(input)));
            } else {

                if (ValidarEntrada.isValidNumber(input)) {
                    this.vista.txtAreaOutputArcTg.setText(Series.arcTg(Double.parseDouble(input)));
                }
            }
        }
    }
    
    private void btnLimpiarArcTgMouseClicked()
    {
        this.vista.txtInputArcTg.setText("");
        
        this.vista.txtAreaOutputArcTg.setText("");
    }


    // variables
    private Vista vista;
    private CardLayout card;
}
