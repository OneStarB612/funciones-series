/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;

import java.awt.CardLayout;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import modelo.Series;
import modelo.TablaCasos;
import modelo.ValidarEntrada;
import modelo.ValorTabla;
import vista.Vista;

/**
 *
 * @author bryan, steve
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

        // Evento para el labelIgualSinx que esta en la ventana de vistaSin, 
        //al presionar mostrara el valor del sinx.
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

        this.vista.btnBackTg.addMouseListener(new java.awt.event.MouseAdapter() {
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

        this.vista.labelExpx.addMouseListener(new java.awt.event.MouseAdapter() {
            @Override
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                labelExpxMouseClicked();
            }
        });

        this.vista.btnIgualExpx.addMouseListener(new java.awt.event.MouseAdapter() {
            @Override
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnIgualExpxMouseClicked();
            }
        });

        this.vista.btnLimpiarExpx.addMouseListener(new java.awt.event.MouseAdapter() {
            @Override
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnLimpiarExpxMouseClicked();
            }
        });

        this.vista.btnBackExpx.addMouseListener(new java.awt.event.MouseAdapter() {
            @Override
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnBackExpxMouseClicked();
            }
        });

        this.vista.labelLn.addMouseListener(new java.awt.event.MouseAdapter() {
            @Override
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                labelLnMouseClicked();
            }
        });

        this.vista.btnBackLn.addMouseListener(new java.awt.event.MouseAdapter() {
            @Override
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnBackLnMouseClicked();
            }
        });

        this.vista.btnIgualLn.addMouseListener(new java.awt.event.MouseAdapter() {
            @Override
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnIgualLnMouseClicked();
            }
        });

        this.vista.btnLimpiarLn.addMouseListener(new java.awt.event.MouseAdapter() {
            @Override
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnLimpiarLnMouseClicked();
            }
        });

        this.vista.labelSinh.addMouseListener(new java.awt.event.MouseAdapter() {
            @Override
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                labelSinhMouseClicked();
            }
        });

        this.vista.btnBackSinh.addMouseListener(new java.awt.event.MouseAdapter() {
            @Override
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnBackSinhMouseClicked();
            }
        });

        this.vista.btnIgualSinh.addMouseListener(new java.awt.event.MouseAdapter() {
            @Override
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnIgualSinhMouseClicked();
            }
        });

        this.vista.btnLimpiarSinh.addMouseListener(new java.awt.event.MouseAdapter() {
            @Override
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnLimpiarSinhMouseClicked();
            }
        });

        this.vista.labelCosh.addMouseListener(new java.awt.event.MouseAdapter() {
            @Override
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                labelCoshMouseClicked();
            }
        });

        this.vista.btnBackCosh.addMouseListener(new java.awt.event.MouseAdapter() {
            @Override
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnBackCoshMouseClicked();
            }
        });

        this.vista.btnIgualCosh.addMouseListener(new java.awt.event.MouseAdapter() {
            @Override
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnIgualCoshMouseClicked();
            }
        });

        this.vista.btnLimpiarCosh.addMouseListener(new java.awt.event.MouseAdapter() {
            @Override
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnLimpiarCoshMouseClicked();
            }
        });

        this.vista.labelAtgh.addMouseListener(new java.awt.event.MouseAdapter() {
            @Override
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                labelAtghMouseClicked();
            }
        });

        this.vista.btnBackAtgh.addMouseListener(new java.awt.event.MouseAdapter() {
            @Override
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnBackAtghMouseClicked();
            }
        });

        this.vista.btnIgualAtgh.addMouseListener(new java.awt.event.MouseAdapter() {
            @Override
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnIgualAtghMouseClicked();
            }
        });

        this.vista.btnLimpiarAtgh.addMouseListener(new java.awt.event.MouseAdapter() {
            @Override
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnLimpiarAtghMouseClicked();
            }
        });

        this.vista.labelAcoth.addMouseListener(new java.awt.event.MouseAdapter() {
            @Override
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                labelAcothMouseClicked();
            }
        });

        this.vista.btnBackAcoth.addMouseListener(new java.awt.event.MouseAdapter() {
            @Override
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnBackAcothMouseClicked();
            }
        });

        this.vista.btnIgualAcoth.addMouseListener(new java.awt.event.MouseAdapter() {
            @Override
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnIgualAcothMouseClicked();
            }
        });

        this.vista.btnLimpiarAcoth.addMouseListener(new java.awt.event.MouseAdapter() {
            @Override
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnLimpiarAcothMouseClicked();
            }
        });
        
        this.vista.labelExpSin.addMouseListener(new java.awt.event.MouseAdapter() {
            @Override
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                labelExpSinMouseClicked();
            }
        });
        
        this.vista.btnBackExpSin.addMouseListener(new java.awt.event.MouseAdapter() {
            @Override
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnBackExpSinMouseClicked();
            }
        });
        
        this.vista.btnIgualExpSin.addMouseListener(new java.awt.event.MouseAdapter() {
            @Override
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnIgualExpSinMouseClicked();
            }
        });
        
        this.vista.btnLimpiarExpSin.addMouseListener(new java.awt.event.MouseAdapter() {
            @Override
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnLimpiarExpSinMouseClicked();
            }
        });
        
        this.vista.labelExpCos.addMouseListener(new java.awt.event.MouseAdapter() {
            @Override
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                labelExpCosMouseClicked();
            }
        });
        
        this.vista.btnBackExpCos.addMouseListener(new java.awt.event.MouseAdapter() {
            @Override
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnBackExpCosMouseClicked();
            }
        });
        
        this.vista.btnIgualExpCos.addMouseListener(new java.awt.event.MouseAdapter() {
            @Override
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnIgualExpCosMouseClicked();
            }
        });
        
        this.vista.btnLimpiarExpCos.addMouseListener(new java.awt.event.MouseAdapter() {
            @Override
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnLimpiarExpCosMouseClicked();
            }
        });
        
        this.vista.labelW.addMouseListener(new java.awt.event.MouseAdapter() {
            @Override
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                labelWMouseClicked();
            }
        });
        
        this.vista.btnBackW.addMouseListener(new java.awt.event.MouseAdapter() {
            @Override
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnBackWMouseClicked();
            }
        });
        
        this.vista.btnIgualW.addMouseListener(new java.awt.event.MouseAdapter() {
            @Override
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnIgualWMouseClicked();
            }
        });
        
        ImageIcon logo = new ImageIcon("src/imagenes/LogoPrincipal.png");

        this.vista.setIconImage(logo.getImage());

        
        this.vista.txtAreaSinOutput.setLineWrap(true);

        this.vista.txtAreaSinOutput.setWrapStyleWord(true);

        this.vista.txtAreaASinOutput.setLineWrap(true);

        this.vista.txtAreaASinOutput.setWrapStyleWord(true);

        this.vista.txtAreaOutputArcCos.setLineWrap(true);

        this.vista.txtAreaOutputArcCos.setWrapStyleWord(true);

        this.vista.txtAreaOutputArcTg.setLineWrap(true);

        this.vista.txtAreaOutputArcTg.setWrapStyleWord(true);

        this.vista.txtAreaOutputCos.setLineWrap(true);

        this.vista.txtAreaOutputCos.setWrapStyleWord(true);

        this.vista.txtAreaOutputExpx.setLineWrap(true);

        this.vista.txtAreaOutputExpx.setWrapStyleWord(true);

        this.vista.txtAreaOutputLn.setLineWrap(true);

        this.vista.txtAreaOutputLn.setWrapStyleWord(true);

        this.vista.setVisible(true);
    }

    private void labelSalirMouseClicked() {
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
    private void labelIniciarMouseClicked() {
        card = (CardLayout) this.vista.prinCard.getLayout();

        card.show(this.vista.prinCard, "eleccion");
    }

    // Metodo para regresar de la ventana de eleccion a la ventana de inicio.
    private void labelBackMouseClicked() {
        card = (CardLayout) this.vista.prinCard.getLayout();

        card.show(this.vista.prinCard, "principal");
    }

    // Metodo para pasar de la ventana de eleccion a la ventana de Sin(x).
    private void labelSinMouseClicked() {

        card = (CardLayout) this.vista.prinCard.getLayout();

        card.show(this.vista.prinCard, "vistaSin");
    }

    private void backSinMouseClicked() {
        card = (CardLayout) this.vista.prinCard.getLayout();

        card.show(this.vista.prinCard, "eleccion");

        this.vista.txtSinInput.setText("");

        this.vista.txtAreaSinOutput.setText("");
    }

    private void labelCosEleccionMouseClicked() {
        card = (CardLayout) this.vista.prinCard.getLayout();

        card.show(this.vista.prinCard, "vistaCos");
    }

    private void btnBackCosMouseClicked() {
        card = (CardLayout) this.vista.prinCard.getLayout();

        card.show(this.vista.prinCard, "eleccion");

        this.vista.txtInputCos.setText("");

        this.vista.txtAreaOutputCos.setText("");
    }

    private void btnAsinMouseClicked() {
        card = (CardLayout) this.vista.prinCard.getLayout();

        card.show(this.vista.prinCard, "vistaASin");
    }

    private void btnBackASinMouseClicked() {
        card = (CardLayout) this.vista.prinCard.getLayout();

        card.show(this.vista.prinCard, "eleccion");

        this.vista.txtASinInput.setText("");

        this.vista.txtAreaASinOutput.setText("");

    }

    private void labelArcCosEleccionMouseClicked() {
        card = (CardLayout) this.vista.prinCard.getLayout();

        card.show(this.vista.prinCard, "vistaArcCos");
    }

    private void btnBackArcCosMouseClicked() {
        card = (CardLayout) this.vista.prinCard.getLayout();

        card.show(this.vista.prinCard, "eleccion");

        this.vista.txtInputArcCos.setText("");

        this.vista.txtAreaOutputArcCos.setText("");
    }

    private void labelArcoTgEleccionMouseClicked() {
        card = (CardLayout) this.vista.prinCard.getLayout();

        card.show(this.vista.prinCard, "vistaArcTg");
    }

    private void btnBackArcTgMouseClicked() {
        card = (CardLayout) this.vista.prinCard.getLayout();

        card.show(this.vista.prinCard, "eleccion");

        this.vista.txtInputArcTg.setText("");

        this.vista.txtAreaOutputArcTg.setText("");
    }

    private void labelExpxMouseClicked() {

        card = (CardLayout) this.vista.prinCard.getLayout();

        card.show(this.vista.prinCard, "vistaExpx");

    }

    private void btnBackExpxMouseClicked() {
        card = (CardLayout) this.vista.prinCard.getLayout();

        card.show(this.vista.prinCard, "eleccion");

        this.vista.txtInputExpx.setText("");

        this.vista.txtAreaOutputExpx.setText("");

    }

    private void labelLnMouseClicked() {

        card = (CardLayout) this.vista.prinCard.getLayout();

        card.show(this.vista.prinCard, "vistaLn");

    }

    private void btnBackLnMouseClicked() {
        card = (CardLayout) this.vista.prinCard.getLayout();

        card.show(this.vista.prinCard, "eleccion");

        this.vista.txtInputLn.setText("");

        this.vista.txtAreaOutputLn.setText("");
    }

    private void labelSinhMouseClicked() {
        card = (CardLayout) this.vista.prinCard.getLayout();

        card.show(this.vista.prinCard, "vistaSinh");
    }

    private void btnBackSinhMouseClicked() {
        card = (CardLayout) this.vista.prinCard.getLayout();

        card.show(this.vista.prinCard, "eleccion");

        this.vista.txtInputSinh.setText("");

        this.vista.txtAreaOutputSinh.setText("");
    }

    private void labelCoshMouseClicked() {
        card = (CardLayout) this.vista.prinCard.getLayout();

        card.show(this.vista.prinCard, "vistaCosh");
    }

    private void btnBackCoshMouseClicked() {
        card = (CardLayout) this.vista.prinCard.getLayout();

        card.show(this.vista.prinCard, "eleccion");

        this.vista.txtInputCosh.setText("");

        this.vista.txtAreaOutputCosh.setText("");
    }

    private void labelAtghMouseClicked() {
        card = (CardLayout) this.vista.prinCard.getLayout();

        card.show(this.vista.prinCard, "vistaAtgh");
    }

    private void btnBackAtghMouseClicked() {
        card = (CardLayout) this.vista.prinCard.getLayout();

        card.show(this.vista.prinCard, "eleccion");

        this.vista.txtInputAtgh.setText("");

        this.vista.txtAreaOutputAtgh.setText("");
    }

    private void labelAcothMouseClicked() {
        card = (CardLayout) this.vista.prinCard.getLayout();

        card.show(this.vista.prinCard, "vistaAcoth");

    }

    private void btnBackAcothMouseClicked() {
        card = (CardLayout) this.vista.prinCard.getLayout();

        card.show(this.vista.prinCard, "eleccion");

        this.vista.txtInputAcoth.setText("");

        this.vista.txtAreaOutputAcoth.setText("");

    }
    
    private void labelExpSinMouseClicked(){
        card = (CardLayout) this.vista.prinCard.getLayout();

        card.show(this.vista.prinCard, "vistaExpSin");
    }
    
    private void btnBackExpSinMouseClicked(){
    
        card = (CardLayout) this.vista.prinCard.getLayout();

        card.show(this.vista.prinCard, "eleccion");

        this.vista.txtInputExpSin.setText("");

        this.vista.txtAreaOutputExpSin.setText("");
    }
    
    private void labelExpCosMouseClicked(){
        card = (CardLayout) this.vista.prinCard.getLayout();

        card.show(this.vista.prinCard, "vistaExpCos");
    }
    
    private void btnBackExpCosMouseClicked(){
        card = (CardLayout) this.vista.prinCard.getLayout();

        card.show(this.vista.prinCard, "eleccion");

        this.vista.txtInputExpCos.setText("");

        this.vista.txtAreaOutputExpCos.setText("");
    }
    
    private void labelWMouseClicked(){
        card = (CardLayout) this.vista.prinCard.getLayout();

        card.show(this.vista.prinCard, "vistaW");
    }
    
    private void btnBackWMouseClicked(){
        card = (CardLayout) this.vista.prinCard.getLayout();

        card.show(this.vista.prinCard, "eleccion");

        this.vista.txtInputW.setText("");

        this.vista.txtAreaOutputW.setText("");
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
            ImageIcon icono = new ImageIcon("src/imagenes/logoverde.png");
            JOptionPane.showMessageDialog(null, "hola", "Entrada vacia", 0, icono);
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

    private void btnIgualCosMouseClicked() {
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

    private void btnLimpiarCosMouseClicked() {
        this.vista.txtInputCos.setText("");

        this.vista.txtAreaOutputCos.setText("");
    }

    private void btnASinMouseClicked() {

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

    private void btnLimpiarASinMouseClicked() {
        this.vista.txtASinInput.setText("");

        this.vista.txtAreaASinOutput.setText("");
    }

    private void btnIgualArcCosMouseClicked() {
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

    private void btnLimpiarArcCosMouseClicked() {
        this.vista.txtInputArcCos.setText("");

        this.vista.txtAreaOutputArcCos.setText("");
    }

    private void btnIgualArcTgMouseClicked() {
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

    private void btnLimpiarArcTgMouseClicked() {
        this.vista.txtInputArcTg.setText("");

        this.vista.txtAreaOutputArcTg.setText("");
    }

    private void btnIgualExpxMouseClicked() {
        String input = this.vista.txtInputExpx.getText();

        if (input.isEmpty()) {
            JOptionPane.showMessageDialog(null, "La entrada está vacía");
        } else {
            input = input.replaceAll("\\s", "");

            if (TablaCasos.casoCoincide(input)) {
                this.vista.txtAreaOutputExpx.setText(Series.expx(ValorTabla.obtenerValor(input)));
            } else {

                if (ValidarEntrada.isValidNumber(input)) {
                    this.vista.txtAreaOutputExpx.setText(Series.expx(Double.parseDouble(input)));
                }
            }
        }

    }

    private void btnLimpiarExpxMouseClicked() {

        this.vista.txtInputExpx.setText("");

        this.vista.txtAreaOutputExpx.setText("");

    }

    private void btnIgualLnMouseClicked() {
        String input = this.vista.txtInputLn.getText();

        if (input.isEmpty()) {
            JOptionPane.showMessageDialog(null, "La entrada está vacía");
        } else {
            input = input.replaceAll("\\s", "");

            if (TablaCasos.casoCoincide(input)) {
                this.vista.txtAreaOutputLn.setText(Series.ln(ValorTabla.obtenerValor(input)));
            } else {

                if (ValidarEntrada.isValidNumber(input)) {
                    this.vista.txtAreaOutputLn.setText(Series.ln(Double.parseDouble(input)));
                }
            }
        }
    }

    private void btnLimpiarLnMouseClicked() {

        this.vista.txtInputLn.setText("");

        this.vista.txtAreaOutputLn.setText("");
    }

    private void btnIgualSinhMouseClicked() {
        String input = this.vista.txtInputSinh.getText();

        if (input.isEmpty()) {
            JOptionPane.showMessageDialog(null, "La entrada está vacía");
        } else {
            input = input.replaceAll("\\s", "");

            if (TablaCasos.casoCoincide(input)) {
                this.vista.txtAreaOutputSinh.setText(Series.sinh(ValorTabla.obtenerValor(input)));
            } else {

                if (ValidarEntrada.isValidNumber(input)) {
                    this.vista.txtAreaOutputSinh.setText(Series.sinh(Double.parseDouble(input)));
                }
            }
        }
    }

    private void btnLimpiarSinhMouseClicked() {
        this.vista.txtInputSinh.setText("");

        this.vista.txtAreaOutputSinh.setText("");
    }

    private void btnIgualCoshMouseClicked() {
        String input = this.vista.txtInputCosh.getText();

        if (input.isEmpty()) {
            JOptionPane.showMessageDialog(null, "La entrada está vacía");
        } else {
            input = input.replaceAll("\\s", "");

            if (TablaCasos.casoCoincide(input)) {
                this.vista.txtAreaOutputCosh.setText(Series.cosh(ValorTabla.obtenerValor(input)));
            } else {

                if (ValidarEntrada.isValidNumber(input)) {
                    this.vista.txtAreaOutputCosh.setText(Series.cosh(Double.parseDouble(input)));
                }
            }
        }
    }

    private void btnLimpiarCoshMouseClicked() {
        this.vista.txtInputCosh.setText("");

        this.vista.txtAreaOutputCosh.setText("");

    }

    private void btnIgualAtghMouseClicked() {
        String input = this.vista.txtInputAtgh.getText();

        if (input.isEmpty()) {
            JOptionPane.showMessageDialog(null, "La entrada está vacía");
        } else {
            input = input.replaceAll("\\s", "");

            if (TablaCasos.casoCoincide(input)) {
                this.vista.txtAreaOutputAtgh.setText(Series.atgh(ValorTabla.obtenerValor(input)));
            } else {

                if (ValidarEntrada.isValidNumber(input)) {
                    this.vista.txtAreaOutputAtgh.setText(Series.atgh(Double.parseDouble(input)));
                }
            }
        }
    }

    private void btnLimpiarAtghMouseClicked() {
        this.vista.txtInputAtgh.setText("");

        this.vista.txtAreaOutputAtgh.setText("");
    }

    private void btnIgualAcothMouseClicked() {

        String input = this.vista.txtInputAcoth.getText();

        if (input.isEmpty()) {
            JOptionPane.showMessageDialog(null, "La entrada está vacía");
        } else {
            input = input.replaceAll("\\s", "");

            if (TablaCasos.casoCoincide(input)) {
                this.vista.txtAreaOutputAcoth.setText(Series.acoth(ValorTabla.obtenerValor(input)));
            } else {

                if (ValidarEntrada.isValidNumber(input)) {
                    this.vista.txtAreaOutputAcoth.setText(Series.acoth(Double.parseDouble(input)));
                }
            }
        }

    }

    private void btnLimpiarAcothMouseClicked() {
        this.vista.txtInputAcoth.setText("");

        this.vista.txtAreaOutputAcoth.setText("");
    }
    
    private void btnIgualExpSinMouseClicked(){
        String input = this.vista.txtInputExpSin.getText();

        if (input.isEmpty()) {
            JOptionPane.showMessageDialog(null, "La entrada está vacía");
        } else {
            input = input.replaceAll("\\s", "");

            if (TablaCasos.casoCoincide(input)) {
                this.vista.txtAreaOutputExpSin.setText(Series.expSin(ValorTabla.obtenerValor(input)));
            } else {

                if (ValidarEntrada.isValidNumber(input)) {
                    this.vista.txtAreaOutputExpSin.setText(Series.expSin(Double.parseDouble(input)));
                }
            }
        }
        
    }
    
    private void btnLimpiarExpSinMouseClicked(){
        this.vista.txtInputExpSin.setText("");

        this.vista.txtAreaOutputExpSin.setText("");
    }
    
    private void btnIgualExpCosMouseClicked(){
       String input = this.vista.txtInputExpCos.getText();

        if (input.isEmpty()) {
            JOptionPane.showMessageDialog(null, "La entrada está vacía");
        } else {
            input = input.replaceAll("\\s", "");

            if (TablaCasos.casoCoincide(input)) {
                this.vista.txtAreaOutputExpCos.setText(Series.expSin(ValorTabla.obtenerValor(input)));
            } else {

                if (ValidarEntrada.isValidNumber(input)) {
                    this.vista.txtAreaOutputExpCos.setText(Series.expCos(Double.parseDouble(input)));
                }
            }
        }
    }
    
    private void btnLimpiarExpCosMouseClicked(){
        this.vista.txtInputExpCos.setText("");

        this.vista.txtAreaOutputExpCos.setText("");
    }
    
    private void btnIgualWMouseClicked(){
        String input = this.vista.txtInputW.getText();

        if (input.isEmpty()) {
            JOptionPane.showMessageDialog(null, "La entrada está vacía");
        } else {
            input = input.replaceAll("\\s", "");

            if (TablaCasos.casoCoincide(input)) {
                this.vista.txtAreaOutputW.setText(Series.w(ValorTabla.obtenerValor(input)));
            } else {

                if (ValidarEntrada.isValidNumber(input)) {
                    this.vista.txtAreaOutputW.setText(Series.w(Double.parseDouble(input)));
                }
            }
        }
    }
    // variables
    private Vista vista;
    private CardLayout card;
}
