/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package desafio;

/**
 *
 * @author 202111640023
 */
public class CadrastrodePessoas extends javax.swing.JFrame {

    /**
     * Creates new form CadrastrodePessoas
     */
    public CadrastrodePessoas() {
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

        jLabel11 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        visor = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        visor2 = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        visor3 = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        visor5 = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        visor4 = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        visor6 = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        visor7 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        limpar = new javax.swing.JButton();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        visor8 = new javax.swing.JTextField();
        visor9 = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        visor10 = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        visor11 = new javax.swing.JComboBox<>();

        jLabel11.setText("jLabel11");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/rsc/lalalagang.jpg"))); // NOI18N
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 11, 240, 130));

        jLabel1.setFont(new java.awt.Font("Siemens AD Mono", 1, 24)); // NOI18N
        jLabel1.setText("CASDASTRO DE JACARÉDS");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 0, 311, 83));

        jLabel3.setFont(new java.awt.Font("Yu Gothic Medium", 1, 12)); // NOI18N
        jLabel3.setText("NOME : ");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 70, 90, 40));
        getContentPane().add(visor, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 80, 190, 20));

        jLabel4.setFont(new java.awt.Font("Yu Gothic Medium", 1, 12)); // NOI18N
        jLabel4.setText("CPF: ");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 110, 40, 20));
        getContentPane().add(visor2, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 110, 220, -1));

        jLabel5.setFont(new java.awt.Font("Swis721 Blk BT", 1, 18)); // NOI18N
        jLabel5.setText("ENDERESSU");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 160, 140, -1));

        jLabel6.setFont(new java.awt.Font("Yu Gothic Medium", 1, 14)); // NOI18N
        jLabel6.setText("RUA :");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 200, -1, -1));

        visor3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                visor3ActionPerformed(evt);
            }
        });
        getContentPane().add(visor3, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 200, 330, -1));

        jLabel7.setFont(new java.awt.Font("Yu Gothic Medium", 1, 14)); // NOI18N
        jLabel7.setText("NÚMERO : ");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 200, -1, -1));
        getContentPane().add(visor5, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 200, 20, -1));

        jLabel8.setFont(new java.awt.Font("Yu Gothic Medium", 1, 14)); // NOI18N
        jLabel8.setText("BAIRRO : ");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 240, -1, -1));

        visor4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                visor4ActionPerformed(evt);
            }
        });
        getContentPane().add(visor4, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 240, 220, -1));

        jLabel9.setFont(new java.awt.Font("Yu Gothic Medium", 1, 14)); // NOI18N
        jLabel9.setText("CIDADE :");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 240, -1, -1));
        getContentPane().add(visor6, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 240, 110, -1));

        jLabel10.setFont(new java.awt.Font("Swis721 Blk BT", 1, 18)); // NOI18N
        jLabel10.setText("TELEFONE : ");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 290, 150, -1));

        visor7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                visor7ActionPerformed(evt);
            }
        });
        getContentPane().add(visor7, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 290, 200, -1));

        jButton1.setFont(new java.awt.Font("Yu Gothic Medium", 1, 11)); // NOI18N
        jButton1.setText("GRAVAR");
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 410, -1, -1));

        limpar.setFont(new java.awt.Font("Yu Gothic Medium", 1, 11)); // NOI18N
        limpar.setText("NOVO");
        limpar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                limparMouseClicked(evt);
            }
        });
        getContentPane().add(limpar, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 410, -1, -1));

        jLabel12.setFont(new java.awt.Font("Swis721 Blk BT", 0, 14)); // NOI18N
        jLabel12.setText("EMAIL : ");
        getContentPane().add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 330, -1, -1));

        jLabel13.setFont(new java.awt.Font("Swis721 Blk BT", 1, 14)); // NOI18N
        jLabel13.setText("Data de nascimento : ");
        getContentPane().add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 360, -1, 30));
        getContentPane().add(visor8, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 330, 260, -1));
        getContentPane().add(visor9, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 360, 140, 30));

        jLabel14.setFont(new java.awt.Font("Swis721 Blk BT", 1, 12)); // NOI18N
        jLabel14.setText("PERFIL:");
        getContentPane().add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 410, -1, -1));
        getContentPane().add(visor10, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 400, 260, 30));

        jLabel15.setFont(new java.awt.Font("Swis721 Blk BT", 1, 12)); // NOI18N
        jLabel15.setText("UF :");
        getContentPane().add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 290, -1, -1));

        visor11.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "selecione", "MG", "SP", "RS", "RJ" }));
        visor11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                visor11ActionPerformed(evt);
            }
        });
        getContentPane().add(visor11, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 290, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void visor3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_visor3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_visor3ActionPerformed

    private void visor4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_visor4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_visor4ActionPerformed

    private void visor7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_visor7ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_visor7ActionPerformed

    private void visor11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_visor11ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_visor11ActionPerformed

    private void limparMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_limparMouseClicked
    visor.setText(""); 
    visor2.setText("");   
    visor3.setText("");   
    visor4.setText("");   
    visor5.setText("");   
    visor6.setText("");   
    visor7.setText("");   
    visor8.setText("");   
    visor9.setText("");   
    visor10.setText("");  
    visor11.setSelectedIndex(0);
// TODO add your handling code here:
    }//GEN-LAST:event_limparMouseClicked

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
            java.util.logging.Logger.getLogger(CadrastrodePessoas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CadrastrodePessoas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CadrastrodePessoas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CadrastrodePessoas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CadrastrodePessoas().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JButton limpar;
    private javax.swing.JTextField visor;
    private javax.swing.JTextField visor10;
    private javax.swing.JComboBox<String> visor11;
    private javax.swing.JTextField visor2;
    private javax.swing.JTextField visor3;
    private javax.swing.JTextField visor4;
    private javax.swing.JTextField visor5;
    private javax.swing.JTextField visor6;
    private javax.swing.JTextField visor7;
    private javax.swing.JTextField visor8;
    private javax.swing.JTextField visor9;
    // End of variables declaration//GEN-END:variables
}
