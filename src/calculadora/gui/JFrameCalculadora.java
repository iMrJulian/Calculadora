/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculadora.gui;
import calculadora.sistema.*;
/**
 *
 * @author Estudiantes
 */
public class JFrameCalculadora extends javax.swing.JFrame {
    Sistema display;
    int cambioNumero;
    /**
     * Creates new form JFrameCalculadora
     */
    public JFrameCalculadora() {
        initComponents();
        display = new Sistema();
        cambioNumero = 1;   
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextField1 = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtpDisplay = new javax.swing.JTextPane();
        jbtnNumero1 = new javax.swing.JButton();
        jbtnNumero2 = new javax.swing.JButton();
        jbtnNumero3 = new javax.swing.JButton();
        jbtnNumero4 = new javax.swing.JButton();
        jbtnNumero5 = new javax.swing.JButton();
        jbtnNumero6 = new javax.swing.JButton();
        jbtnNumero7 = new javax.swing.JButton();
        jbtnNumero8 = new javax.swing.JButton();
        jbtnNumero9 = new javax.swing.JButton();
        jbtnNumero0 = new javax.swing.JButton();
        jbtnNumeroB = new javax.swing.JButton();
        jbtnNumeroD = new javax.swing.JButton();
        jbtnNumeroC = new javax.swing.JButton();
        jbtnNumeroE = new javax.swing.JButton();
        jbtnNumeroA = new javax.swing.JButton();
        jbtnNumeroF = new javax.swing.JButton();
        jrbtnBinario = new javax.swing.JRadioButton();
        jrbtnOctal = new javax.swing.JRadioButton();
        jrbtnDecimal = new javax.swing.JRadioButton();
        jrbtnHexa = new javax.swing.JRadioButton();
        jbtnSuma = new javax.swing.JButton();
        jbtnMultiplicacion = new javax.swing.JButton();
        jbtnResta = new javax.swing.JButton();
        jbtnDivision = new javax.swing.JButton();

        jTextField1.setText("jTextField1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jtpDisplay.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        jtpDisplay.setEnabled(false);
        jScrollPane1.setViewportView(jtpDisplay);

        jbtnNumero1.setText("1");
        jbtnNumero1.setEnabled(false);
        jbtnNumero1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnNumero1ActionPerformed(evt);
            }
        });

        jbtnNumero2.setText("2");
        jbtnNumero2.setEnabled(false);
        jbtnNumero2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnNumero2ActionPerformed(evt);
            }
        });

        jbtnNumero3.setText("3");
        jbtnNumero3.setEnabled(false);
        jbtnNumero3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnNumero3ActionPerformed(evt);
            }
        });

        jbtnNumero4.setText("4");
        jbtnNumero4.setEnabled(false);
        jbtnNumero4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnNumero4ActionPerformed(evt);
            }
        });

        jbtnNumero5.setText("5");
        jbtnNumero5.setEnabled(false);
        jbtnNumero5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnNumero5ActionPerformed(evt);
            }
        });

        jbtnNumero6.setText("6");
        jbtnNumero6.setEnabled(false);
        jbtnNumero6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnNumero6ActionPerformed(evt);
            }
        });

        jbtnNumero7.setText("7");
        jbtnNumero7.setEnabled(false);
        jbtnNumero7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnNumero7ActionPerformed(evt);
            }
        });

        jbtnNumero8.setText("8");
        jbtnNumero8.setEnabled(false);
        jbtnNumero8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnNumero8ActionPerformed(evt);
            }
        });

        jbtnNumero9.setText("9");
        jbtnNumero9.setEnabled(false);
        jbtnNumero9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnNumero9ActionPerformed(evt);
            }
        });

        jbtnNumero0.setText("0");
        jbtnNumero0.setEnabled(false);
        jbtnNumero0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnNumero0ActionPerformed(evt);
            }
        });

        jbtnNumeroB.setText("B");
        jbtnNumeroB.setEnabled(false);
        jbtnNumeroB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnNumeroBActionPerformed(evt);
            }
        });

        jbtnNumeroD.setText("D");
        jbtnNumeroD.setEnabled(false);
        jbtnNumeroD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnNumeroDActionPerformed(evt);
            }
        });

        jbtnNumeroC.setText("C");
        jbtnNumeroC.setEnabled(false);
        jbtnNumeroC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnNumeroCActionPerformed(evt);
            }
        });

        jbtnNumeroE.setText("E");
        jbtnNumeroE.setEnabled(false);
        jbtnNumeroE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnNumeroEActionPerformed(evt);
            }
        });

        jbtnNumeroA.setText("A");
        jbtnNumeroA.setEnabled(false);
        jbtnNumeroA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnNumeroAActionPerformed(evt);
            }
        });

        jbtnNumeroF.setText("F");
        jbtnNumeroF.setEnabled(false);
        jbtnNumeroF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnNumeroFActionPerformed(evt);
            }
        });

        jrbtnBinario.setText("Binario");
        jrbtnBinario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jrbtnBinarioActionPerformed(evt);
            }
        });

        jrbtnOctal.setText("Octal");
        jrbtnOctal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jrbtnOctalActionPerformed(evt);
            }
        });

        jrbtnDecimal.setText("Decimal");
        jrbtnDecimal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jrbtnDecimalActionPerformed(evt);
            }
        });

        jrbtnHexa.setText("Hexadecimal");
        jrbtnHexa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jrbtnHexaActionPerformed(evt);
            }
        });

        jbtnSuma.setText("+");
        jbtnSuma.setEnabled(false);
        jbtnSuma.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnSumaActionPerformed(evt);
            }
        });

        jbtnMultiplicacion.setText("X");
        jbtnMultiplicacion.setEnabled(false);
        jbtnMultiplicacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnMultiplicacionActionPerformed(evt);
            }
        });

        jbtnResta.setText("-");
        jbtnResta.setEnabled(false);
        jbtnResta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnRestaActionPerformed(evt);
            }
        });

        jbtnDivision.setText("/");
        jbtnDivision.setEnabled(false);
        jbtnDivision.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnDivisionActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(51, 51, 51)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 414, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(32, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jbtnNumeroC, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(38, 38, 38)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jbtnNumero4)
                                    .addComponent(jbtnNumero1)))
                            .addComponent(jbtnNumero0, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jbtnNumero7, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(jbtnNumeroF, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jbtnNumeroD, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jbtnNumeroA, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jbtnNumero8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jbtnNumeroE, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jbtnNumeroB, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(jbtnNumero9, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                        .addComponent(jbtnNumero5)
                                        .addGap(18, 18, 18)
                                        .addComponent(jbtnNumero6, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                        .addComponent(jbtnNumero2)
                                        .addGap(18, 18, 18)
                                        .addComponent(jbtnNumero3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                .addGap(45, 45, 45)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jbtnSuma, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jbtnResta, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jbtnMultiplicacion, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jbtnDivision, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jrbtnDecimal)
                            .addComponent(jrbtnBinario)
                            .addComponent(jrbtnHexa)
                            .addComponent(jrbtnOctal))
                        .addGap(11, 11, 11))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(44, 44, 44)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jbtnNumero2, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jbtnNumero1, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jbtnNumero3, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jbtnSuma, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jbtnNumero4, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jbtnNumero6, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jbtnNumero5, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jbtnResta, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jbtnNumero7, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jbtnNumero9, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jbtnNumero8, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jbtnMultiplicacion, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jrbtnBinario)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jrbtnOctal)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jrbtnDecimal)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jrbtnHexa)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbtnNumeroB, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbtnNumeroA, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbtnNumero0, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbtnDivision, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbtnNumeroC, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbtnNumeroD, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbtnNumeroE, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jbtnNumeroF, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(22, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbtnNumero5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnNumero5ActionPerformed
//        if (cambioNumero==1){
//            display.numero1+="5";
//            jtpDisplay.setText(display.numero1);
//        }
        jtpDisplay.setText(jtpDisplay.getText()+"5");
    }//GEN-LAST:event_jbtnNumero5ActionPerformed

    private void jbtnNumero1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnNumero1ActionPerformed
        if (cambioNumero==1){
        display.numero1+="1";
        jtpDisplay.setText(display.numero1);
        }
    }//GEN-LAST:event_jbtnNumero1ActionPerformed

    private void jrbtnBinarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jrbtnBinarioActionPerformed
        jrbtnOctal.setSelected(false);
        jrbtnDecimal.setSelected(false);
        jrbtnHexa.setSelected(false);
        
        jbtnNumero0.setEnabled(true);
        jbtnNumero1.setEnabled(true);
    }//GEN-LAST:event_jrbtnBinarioActionPerformed

    private void jrbtnOctalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jrbtnOctalActionPerformed
        jrbtnBinario.setSelected(false);
        jrbtnDecimal.setSelected(false);
        jrbtnHexa.setSelected(false);
        
        jbtnNumero0.setEnabled(true);
        jbtnNumero1.setEnabled(true);
        jbtnNumero2.setEnabled(true);
        jbtnNumero3.setEnabled(true);
        jbtnNumero4.setEnabled(true);
        jbtnNumero5.setEnabled(true);
        jbtnNumero6.setEnabled(true);
        jbtnNumero7.setEnabled(true);
    }//GEN-LAST:event_jrbtnOctalActionPerformed

    private void jrbtnDecimalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jrbtnDecimalActionPerformed
        jrbtnBinario.setSelected(false);
        jrbtnOctal.setSelected(false);
        jrbtnHexa.setSelected(false);
        
        jbtnNumero0.setEnabled(true);
        jbtnNumero1.setEnabled(true);
        jbtnNumero2.setEnabled(true);
        jbtnNumero3.setEnabled(true);
        jbtnNumero4.setEnabled(true);
        jbtnNumero5.setEnabled(true);
        jbtnNumero6.setEnabled(true);
        jbtnNumero7.setEnabled(true);
        jbtnNumero8.setEnabled(true);
        jbtnNumero9.setEnabled(true);       
    }//GEN-LAST:event_jrbtnDecimalActionPerformed

    private void jrbtnHexaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jrbtnHexaActionPerformed
        jrbtnBinario.setSelected(false);
        jrbtnOctal.setSelected(false);
        jrbtnDecimal.setSelected(false);
        
        jbtnNumero0.setEnabled(true);
        jbtnNumero1.setEnabled(true);
        jbtnNumero2.setEnabled(true);
        jbtnNumero3.setEnabled(true);
        jbtnNumero4.setEnabled(true);
        jbtnNumero5.setEnabled(true);
        jbtnNumero6.setEnabled(true);
        jbtnNumero7.setEnabled(true);
        jbtnNumero8.setEnabled(true);
        jbtnNumero9.setEnabled(true);
        jbtnNumeroA.setEnabled(true);
        jbtnNumeroB.setEnabled(true);
        jbtnNumeroC.setEnabled(true);
        jbtnNumeroD.setEnabled(true);
        jbtnNumeroE.setEnabled(true);        
        jbtnNumeroF.setEnabled(true);  
    }//GEN-LAST:event_jrbtnHexaActionPerformed

    private void jbtnNumero2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnNumero2ActionPerformed
        if (cambioNumero==1){
        display.numero1+="2";
        jtpDisplay.setText(display.numero1);
        }
    }//GEN-LAST:event_jbtnNumero2ActionPerformed

    private void jbtnNumero3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnNumero3ActionPerformed
        if (cambioNumero==1){
        display.numero1+="3";
        jtpDisplay.setText(display.numero1);
        }
    }//GEN-LAST:event_jbtnNumero3ActionPerformed

    private void jbtnNumero4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnNumero4ActionPerformed
        if (cambioNumero==1){
        display.numero1+="4";
        jtpDisplay.setText(display.numero1);
        }
    }//GEN-LAST:event_jbtnNumero4ActionPerformed

    private void jbtnNumero6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnNumero6ActionPerformed
        if (cambioNumero==1){
        display.numero1+="6";
        jtpDisplay.setText(display.numero1);
        }
    }//GEN-LAST:event_jbtnNumero6ActionPerformed

    private void jbtnNumero7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnNumero7ActionPerformed
        if (cambioNumero==1){
        display.numero1+="7";
        jtpDisplay.setText(display.numero1);
        }
    }//GEN-LAST:event_jbtnNumero7ActionPerformed

    private void jbtnNumero8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnNumero8ActionPerformed
        if (cambioNumero==1){
        display.numero1+="8";
        jtpDisplay.setText(display.numero1);
    }//GEN-LAST:event_jbtnNumero8ActionPerformed

    private void jbtnNumero9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnNumero9ActionPerformed
        display.numero1+="9";
        jtpDisplay.setText(display.numero1);
    }//GEN-LAST:event_jbtnNumero9ActionPerformed

    private void jbtnNumero0ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnNumero0ActionPerformed
        display.numero1+="0";
        jtpDisplay.setText(display.numero1);
    }//GEN-LAST:event_jbtnNumero0ActionPerformed

    private void jbtnNumeroAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnNumeroAActionPerformed
        display.numero1+="A";
        jtpDisplay.setText(display.numero1);
    }//GEN-LAST:event_jbtnNumeroAActionPerformed

    private void jbtnNumeroBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnNumeroBActionPerformed
        display.numero1+="B";
        jtpDisplay.setText(display.numero1);
    }//GEN-LAST:event_jbtnNumeroBActionPerformed

    private void jbtnNumeroCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnNumeroCActionPerformed
        display.numero1+="C";
        jtpDisplay.setText(display.numero1);
    }//GEN-LAST:event_jbtnNumeroCActionPerformed

    private void jbtnNumeroDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnNumeroDActionPerformed
        display.numero1+="D";
        jtpDisplay.setText(display.numero1);
    }//GEN-LAST:event_jbtnNumeroDActionPerformed

    private void jbtnNumeroEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnNumeroEActionPerformed
        display.numero1+="E";
        jtpDisplay.setText(display.numero1);
    }//GEN-LAST:event_jbtnNumeroEActionPerformed

    private void jbtnNumeroFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnNumeroFActionPerformed
        display.numero1+="F";
        jtpDisplay.setText(display.numero1);
    }//GEN-LAST:event_jbtnNumeroFActionPerformed

    private void jbtnSumaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnSumaActionPerformed
        
    }//GEN-LAST:event_jbtnSumaActionPerformed

    private void jbtnRestaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnRestaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jbtnRestaActionPerformed

    private void jbtnMultiplicacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnMultiplicacionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jbtnMultiplicacionActionPerformed

    private void jbtnDivisionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnDivisionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jbtnDivisionActionPerformed

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
            java.util.logging.Logger.getLogger(JFrameCalculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JFrameCalculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JFrameCalculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JFrameCalculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JFrameCalculadora().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JButton jbtnDivision;
    private javax.swing.JButton jbtnMultiplicacion;
    private javax.swing.JButton jbtnNumero0;
    private javax.swing.JButton jbtnNumero1;
    private javax.swing.JButton jbtnNumero2;
    private javax.swing.JButton jbtnNumero3;
    private javax.swing.JButton jbtnNumero4;
    private javax.swing.JButton jbtnNumero5;
    private javax.swing.JButton jbtnNumero6;
    private javax.swing.JButton jbtnNumero7;
    private javax.swing.JButton jbtnNumero8;
    private javax.swing.JButton jbtnNumero9;
    private javax.swing.JButton jbtnNumeroA;
    private javax.swing.JButton jbtnNumeroB;
    private javax.swing.JButton jbtnNumeroC;
    private javax.swing.JButton jbtnNumeroD;
    private javax.swing.JButton jbtnNumeroE;
    private javax.swing.JButton jbtnNumeroF;
    private javax.swing.JButton jbtnResta;
    private javax.swing.JButton jbtnSuma;
    private javax.swing.JRadioButton jrbtnBinario;
    private javax.swing.JRadioButton jrbtnDecimal;
    private javax.swing.JRadioButton jrbtnHexa;
    private javax.swing.JRadioButton jrbtnOctal;
    private javax.swing.JTextPane jtpDisplay;
    // End of variables declaration//GEN-END:variables
}