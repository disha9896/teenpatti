/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package teenpatti;
import AppPackage.AnimationClass;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;

/**
 *
 * @author disha
 */
public class login extends javax.swing.JFrame {
AnimationClass ac = new AnimationClass();
     
    /**
     * Creates new form login
     */
    public login() {
        initComponents();
        Dimension screenSize,frameSize;
        int x,y;
        screenSize=Toolkit.getDefaultToolkit().getScreenSize();
        frameSize=getSize();
        x=(screenSize.width-frameSize.width)/2;
        y=(screenSize.height-frameSize.height)/2;
        setLocation(x, y);
       
       //this.setResizable(false);
        
//        ImageIcon img =new ImageIcon( new ImageIcon("1_small.png.jpg").getImage().getScaledInstance(this.getWidth(), this.getHeight(), Image.SCALE_DEFAULT));
//        jLabel1.setIcon(img);
        slideshow();    
    }
    int count=1;
    
    public void slideshow(){
        Thread t=new Thread() {
            @Override
            public void run() {
                try {
                    while (true) {
                        
                        
                        
                       
                        switch (count) {
                            case 1: {
                                
                                Thread.sleep(2000);
                                ac.jLabelXLeft(jLabel1.getX(),-jLabel1.getWidth(),20, 6, jLabel1);
                                ac.jLabelXLeft(jLabel2.getX(),0, 20, 6, jLabel2);
                                count=2;
                                Thread.sleep(1500);
                                break;
                            }
                            case 2:
                            {
                               Thread.sleep(2000);
                               ac.jLabelXRight(jLabel1.getX(),0, 20, 6, jLabel1);
                               ac.jLabelXRight(jLabel2.getX(),jLabel2.getWidth(), 20, 6, jLabel2);
                               count=3;
                               Thread.sleep(1500);

                                break;
                            }
                            case 3: {
                                Thread.sleep(2000);
                                ac.jLabelYUp(0, -350, 20, 7, jLabel1);
                                ac.jLabelYUp(350, 0, 20, 7, jLabel3);
                                count=4;
                                break;
                            }
                            case 4:
                            {
                                Thread.sleep(2000);
                                ac.jLabelYDown(-350, 0  , 20, 7, jLabel1);
                                ac.jLabelYDown(0, 350, 20, 7, jLabel3);
                                count=1;
                                break;
                                
                                
                            }
                       }
                                           }
                } 
                catch (Exception e) {

                }
            }
        };  t.start(); 
       
        
            
    }
           
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jPasswordField1 = new javax.swing.JPasswordField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(600, 350));
        setResizable(false);
        getContentPane().setLayout(null);

        jButton1.setText("Login");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(160, 260, 70, 23);

        jButton2.setText("SignUp");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2);
        jButton2.setBounds(300, 260, 70, 23);
        getContentPane().add(jPasswordField1);
        jPasswordField1.setBounds(300, 180, 120, 30);

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("UserName");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(100, 100, 100, 22);

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Password");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(100, 170, 100, 20);

        jTextField1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });
        getContentPane().add(jTextField1);
        jTextField1.setBounds(300, 90, 120, 30);

        jLabel1.setBackground(new java.awt.Color(255, 185, 46));
        jLabel1.setForeground(new java.awt.Color(102, 51, 255));
        jLabel1.setIcon(new javax.swing.ImageIcon("F:\\study\\sem-4\\java\\TeenPatti\\poker\\poker3.jpg")); // NOI18N
        getContentPane().add(jLabel1);
        jLabel1.setBounds(0, 0, 600, 350);

        jLabel2.setIcon(new javax.swing.ImageIcon("F:\\study\\sem-4\\java\\TeenPatti\\poker\\POKER8.jpg")); // NOI18N
        jLabel2.setText("jLabel2");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(600, 0, 600, 350);

        jLabel3.setIcon(new javax.swing.ImageIcon("F:\\study\\sem-4\\java\\TeenPatti\\poker\\POKER9.jpg")); // NOI18N
        getContentPane().add(jLabel3);
        jLabel3.setBounds(0, 350, 600, 350);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        int check = 0;
        String nm = jTextField1.getText();
         String pass = jPasswordField1.getText();
        Connection con = null;
         ResultSet rs = null;
    Statement stat = null;
    String dbpath = "F:\\study\\sem-4\\java\\TeenPatti\\Game.accdb";
    try{
        String connString = "jdbc:ucanaccess://" + dbpath;
        con = DriverManager.getConnection(connString);
         stat = con.createStatement();
        
        String selectQuery = "SELECT username, password,name FROM login"; 
        rs = stat.executeQuery(selectQuery);
        //System.out.println("Customer_id"+ " " + "customer name");
        while(rs.next())
        {
            String  dum= rs.getString("username");
             String dpass = rs.getString("password");
            //String marks = rs.getString("name");
           if(nm.equals(dum) && pass.equals(dpass)){
               this.setVisible(false);
               Game gm = new Game();
               gm.setVisible(true);
               return;
            }
            else
           {
                check++;
           }
        }
        stat.close();
        con.close();
         
    }
    catch(Exception e){
        System.out.println("exception catch...");
        e.printStackTrace();
    }
    if(check>0)
    {
        JOptionPane.showMessageDialog(null, "Invalid login credentials");
    }
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
        CreateAccount ca = new CreateAccount();
        ca.setVisible(true);
    }//GEN-LAST:event_jButton2ActionPerformed
static boolean check;
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
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
           
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPasswordField jPasswordField1;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables
}