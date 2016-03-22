package clientcalculator;

import java.awt.Toolkit;
import java.awt.event.ItemEvent;
import java.awt.event.KeyEvent;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class CalculatorGUI extends javax.swing.JFrame {

    public CalculatorGUI() {
        initComponents();
    }


    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton10 = new javax.swing.JButton();
        jButton12 = new javax.swing.JButton();
        jButton14 = new javax.swing.JButton();
        jButton15 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jColorChooser1 = new javax.swing.JColorChooser();
        jDialog1 = new javax.swing.JDialog();
        dugme1 = new javax.swing.JButton();
        dugme7 = new javax.swing.JButton();
        dugme8 = new javax.swing.JButton();
        dugme5 = new javax.swing.JButton();
        dugme9 = new javax.swing.JButton();
        dugme6 = new javax.swing.JButton();
        dugme3 = new javax.swing.JButton();
        dugme4 = new javax.swing.JButton();
        dugme2 = new javax.swing.JButton();
        dugmeTacka = new javax.swing.JButton();
        dugmeSabiranje = new javax.swing.JButton();
        dugmeOduzimanje = new javax.swing.JButton();
        dugmeMnozenje = new javax.swing.JButton();
        dugmePodeljeno = new javax.swing.JButton();
        CDugme = new javax.swing.JButton();
        rezultat = new javax.swing.JTextField();
        backspace = new javax.swing.JButton();
        jednako = new javax.swing.JButton();
        dugme0 = new javax.swing.JButton();
        dugmeZnak = new javax.swing.JToggleButton();

        jButton10.setText("jButton1");

        jButton12.setText("jButton12");

        jButton14.setText("jButton12");

        jButton15.setText("jButton12");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jDialog1Layout = new javax.swing.GroupLayout(jDialog1.getContentPane());
        jDialog1.getContentPane().setLayout(jDialog1Layout);
        jDialog1Layout.setHorizontalGroup(
            jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jDialog1Layout.setVerticalGroup(
            jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Calculator");
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("icon.png")));
        setLocation(new java.awt.Point(200, 120));
        setMaximumSize(new java.awt.Dimension(350, 410));
        setMinimumSize(new java.awt.Dimension(350, 410));
        setPreferredSize(new java.awt.Dimension(350, 410));
        setResizable(false);

        dugme1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/clientcalculator/1.png"))); // NOI18N
        dugme1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dugme1ActionPerformed(evt);
            }
        });

        dugme7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/clientcalculator/7.png"))); // NOI18N
        dugme7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dugme7ActionPerformed(evt);
            }
        });

        dugme8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/clientcalculator/8.png"))); // NOI18N
        dugme8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dugme8ActionPerformed(evt);
            }
        });

        dugme5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/clientcalculator/5.png"))); // NOI18N
        dugme5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dugme5ActionPerformed(evt);
            }
        });

        dugme9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/clientcalculator/9.png"))); // NOI18N
        dugme9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dugme9ActionPerformed(evt);
            }
        });

        dugme6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/clientcalculator/6.png"))); // NOI18N
        dugme6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dugme6ActionPerformed(evt);
            }
        });

        dugme3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/clientcalculator/3.png"))); // NOI18N
        dugme3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dugme3ActionPerformed(evt);
            }
        });

        dugme4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/clientcalculator/4.png"))); // NOI18N
        dugme4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dugme4ActionPerformed(evt);
            }
        });

        dugme2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/clientcalculator/2.png"))); // NOI18N
        dugme2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dugme2ActionPerformed(evt);
            }
        });

        dugmeTacka.setIcon(new javax.swing.ImageIcon(getClass().getResource("/clientcalculator/point.png"))); // NOI18N
        dugmeTacka.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dugmeTackaActionPerformed(evt);
            }
        });

        dugmeSabiranje.setIcon(new javax.swing.ImageIcon(getClass().getResource("/clientcalculator/plus.png"))); // NOI18N
        dugmeSabiranje.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dugmeSabiranjeActionPerformed(evt);
            }
        });

        dugmeOduzimanje.setIcon(new javax.swing.ImageIcon(getClass().getResource("/clientcalculator/minus.png"))); // NOI18N
        dugmeOduzimanje.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dugmeOduzimanjeActionPerformed(evt);
            }
        });

        dugmeMnozenje.setIcon(new javax.swing.ImageIcon(getClass().getResource("/clientcalculator/multiple.png"))); // NOI18N
        dugmeMnozenje.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dugmeMnozenjeActionPerformed(evt);
            }
        });

        dugmePodeljeno.setIcon(new javax.swing.ImageIcon(getClass().getResource("/clientcalculator/divide.png"))); // NOI18N
        dugmePodeljeno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dugmePodeljenoActionPerformed(evt);
            }
        });

        CDugme.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        CDugme.setIcon(new javax.swing.ImageIcon(getClass().getResource("/clientcalculator/c.png"))); // NOI18N
        CDugme.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CDugmeActionPerformed(evt);
            }
        });

        rezultat.setEditable(false);
        rezultat.setBackground(new java.awt.Color(244, 244, 244));
        rezultat.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        rezultat.setSelectionColor(new java.awt.Color(255, 0, 0));
        rezultat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rezultatActionPerformed(evt);
            }
        });

        backspace.setIcon(new javax.swing.ImageIcon(getClass().getResource("/clientcalculator/backspace.png"))); // NOI18N
        backspace.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backspaceActionPerformed(evt);
            }
        });

        jednako.setBackground(new java.awt.Color(130, 130, 130));
        jednako.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jednako.setIcon(new javax.swing.ImageIcon(getClass().getResource("/clientcalculator/equal.png"))); // NOI18N
        jednako.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jednako.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jednakoActionPerformed(evt);
            }
        });

        dugme0.setIcon(new javax.swing.ImageIcon(getClass().getResource("/clientcalculator/0.png"))); // NOI18N
        dugme0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dugme0ActionPerformed(evt);
            }
        });

        dugmeZnak.setIcon(new javax.swing.ImageIcon(getClass().getResource("/clientcalculator/+-.png"))); // NOI18N
        dugmeZnak.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                dugmeZnakItemStateChanged(evt);
            }
        });
        dugmeZnak.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dugmeZnakActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(29, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(rezultat)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(dugme1, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(dugme7, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(dugme4, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(CDugme, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(dugmeZnak, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(dugme5, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(dugme6, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(dugme2, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(dugme0, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(dugme3, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(dugmeTacka, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(dugme8, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(backspace, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(dugme9, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addGap(37, 37, 37)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(dugmeSabiranje, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(dugmeOduzimanje, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(dugmePodeljeno, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(dugmeMnozenje, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jednako, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(16, 16, 16)))
                .addGap(21, 21, 21))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(43, Short.MAX_VALUE)
                .addComponent(rezultat, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(11, 11, 11)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(CDugme, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(backspace, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(dugme7, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(dugme4, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(dugme1, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(dugme8, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(dugme9, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(dugme6, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(dugme3, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(dugme5, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(11, 11, 11)
                                        .addComponent(dugme2, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(dugmeSabiranje, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(dugmeOduzimanje, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(dugmePodeljeno, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(dugmeMnozenje, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(49, 49, 49)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(dugme0, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(dugmeTacka, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jednako, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(dugmeZnak, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(19, 19, 19))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void dugme1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dugme1ActionPerformed
        rezultat.setText(rezultat.getText() + "1");
    }//GEN-LAST:event_dugme1ActionPerformed

    private void dugme4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dugme4ActionPerformed
        rezultat.setText(rezultat.getText() + "4");
    }//GEN-LAST:event_dugme4ActionPerformed

    private void CDugmeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CDugmeActionPerformed
        rezultat.setText("");
        ukljuciDugmice();
    }//GEN-LAST:event_CDugmeActionPerformed

    private void dugmeSabiranjeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dugmeSabiranjeActionPerformed
        rezultat.setText(rezultat.getText() + "+");
        iskljuciDugmice();
    }//GEN-LAST:event_dugmeSabiranjeActionPerformed

    private void dugmeTackaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dugmeTackaActionPerformed
        rezultat.setText(rezultat.getText() + ".");
    }//GEN-LAST:event_dugmeTackaActionPerformed

    private void dugme2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dugme2ActionPerformed
        rezultat.setText(rezultat.getText() + "2");
    }//GEN-LAST:event_dugme2ActionPerformed

    private void dugme3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dugme3ActionPerformed
        rezultat.setText(rezultat.getText() + "3");
    }//GEN-LAST:event_dugme3ActionPerformed

    private void dugme5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dugme5ActionPerformed
        rezultat.setText(rezultat.getText() + "5");
    }//GEN-LAST:event_dugme5ActionPerformed

    private void dugme6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dugme6ActionPerformed
        rezultat.setText(rezultat.getText() + "6");
    }//GEN-LAST:event_dugme6ActionPerformed

    private void dugme7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dugme7ActionPerformed
        rezultat.setText(rezultat.getText() + "7");
    }//GEN-LAST:event_dugme7ActionPerformed

    private void dugme8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dugme8ActionPerformed
        rezultat.setText(rezultat.getText() + "8");
    }//GEN-LAST:event_dugme8ActionPerformed

    private void dugme9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dugme9ActionPerformed
        rezultat.setText(rezultat.getText() + "9");
    }//GEN-LAST:event_dugme9ActionPerformed

    private void dugmeOduzimanjeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dugmeOduzimanjeActionPerformed
        rezultat.setText(rezultat.getText() + "-");
        iskljuciDugmice();
    }//GEN-LAST:event_dugmeOduzimanjeActionPerformed

    private void dugmeMnozenjeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dugmeMnozenjeActionPerformed
        rezultat.setText(rezultat.getText() + "*");
        iskljuciDugmice();
    }//GEN-LAST:event_dugmeMnozenjeActionPerformed

    private void dugmePodeljenoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dugmePodeljenoActionPerformed
        rezultat.setText(rezultat.getText() + "/");
        iskljuciDugmice();
    }//GEN-LAST:event_dugmePodeljenoActionPerformed

    private void backspaceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backspaceActionPerformed
        rezultat.setText(rezultat.getText().substring(0, rezultat.getText().length() - 1));
        ukljuciDugmice();
    }//GEN-LAST:event_backspaceActionPerformed

    private void rezultatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rezultatActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rezultatActionPerformed

    private void jednakoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jednakoActionPerformed
        ukljuciDugmice();
        String rezultatServeru = rezultat.getText();
        CalculatorClient c = new CalculatorClient();

        try {
            String rezultatOdServera = c.izracunaj(rezultatServeru);

            rezultat.setText(rezultatOdServera);
        } catch (Exception ex) {
            Logger.getLogger(CalculatorGUI.class.getName()).log(Level.SEVERE, null, ex);
        }

    }//GEN-LAST:event_jednakoActionPerformed

    private void dugme0ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dugme0ActionPerformed
                rezultat.setText(rezultat.getText() + "0");
    }//GEN-LAST:event_dugme0ActionPerformed

    private void dugmeZnakActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dugmeZnakActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_dugmeZnakActionPerformed

    private void dugmeZnakItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_dugmeZnakItemStateChanged
        if(evt.getStateChange() == ItemEvent.SELECTED){
            rezultat.setText("-" + rezultat.getText());
        }
        else{
            rezultat.setText((rezultat.getText()).substring(1));
        }
    }//GEN-LAST:event_dugmeZnakItemStateChanged
/**/
    public void ukljuciDugmice() {
        dugmeOduzimanje.setEnabled(true);
        dugmeSabiranje.setEnabled(true);
        dugmeMnozenje.setEnabled(true);
        dugmePodeljeno.setEnabled(true);
        
    }

    public void iskljuciDugmice() {
        dugmeOduzimanje.setEnabled(false);
        dugmeSabiranje.setEnabled(false);
        dugmeMnozenje.setEnabled(false);
        dugmePodeljeno.setEnabled(false);
        
    }

    public static void main(String args[]) throws IOException {
        try {
            
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }

        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CalculatorGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        java.awt.EventQueue.invokeLater(() -> {
            new CalculatorGUI().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton CDugme;
    private javax.swing.JButton backspace;
    public javax.swing.JButton dugme0;
    private javax.swing.JButton dugme1;
    private javax.swing.JButton dugme2;
    private javax.swing.JButton dugme3;
    private javax.swing.JButton dugme4;
    private javax.swing.JButton dugme5;
    private javax.swing.JButton dugme6;
    private javax.swing.JButton dugme7;
    private javax.swing.JButton dugme8;
    private javax.swing.JButton dugme9;
    private javax.swing.JButton dugmeMnozenje;
    private javax.swing.JButton dugmeOduzimanje;
    private javax.swing.JButton dugmePodeljeno;
    private javax.swing.JButton dugmeSabiranje;
    private javax.swing.JButton dugmeTacka;
    private javax.swing.JToggleButton dugmeZnak;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton12;
    private javax.swing.JButton jButton14;
    private javax.swing.JButton jButton15;
    private javax.swing.JColorChooser jColorChooser1;
    private javax.swing.JDialog jDialog1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton jednako;
    private javax.swing.JTextField rezultat;
    // End of variables declaration//GEN-END:variables

}
