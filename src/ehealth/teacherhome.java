/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ehealth;

import java.awt.Image;
import javax.swing.JOptionPane;
import java.awt.event.WindowEvent;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;

public class teacherhome extends javax.swing.JFrame {

    public Statement st;
    public Connection cn;
    public user u;
    String sql3;
    String sql4;
    ResultSet rss4;
    ResultSet rss;
    ResultSet rss2;
    byte[] photo = null;
    byte[] imgbytes = null;
    public ImageIcon image1;
    public int count = 0;
    public int a = 0;
    public String accept1 = "accept";
//    public int slip = 0;

    public teacherhome(user _u) {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            cn = DriverManager.getConnection("jdbc:mysql://sql12.freesqldatabase.com:3306/sql12353692","sql12353692","NruRn74dY6");
            st = cn.createStatement();
            //JOptionPane.showMessageDialog(null, "Connected");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Not Connected");
        }
        u = _u;
//        String sql2 ="select *from yellowslip where accept = '" + "accept" + "'";
//      
//        ResultSet rss2;
//        try {
//            rss2 = st.executeQuery(sql2);
//            count = 0;
//            while(rss2.next())   
//                count++;
//            System.out.println("count: "+count);
//        } catch (SQLException ex) {
//            Logger.getLogger(doctorhome.class.getName()).log(Level.SEVERE, null, ex);
//        }
        
