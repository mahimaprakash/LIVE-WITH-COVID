/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package lwc;

import java.awt.Color;

/**
 *
 * @author User
 */
public class hrcdetails extends javax.swing.JFrame {

    /**
     * Creates new form hrcdetails
     */
    public hrcdetails() {
        initComponents();
        p.setBackground(Color.orange);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        p = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        logout = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        vfname = new javax.swing.JTextField();
        vdob = new javax.swing.JTextField();
        vcontact = new javax.swing.JTextField();
        vlname = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        vgender = new javax.swing.JTextField();
        vhw = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        vhwcont = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        vcomp = new javax.swing.JTextArea();
        jLabel4 = new javax.swing.JLabel();
        vecontact = new javax.swing.JTextField();
        respond = new javax.swing.JButton();
        hrid = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        cdate_txt = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("LIVE WITH COVID");

        logout.setText("Logout");
        logout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logoutActionPerformed(evt);
            }
        });

        jButton1.setText("Back");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pLayout = new javax.swing.GroupLayout(p);
        p.setLayout(pLayout);
        pLayout.setHorizontalGroup(
            pLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 557, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(logout)
                .addContainerGap())
        );
        pLayout.setVerticalGroup(
            pLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(logout)
                    .addComponent(jButton1))
                .addContainerGap(12, Short.MAX_VALUE))
        );

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel5.setText("First Name");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(49, 48, -1, -1));

        jLabel6.setText("DOB");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(79, 86, -1, -1));

        jLabel8.setText("Contact");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(62, 127, -1, -1));

        jLabel12.setText("Emergency Contact");
        jPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(343, 121, -1, 23));

        jLabel13.setText("Last  Name");
        jPanel1.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(384, 48, -1, -1));
        jPanel1.add(vfname, new org.netbeans.lib.awtextra.AbsoluteConstraints(118, 45, 101, -1));

        vdob.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                vdobActionPerformed(evt);
            }
        });
        jPanel1.add(vdob, new org.netbeans.lib.awtextra.AbsoluteConstraints(118, 83, 101, -1));
        jPanel1.add(vcontact, new org.netbeans.lib.awtextra.AbsoluteConstraints(118, 124, 101, -1));
        jPanel1.add(vlname, new org.netbeans.lib.awtextra.AbsoluteConstraints(455, 45, 104, -1));

        jLabel14.setText("Health Worker");
        jPanel1.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(31, 171, -1, -1));

        vgender.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                vgenderActionPerformed(evt);
            }
        });
        jPanel1.add(vgender, new org.netbeans.lib.awtextra.AbsoluteConstraints(455, 83, 104, -1));
        jPanel1.add(vhw, new org.netbeans.lib.awtextra.AbsoluteConstraints(118, 168, 104, -1));

        jLabel2.setText("Gender");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(402, 86, -1, -1));
        jPanel1.add(vhwcont, new org.netbeans.lib.awtextra.AbsoluteConstraints(455, 168, 104, -1));

        jLabel3.setText("Healthworker Contact");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(322, 171, -1, -1));

        vcomp.setColumns(20);
        vcomp.setRows(5);
        jScrollPane1.setViewportView(vcomp);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(118, 206, 218, 161));

        jLabel4.setText("Complications");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(31, 206, -1, -1));
        jPanel1.add(vecontact, new org.netbeans.lib.awtextra.AbsoluteConstraints(455, 122, 104, -1));

        respond.setText("Respond");
        respond.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                respondActionPerformed(evt);
            }
        });
        jPanel1.add(respond, new org.netbeans.lib.awtextra.AbsoluteConstraints(354, 344, -1, -1));
        jPanel1.add(hrid, new org.netbeans.lib.awtextra.AbsoluteConstraints(118, 7, 47, -1));

        jLabel7.setText("ID");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(89, 10, -1, -1));

        jLabel9.setText("Complaint Date");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 210, -1, -1));
        jPanel1.add(cdate_txt, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 210, 100, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(p, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(p, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 380, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    private void logoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logoutActionPerformed
        new logas().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_logoutActionPerformed

    private void vdobActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_vdobActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_vdobActionPerformed

    private void vgenderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_vgenderActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_vgenderActionPerformed

    private void respondActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_respondActionPerformed
        new response().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_respondActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
         new doctor().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed
   
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
            java.util.logging.Logger.getLogger(hrcdetails.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(hrcdetails.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(hrcdetails.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(hrcdetails.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new hrcdetails().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public static javax.swing.JTextField cdate_txt;
    public static javax.swing.JTextField hrid;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton logout;
    private javax.swing.JPanel p;
    private javax.swing.JButton respond;
    public static javax.swing.JTextArea vcomp;
    public static javax.swing.JTextField vcontact;
    public static javax.swing.JTextField vdob;
    public static javax.swing.JTextField vecontact;
    public static javax.swing.JTextField vfname;
    public static javax.swing.JTextField vgender;
    public static javax.swing.JTextField vhw;
    public static javax.swing.JTextField vhwcont;
    public static javax.swing.JTextField vlname;
    // End of variables declaration//GEN-END:variables
}