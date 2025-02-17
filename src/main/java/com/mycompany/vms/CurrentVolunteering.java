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
public class CurrentVolunteering extends javax.swing.JFrame {

    /**
     * Creates new form CurrentVolunteering
     */
    public String userEmail="";
    public CurrentVolunteering() {
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

        jButton2 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        table = new javax.swing.JTable();
        jLabel5 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton2.setIcon(new javax.swing.ImageIcon("C:\\Users\\indrajeet\\Documents\\NetBeansProjects\\VMS\\VMS ICON\\mobile-interface-icons-2021-10-21-02-36-44-utc\\png\\20\\26 - Zoom.png")); // NOI18N
        jButton2.setText("LOAD DATA");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 180, 140, 30));

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

        table.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Current Activity", "Shift", "Start Time", "End Time", "Volunteering Period"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        table.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                tableComponentShown(evt);
            }
        });
        jScrollPane2.setViewportView(table);

        getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 240, 910, 410));

        jLabel5.setIcon(new javax.swing.ImageIcon("C:\\Users\\indrajeet\\Documents\\NetBeansProjects\\VMS\\VMS ICON\\panel transparency new add diagnosis.png")); // NOI18N
        jLabel5.setText("jLabel2");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 170, 990, 500));

        jLabel1.setIcon(new javax.swing.ImageIcon("C:\\Users\\indrajeet\\Documents\\NetBeansProjects\\VMS\\VMS ICON\\admin dahsboard.jpg")); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        ManageVolunteering mv=new ManageVolunteering();
        mv.userEmail=userEmail;
        mv.setVisible(true);
        dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void tableComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_tableComponentShown
        // TODO add your handling code here:

    }//GEN-LAST:event_tableComponentShown

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:

        try{
            Connection conn=DBConnection.connectDB();
            PreparedStatement st=(PreparedStatement)
            conn.prepareStatement("select title, shift, starttime, endtime, period from apply inner join "
                    + "opportunities where apply.idtype='ACCEPTED' and apply.vid=opportunities.code and email=?");
            st.setString(1, userEmail);
            ResultSet rs=st.executeQuery();
            
            
            PreparedStatement st1=(PreparedStatement)
            conn.prepareStatement("select title, shift, starttime, endtime, period from apply inner join "
                    + "opportunities where apply.idtype='ACCEPTED' and apply.vid=opportunities.code and email=?");
            st1.setString(1, userEmail);
            ResultSet rs1=st1.executeQuery();
            
            while(rs.next())
            {
              String period=rs.getString("period");
              String title=rs.getString("title");  
              String shift=rs.getString("shift");
              String starttime=rs.getString("starttime");
              String endtime=rs.getString("endtime");
//              label1.setText("You have been selected for "+title+". "+"You have to work for "+period+" days");
//              label2.setText("Schedule: Shift: "+shift +"shift, Start Time: "+ starttime+", End Time: "+endtime+".");
              String tableData[]={title, shift, starttime, endtime, period};
                DefaultTableModel tableModel=(DefaultTableModel) table.getModel();
                tableModel.addRow(tableData);
                jButton2.setEnabled(false);


            }
            if(rs1.next()==false)
            {
                
                JOptionPane.showMessageDialog(this, "You haven't been allocated to any Volunteering tasks yet!!!", "Found Nothing", JOptionPane.ERROR_MESSAGE);
            
            }

        }
        catch(SQLException sqle)
        {
            Logger.getLogger(Home.class.getName()).log(Level.SEVERE, null, sqle);
        }
//        
//        try{
//            Connection conn=DBConnection.connectDB();
//            PreparedStatement st=(PreparedStatement)
//            conn.prepareStatement("select name, code, title, remarks, requestfor from opportunities inner join requests");
//
//            ResultSet rs=st.executeQuery();
//            PreparedStatement st1=(PreparedStatement)
//            conn.prepareStatement("select name, code, title, remarks, requestfor from opportunities inner join requests where opportunities.code=requests.vid");
//            ResultSet sr=st1.executeQuery();
//            if(sr.next()==false)
//            {
//                JOptionPane.showMessageDialog(this, "No Requests have been made! ", "Found Nothing", JOptionPane.ERROR_MESSAGE);
//            }
//            while(rs.next())
//            {
//                String name=rs.getString("name");
//                String code=rs.getString("code");
//                String vTitle=rs.getString("title");
//                String remarks=rs.getString("remarks");
//                String requestfor=rs.getString("requestfor");
//
//                String tableData[]={name, code, vTitle, requestfor, remarks};
//                DefaultTableModel tableModel=(DefaultTableModel) table.getModel();
//                tableModel.addRow(tableData);
//
//                jButton2.setEnabled(false);
//
//            }
//
//        }
//        catch(SQLException sqle)
//        {
//            Logger.getLogger(Home.class.getName()).log(Level.SEVERE, null, sqle);
//            JOptionPane.showMessageDialog(this, "No Requests have been made!!!", "Error", JOptionPane.ERROR_MESSAGE);
//
//        }
    }//GEN-LAST:event_jButton2ActionPerformed

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
            java.util.logging.Logger.getLogger(CurrentVolunteering.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CurrentVolunteering.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CurrentVolunteering.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CurrentVolunteering.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CurrentVolunteering().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable table;
    // End of variables declaration//GEN-END:variables
}
