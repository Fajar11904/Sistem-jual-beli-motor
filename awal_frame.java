/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jual_motor;

/**
 *
 * @author HP
 */
public class awal_frame extends javax.swing.JFrame {

    /**
     * Creates new form awal_frame
     */
    public awal_frame() {
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

        jLabel1 = new javax.swing.JLabel();
        namaPelanggan = new javax.swing.JLabel();
        txtnamaPelanggan = new javax.swing.JTextField();
        kodePel = new javax.swing.JLabel();
        cbkodePel = new javax.swing.JComboBox<>();
        Keterangan = new javax.swing.JLabel();
        txtKeterangan = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        btnRegister1 = new javax.swing.JButton();
        namaPelanggan1 = new javax.swing.JLabel();
        txtnamaPelanggan1 = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Monospaced", 1, 24)); // NOI18N
        jLabel1.setText("GASKEN HAYU MOTOR JAYA ABADI ");

        namaPelanggan.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        namaPelanggan.setText("User Name          :");

        txtnamaPelanggan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtnamaPelangganActionPerformed(evt);
            }
        });

        kodePel.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        kodePel.setText("Kode Pelanggan  :");

        cbkodePel.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "K-01", "K-02" }));
        cbkodePel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbkodePelActionPerformed(evt);
            }
        });

        Keterangan.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        Keterangan.setText("Keterangan         :");

        txtKeterangan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtKeteranganActionPerformed(evt);
            }
        });

        jButton1.setText("MASUK");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("KELUAR");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        btnRegister1.setText("REGISTER");
        btnRegister1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegister1ActionPerformed(evt);
            }
        });

        namaPelanggan1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        namaPelanggan1.setText("Password            :");

        txtnamaPelanggan1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtnamaPelanggan1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(218, 218, 218)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel1)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(namaPelanggan)
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jButton1)
                                .addComponent(Keterangan)
                                .addComponent(namaPelanggan1)
                                .addComponent(kodePel))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(37, 37, 37)
                                    .addComponent(btnRegister1)
                                    .addGap(31, 31, 31)
                                    .addComponent(jButton2))
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(18, 18, 18)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(txtnamaPelanggan1, javax.swing.GroupLayout.PREFERRED_SIZE, 301, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(txtnamaPelanggan, javax.swing.GroupLayout.PREFERRED_SIZE, 301, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(cbkodePel, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(txtKeterangan, javax.swing.GroupLayout.PREFERRED_SIZE, 301, javax.swing.GroupLayout.PREFERRED_SIZE)))))))
                .addContainerGap(273, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(47, 47, 47)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(namaPelanggan)
                    .addComponent(txtnamaPelanggan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(namaPelanggan1)
                    .addComponent(txtnamaPelanggan1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(kodePel)
                        .addGap(91, 91, 91))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(cbkodePel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(3, 3, 3)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Keterangan)
                            .addComponent(txtKeterangan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(65, 65, 65)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(btnRegister1)
                    .addComponent(jButton2))
                .addContainerGap(69, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtnamaPelangganActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtnamaPelangganActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtnamaPelangganActionPerformed

    private void cbkodePelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbkodePelActionPerformed
        // TODO add your handling code here:
        String kodePel, Keterangan;

        kodePel = String.valueOf(cbkodePel.getSelectedItem());

        if (kodePel.equals("K-01")){
            Keterangan = "Member";
        }else
        if (kodePel.equals("K-02")){
            Keterangan = "Non Member";
        }else
        {
            Keterangan = "Tidak Terdaftar";
        }
        txtKeterangan.setText(""+Keterangan);
    }//GEN-LAST:event_cbkodePelActionPerformed

    private void txtKeteranganActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtKeteranganActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtKeteranganActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        System.exit(0);     
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        jual_motorFrame n = new jual_motorFrame();
        n.setVisible(true);
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void btnRegister1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegister1ActionPerformed
        // TODO add your handling code here:
         register_frame n = new register_frame();
        n.setVisible(true);
        
        
    }//GEN-LAST:event_btnRegister1ActionPerformed

    private void txtnamaPelanggan1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtnamaPelanggan1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtnamaPelanggan1ActionPerformed

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
            java.util.logging.Logger.getLogger(awal_frame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(awal_frame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(awal_frame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(awal_frame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new awal_frame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Keterangan;
    private javax.swing.JButton btnRegister1;
    private javax.swing.JComboBox<String> cbkodePel;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel kodePel;
    private javax.swing.JLabel namaPelanggan;
    private javax.swing.JLabel namaPelanggan1;
    private javax.swing.JTextField txtKeterangan;
    private javax.swing.JTextField txtnamaPelanggan;
    private javax.swing.JTextField txtnamaPelanggan1;
    // End of variables declaration//GEN-END:variables
}
