
public class login extends javax.swing.JInternalFrame {

    String usuario = "";
    String clave = "";

    public login() {
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

        combousuarios = new javax.swing.JComboBox<>();
        pass = new javax.swing.JTextField();
        fotos = new javax.swing.JLabel();
        b_valida = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        b_cancela = new javax.swing.JButton();
        textovalida = new javax.swing.JLabel();

        setTitle("Login");

        combousuarios.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "", "Messi", "Maradona", "Pele" }));
        combousuarios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                combousuariosActionPerformed(evt);
            }
        });

        pass.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                passActionPerformed(evt);
            }
        });

        b_valida.setText("Validar");
        b_valida.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_validaActionPerformed(evt);
            }
        });

        jLabel1.setText("Usuario");

        jLabel2.setText("Clave");

        b_cancela.setText("Cancelar");
        b_cancela.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_cancelaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(42, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(37, 37, 37)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(b_valida)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(b_cancela))
                    .addComponent(fotos, javax.swing.GroupLayout.PREFERRED_SIZE, 236, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(pass, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(combousuarios, javax.swing.GroupLayout.Alignment.LEADING, 0, 142, Short.MAX_VALUE))
                    .addComponent(textovalida, javax.swing.GroupLayout.PREFERRED_SIZE, 216, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(combousuarios, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(pass, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(fotos, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(textovalida, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(5, 5, 5)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(b_valida)
                    .addComponent(b_cancela))
                .addContainerGap(15, Short.MAX_VALUE))
        );

        fotos.getAccessibleContext().setAccessibleDescription("");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void passActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_passActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_passActionPerformed

    private void combousuariosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_combousuariosActionPerformed
       switch(combousuarios.getSelectedIndex()) {
        case 0:
            //fotos.setIcon((new javax.swing.ImageIcon(getClass().getResource("/imagenes/1.png"))));
            //usario = (String) combousuarios.getSelectedItem();
        break;
        case 1:
            fotos.setIcon((new javax.swing.ImageIcon(getClass().getResource("/imagenes/1.png"))));
            usuario = (String) combousuarios.getSelectedItem();
            System.out.println(""+usuario);
        break;
        case 2:
            fotos.setIcon((new javax.swing.ImageIcon(getClass().getResource("/imagenes/2.png"))));
            usuario = (String) combousuarios.getSelectedItem();
            System.out.println(""+usuario);
        break;
        case 3:
            fotos.setIcon((new javax.swing.ImageIcon(getClass().getResource("/imagenes/3.png"))));
            usuario = (String) combousuarios.getSelectedItem();
            System.out.println(""+usuario);
        break;
    }    
    }//GEN-LAST:event_combousuariosActionPerformed

    private void b_validaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_validaActionPerformed
        clave = (String) pass.getText();
        System.out.println(""+clave);
        
        switch(combousuarios.getSelectedIndex()) {
        case 0:
           
        break;
        case 1:
            if(clave.equals("123")) {                
              calculadora v2 = new calculadora();
              ventanaprincipal.escritorio.add(v2);
              this.setVisible(false);
              v2.setVisible(true);
            } else { 
               textovalida.setText("La clave no es correcta");
            }     
        break;
        case 2:
            if(clave.equals("456")) {                
              calculadora v2 = new calculadora();
              ventanaprincipal.escritorio.add(v2);
              this.setVisible(false);
              v2.setVisible(true);
            } else { 
               textovalida.setText("La clave no es correcta");
            }     
        break;
        case 3:
            if(clave.equals("789")) {                
              calculadora v2 = new calculadora();
              ventanaprincipal.escritorio.add(v2);
              this.setVisible(false);
              v2.setVisible(true);
            } else { 
               textovalida.setText("La clave no es correcta");
            }     
        break;
        }   
    }//GEN-LAST:event_b_validaActionPerformed

    private void b_cancelaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_cancelaActionPerformed
    this.setVisible(false);      
    }//GEN-LAST:event_b_cancelaActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton b_cancela;
    private javax.swing.JButton b_valida;
    private javax.swing.JComboBox<String> combousuarios;
    private javax.swing.JLabel fotos;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JTextField pass;
    private javax.swing.JLabel textovalida;
    // End of variables declaration//GEN-END:variables
}