        sql3 = "select * from yellowslip,teacher_student_connection where teacher_student_connection.teacherid = '"+u.id+"' and yellowslip.accept = '"+accept1+"'and teacher_student_connection.studentid = yellowslip.Id" ;
        try {
            rss = st.executeQuery(sql3);
//            String sql4 = "select *from yellowslip where accept = '" + "accept";
//            ResultSet rss2;
//            try {
//                rss2 = st.executeQuery(sql4);
//                while (rss2.next()) {
//                    count++;
//                }
//                if (count != 0) {
//                    rss.next();
//                    imgbytes = rss.getBytes("image");
//                    Image image = getToolkit().createImage(imgbytes);
//                    image1 = new ImageIcon(image);
//                    dispose();
//                } else {
////                    image1 = null; 
//                    a = 1;
////                    dispose();
//                }
//            } catch (SQLException ex) {
//                Logger.getLogger(teacherhome.class.getName()).log(Level.SEVERE, null, ex);
//            }
            rss.next();
            
//            a++;
            System.out.println(a);
//            slip=rss.getInt("SlipNo");
//            String sqlss = "update yellowslip set accept = '" + accept + "'where BillNo='" + slip + "'";
//        PreparedStatement pst;
            
            imgbytes = rss.getBytes("image");
//                ImageIcon image = new ImageIcon(img);
            Image image = getToolkit().createImage(imgbytes);
//                Image icon = new 
//            System.out.println("A1");
            image1 = new ImageIcon(image);
     
        } catch (SQLException ex) {
            Logger.getLogger(teacherhome.class.getName()).log(Level.SEVERE, null, ex);
        }
        initComponents();
        try {
//            if (a == 0) {
            Jlabel18.setIcon(image1);
//            } else {
//                JOptionPane.showMessageDialog(null, "All clear");
//            }
        } catch (Exception e) {

            System.out.println("teacher: " + e);
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Jlabel16 = new javax.swing.JLabel();
        jDesktopPane2 = new javax.swing.JDesktopPane();
        Jlabel17 = new javax.swing.JLabel();
        kGradientPanel1 = new keeptoo.KGradientPanel();
        myprofile = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        back = new javax.swing.JButton();
        jDesktopPane3 = new javax.swing.JDesktopPane();
        Jlabel18 = new javax.swing.JLabel();

        jDesktopPane2.setBackground(new java.awt.Color(51, 51, 51));
        jDesktopPane2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));

        jDesktopPane2.setLayer(Jlabel17, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jDesktopPane2Layout = new javax.swing.GroupLayout(jDesktopPane2);
        jDesktopPane2.setLayout(jDesktopPane2Layout);
        jDesktopPane2Layout.setHorizontalGroup(
            jDesktopPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDesktopPane2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Jlabel17, javax.swing.GroupLayout.DEFAULT_SIZE, 424, Short.MAX_VALUE)
                .addContainerGap())
        );
        jDesktopPane2Layout.setVerticalGroup(
            jDesktopPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDesktopPane2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Jlabel17, javax.swing.GroupLayout.DEFAULT_SIZE, 499, Short.MAX_VALUE)
                .addContainerGap())
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        kGradientPanel1.setkEndColor(new java.awt.Color(248, 6, 35));
        kGradientPanel1.setkStartColor(new java.awt.Color(255, 255, 255));

        myprofile.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        myprofile.setText("My Profile");
        myprofile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                myprofileActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setText("Teacher Homepage");

        jButton1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButton1.setText("Next");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel2.setText("(Limit: 424 * 499)");

        back.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        back.setText("Sign out");
        back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backActionPerformed(evt);
            }
        });

        jDesktopPane3.setBackground(new java.awt.Color(255, 255, 255));
        jDesktopPane3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));

        jDesktopPane3.setLayer(Jlabel18, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jDesktopPane3Layout = new javax.swing.GroupLayout(jDesktopPane3);
        jDesktopPane3.setLayout(jDesktopPane3Layout);
        jDesktopPane3Layout.setHorizontalGroup(
            jDesktopPane3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDesktopPane3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Jlabel18, javax.swing.GroupLayout.DEFAULT_SIZE, 424, Short.MAX_VALUE)
                .addContainerGap())
        );
        jDesktopPane3Layout.setVerticalGroup(
            jDesktopPane3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jDesktopPane3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Jlabel18, javax.swing.GroupLayout.DEFAULT_SIZE, 499, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout kGradientPanel1Layout = new javax.swing.GroupLayout(kGradientPanel1);
        kGradientPanel1.setLayout(kGradientPanel1Layout);
        kGradientPanel1Layout.setHorizontalGroup(
            kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(kGradientPanel1Layout.createSequentialGroup()
                .addGroup(kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, kGradientPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18))
                    .addGroup(kGradientPanel1Layout.createSequentialGroup()
                        .addGap(74, 74, 74)
                        .addComponent(back, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(142, 142, 142)))
                .addGroup(kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(kGradientPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(212, 212, 212)
                        .addComponent(myprofile, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(37, 37, 37))
                    .addGroup(kGradientPanel1Layout.createSequentialGroup()
                        .addComponent(jDesktopPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(83, Short.MAX_VALUE))))
        );
        kGradientPanel1Layout.setVerticalGroup(
            kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(kGradientPanel1Layout.createSequentialGroup()
                .addContainerGap(14, Short.MAX_VALUE)
                .addGroup(kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(myprofile, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(kGradientPanel1Layout.createSequentialGroup()
                        .addGroup(kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(kGradientPanel1Layout.createSequentialGroup()
                                .addGap(480, 480, 480)
                                .addComponent(back, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(kGradientPanel1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jDesktopPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(12, 12, 12))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, kGradientPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel2)
                        .addGap(22, 22, 22))))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(kGradientPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(kGradientPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void backActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backActionPerformed
        // TODO add your handling code here:
        
        dispose();
        signinform sr= new signinform();
        sr.setVisible(true);
        JOptionPane.showMessageDialog(null, "Logged out");
        
    }//GEN-LAST:event_backActionPerformed

    private void myprofileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_myprofileActionPerformed
        myprofile mp = null;
        try {
            mp = new myprofile(u);
        } catch (SQLException ex) {
            Logger.getLogger(teacherhome.class.getName()).log(Level.SEVERE, null, ex);
        }
        mp.setVisible(true);
        //dispose();
    }//GEN-LAST:event_myprofileActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        try {
            
            if(rss.next())
            {    
            imgbytes = rss.getBytes("image");
            Image image = getToolkit().createImage(imgbytes);
            image1 = new ImageIcon(image);
            Jlabel18.setIcon(image1);
            }
            else
            {
//                
                JOptionPane.showMessageDialog(null, "finished");
            }   
//            

        } catch (SQLException ex) {
            Logger.getLogger(teacherhome.class.getName()).log(Level.SEVERE, null, ex);
        }

    }//GEN-LAST:event_jButton1ActionPerformed

    /**
     * @param args the command line arguments
     */
//    public static void main(String args[]) {
//        /* Set the Nimbus look and feel */
//        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
//        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
//         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
//         */
//        try {
//            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
//                if ("Nimbus".equals(info.getName())) {
//                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
//                    break;
//                }
//            }
//        } catch (ClassNotFoundException ex) {
//            java.util.logging.Logger.getLogger(teacherhome.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (InstantiationException ex) {
//            java.util.logging.Logger.getLogger(teacherhome.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (IllegalAccessException ex) {
//            java.util.logging.Logger.getLogger(teacherhome.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
//            java.util.logging.Logger.getLogger(teacherhome.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        }
//        //</editor-fold>
//
//        /* Create and display the form */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                new teacherhome().setVisible(true);
//            }
//        });
//    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Jlabel16;
    private javax.swing.JLabel Jlabel17;
    private javax.swing.JLabel Jlabel18;
    private javax.swing.JButton back;
    private javax.swing.JButton jButton1;
    private javax.swing.JDesktopPane jDesktopPane2;
    private javax.swing.JDesktopPane jDesktopPane3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private keeptoo.KGradientPanel kGradientPanel1;
    private javax.swing.JButton myprofile;
    // End of variables declaration//GEN-END:variables
}
