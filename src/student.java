import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import java.util.Vector;
import javax.swing.table.DefaultTableModel;

public class student extends javax.swing.JFrame {
    public student() {
        initComponents();
        connect();
        load();
    }
    
    Connection con;
    PreparedStatement pst;
    ResultSet rs;
    
    public void connect(){
           try{
           Class.forName("com.mysql.jdbc.Driver");
           con =DriverManager.getConnection("jdbc:mysql://localhost/OnlineExam","royden","root");
           
       }catch(ClassNotFoundException ex){
           Logger.getLogger(student.class.getName()).log(Level.SEVERE,null,ex);
       }catch (SQLException ex) {
            Logger.getLogger(student.class.getName()).log(Level.SEVERE, null, ex);
       }
       }
    
    public void load(){
        
        try {
            pst =con.prepareStatement("select * from student");
            rs= pst.executeQuery();
            
            ResultSetMetaData rsd= rs.getMetaData();
            int c;
            c= rsd.getColumnCount();
            DefaultTableModel d= (DefaultTableModel)Stable.getModel();
            d.setRowCount(0);
            
            while(rs.next()){
                Vector v = new Vector();
                for(int i=0; i<=c; i++){
                v.add(rs.getString("id"));
                v.add(rs.getString("stname"));
                v.add(rs.getString("phone"));
                v.add(rs.getString("address"));
                v.add(rs.getString("age"));  
                v.add(rs.getString("spass"));
                }
                
                d.addRow(v);
            }  
        } catch (SQLException ex) {
            Logger.getLogger(student.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
       
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton4 = new javax.swing.JButton();
        jInternalFrame1 = new javax.swing.JInternalFrame();
        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtname = new javax.swing.JTextField();
        txtage = new javax.swing.JTextField();
        txtphone = new javax.swing.JTextField();
        txtaddress = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txtpass = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        Stable = new javax.swing.JTable();
        addstudbackbtn = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        Delete = new javax.swing.JButton();
        Edit = new javax.swing.JButton();
        Add = new javax.swing.JButton();

        jButton4.setText("jButton4");

        jInternalFrame1.setVisible(true);

        javax.swing.GroupLayout jInternalFrame1Layout = new javax.swing.GroupLayout(jInternalFrame1.getContentPane());
        jInternalFrame1.getContentPane().setLayout(jInternalFrame1Layout);
        jInternalFrame1Layout.setHorizontalGroup(
            jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jInternalFrame1Layout.setVerticalGroup(
            jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setText("Student Registration");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(271, 32, -1, -1));

        jPanel1.setBackground(new java.awt.Color(97, 135, 110));
        jPanel1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel2.setText("Student name:");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel3.setText("Age:");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel4.setText("Phone no:");

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel5.setText("Address:");

        txtname.setBackground(new java.awt.Color(166, 187, 141));

        txtage.setBackground(new java.awt.Color(166, 187, 141));

        txtphone.setBackground(new java.awt.Color(166, 187, 141));

        txtaddress.setBackground(new java.awt.Color(166, 187, 141));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel6.setText("Student password: ");

        txtpass.setBackground(new java.awt.Color(166, 187, 141));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 64, Short.MAX_VALUE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(txtage)
                                .addComponent(txtaddress, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE)
                                .addComponent(txtname))
                            .addComponent(txtphone, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtpass, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(57, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtphone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtaddress, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtage, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 31, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(txtpass, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(22, 100, 330, -1));

        Stable.setBackground(new java.awt.Color(97, 135, 110));
        Stable.setForeground(new java.awt.Color(0, 0, 0));
        Stable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Student ID", "Student Name", "Phone", "Address", "Age", "Student password"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        Stable.getTableHeader().setReorderingAllowed(false);
        Stable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                StableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(Stable);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(376, 70, 410, 420));

        addstudbackbtn.setBackground(new java.awt.Color(234, 231, 177));
        addstudbackbtn.setText("back");
        addstudbackbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addstudbackbtnActionPerformed(evt);
            }
        });
        getContentPane().add(addstudbackbtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(22, 479, -1, -1));

        jPanel2.setBackground(new java.awt.Color(60, 98, 85));

        Delete.setBackground(new java.awt.Color(234, 231, 177));
        Delete.setText("Delete");
        Delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DeleteActionPerformed(evt);
            }
        });

        Edit.setBackground(new java.awt.Color(234, 231, 177));
        Edit.setText("Edit");
        Edit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EditActionPerformed(evt);
            }
        });

        Add.setBackground(new java.awt.Color(234, 231, 177));
        Add.setText("Add");
        Add.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(Add)
                .addGap(51, 51, 51)
                .addComponent(Edit)
                .addGap(55, 55, 55)
                .addComponent(Delete)
                .addContainerGap(451, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(389, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Delete, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Edit, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Add, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(82, 82, 82))
        );

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 800, 510));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void AddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddActionPerformed
        String stname=txtname.getText();
        String phone=txtphone.getText();
        String address=txtaddress.getText();
        String age=txtage.getText();
        String spass= txtpass.getText();
        if(stname.equals("")|| phone.equals("")|| address.equals("")|| age.equals("")){
            JOptionPane.showMessageDialog(this, "Input Data");
        }else{
            try {
            
            pst =con.prepareStatement("insert into student(stname,phone,address,age,spass) values(?,?,?,?,?)");
            pst.setString(1,stname);
            pst.setString(2,phone);
            pst.setString(3,address);
            pst.setString(4,age);
            pst.setString(5,spass);
            int k = pst.executeUpdate();
            
            if(k==1){
                JOptionPane.showMessageDialog(this, "Record added");
                txtname.setText("");
                txtphone.setText("");
                txtaddress.setText("");
                txtage.setText("");
                txtpass.setText("");
                txtname.requestFocus();
                load();
            }else{
                JOptionPane.showMessageDialog(this, "Record added failed");
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(student.class.getName()).log(Level.SEVERE, null, ex);
        }}
        
        
    }//GEN-LAST:event_AddActionPerformed

    private void DeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DeleteActionPerformed
            try {
            DefaultTableModel d= (DefaultTableModel)Stable.getModel();
            int selectIndex =Stable.getSelectedRow();
            String id = d.getValueAt(selectIndex,0).toString();
            
            
            pst =con.prepareStatement("delete from student where id = ?");
            pst.setString(1,id);
            int k = pst.executeUpdate();
            
            if(k==1){
                JOptionPane.showMessageDialog(this, "Record Deleted");
                txtname.setText("");
                txtphone.setText("");
                txtaddress.setText("");
                txtage.setText("");
                txtpass.setText("");
                txtname.requestFocus();
                load();
            }else{
                JOptionPane.showMessageDialog(this, "Record deletion failed");
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(student.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_DeleteActionPerformed

    private void addstudbackbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addstudbackbtnActionPerformed
teacherpage tpage = new teacherpage();
        tpage.show();

        dispose();
    }//GEN-LAST:event_addstudbackbtnActionPerformed

    private void StableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_StableMouseClicked
        
        DefaultTableModel d= (DefaultTableModel)Stable.getModel();
        
        int selectIndex =Stable.getSelectedRow();
        String id = d.getValueAt(selectIndex,0).toString();
        
        txtname.setText(d.getValueAt(selectIndex,1).toString());
        txtphone.setText(d.getValueAt(selectIndex,2).toString());
        txtaddress.setText(d.getValueAt(selectIndex,3).toString());
        txtage.setText(d.getValueAt(selectIndex,4).toString());
        txtpass.setText(d.getValueAt(selectIndex,5).toString());
        
        
    }//GEN-LAST:event_StableMouseClicked

    private void EditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EditActionPerformed
        String stname=txtname.getText();
        String phone=txtphone.getText();
        String address=txtaddress.getText();
        String age=txtage.getText();
        String spass= txtpass.getText();

        
        if(stname.equals("")|| phone.equals("")|| address.equals("")|| age.equals("")){
            JOptionPane.showMessageDialog(this, "Input Data");
        }else{
            try {
           
            
            DefaultTableModel d= (DefaultTableModel)Stable.getModel();
            int selectIndex =Stable.getSelectedRow();
            String id = d.getValueAt(selectIndex,0).toString();
            
            
            pst =con.prepareStatement("update student set stname=?,phone=?,address=?,age=?, spass= ? where id = ?");
            pst.setString(1,stname);
            pst.setString(2,phone);
            pst.setString(3,address);
            pst.setString(4,age);
            pst.setString(5,spass);
            pst.setString(6,id);
            int k = pst.executeUpdate();
            
            if(k==1){
                JOptionPane.showMessageDialog(this, "Record updated");
                txtname.setText("");
                txtphone.setText("");
                txtaddress.setText("");
                txtage.setText("");
                txtname.requestFocus();
                load();
            }else{
                JOptionPane.showMessageDialog(this, "Record update failed");
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(student.class.getName()).log(Level.SEVERE, null, ex);
        }}
    }//GEN-LAST:event_EditActionPerformed

    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Mental".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(student.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(student.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(student.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(student.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new student().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Add;
    private javax.swing.JButton Delete;
    private javax.swing.JButton Edit;
    private javax.swing.JTable Stable;
    private javax.swing.JButton addstudbackbtn;
    private javax.swing.JButton jButton4;
    private javax.swing.JInternalFrame jInternalFrame1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField txtaddress;
    private javax.swing.JTextField txtage;
    private javax.swing.JTextField txtname;
    private javax.swing.JTextField txtpass;
    private javax.swing.JTextField txtphone;
    // End of variables declaration//GEN-END:variables

}
