package Interfaz;

import Codigo.Tienda;
import Codigo.Animal;
import java.awt.Color;

public class Principal extends javax.swing.JFrame {
    
    Animal animalUno;
    Animal animalDos;
    Animal animalTres;
    Animal animalCuatro;
    
    Tienda tiendaLego;

    public Principal() {
        initComponents();
        this.setLocationRelativeTo(null);
        btnMasviejo.setVisible(false);
        txtViejo.setVisible(false);
        btnMasCaro.setVisible(false);
        txtMasCaro.setVisible(false);
        
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jColorChooser1 = new javax.swing.JColorChooser();
        jColorChooser2 = new javax.swing.JColorChooser();
        jColorChooser3 = new javax.swing.JColorChooser();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtTipoUno = new javax.swing.JTextField();
        txtEdadUno = new javax.swing.JTextField();
        txtPrecioUno = new javax.swing.JTextField();
        btnAgregarUno = new javax.swing.JButton();
        btnEnfermoUno = new javax.swing.JButton();
        txtEdadDos = new javax.swing.JTextField();
        txtPrecioDos = new javax.swing.JTextField();
        btnAgregarDos = new javax.swing.JButton();
        btnEnfermoDos = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        txtTipoDos = new javax.swing.JTextField();
        btnAgregarTres = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        txtPrecioTres = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        txtEdadTres = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        txtTipoTres = new javax.swing.JTextField();
        btnEnfermoTres = new javax.swing.JButton();
        txtEdadCuatro = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        btnEnfermoCuatro = new javax.swing.JButton();
        txtTipoCuatro = new javax.swing.JTextField();
        txtPrecioCuatro = new javax.swing.JTextField();
        btnAgregarCuatro = new javax.swing.JButton();
        btnMasviejo = new javax.swing.JButton();
        btnMasCaro = new javax.swing.JButton();
        txtViejo = new javax.swing.JTextField();
        txtMasCaro = new javax.swing.JTextField();
        btnMostrarOpciones = new javax.swing.JButton();
        lblCorazonUno = new javax.swing.JLabel();
        lblCorazonDos = new javax.swing.JLabel();
        lblCorazonTres = new javax.swing.JLabel();
        lblCorazonCuatro = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 51, 51));

        jLabel1.setText("Animal 1");

        jLabel2.setBackground(new java.awt.Color(51, 255, 204));
        jLabel2.setText("Tipo");

        jLabel3.setText("Edad");

        jLabel4.setText("Precio");

        txtTipoUno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTipoUnoActionPerformed(evt);
            }
        });

        btnAgregarUno.setBackground(new java.awt.Color(204, 255, 255));
        btnAgregarUno.setText("Agregar");
        btnAgregarUno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarUnoActionPerformed(evt);
            }
        });

        btnEnfermoUno.setBackground(new java.awt.Color(204, 255, 255));
        btnEnfermoUno.setText("Enfermo");
        btnEnfermoUno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEnfermoUnoActionPerformed(evt);
            }
        });

        txtEdadDos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtEdadDosActionPerformed(evt);
            }
        });

        btnAgregarDos.setBackground(new java.awt.Color(204, 255, 255));
        btnAgregarDos.setText("Agregar");
        btnAgregarDos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarDosActionPerformed(evt);
            }
        });

        btnEnfermoDos.setBackground(new java.awt.Color(204, 255, 255));
        btnEnfermoDos.setText("Enfermo");
        btnEnfermoDos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEnfermoDosActionPerformed(evt);
            }
        });

        jLabel5.setText("Animal 2");

        jLabel6.setText("Tipo");

        jLabel7.setText("Edad");

        jLabel8.setText("Precio");

        btnAgregarTres.setBackground(new java.awt.Color(204, 255, 255));
        btnAgregarTres.setText("Agregar");
        btnAgregarTres.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarTresActionPerformed(evt);
            }
        });

        jLabel9.setText("Tipo");

        jLabel10.setText("Edad");

        jLabel11.setText("Animal 3");

        jLabel12.setText("Precio");

        btnEnfermoTres.setBackground(new java.awt.Color(204, 255, 255));
        btnEnfermoTres.setText("Enfermo");
        btnEnfermoTres.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEnfermoTresActionPerformed(evt);
            }
        });

        jLabel13.setText("Precio");

        jLabel14.setText("Edad");

        jLabel15.setText("Tipo");

        jLabel16.setText("Animal 4");

        btnEnfermoCuatro.setBackground(new java.awt.Color(204, 255, 255));
        btnEnfermoCuatro.setText("Enfermo");
        btnEnfermoCuatro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEnfermoCuatroActionPerformed(evt);
            }
        });

        btnAgregarCuatro.setBackground(new java.awt.Color(204, 255, 255));
        btnAgregarCuatro.setText("Agregar");
        btnAgregarCuatro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarCuatroActionPerformed(evt);
            }
        });

        btnMasviejo.setBackground(new java.awt.Color(204, 255, 255));
        btnMasviejo.setText("Mas viejo");
        btnMasviejo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMasviejoActionPerformed(evt);
            }
        });

        btnMasCaro.setBackground(new java.awt.Color(204, 255, 255));
        btnMasCaro.setText("Mas Caro");
        btnMasCaro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMasCaroActionPerformed(evt);
            }
        });

        btnMostrarOpciones.setBackground(new java.awt.Color(204, 255, 255));
        btnMostrarOpciones.setText("Mostrar Opciones");
        btnMostrarOpciones.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMostrarOpcionesActionPerformed(evt);
            }
        });

        lblCorazonUno.setText("♥");

        lblCorazonDos.setText("♥");

        lblCorazonTres.setText("♥");

        lblCorazonCuatro.setText("♥");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel11)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel4)
                                        .addGap(39, 39, 39)
                                        .addComponent(txtPrecioUno, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addGroup(layout.createSequentialGroup()
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(jLabel10)
                                                .addComponent(jLabel12))
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                                .addComponent(txtPrecioTres, javax.swing.GroupLayout.DEFAULT_SIZE, 84, Short.MAX_VALUE)
                                                .addComponent(txtEdadTres)))
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(jLabel9)
                                            .addGap(50, 50, 50)
                                            .addComponent(txtTipoTres, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                            .addComponent(jLabel3)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(txtEdadUno, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(jLabel2)
                                            .addGap(50, 50, 50)
                                            .addComponent(txtTipoUno, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(34, 34, 34)
                                        .addComponent(lblCorazonTres))
                                    .addGroup(layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(btnEnfermoUno)
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                .addComponent(btnEnfermoTres, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(btnAgregarTres, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                            .addComponent(btnAgregarUno, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(34, 34, 34)
                                        .addComponent(lblCorazonUno)))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 207, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel6)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(txtTipoDos, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel7)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(txtEdadDos, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel8)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txtPrecioDos, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(btnEnfermoDos)
                                            .addComponent(btnAgregarDos, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(40, 40, 40)
                                        .addComponent(lblCorazonDos)))
                                .addGap(121, 121, 121))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(4, 4, 4)
                                        .addComponent(jLabel5))
                                    .addComponent(jLabel16)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel15)
                                            .addComponent(jLabel14)
                                            .addComponent(jLabel13))
                                        .addGap(20, 20, 20)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                            .addComponent(txtPrecioCuatro)
                                            .addComponent(txtEdadCuatro, javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(txtTipoCuatro, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                    .addComponent(btnEnfermoCuatro, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                    .addComponent(btnAgregarCuatro, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                            .addGroup(layout.createSequentialGroup()
                                                .addGap(42, 42, 42)
                                                .addComponent(lblCorazonCuatro)))))
                                .addGap(107, 107, 107))))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(btnMasCaro)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(txtMasCaro))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(btnMasviejo)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(txtViejo, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(btnMostrarOpciones))
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(btnEnfermoUno)
                    .addComponent(jLabel6)
                    .addComponent(txtTipoDos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnEnfermoDos)
                    .addComponent(txtTipoUno))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(txtEdadDos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(btnAgregarDos))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(btnAgregarUno)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(txtPrecioDos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel8)
                                .addComponent(lblCorazonDos))
                            .addComponent(lblCorazonUno)))
                    .addComponent(jLabel7)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(txtEdadUno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(txtPrecioUno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(142, 142, 142)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel16)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtTipoCuatro, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel15)
                                .addComponent(btnEnfermoCuatro)))
                        .addGap(8, 8, 8)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel14)
                            .addComponent(txtEdadCuatro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnAgregarCuatro))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel13)
                            .addComponent(txtPrecioCuatro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblCorazonCuatro)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel11)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(txtTipoTres, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(btnEnfermoTres))
                            .addComponent(jLabel9))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(8, 8, 8)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(txtEdadTres, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btnAgregarTres)))
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel10)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel12)
                            .addComponent(txtPrecioTres, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblCorazonTres))))
                .addGap(38, 38, 38)
                .addComponent(btnMostrarOpciones)
                .addGap(40, 40, 40)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnMasviejo)
                    .addComponent(txtViejo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnMasCaro)
                    .addComponent(txtMasCaro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(98, 98, 98))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnMasviejoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMasviejoActionPerformed
       
        txtViejo.setText(tiendaLego.darMasViejo());
    }//GEN-LAST:event_btnMasviejoActionPerformed

    private void txtTipoUnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTipoUnoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTipoUnoActionPerformed

    private void btnMasCaroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMasCaroActionPerformed
        txtMasCaro.setText(tiendaLego.darMasCaro());
    }//GEN-LAST:event_btnMasCaroActionPerformed

    private void btnAgregarUnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarUnoActionPerformed
        
        String tipo = txtTipoUno.getText();
        int edad = Integer.parseInt(txtEdadUno.getText());
        int precio = Integer.parseInt(txtPrecioUno.getText());
        
        
        animalUno = new Animal(tipo, edad, precio, false);
        
    }//GEN-LAST:event_btnAgregarUnoActionPerformed

    private void btnEnfermoUnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEnfermoUnoActionPerformed
        
        animalUno.setEnfermo(true);
        
        if(animalUno.isEnfermo() == true){
            lblCorazonUno.setForeground(Color.red);
        }
    }//GEN-LAST:event_btnEnfermoUnoActionPerformed

    private void btnAgregarTresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarTresActionPerformed
        
         String tipo = txtTipoTres.getText();
        int edad = Integer.parseInt(txtEdadTres.getText());
        int precio = Integer.parseInt(txtPrecioTres.getText());
        
        
        animalTres = new Animal(tipo, edad, precio, false);
    }//GEN-LAST:event_btnAgregarTresActionPerformed

    private void btnAgregarDosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarDosActionPerformed
        
        String tipo = txtTipoDos.getText();
        int edad = Integer.parseInt(txtEdadDos.getText());
        int precio = Integer.parseInt(txtPrecioDos.getText());
        
        
        animalDos = new Animal(tipo, edad, precio, false);
    }//GEN-LAST:event_btnAgregarDosActionPerformed

    private void btnAgregarCuatroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarCuatroActionPerformed
        
         String tipo = txtTipoCuatro.getText();
        int edad = Integer.parseInt(txtEdadCuatro.getText());
        int precio = Integer.parseInt(txtPrecioCuatro.getText());
        
        
        animalCuatro = new Animal(tipo, edad, precio, false);
    }//GEN-LAST:event_btnAgregarCuatroActionPerformed

    private void txtEdadDosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtEdadDosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtEdadDosActionPerformed

    private void btnMostrarOpcionesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMostrarOpcionesActionPerformed
          
        btnMasviejo.setVisible(true);
        txtViejo.setVisible(true);
        btnMasCaro.setVisible(true);
        txtMasCaro.setVisible(true);
        tiendaLego = new Tienda(animalUno, animalDos, animalTres, animalCuatro);        
    }//GEN-LAST:event_btnMostrarOpcionesActionPerformed

    private void btnEnfermoDosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEnfermoDosActionPerformed
        
        animalDos.setEnfermo(true);
        
        if(animalDos.isEnfermo() == true){
            lblCorazonDos.setForeground(Color.red);
        }
    }//GEN-LAST:event_btnEnfermoDosActionPerformed

    private void btnEnfermoTresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEnfermoTresActionPerformed
        
        animalTres.setEnfermo(true);
        
        if(animalTres.isEnfermo() == true){
            lblCorazonTres.setForeground(Color.red);
        }
    }//GEN-LAST:event_btnEnfermoTresActionPerformed

    private void btnEnfermoCuatroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEnfermoCuatroActionPerformed
        
        animalCuatro.setEnfermo(true);
        
        if(animalCuatro.isEnfermo() == true){
            lblCorazonCuatro.setForeground(Color.red);
        }
    }//GEN-LAST:event_btnEnfermoCuatroActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Principal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAgregarCuatro;
    private javax.swing.JButton btnAgregarDos;
    private javax.swing.JButton btnAgregarTres;
    private javax.swing.JButton btnAgregarUno;
    private javax.swing.JButton btnEnfermoCuatro;
    private javax.swing.JButton btnEnfermoDos;
    private javax.swing.JButton btnEnfermoTres;
    private javax.swing.JButton btnEnfermoUno;
    private javax.swing.JButton btnMasCaro;
    private javax.swing.JButton btnMasviejo;
    private javax.swing.JButton btnMostrarOpciones;
    private javax.swing.JColorChooser jColorChooser1;
    private javax.swing.JColorChooser jColorChooser2;
    private javax.swing.JColorChooser jColorChooser3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel lblCorazonCuatro;
    private javax.swing.JLabel lblCorazonDos;
    private javax.swing.JLabel lblCorazonTres;
    private javax.swing.JLabel lblCorazonUno;
    private javax.swing.JTextField txtEdadCuatro;
    private javax.swing.JTextField txtEdadDos;
    private javax.swing.JTextField txtEdadTres;
    private javax.swing.JTextField txtEdadUno;
    private javax.swing.JTextField txtMasCaro;
    private javax.swing.JTextField txtPrecioCuatro;
    private javax.swing.JTextField txtPrecioDos;
    private javax.swing.JTextField txtPrecioTres;
    private javax.swing.JTextField txtPrecioUno;
    private javax.swing.JTextField txtTipoCuatro;
    private javax.swing.JTextField txtTipoDos;
    private javax.swing.JTextField txtTipoTres;
    private javax.swing.JTextField txtTipoUno;
    private javax.swing.JTextField txtViejo;
    // End of variables declaration//GEN-END:variables
}
