import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author asus
 */
public class Test extends javax.swing.JFrame {

    /**
     * Creates new form question
     */
    public Test() {
        initComponents();
        connect();
        NullAllGivenAnswers();   
    }
    private void NullAllGivenAnswers(){
    try {
                    String query = "UPDATE examquestion SET givenanswer = ?";
                    pst = con.prepareStatement(query);
                    pst.setString(1, null);
                    pst.execute();
                } catch (SQLException ex) {
                   ex.printStackTrace();
                }

    }
     
   Connection con;
       
   int answercheck =0;
   public static int marks=0;
    
    PreparedStatement pst;
    Statement stat = null;
    ResultSet rs;
  
    
    int total_q;
    int attempted_q=0;
    int correct;
    int incorrect =-1;
    int notattempt=0;
    String newans;
    String cor=null;
    
    public void connect(){
           try{
           Class.forName("com.mysql.jdbc.Driver");
           con =DriverManager.getConnection("jdbc:mysql://localhost/OnlineExam","royden","root");
           String query = "select * from examquestion";
           stat = con.createStatement();
           rs = stat.executeQuery(query);
            
           while(rs.next()){
                txtqu.setText(rs.getString("id"));
                txtques.setText(rs.getString("questions"));
                r1.setText(rs.getString(3));
                r2.setText(rs.getString(4));
                r3.setText(rs.getString(5));
                r4.setText(rs.getString(6));
                cor = rs.getString(7);
            
                break;
                }
           
           
       }catch(ClassNotFoundException ex){
           Logger.getLogger(student.class.getName()).log(Level.SEVERE,null,ex);
       }catch (SQLException ex) {
            Logger.getLogger(student.class.getName()).log(Level.SEVERE, null, ex);
       }
       }
        public boolean answerCheck(){
            String answerAnswer="";
            if(r1.isSelected()){
                answerAnswer = r1.getText();
            }else if(r2.isSelected()){
                answerAnswer = r2.getText();
            }else if(r3.isSelected()){
                answerAnswer = r3.getText();
            }else if(r4.isSelected()) {
                answerAnswer = r4.getText();
            }
            if(answerAnswer.equals(cor) && (answer == null  || !answer.equals(cor)))
            {
                marks = marks + 1;
                result pr= new result();
                pr.Lmarks.setText(marks+" marks");
            }
            else if(!answerAnswer.equals(cor) && answer != null)
            {            
                if( marks > 0){
                marks = marks - 1;  
                result pr= new result();
                pr.Lmarks.setText(marks+" marks");
                }             
            }
            
            if(!answerAnswer.equals("")){
                try {
                    String query = "UPDATE examquestion SET givenanswer = ? WHERE questions = ?";
                    pst = con.prepareStatement(query);
                    pst.setString(1, answerAnswer);
                    pst.setString(2, txtques.getText());
                    pst.execute();
                } catch (SQLException ex) {
                   ex.printStackTrace();
                }
                   return true;
            }
            
            return false;

}

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel3 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        r1 = new javax.swing.JRadioButton();
        r2 = new javax.swing.JRadioButton();
        r3 = new javax.swing.JRadioButton();
        r4 = new javax.swing.JRadioButton();
        jLabel1 = new javax.swing.JLabel();
        txtques = new javax.swing.JLabel();
        qnext = new javax.swing.JButton();
        EndExambtn = new javax.swing.JButton();
        txtqu = new javax.swing.JLabel();
        qprev = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(60, 98, 85));
        setResizable(false);

        jPanel3.setBackground(new java.awt.Color(60, 98, 85));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(166, 187, 141));
        jPanel2.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        r1.setBackground(new java.awt.Color(166, 187, 141));
        buttonGroup1.add(r1);
        r1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        r1.setText("jRadioButton1");

        r2.setBackground(new java.awt.Color(166, 187, 141));
        buttonGroup1.add(r2);
        r2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        r2.setText("jRadioButton2");

        r3.setBackground(new java.awt.Color(166, 187, 141));
        buttonGroup1.add(r3);
        r3.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        r3.setText("jRadioButton3");

        r4.setBackground(new java.awt.Color(166, 187, 141));
        buttonGroup1.add(r4);
        r4.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        r4.setText("jRadioButton4");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(56, 56, 56)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(r1, javax.swing.GroupLayout.DEFAULT_SIZE, 479, Short.MAX_VALUE)
                    .addComponent(r2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(r3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(r4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(179, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addComponent(r1)
                .addGap(33, 33, 33)
                .addComponent(r2)
                .addGap(34, 34, 34)
                .addComponent(r3)
                .addGap(35, 35, 35)
                .addComponent(r4)
                .addContainerGap(93, Short.MAX_VALUE))
        );

        jPanel3.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(75, 104, 720, 330));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 0, 0));
        jLabel1.setText("Test");
        jPanel3.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 10, -1, -1));

        txtques.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        txtques.setForeground(new java.awt.Color(0, 0, 0));
        txtques.setText("Questions");
        jPanel3.add(txtques, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 60, 830, 40));

        qnext.setBackground(new java.awt.Color(234, 231, 177));
        qnext.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        qnext.setText("Next");
        qnext.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                qnextActionPerformed(evt);
            }
        });
        jPanel3.add(qnext, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 450, 113, 45));

        EndExambtn.setBackground(new java.awt.Color(234, 231, 177));
        EndExambtn.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        EndExambtn.setText("End Exam");
        EndExambtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EndExambtnActionPerformed(evt);
            }
        });
        jPanel3.add(EndExambtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 450, 101, 41));

        txtqu.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        txtqu.setForeground(new java.awt.Color(51, 51, 51));
        txtqu.setText("No. ");
        jPanel3.add(txtqu, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 10, -1, -1));

        qprev.setBackground(new java.awt.Color(234, 231, 177));
        qprev.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        qprev.setText("Previous");
        qprev.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                qprevActionPerformed(evt);
            }
        });
        jPanel3.add(qprev, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 450, 100, 45));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, 538, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void qnextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_qnextActionPerformed
    if(answerCheck()){
       try
           {
               
            if(rs.next())
            {   
             txtques.setText(rs.getString("questions"));
             r1.setText(rs.getString(3));
             r2.setText(rs.getString(4));
             r3.setText(rs.getString(5));
             r4.setText(rs.getString(6));
             cor=rs.getString(7);          
            if(!AlreadyAnswered()){
                    buttonGroup1.clearSelection();
            }                       
            } 
      }
        catch(Exception e)
        {
            e.printStackTrace();
        }
        }       
    }//GEN-LAST:event_qnextActionPerformed

    private void EndExambtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EndExambtnActionPerformed
        // TODO add your handling code here:
        result res = new result();
        res.show();
        
        dispose();
    }//GEN-LAST:event_EndExambtnActionPerformed

    private void qprevActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_qprevActionPerformed
    try
           {
            if(rs.previous())
            {   
               
          
                txtques.setText(rs.getString("questions"));
             
                r1.setText(rs.getString(3));
                r2.setText(rs.getString(4));
                r3.setText(rs.getString(5));
                r4.setText(rs.getString(6));
                cor=rs.getString(7);
                AlreadyAnswered();

            }
          
   
      }
        catch(Exception e)
        {
            e.printStackTrace();
        }
    }                                    
    private String answer;
    private boolean AlreadyAnswered(){
        try {
            String query = "SELECT givenanswer FROM examquestion WHERE questions = '"+txtques.getText()+"'";
            stat = con.prepareStatement(query);
            
            ResultSet res = stat.executeQuery(query);
            
              while(res.next()){
               
                  answer = res.getString("givenanswer");
                if( answer  == null){
                    return false;
                }
            break;
            }if(r1.getText().equals(answer)){
             r1.setSelected(true);            
            }else if(r2.getText().equals(answer)){
               r2.setSelected(true);   
            }else if(r3.getText().equals(answer)){
               r3.setSelected(true);
            }else if(r4.getText().equals(answer)){
               r4.setSelected(true);
            }
              
            } catch (SQLException ex) {
                System.out.println("Exception Caught");
                ex.printStackTrace();
            }
        return true;
    }//GEN-LAST:event_qprevActionPerformed

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
            java.util.logging.Logger.getLogger(Test.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Test.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Test.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Test.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Test().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton EndExambtn;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JButton qnext;
    private javax.swing.JButton qprev;
    private javax.swing.JRadioButton r1;
    private javax.swing.JRadioButton r2;
    private javax.swing.JRadioButton r3;
    private javax.swing.JRadioButton r4;
    private javax.swing.JLabel txtqu;
    private javax.swing.JLabel txtques;
    // End of variables declaration//GEN-END:variables
}
