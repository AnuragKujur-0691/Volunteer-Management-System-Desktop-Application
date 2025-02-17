/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.vms;

/**
 *
 * @author indrajeet
 */
public class UserDashboard extends javax.swing.JFrame {

    /**
     * Creates new form UserDashboard
     */
    
    public String userEmail="";
    public UserDashboard() {
        initComponents();
        
        jLabel3.setVisible(false);
        jLabel10.setVisible(false);
        jLabel11.setVisible(false);
        trackbtn.setVisible(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        postbtn = new javax.swing.JButton();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        managevolunteering = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        logoutbtn = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        trackbtn = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel6.setText("APPLY FOR VOLUNTEERING");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 280, -1, -1));

        jLabel7.setText("Join as a volunteer and become a change maker for the institute.");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 310, -1, -1));

        postbtn.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        postbtn.setIcon(new javax.swing.ImageIcon("C:\\Users\\indrajeet\\Documents\\NetBeansProjects\\VMS\\VMS ICON\\user-interface-2022-07-07-00-57-15-utc\\PNG\\24px\\hand-cursor.png")); // NOI18N
        postbtn.setText("CLICK HERE TO APPLY");
        postbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                postbtnActionPerformed(evt);
            }
        });
        getContentPane().add(postbtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 380, -1, -1));

        jLabel12.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel12.setText("MANAGE VOLUNTEERING ACTIVITIES");
        getContentPane().add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 280, -1, -1));

        jLabel13.setText("Request for Opt Out from the Volunteering Sessions.");
        getContentPane().add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 310, -1, -1));

        managevolunteering.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        managevolunteering.setIcon(new javax.swing.ImageIcon("C:\\Users\\indrajeet\\Documents\\NetBeansProjects\\VMS\\VMS ICON\\user-interface-2022-07-07-00-57-15-utc\\PNG\\24px\\gear.png")); // NOI18N
        managevolunteering.setText("MANAGE VOLUNTEERING");
        managevolunteering.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                managevolunteeringActionPerformed(evt);
            }
        });
        getContentPane().add(managevolunteering, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 380, -1, -1));

        jLabel5.setIcon(new javax.swing.ImageIcon("C:\\Users\\indrajeet\\Documents\\NetBeansProjects\\VMS\\VMS ICON\\panel transparency new add diagnosis.png")); // NOI18N
        jLabel5.setText("jLabel2");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 260, 470, 260));

        jLabel2.setIcon(new javax.swing.ImageIcon("C:\\Users\\indrajeet\\Documents\\NetBeansProjects\\VMS\\VMS ICON\\panel transparency new add diagnosis.png")); // NOI18N
        jLabel2.setText("jLabel2");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 260, 470, 260));

        logoutbtn.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        logoutbtn.setIcon(new javax.swing.ImageIcon("C:\\Users\\indrajeet\\Documents\\NetBeansProjects\\VMS\\VMS ICON\\user-interface-2022-07-07-00-57-15-utc\\PNG\\24px\\exit.png")); // NOI18N
        logoutbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logoutbtnActionPerformed(evt);
            }
        });
        getContentPane().add(logoutbtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(1280, 10, -1, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon("C:\\Users\\indrajeet\\Documents\\NetBeansProjects\\VMS\\VMS ICON\\admin dahsboard.jpg")); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        jLabel10.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel10.setText("TRACK REQUESTS");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 510, -1, -1));

        jLabel11.setText("Get access to the requests you have made as a volunteer");
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 540, -1, -1));

        trackbtn.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        trackbtn.setIcon(new javax.swing.ImageIcon("C:\\Users\\indrajeet\\Documents\\NetBeansProjects\\VMS\\VMS ICON\\user-interface-2022-07-07-00-57-15-utc\\PNG\\24px\\graph.png")); // NOI18N
        trackbtn.setText("CLICK HERE TO TRACK");
        trackbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                trackbtnActionPerformed(evt);
            }
        });
        getContentPane().add(trackbtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 610, -1, -1));

        jLabel3.setIcon(new javax.swing.ImageIcon("C:\\Users\\indrajeet\\Documents\\NetBeansProjects\\VMS\\VMS ICON\\panel transparency new add diagnosis.png")); // NOI18N
        jLabel3.setText("jLabel2");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 470, 470, 260));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void logoutbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logoutbtnActionPerformed
        // TODO add your handling code here:
        UserLogin al=new UserLogin();
        al.setVisible(true);
        dispose();
    }//GEN-LAST:event_logoutbtnActionPerformed

    private void postbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_postbtnActionPerformed
        // TODO add your handling code here:
        ApplicationApply ao=new ApplicationApply();
        ao.aouserEmail=userEmail;
        ao.setVisible(true);
        dispose();
    }//GEN-LAST:event_postbtnActionPerformed

    private void managevolunteeringActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_managevolunteeringActionPerformed
        // TODO add your handling code here:
        ManageVolunteering mv=new ManageVolunteering();
        mv.userEmail=userEmail;
        mv.setVisible(true);
        dispose();
        
    }//GEN-LAST:event_managevolunteeringActionPerformed

    private void trackbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_trackbtnActionPerformed
        // TODO add your handling code here:
        
        TrackRequests tr=new TrackRequests();
        tr.setVisible(true);
        dispose();
        
        
    }//GEN-LAST:event_trackbtnActionPerformed

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
            java.util.logging.Logger.getLogger(UserDashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(UserDashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(UserDashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(UserDashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new UserDashboard().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JButton logoutbtn;
    private javax.swing.JButton managevolunteering;
    private javax.swing.JButton postbtn;
    private javax.swing.JButton trackbtn;
    // End of variables declaration//GEN-END:variables
}
