/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */

/**
 *
 * @author Max
 */
public class calculadora extends javax.swing.JInternalFrame {

    public double v_monedaIN;
    public double v_monedaOUT;
    public double cotizacion = 600.00;
    
    public calculadora() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        in_monedaIN = new javax.swing.JTextField();
        b_calcular = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        print_dolares = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        b_reiniciar = new javax.swing.JButton();
        b_cerrarcalculadora = new javax.swing.JButton();

        setTitle("Conversor pesos a dolares");

        in_monedaIN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                in_monedaINActionPerformed(evt);
            }
        });

        b_calcular.setText("Calcular dolares");
        b_calcular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_calcularActionPerformed(evt);
            }
        });

        jLabel1.setText("Ingrese importe en pesos");

        jLabel2.setText("Sus pesos equivalen a ");

        b_reiniciar.setText("Nueva cotizacion");
        b_reiniciar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_reiniciarActionPerformed(evt);
            }
        });

        b_cerrarcalculadora.setText("Cerrar calculadora");
        b_cerrarcalculadora.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_cerrarcalculadoraActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(b_cerrarcalculadora, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(b_reiniciar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(print_dolares)
                    .addComponent(b_calcular, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(in_monedaIN))
                .addGap(109, 109, 109))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(in_monedaIN, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(b_calcular)
                .addGap(12, 12, 12)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(print_dolares, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(b_reiniciar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(b_cerrarcalculadora)
                .addContainerGap(21, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void b_calcularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_calcularActionPerformed
         v_monedaIN = Double.parseDouble(in_monedaIN.getText());
         v_monedaOUT = v_monedaIN / cotizacion;
         print_dolares.setText(String.format("%.2f",v_monedaOUT));
    }//GEN-LAST:event_b_calcularActionPerformed

    private void in_monedaINActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_in_monedaINActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_in_monedaINActionPerformed

    private void b_cerrarcalculadoraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_cerrarcalculadoraActionPerformed
    this.setVisible(false);        // TODO add your handling code here:
    }//GEN-LAST:event_b_cerrarcalculadoraActionPerformed

    private void b_reiniciarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_reiniciarActionPerformed
     in_monedaIN.setText("");
     print_dolares.setText("");
    }//GEN-LAST:event_b_reiniciarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton b_calcular;
    private javax.swing.JButton b_cerrarcalculadora;
    private javax.swing.JButton b_reiniciar;
    private javax.swing.JTextField in_monedaIN;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JTextField print_dolares;
    // End of variables declaration//GEN-END:variables
}