package clientcalculator;

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
        dugme0 = new javax.swing.JButton();
        rezultat = new javax.swing.JTextField();
        backspace = new javax.swing.JButton();
        jednako = new javax.swing.JButton();

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

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Calculator");
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setMaximumSize(new java.awt.Dimension(280, 280));
        setMinimumSize(new java.awt.Dimension(280, 280));
        setResizable(false);

        dugme1.setText("1");
        dugme1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dugme1ActionPerformed(evt);
            }
        });

        dugme7.setText("7");
        dugme7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dugme7ActionPerformed(evt);
            }
        });

        dugme8.setText("8");
        dugme8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dugme8ActionPerformed(evt);
            }
        });

        dugme5.setText("5");
        dugme5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dugme5ActionPerformed(evt);
            }
        });

        dugme9.setText("9");
        dugme9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dugme9ActionPerformed(evt);
            }
        });

        dugme6.setText("6");
        dugme6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dugme6ActionPerformed(evt);
            }
        });

        dugme3.setText("3");
        dugme3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dugme3ActionPerformed(evt);
            }
        });

        dugme4.setText("4");
        dugme4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dugme4ActionPerformed(evt);
            }
        });

        dugme2.setText("2");
        dugme2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dugme2ActionPerformed(evt);
            }
        });

        dugmeTacka.setText(".");
        dugmeTacka.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dugmeTackaActionPerformed(evt);
            }
        });

        dugmeSabiranje.setText("+");
        dugmeSabiranje.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dugmeSabiranjeActionPerformed(evt);
            }
        });

        dugmeOduzimanje.setText("-");
        dugmeOduzimanje.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dugmeOduzimanjeActionPerformed(evt);
            }
        });

        dugmeMnozenje.setText("x");
        dugmeMnozenje.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dugmeMnozenjeActionPerformed(evt);
            }
        });

        dugmePodeljeno.setText("÷");
        dugmePodeljeno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dugmePodeljenoActionPerformed(evt);
            }
        });

        CDugme.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        CDugme.setText("C");
        CDugme.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CDugmeActionPerformed(evt);
            }
        });

        dugme0.setText("0");
        dugme0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dugme0ActionPerformed(evt);
            }
        });
        dugme0.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                dugme0KeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                dugme0KeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                dugme0KeyTyped(evt);
            }
        });

        rezultat.setEditable(false);
        rezultat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rezultatActionPerformed(evt);
            }
        });

        backspace.setText("Backspace");
        backspace.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backspaceActionPerformed(evt);
            }
        });

        jednako.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jednako.setText("=");
        jednako.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jednakoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(dugme1, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(dugme2, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(dugme3, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(dugme7, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(dugme4, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(dugme5, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(dugme6, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(dugme8, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(dugme9, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(58, 58, 58)
                                .addComponent(dugme0, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(dugmeTacka, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 30, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(dugmePodeljeno, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(dugmeMnozenje, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(dugmeOduzimanje, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(dugmeSabiranje, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(17, 17, 17))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jednako, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap())))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(rezultat, javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(CDugme, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(33, 33, 33)
                                .addComponent(backspace)))
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(48, 48, 48)
                        .addComponent(dugmeSabiranje, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(rezultat, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(CDugme, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(backspace, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(dugme7, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(dugme8, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(dugme9, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(dugmeOduzimanje, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(dugme5, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(dugme6, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(dugme4, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(dugmeMnozenje, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(dugme1, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(dugme2, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(dugme3, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(dugmePodeljeno, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(dugmeTacka, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(dugme0, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jednako, javax.swing.GroupLayout.DEFAULT_SIZE, 33, Short.MAX_VALUE))
                .addContainerGap(13, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void dugme1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dugme1ActionPerformed
        rezultat.setText(rezultat.getText() + "1");
    }//GEN-LAST:event_dugme1ActionPerformed

    private void dugme4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dugme4ActionPerformed
        rezultat.setText(rezultat.getText() + "4");
    }//GEN-LAST:event_dugme4ActionPerformed

    private void dugme0ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dugme0ActionPerformed
        rezultat.setText(rezultat.getText() + "0");
        //rezultat.setText(dugme0.getInputMap().put(keyStroke, ICONIFIED));
    }//GEN-LAST:event_dugme0ActionPerformed

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

    private void dugme0KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_dugme0KeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_0) {
            rezultat.setText(rezultat.getText() + "0");
        }
    }//GEN-LAST:event_dugme0KeyPressed

    private void dugme0KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_dugme0KeyTyped

    }//GEN-LAST:event_dugme0KeyTyped

    private void dugme0KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_dugme0KeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_dugme0KeyReleased

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
    private javax.swing.JButton dugme0;
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
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton12;
    private javax.swing.JButton jButton14;
    private javax.swing.JButton jButton15;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton jednako;
    private javax.swing.JTextField rezultat;
    // End of variables declaration//GEN-END:variables

}
