/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package net.codejava.passwortgenerator;

import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.util.Random;
import javax.swing.JOptionPane;
import static javax.swing.JOptionPane.*;

/**
 *
 * @author Admin
 */
public class passwortgeneratorGui extends javax.swing.JFrame {

    public passwortgeneratorGui() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        ueberschriftLabel = new javax.swing.JLabel();
        zeichenanzahlLabel = new javax.swing.JLabel();
        zeichenanzahlTextField = new javax.swing.JTextField();
        passwortLabel = new javax.swing.JLabel();
        passwortAusgabeTextField = new javax.swing.JTextField();
        generierenButton = new javax.swing.JButton();
        kopierenButton = new javax.swing.JButton();
        jCheckBox1 = new javax.swing.JCheckBox();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setTitle("Passwortgenerator by Scotch#5627");
        setName("gui"); // NOI18N
        setResizable(false);

        ueberschriftLabel.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        ueberschriftLabel.setText("Passwortgenerator");

        zeichenanzahlLabel.setText("Zeichenanzahl:");

        zeichenanzahlTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                zeichenanzahlTextFieldActionPerformed(evt);
            }
        });
        zeichenanzahlTextField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                zeichenanzahlTextFieldKeyTyped(evt);
            }
        });

        passwortLabel.setText("Passwort:");

        passwortAusgabeTextField.setEditable(false);

        generierenButton.setText("Generiere Passwort");
        generierenButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                generierenButtonActionPerformed(evt);
            }
        });

        kopierenButton.setText("Kopieren");
        kopierenButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kopierenButtonActionPerformed(evt);
            }
        });

        jCheckBox1.setText("Warnung bei Zeichenlänge ab 250");

        jButton1.setText("Exit");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
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
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(zeichenanzahlLabel)
                            .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(zeichenanzahlTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(passwortAusgabeTextField)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(0, 7, Short.MAX_VALUE)
                                        .addComponent(ueberschriftLabel)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(kopierenButton)
                                .addGap(3, 3, 3))))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jCheckBox1)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(passwortLabel)
                                .addGap(166, 166, 166))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(generierenButton)
                                .addGap(126, 126, 126))))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(ueberschriftLabel)
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(zeichenanzahlLabel)
                    .addComponent(zeichenanzahlTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31)
                .addComponent(jCheckBox1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 48, Short.MAX_VALUE)
                .addComponent(generierenButton)
                .addGap(18, 18, 18)
                .addComponent(passwortLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(passwortAusgabeTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(kopierenButton)
                    .addComponent(jButton1))
                .addGap(15, 15, 15))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void zeichenanzahlTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_zeichenanzahlTextFieldActionPerformed

    }//GEN-LAST:event_zeichenanzahlTextFieldActionPerformed

    public void passwort(int anzahl) {
        String[] strArr = {"A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z", "a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z", "0", "1", "2", "3", "4", "5", "6", "7", "8", "9", "!", ".", "#", "+", "&", "$", "€", "§", ")", "(", ","}; // Sonderzeichen unvollständig
        Random rand = new Random();
        for (int i = 0; i < anzahl; i++) {
            int arrayStelle = rand.nextInt(strArr.length);
            //System.out.print(strArr[arrayStelle]);
            String sichern = passwortAusgabeTextField.getText();
            passwortAusgabeTextField.setText(sichern + strArr[arrayStelle]);
        }
    }

    public void passwortgenerieren(int anzahl) {
        if (anzahl >= 250 && jCheckBox1.isSelected()) {
            int box = JOptionPane.showConfirmDialog(null, "Die Zeichenanzahl ist sehr hoch (" + anzahl + ")\nSicher, dass das Passwort generiert werden soll?", "WARNUNG", JOptionPane.YES_NO_OPTION, JOptionPane.PLAIN_MESSAGE);
            if (box == 0) {
                passwort(anzahl);
            }
        } else {
            passwort(anzahl);
        }
    }

    private void generierenButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_generierenButtonActionPerformed
        int zeichenanzahl = Integer.parseInt(zeichenanzahlTextField.getText());
        if (zeichenanzahl <= 0)
            JOptionPane.showMessageDialog(null, "Ungültige Zeichenanzahl! (" + zeichenanzahl + ")");
        else {
            passwortAusgabeTextField.setText("");
            passwortgenerieren(zeichenanzahl);
        }
    }//GEN-LAST:event_generierenButtonActionPerformed

    private void kopierenButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kopierenButtonActionPerformed
        String passwort = passwortAusgabeTextField.getText();
        StringSelection stringSelection = new StringSelection(passwort);
        Clipboard clip = Toolkit.getDefaultToolkit().getSystemClipboard();
        clip.setContents(stringSelection, null);
        JOptionPane.showMessageDialog(null, "Erfolgreich in die Zwischenablage kopiert.", "ERFOLGREICH", INFORMATION_MESSAGE);
    }//GEN-LAST:event_kopierenButtonActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void zeichenanzahlTextFieldKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_zeichenanzahlTextFieldKeyTyped
        char c = evt.getKeyChar();
        if (!(Character.isDigit(c) || (c == KeyEvent.VK_BACK_SPACE) || c == KeyEvent.VK_DELETE)) {
            getToolkit().beep();
            evt.consume();
        }
    }//GEN-LAST:event_zeichenanzahlTextFieldKeyTyped

    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(passwortgeneratorGui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(passwortgeneratorGui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(passwortgeneratorGui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(passwortgeneratorGui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        JOptionPane.showMessageDialog(null, "Es wird keine Haftung für Schäden jeglicher Art übernommen!", "WARNUNG", JOptionPane.WARNING_MESSAGE);
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new passwortgeneratorGui().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton generierenButton;
    private javax.swing.JButton jButton1;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JButton kopierenButton;
    private javax.swing.JTextField passwortAusgabeTextField;
    private javax.swing.JLabel passwortLabel;
    private javax.swing.JLabel ueberschriftLabel;
    private javax.swing.JLabel zeichenanzahlLabel;
    private javax.swing.JTextField zeichenanzahlTextField;
    // End of variables declaration//GEN-END:variables
}
