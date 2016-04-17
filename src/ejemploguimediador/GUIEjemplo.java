/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * GUIEjemplo.java
 *
 * Created on 13/05/2010, 13:56:22
 */

package ejemploguimediador;

/**
 *
 * @author Administrador
 */

import java.awt.event.ActionListener;
import java.awt.event.KeyListener;

public class GUIEjemplo extends javax.swing.JFrame {

    /** Creates new form GUIEjemplo */
    public GUIEjemplo() {
        initComponents();
    }

    public void setActionListeners(ActionListener lis){
        this.jButtonSumar.addActionListener(lis);
    }

    public void setKeyListener(KeyListener lis){
        this.jTextFieldPrimerNum.addKeyListener(lis);
        this.jTextFieldSegundoNum.addKeyListener(lis);
        //this.jTextFieldResultado.addKeyListener(lis);
    }

    /**
     * @return the jButtonSumar
     */
    public javax.swing.JButton getjButtonSumar() {
        return jButtonSumar;
    }

    /**
     * @return the jTextFieldPrimerNum
     */
    public javax.swing.JTextField getjTextFieldPrimerNum() {
        return jTextFieldPrimerNum;
    }

    /**
     * @return the jTextFieldResultado
     */
    public javax.swing.JTextField getjTextFieldResultado() {
        return jTextFieldResultado;
    }

    /**
     * @return the jTextFieldSegundoNum
     */
    public javax.swing.JTextField getjTextFieldSegundoNum() {
        return jTextFieldSegundoNum;
    }







    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextFieldPrimerNum = new javax.swing.JTextField();
        jButtonSumar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jTextFieldSegundoNum = new javax.swing.JTextField();
        jTextFieldResultado = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jButtonSumar.setText("SUMAR");
        jButtonSumar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSumarActionPerformed(evt);
            }
        });

        jLabel1.setText("Ingrese un numero:");

        jLabel2.setText("Ingrese un numero:");

        jTextFieldResultado.setFont(new java.awt.Font("Tahoma", 0, 48));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextFieldSegundoNum, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextFieldPrimerNum, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButtonSumar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextFieldResultado, javax.swing.GroupLayout.DEFAULT_SIZE, 147, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jTextFieldResultado, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 75, Short.MAX_VALUE)
                    .addComponent(jButtonSumar, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 75, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGap(7, 7, 7)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(jTextFieldPrimerNum, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(jTextFieldSegundoNum, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonSumarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSumarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonSumarActionPerformed

    /**
    * @param args the command line arguments
    */
    public static void main(String args[]) {
        try {
            javax.swing.UIManager.setLookAndFeel(javax.swing.UIManager.getSystemLookAndFeelClassName());
        } catch (Exception e){

        }
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GUIEjemplo().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonSumar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JTextField jTextFieldPrimerNum;
    private javax.swing.JTextField jTextFieldResultado;
    private javax.swing.JTextField jTextFieldSegundoNum;
    // End of variables declaration//GEN-END:variables

}
