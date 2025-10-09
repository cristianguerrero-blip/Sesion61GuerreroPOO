
package Vista;

import javax.swing.JOptionPane;
public class Operadores extends javax.swing.JFrame {//Inicia la clase
    public int num1 = 100;//Variable tipo entero
    public int num2 = 80;//Variable tipo entero
}


    public Operadores() {//Inicia el constructor
        initComponents();
    }//Termina constructor


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblTitulo = new javax.swing.JLabel();
        btnAritmeticos = new javax.swing.JButton();
        btnRelacionables = new javax.swing.JButton();
        btnLogicos = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lblTitulo.setText("Operadores JAVA POO Guerrero");

        btnAritmeticos.setText("Aritmeticos");
        btnAritmeticos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAritmeticosActionPerformed(evt);
            }
        });

        btnRelacionables.setText("Relacionables");
        btnRelacionables.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRelacionablesActionPerformed(evt);
            }
        });

        btnLogicos.setText("Logicos ");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(76, 76, 76)
                        .addComponent(lblTitulo))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(140, 140, 140)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnRelacionables)
                            .addComponent(btnAritmeticos)
                            .addComponent(btnLogicos))))
                .addContainerGap(112, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addComponent(lblTitulo)
                .addGap(41, 41, 41)
                .addComponent(btnAritmeticos)
                .addGap(18, 18, 18)
                .addComponent(btnRelacionables)
                .addGap(18, 18, 18)
                .addComponent(btnLogicos)
                .addContainerGap(73, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAritmeticosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAritmeticosActionPerformed
       int suma = num1 + num2;
       int resta = num1 - num2;
       int multi = num1 * num2;
       int divi = num1 / num2;
       int modulo = num1 % num2;
       JOptionPane.ShowMessageDialog(null, "Operadores Aritmeticos"
+ "\nSuma :"+suma
+ "\nResta :"resta
+ "\nMulti :"+multi
+ "\nDivi :"+divi
+ "\nModulo :"+modulo)
    }//GEN-LAST:event_btnAritmeticosActionPerformed

    private void btnRelacionablesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRelacionablesActionPerformed
        boolean mayorque=num1>num2;
        boolean mayorigualque=num1>=num2;
        boolean menorque=num1<num2;
        boolean menorigualque=num1>=num2;
        boolean igualque=(num1==num2);
        boolean diferentede=(num1!=num2);
        JOptionPane.showMessageDialog(null, "Operadores relacionables"
+ "\nMayor que :"+mayorque
+ "\Mayor igual que :"+mayorigualque
+ "\nMenor que :"+menorque
+ "\nMenor igual que :"+menorigualque
+ "\nIgual que :"+igualque
+ "\nDiferente de :"+diferede)
    }//GEN-LAST:event_btnRelacionablesActionPerformed

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
            java.util.logging.Logger.getLogger(Operadores.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Operadores.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Operadores.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Operadores.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Operadores().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAritmeticos;
    private javax.swing.JButton btnLogicos;
    private javax.swing.JButton btnRelacionables;
    private javax.swing.JLabel lblTitulo;
    // End of variables declaration//GEN-END:variables
}
