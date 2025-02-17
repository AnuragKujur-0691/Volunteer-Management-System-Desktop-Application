/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.vms;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author indrajeet
 */
public class ManageActivity extends javax.swing.JFrame {

    /**
     * Creates new form ManageActivity
     */
    String adminEmail="", title="", vid="";
    public ManageActivity() {
        initComponents();
        status.setVisible(false);
        statuscross.setVisible(false);
        editbtn.setVisible(false);
        reviewbtn.setVisible(false);
        deletebtn.setVisible(false);
        
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        deletebtn = new javax.swing.JButton();
        editbtn = new javax.swing.JButton();
        reviewbtn = new javax.swing.JButton();
        statuscross = new javax.swing.JButton();
        status = new javax.swing.JLabel();
        loadData = new javax.swing.JButton();
        availablepanel = new javax.swing.JScrollPane();
        availabletable = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        logoutbtn = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        deletebtn.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        deletebtn.setText("DELETE");
        deletebtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deletebtnActionPerformed(evt);
            }
        });
        getContentPane().add(deletebtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(880, 390, -1, -1));

        editbtn.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        editbtn.setText("EDIT");
        editbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editbtnActionPerformed(evt);
            }
        });
        getContentPane().add(editbtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 390, -1, -1));

        reviewbtn.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        reviewbtn.setText("REVIEW APPLICATIONS");
        reviewbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                reviewbtnActionPerformed(evt);
            }
        });
        getContentPane().add(reviewbtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 390, -1, -1));

        statuscross.setBackground(new java.awt.Color(242, 242, 242));
        statuscross.setForeground(new java.awt.Color(242, 242, 242));
        statuscross.setIcon(new javax.swing.ImageIcon("C:\\Users\\indrajeet\\Documents\\NetBeansProjects\\VMS\\VMS ICON\\Close.png")); // NOI18N
        statuscross.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        statuscross.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                statuscrossActionPerformed(evt);
            }
        });
        getContentPane().add(statuscross, new org.netbeans.lib.awtextra.AbsoluteConstraints(970, 290, 40, 40));

        status.setIcon(new javax.swing.ImageIcon("C:\\Users\\indrajeet\\Documents\\NetBeansProjects\\VMS\\VMS ICON\\panel transparency new add diagnosis.png")); // NOI18N
        status.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        getContentPane().add(status, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 280, 680, 190));

        loadData.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        loadData.setText("LOAD DATA");
        loadData.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loadDataActionPerformed(evt);
            }
        });
        getContentPane().add(loadData, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 130, -1, -1));

        availabletable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Code", "Title", "Students Required", "Volunteering Period (in days)", "Last Date to Apply", "More Details"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        availabletable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                availabletableMouseClicked(evt);
            }
        });
        availabletable.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                availabletableComponentShown(evt);
            }
        });
        availablepanel.setViewportView(availabletable);

        getContentPane().add(availablepanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 180, 1040, 430));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("ACTIVITIES POSTED BY YOU");
        jLabel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 5));
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 40, 330, 50));

        jButton1.setBackground(new java.awt.Color(242, 242, 242));
        jButton1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jButton1.setIcon(new javax.swing.ImageIcon("C:\\Users\\indrajeet\\Documents\\NetBeansProjects\\VMS\\VMS ICON\\mobile-interface-icons-2021-10-21-02-36-44-utc\\png\\48\\05 - Arrow Left.png")); // NOI18N
        jButton1.setBorder(null);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, -1, -1));

        logoutbtn.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        logoutbtn.setIcon(new javax.swing.ImageIcon("C:\\Users\\indrajeet\\Documents\\NetBeansProjects\\VMS\\VMS ICON\\user-interface-2022-07-07-00-57-15-utc\\PNG\\24px\\exit.png")); // NOI18N
        logoutbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logoutbtnActionPerformed(evt);
            }
        });
        getContentPane().add(logoutbtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(1290, 20, -1, -1));

        jLabel3.setIcon(new javax.swing.ImageIcon("C:\\Users\\indrajeet\\Documents\\NetBeansProjects\\VMS\\VMS ICON\\panel transparency new add diagnosis.png")); // NOI18N
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 110, 1100, 510));

        jLabel1.setIcon(new javax.swing.ImageIcon("C:\\Users\\indrajeet\\Documents\\NetBeansProjects\\VMS\\VMS ICON\\admin dahsboard.jpg")); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void logoutbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logoutbtnActionPerformed
        // TODO add your handling code here:
        AdminLogin al=new AdminLogin();
        
        al.setVisible(true);
        dispose();
    }//GEN-LAST:event_logoutbtnActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        AdminDashboard ad=new AdminDashboard();
        ad.adminEmail=adminEmail;
        ad.setVisible(true);
        dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void availabletableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_availabletableMouseClicked
        // TODO add your handling code here:

        int row=availabletable.getSelectedRow();
        DefaultTableModel model=(DefaultTableModel) availabletable.getModel();
        vid=model.getValueAt(row, 0).toString();
        title=model.getValueAt(row, 1).toString();
        status.setVisible(true);
        statuscross.setVisible(true);
        editbtn.setVisible(true);
        reviewbtn.setVisible(true);
        deletebtn.setVisible(true);
        
        
        
        
        
        
    }//GEN-LAST:event_availabletableMouseClicked

    private void availabletableComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_availabletableComponentShown
        // TODO add your handling code here:
    }//GEN-LAST:event_availabletableComponentShown

    private void loadDataActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loadDataActionPerformed
        // TODO add your handling code here:

        try{
            Connection conn=DBConnection.connectDB();
            PreparedStatement st=(PreparedStatement)
            conn.prepareStatement("select code, title, studentrequired, period, lastdate, moredetails from opportunities where lastdate >= NOW()");
            //st.setString(1, adminEmail);
            ResultSet rs=st.executeQuery();
            
            PreparedStatement st1=(PreparedStatement)
            conn.prepareStatement("select code, title, studentrequired, period, lastdate, moredetails from opportunities where lastdate >= NOW()");
           // st1.setString(1, adminEmail);
            ResultSet rs1=st1.executeQuery();
            if(rs1.next()==false)
            {
                JOptionPane.showMessageDialog(this, "No Volunteering Activities Posted Yet! ", "Found Nothing", JOptionPane.ERROR_MESSAGE);
            }
            while(rs.next())
            {
                String code=rs.getString("code");
                String title=rs.getString("title");
                String stduentsrequired=rs.getString("studentrequired");
                String period=rs.getString("period");
                String lastdate=rs.getString("lastdate");
                String moredetails=rs.getString("moredetails");

                String tableData[]={code, title, stduentsrequired, period, lastdate, moredetails};
                DefaultTableModel tableModel=(DefaultTableModel) availabletable.getModel();
                tableModel.addRow(tableData);
                
            }

        }
        catch(SQLException sqle)
        {
            Logger.getLogger(Home.class.getName()).log(Level.SEVERE, null, sqle);
        }
        
        
        loadData.setEnabled(false);
        
        
        
        
        
        

    }//GEN-LAST:event_loadDataActionPerformed

    private void statuscrossActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_statuscrossActionPerformed
        // TODO add your handling code here:
        status.setVisible(false);
        statuscross.setVisible(false);
        editbtn.setVisible(false);
        reviewbtn.setVisible(false);
        deletebtn.setVisible(false);
    }//GEN-LAST:event_statuscrossActionPerformed

    private void reviewbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_reviewbtnActionPerformed
        // TODO add your handling code here:
        
        ReviewApplication ra=new ReviewApplication();
        ra.vid=vid;
        ra.title=title;
        ra.adminEmail=adminEmail;
        ra.setVisible(true);
        dispose();
        
    }//GEN-LAST:event_reviewbtnActionPerformed

    private void editbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editbtnActionPerformed
        // TODO add your handling code here:
        EditActivity ea=new EditActivity();
        ea.adminEmail=adminEmail;
        ea.vid=vid;
        ea.setVisible(true);
        dispose();
    }//GEN-LAST:event_editbtnActionPerformed

    private void deletebtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deletebtnActionPerformed
        // TODO add your handling code here:
        
        Connection loginConn=DBConnection.connectDB();
            
        try{
            PreparedStatement st1=(PreparedStatement)
                        loginConn.prepareStatement("delete from opportunities where code=?");
            
            st1.setString(1, vid);
            int rs1=st1.executeUpdate();
            
            JOptionPane.showMessageDialog(this, "Post Deleted Successfully", "Success", JOptionPane.INFORMATION_MESSAGE);
            dispose();
            ManageActivity ad=new ManageActivity();
            ad.adminEmail=adminEmail;
            ad.setVisible(true);
        }
        catch(SQLException se)
        {
            Logger.getLogger(Home.class.getName()).log(Level.SEVERE, null, se);
            //JOptionPane.showMessageDialog(this, "Id Already Exist!!!", "Error", JOptionPane.ERROR_MESSAGE);
       
        }
        
        
        
    }//GEN-LAST:event_deletebtnActionPerformed

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
            java.util.logging.Logger.getLogger(ManageActivity.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ManageActivity.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ManageActivity.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ManageActivity.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ManageActivity().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane availablepanel;
    private javax.swing.JTable availabletable;
    private javax.swing.JButton deletebtn;
    private javax.swing.JButton editbtn;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JButton loadData;
    private javax.swing.JButton logoutbtn;
    private javax.swing.JButton reviewbtn;
    private javax.swing.JLabel status;
    private javax.swing.JButton statuscross;
    // End of variables declaration//GEN-END:variables
}
