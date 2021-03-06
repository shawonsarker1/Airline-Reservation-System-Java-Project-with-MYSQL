
import com.mysql.jdbc.Connection;
import com.mysql.jdbc.Statement;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author USER
 */
public class user_creation extends javax.swing.JInternalFrame {

    /**
     * Creates new form user_creation
     */
    public user_creation() {
        initComponents();
        autoID();
    }
public void autoID()
   {
        try {
            Class.forName("java.sql.DriverManager");
            Connection con=(Connection)
            DriverManager.getConnection("jdbc:mysql://localhost:3306/mysql","root","");
            Statement stmt=(Statement)con.createStatement();
            ResultSet rs=stmt.executeQuery("select max(ID) FROM user_airline");
           rs.next();
         String t =rs.getString("MAX(ID)");
          if(t==null )
           {
             txtid.setText("U00001");

               }
          else  {
             long id=Long.parseLong(rs.getString("MAX(ID)").substring(1,rs.getString("MAX(ID)").length()));
             id++;
            txtid.setText("U" +String.format("%05d",id));

                }
            
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
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

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtfirst = new javax.swing.JTextField();
        txtlast = new javax.swing.JTextField();
        txtuser = new javax.swing.JTextField();
        txtpass = new javax.swing.JTextField();
        txtid = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();

        jPanel1.setBackground(new java.awt.Color(0, 204, 204));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "User Create", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 18), new java.awt.Color(255, 255, 0))); // NOI18N

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setText("User ID");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setText("First Name :");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setText("Last Name :");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setText("User Name : ");

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setText("Password :");

        txtfirst.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N

        txtlast.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txtlast.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtlastActionPerformed(evt);
            }
        });

        txtuser.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N

        txtpass.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N

        txtid.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txtid.setText("jLabel6");

        jButton1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton1.setText("Add");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton2.setText("Cancel");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel1))
                        .addGap(58, 58, 58)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtid)
                            .addComponent(txtfirst, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(59, 59, 59)
                        .addComponent(txtlast))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5))
                        .addGap(53, 53, 53)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jButton1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(txtuser)
                            .addComponent(txtpass))))
                .addContainerGap(33, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtid))
                .addGap(43, 43, 43)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtfirst, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(45, 45, 45)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtlast, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(52, 52, 52)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtuser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 47, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txtpass, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(16, 16, 16)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton2)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(120, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtlastActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtlastActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtlastActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        String   ID= txtid.getText();
       String  first_name= txtfirst.getText();
      String   last_name= txtlast.getText();
     String   user_name= txtuser.getText();
    String  password =txtpass.getText();
  
 
       
            try {
                Class.forName("java.sql.DriverManager");
                Connection con=(Connection)
            DriverManager.getConnection("jdbc:mysql://localhost:3306/mysql","root","");
           String query=("insert into user_airline(ID,first_name,last_name,user_name,password)VALUES(?,?,?,?,?)");
           PreparedStatement pstmt = con.prepareStatement(query);
                pstmt.setString(1,ID);
                 pstmt.setString(2,first_name);
               
                 pstmt.setString(3,last_name); 
                  pstmt.setString(4,user_name);
                
                  pstmt.setString(5,password);
                    
                     
                        pstmt.executeUpdate();
                        JOptionPane.showMessageDialog(null, " User Creation Complete");
                       
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(Add_flight.class.getName()).log(Level.SEVERE, null, ex);
            }catch (SQLException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        this.hide();
    }//GEN-LAST:event_jButton2ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField txtfirst;
    private javax.swing.JLabel txtid;
    private javax.swing.JTextField txtlast;
    private javax.swing.JTextField txtpass;
    private javax.swing.JTextField txtuser;
    // End of variables declaration//GEN-END:variables
}
