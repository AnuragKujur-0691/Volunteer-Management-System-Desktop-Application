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
public class ReviewApplication extends javax.swing.JFrame {

    /**
     * Creates new form ReviewApplication
     */
    String start_time="", end_time="", vshift="";
    String vid="", adminEmail="", title="";
    String userEmail="";
    public ReviewApplication() {
        initComponents();
        titleLabel.setText(title);
        accept.setVisible(false);
        reject.setVisible(false);
        status.setVisible(false);
        statuscross.setVisible(false);
        status1.setVisible(false);
        shiftLabel.setVisible(false);
        done.setVisible(false);
        shift.setVisible(false);
        startTimeLabel.setVisible(false);
        starttime.setVisible(false);
        endTimeLabel.setVisible(false);
        endtime.setVisible(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        done = new javax.swing.JButton();
        shiftLabel = new javax.swing.JLabel();
        shift = new javax.swing.JTextField();
        startTimeLabel = new javax.swing.JLabel();
        starttime = new javax.swing.JTextField();
        endTimeLabel = new javax.swing.JLabel();
        endtime = new javax.swing.JTextField();
        status1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        accept = new javax.swing.JButton();
        reject = new javax.swing.JButton();
        statuscross = new javax.swing.JButton();
        status = new javax.swing.JLabel();
        loadData = new javax.swing.JButton();
        titleLabel = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        applicantTable = new javax.swing.JTable();
        jLabel3 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        logoutbtn = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        done.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        done.setText("DONE");
        done.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                doneActionPerformed(evt);
            }
        });
        getContentPane().add(done, new org.netbeans.lib.awtextra.AbsoluteConstraints(930, 430, -1, -1));

        shiftLabel.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        shiftLabel.setText("Allocated Shift(Day/Noon/Evening)");
        getContentPane().add(shiftLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 300, 240, 30));

        shift.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        getContentPane().add(shift, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 330, 490, 40));

        startTimeLabel.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        startTimeLabel.setText("Start Time (in hh:mm:ss)");
        getContentPane().add(startTimeLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 380, 220, 30));

        starttime.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        getContentPane().add(starttime, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 410, 240, 40));

        endTimeLabel.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        endTimeLabel.setText("End Time (in hh:mm:ss)");
        getContentPane().add(endTimeLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 380, 220, 30));

        endtime.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        getContentPane().add(endtime, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 410, 240, 40));

        status1.setIcon(new javax.swing.ImageIcon("C:\\Users\\indrajeet\\Documents\\NetBeansProjects\\VMS\\VMS ICON\\panel transparency new add diagnosis.png")); // NOI18N
        status1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        getContentPane().add(status1, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 280, 680, 190));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 0, 0));
        jLabel4.setText("Leave Applicants With ACCEPTED/REJECTED Status ");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 610, -1, -1));

        accept.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        accept.setIcon(new javax.swing.ImageIcon("C:\\Users\\indrajeet\\Documents\\NetBeansProjects\\VMS\\VMS ICON\\user-interface-2022-07-07-00-57-15-utc\\PNG\\24px\\24 - Like.png")); // NOI18N
        accept.setText("ACCEPT");
        accept.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                acceptActionPerformed(evt);
            }
        });
        getContentPane().add(accept, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 360, 170, 50));

        reject.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        reject.setIcon(new javax.swing.ImageIcon("C:\\Users\\indrajeet\\Documents\\NetBeansProjects\\VMS\\VMS ICON\\user-interface-2022-07-07-00-57-15-utc\\PNG\\24px\\23 - Dislike.png")); // NOI18N
        reject.setText("REJECT");
        reject.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rejectActionPerformed(evt);
            }
        });
        getContentPane().add(reject, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 360, 150, 50));

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
        getContentPane().add(loadData, new org.netbeans.lib.awtextra.AbsoluteConstraints(1070, 130, -1, -1));

        titleLabel.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        getContentPane().add(titleLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 130, -1, -1));

        applicantTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Name", "Roll No.", "Email", "Skills", "Experience", "Contribution", "Status"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        applicantTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                applicantTableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(applicantTable);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 170, 1010, -1));

        jLabel3.setIcon(new javax.swing.ImageIcon("C:\\Users\\indrajeet\\Documents\\NetBeansProjects\\VMS\\VMS ICON\\panel transparency new add diagnosis.png")); // NOI18N
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 110, 1100, 540));

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

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("APPLICANTS LIST");
        jLabel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 5));
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 40, 220, 50));

        logoutbtn.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        logoutbtn.setIcon(new javax.swing.ImageIcon("C:\\Users\\indrajeet\\Documents\\NetBeansProjects\\VMS\\VMS ICON\\user-interface-2022-07-07-00-57-15-utc\\PNG\\24px\\exit.png")); // NOI18N
        logoutbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logoutbtnActionPerformed(evt);
            }
        });
        getContentPane().add(logoutbtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(1290, 20, -1, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon("C:\\Users\\indrajeet\\Documents\\NetBeansProjects\\VMS\\VMS ICON\\admin dahsboard.jpg")); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        ManageActivity ad=new ManageActivity();
        ad.adminEmail=adminEmail;
        ad.setVisible(true);
        dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void logoutbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logoutbtnActionPerformed
        // TODO add your handling code here:
        AdminLogin al=new AdminLogin();
        al.setVisible(true);
        dispose();
    }//GEN-LAST:event_logoutbtnActionPerformed

    private void loadDataActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loadDataActionPerformed
        // TODO add your handling code here:

        try{
            Connection conn=DBConnection.connectDB();
            PreparedStatement st=(PreparedStatement)
            conn.prepareStatement("select name, roll, email, skills, experience, contribute, idtype from apply where vid=?");
            st.setString(1, vid);
            ResultSet rs=st.executeQuery();
            
            
            PreparedStatement st1=(PreparedStatement)
                    conn.prepareStatement("select name, roll, email, skills, experience, contribute, idtype from apply where vid=?");
            st1.setString(1, vid);
            ResultSet rs1=st1.executeQuery();
            if(rs1.next()==false)
            {
                JOptionPane.showMessageDialog(this, "No Applicants Available! ", "Found Nothing", JOptionPane.ERROR_MESSAGE);
            }
            while(rs.next())
            {
                String name=rs.getString("name");
                String roll=rs.getString("roll");
                String email=rs.getString("email");
                String skills=rs.getString("skills");
                String exp=rs.getString("experience");
                String contribute=rs.getString("contribute");
                String status=rs.getString("idtype");
                
                String tableData[]={name, roll, email, skills, exp, contribute, status};
                DefaultTableModel tableModel=(DefaultTableModel) applicantTable.getModel();
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
        accept.setVisible(false);
        reject.setVisible(false);
    }//GEN-LAST:event_statuscrossActionPerformed

    private void acceptActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_acceptActionPerformed
        // TODO add your handling code here:
        
        accept.setVisible(false);
        reject.setVisible(false);
        status.setVisible(false);
        statuscross.setVisible(false);
        status1.setVisible(true);
        shiftLabel.setVisible(true);
        done.setVisible(true);
        shift.setVisible(true);
        startTimeLabel.setVisible(true);
        starttime.setVisible(true);
        endTimeLabel.setVisible(true);
        endtime.setVisible(true);
        
        
    }//GEN-LAST:event_acceptActionPerformed

    private void rejectActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rejectActionPerformed

        
        Connection conn=DBConnection.connectDB();
        try{
            PreparedStatement st=(PreparedStatement)
            conn.prepareStatement("update apply set idtype='REJECTED' where email=?");
            st.setString(1, userEmail);
            st.executeUpdate();
            
            ReviewApplication sa=new ReviewApplication();
            sa.vid=vid;
            sa.title=title;
            sa.adminEmail=adminEmail;
            sa.setVisible(true);
            dispose();
        }
        catch(SQLException sqle)
        {
            JOptionPane.showMessageDialog(this, "Invalid Email", "Error", JOptionPane.ERROR_MESSAGE);

            Logger.getLogger(UserLogin.class.getName()).log(Level.SEVERE, null, sqle);
        }
        DefaultTableModel tableModel=(DefaultTableModel) applicantTable.getModel();
        tableModel.setRowCount(0);
        
        accept.setVisible(false);
        reject.setVisible(false);
        status.setVisible(false);
        statuscross.setVisible(false);
        
    }//GEN-LAST:event_rejectActionPerformed

    private void applicantTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_applicantTableMouseClicked
        // TODO add your handling code here:
        
        
        int row=applicantTable.getSelectedRow();
        DefaultTableModel model=(DefaultTableModel) applicantTable.getModel();
        String stat=model.getValueAt(row, 6).toString();
        userEmail=model.getValueAt(row, 2).toString();
        if(stat.equals("APPLIED"))
        {
            accept.setVisible(true);
            reject.setVisible(true);
            status.setVisible(true);
            statuscross.setVisible(true);
        }
        
    }//GEN-LAST:event_applicantTableMouseClicked

    private void doneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_doneActionPerformed
        // TODO add your handling code here:
        
        start_time=starttime.getText(); 
        end_time=endtime.getText();
        vshift=shift.getText();
        
        if(start_time.isEmpty() || end_time.isEmpty() || vshift.isEmpty())
        {
            JOptionPane.showMessageDialog(this, "Fill Everything", "Error", JOptionPane.ERROR_MESSAGE);
                
        }
        else
        {
            Connection conn=DBConnection.connectDB();
            try{
                PreparedStatement st=(PreparedStatement)
                conn.prepareStatement("update apply set idtype='ACCEPTED', shift=?, starttime=?, endtime=? where email=? ");

                st.setString(1, vshift);
                st.setString(2, start_time);
                st.setString(3, end_time);
                st.setString(4, userEmail);

                st.executeUpdate();
                PreparedStatement st1=(PreparedStatement)
                conn.prepareStatement("update opportunities set studentsentered=studentsentered+1 where code=? ");
                st1.setString(1, vid);
                st1.executeUpdate();

                
                ReviewApplication sa=new ReviewApplication();
                sa.vid=vid;
                sa.title=title;
                sa.adminEmail=adminEmail;
                sa.setVisible(true);
                dispose();
            }
            catch(SQLException sqle)
            {
                JOptionPane.showMessageDialog(this, "Invalid", "Error", JOptionPane.ERROR_MESSAGE);
                Logger.getLogger(UserLogin.class.getName()).log(Level.SEVERE, null, sqle);
            }
            DefaultTableModel tableModel=(DefaultTableModel) applicantTable.getModel();
            tableModel.setRowCount(0);

            accept.setVisible(false);
            reject.setVisible(false);
            status.setVisible(false);
            statuscross.setVisible(false);
            status1.setVisible(false);
            shiftLabel.setVisible(false);
            done.setVisible(false);
            shift.setVisible(false);
            startTimeLabel.setVisible(false);
            starttime.setVisible(false);
            endTimeLabel.setVisible(false);
            endtime.setVisible(false);
        }
    }//GEN-LAST:event_doneActionPerformed

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
            java.util.logging.Logger.getLogger(ReviewApplication.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ReviewApplication.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ReviewApplication.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ReviewApplication.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ReviewApplication().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton accept;
    private javax.swing.JTable applicantTable;
    private javax.swing.JButton done;
    private javax.swing.JLabel endTimeLabel;
    private javax.swing.JTextField endtime;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton loadData;
    private javax.swing.JButton logoutbtn;
    private javax.swing.JButton reject;
    private javax.swing.JTextField shift;
    private javax.swing.JLabel shiftLabel;
    private javax.swing.JLabel startTimeLabel;
    private javax.swing.JTextField starttime;
    private javax.swing.JLabel status;
    private javax.swing.JLabel status1;
    private javax.swing.JButton statuscross;
    private javax.swing.JLabel titleLabel;
    // End of variables declaration//GEN-END:variables
}
