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
public class UserRequest extends javax.swing.JFrame {

    /**
     * Creates new form UserRequest
     */
    public String userEmail="";
    String ucode, utitle, ushift, ustarttime, uendtime, uname;
    public UserRequest() {
        initComponents();
        shift.setVisible(false);
        shiftView.setVisible(false);
        vid.setVisible(false);
        vidView.setVisible(false);
        vid1.setVisible(false);
        vidView1.setVisible(false);
        
        
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        vid1 = new javax.swing.JTextField();
        vidView1 = new javax.swing.JLabel();
        vidView = new javax.swing.JLabel();
        vid = new javax.swing.JTextField();
        optoutbtn = new javax.swing.JButton();
        shiftchangebtn = new javax.swing.JButton();
        isShift = new javax.swing.JCheckBox();
        jLabel6 = new javax.swing.JLabel();
        shiftView = new javax.swing.JLabel();
        loadData = new javax.swing.JButton();
        shift = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        isOptOut = new javax.swing.JCheckBox();
        jLabel7 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        table = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        vid1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        getContentPane().add(vid1, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 450, 80, 30));

        vidView1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        vidView1.setText("Volunteer Id :");
        getContentPane().add(vidView1, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 450, -1, 30));

        vidView.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        vidView.setText("Volunteer Id :");
        getContentPane().add(vidView, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 230, -1, 30));

        vid.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        getContentPane().add(vid, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 230, 80, 30));

        optoutbtn.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        optoutbtn.setIcon(new javax.swing.ImageIcon("C:\\Users\\indrajeet\\Documents\\NetBeansProjects\\VMS\\VMS ICON\\user-interface-2022-07-07-00-57-15-utc\\PNG\\24px\\gear.png")); // NOI18N
        optoutbtn.setText("CLICK HERE TO OPT-OUT");
        optoutbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                optoutbtnActionPerformed(evt);
            }
        });
        getContentPane().add(optoutbtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 500, -1, -1));

        shiftchangebtn.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        shiftchangebtn.setIcon(new javax.swing.ImageIcon("C:\\Users\\indrajeet\\Documents\\NetBeansProjects\\VMS\\VMS ICON\\user-interface-2022-07-07-00-57-15-utc\\PNG\\24px\\gear.png")); // NOI18N
        shiftchangebtn.setText("CLICK HERE TO CHANGE SHIFT");
        shiftchangebtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                shiftchangebtnActionPerformed(evt);
            }
        });
        getContentPane().add(shiftchangebtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 280, -1, -1));

        isShift.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        isShift.setText("Yes");
        isShift.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                isShiftActionPerformed(evt);
            }
        });
        getContentPane().add(isShift, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 190, -1, -1));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel6.setText("Shift Change?");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 190, -1, -1));

        shiftView.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        shiftView.setText("Preferred Shift : ");
        getContentPane().add(shiftView, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 190, -1, -1));

        loadData.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        loadData.setText("LOAD DATA");
        loadData.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loadDataActionPerformed(evt);
            }
        });
        getContentPane().add(loadData, new org.netbeans.lib.awtextra.AbsoluteConstraints(920, 540, -1, -1));

        shift.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        shift.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Day", "Noon", "Evening" }));
        shift.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                shiftActionPerformed(evt);
            }
        });
        getContentPane().add(shift, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 230, 140, 30));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("CURRENTLY ENROLLED VOLUNTEERING TASKS");
        jLabel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 5));
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 130, 420, 50));

        isOptOut.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        isOptOut.setText("Yes");
        isOptOut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                isOptOutActionPerformed(evt);
            }
        });
        getContentPane().add(isOptOut, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 410, -1, -1));

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel7.setText("Want to Opt-Out");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 410, -1, -1));

        jLabel5.setIcon(new javax.swing.ImageIcon("C:\\Users\\indrajeet\\Documents\\NetBeansProjects\\VMS\\VMS ICON\\panel transparency new add diagnosis.png")); // NOI18N
        jLabel5.setText("jLabel2");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 130, 470, 460));

        table.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        table.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Volunteer ID", "Volunteering Opportunities", "Current Shift", "Start Time", "End Time"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, true, true, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        table.setRowHeight(24);
        table.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                tableComponentShown(evt);
            }
        });
        jScrollPane2.setViewportView(table);

        getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 190, 510, 340));

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

    private void isShiftActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_isShiftActionPerformed
        // TODO add your handling code here:

        if(isShift.isSelected())
        {
            shift.setVisible(true);
            shiftView.setVisible(true);
            vid.setVisible(true);
            vidView.setVisible(true);
        }
        else
        {
            shift.setVisible(false);
            shiftView.setVisible(false);
            vid.setVisible(false);
            vidView.setVisible(false);
        }
        

    }//GEN-LAST:event_isShiftActionPerformed

    private void shiftActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_shiftActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_shiftActionPerformed

    private void isOptOutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_isOptOutActionPerformed
        // TODO add your handling code here:
        
        if(isOptOut.isSelected())
        {
//            optOut.setVisible(true);
//            optOutView.setVisible(true);
            vid1.setVisible(true);
            vidView1.setVisible(true);
        }
        else
        {
//            optOut.setVisible(false);
//            optOutView.setVisible(false);
            vid1.setVisible(false);
            vidView1.setVisible(false);
        }
    }//GEN-LAST:event_isOptOutActionPerformed

    private void shiftchangebtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_shiftchangebtnActionPerformed
        // TODO add your handling code here:
        
        if(isShift.isSelected())
        {
            if(vid.getText().isEmpty())
            {
                JOptionPane.showMessageDialog(this, "Fill All the Details First! ", "Fill All Details", JOptionPane.ERROR_MESSAGE);
           
            }
            else
            {
                if(((String)shift.getSelectedItem()).equals(ushift))
                {
                    JOptionPane.showMessageDialog(this, "Please Select Different Shift! ", "Change Shift", JOptionPane.ERROR_MESSAGE);
           
                }
                else
                {
                      Connection conn=DBConnection.connectDB();
                    try{
                        PreparedStatement st=(PreparedStatement) 
                                conn.prepareStatement("Insert into requests(name, email, vid, requestfor, suggestion, remarks) values(?,?,?,?,?, ?)");
                        st.setString(1, uname);
                        st.setString(2, userEmail);
                        st.setString(3, vid.getText());
                        st.setString(4, "Shift Change");
                        st.setString(5, (String)shift.getSelectedItem());
                        st.setString(6,  " ");
                        int rs=st.executeUpdate();
                        
                        JOptionPane.showMessageDialog(this, "Shift Change Request Sent to Admin Successfully", "Success", JOptionPane.INFORMATION_MESSAGE);
                        
                        dispose();
                        ManageVolunteering mv=new ManageVolunteering();
                        mv.userEmail=userEmail;
                        mv.setVisible(true);
                    }
                    catch(SQLException sqle)
                    {
                        JOptionPane.showMessageDialog(this, "Invalid Email", "Error", JOptionPane.ERROR_MESSAGE);

                        Logger.getLogger(UserLogin.class.getName()).log(Level.SEVERE, null, sqle);
                    }
                    
//                    Connection conn=DBConnection.connectDB();
//                    try{
//                        PreparedStatement st=(PreparedStatement) 
//                                conn.prepareStatement("Update apply set shift=? where vid=? and email=?");
//                        st.setString(1, (String)shift.getSelectedItem());
//                        st.setString(2, vid.getText());
//                        st.setString(3, userEmail);
//                        
//                        int rs=st.executeUpdate();
//                        
//                        JOptionPane.showMessageDialog(this, "Shift Changed Successfully", "Success", JOptionPane.INFORMATION_MESSAGE);
//                        
//                        dispose();
//                        SelectApplicant sa=new SelectApplicant();
//                        sa.setVisible(true);
//                    }
//                    catch(SQLException sqle)
//                    {
//                        JOptionPane.showMessageDialog(this, "Invalid Email", "Error", JOptionPane.ERROR_MESSAGE);
//
//                        Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, sqle);
//                    }
                }
                
            }
        }
        else
        {
            JOptionPane.showMessageDialog(this, "Select the Checkbox First! ", "Found Nothing", JOptionPane.ERROR_MESSAGE);
           
        }
        
    }//GEN-LAST:event_shiftchangebtnActionPerformed

    private void optoutbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_optoutbtnActionPerformed
        // TODO add your handling code here:
        
       if(vid1.getText().isEmpty())
            {
                JOptionPane.showMessageDialog(this, "Fill All the Details First! ", "Fill All Details", JOptionPane.ERROR_MESSAGE);
           
            }
            else
            {
                
                
                      Connection conn=DBConnection.connectDB();
                    try{
                        PreparedStatement st=(PreparedStatement) 
                                conn.prepareStatement("Insert into requests(name, email, vid, requestfor, suggestion, remarks) values(?,?,?,?,?)");
                        st.setString(1, uname);
                        st.setString(2, userEmail);
                        st.setString(3, vid.getText());
                        st.setString(4, "Opt Out");
                        st.setString(5, " ");
                        st.setString(6, " ");
                        
                        int rs=st.executeUpdate();
                        
                        JOptionPane.showMessageDialog(this, "Opt-Out Request Sent to Admin Successfully", "Success", JOptionPane.INFORMATION_MESSAGE);
                        
                        dispose();
                        ManageVolunteering mv=new ManageVolunteering();
                        mv.userEmail=userEmail;
                        mv.setVisible(true);
                    }
                    catch(SQLException sqle)
                    {
                        JOptionPane.showMessageDialog(this, "Invalid Email", "Error", JOptionPane.ERROR_MESSAGE);

                        Logger.getLogger(UserLogin.class.getName()).log(Level.SEVERE, null, sqle);
                    }
                
                
            }
         
        
        
        
    }//GEN-LAST:event_optoutbtnActionPerformed

    private void tableComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_tableComponentShown
        // TODO add your handling code here:
    }//GEN-LAST:event_tableComponentShown

    private void loadDataActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loadDataActionPerformed
        // TODO add your handling code here:
        
        try{
            Connection conn=DBConnection.connectDB();
            PreparedStatement st=(PreparedStatement)
            conn.prepareStatement("select code, title, name, shift, starttime, endtime from apply inner join opportunities where opportunities.code = apply.vid and email=?");
            st.setString(1, userEmail);
            ResultSet rs=st.executeQuery();
            
            while(rs.next())
            {
                 ucode=rs.getString("code");
                 utitle=rs.getString("title");
                 ushift=rs.getString("shift");
                 ustarttime=rs.getString("starttime");
                 uendtime=rs.getString("endtime");
                 uname=rs.getString("name");
                 String tableData[]={ucode, utitle, ushift, ustarttime, uendtime};
                DefaultTableModel tableModel=(DefaultTableModel) table.getModel();
                tableModel.addRow(tableData);
                
                

            }
            if(rs==null)
            {
                JOptionPane.showMessageDialog(this, "No Applicants Available! ", "Found Nothing", JOptionPane.ERROR_MESSAGE);
            }

        }
        catch(SQLException sqle)
        {
            Logger.getLogger(Home.class.getName()).log(Level.SEVERE, null, sqle);
        }
        loadData.setEnabled(false);
    }//GEN-LAST:event_loadDataActionPerformed

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
            java.util.logging.Logger.getLogger(UserRequest.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(UserRequest.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(UserRequest.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(UserRequest.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new UserRequest().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JCheckBox isOptOut;
    private javax.swing.JCheckBox isShift;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JButton loadData;
    private javax.swing.JButton optoutbtn;
    private javax.swing.JComboBox<String> shift;
    private javax.swing.JLabel shiftView;
    private javax.swing.JButton shiftchangebtn;
    private javax.swing.JTable table;
    private javax.swing.JTextField vid;
    private javax.swing.JTextField vid1;
    private javax.swing.JLabel vidView;
    private javax.swing.JLabel vidView1;
    // End of variables declaration//GEN-END:variables
}
