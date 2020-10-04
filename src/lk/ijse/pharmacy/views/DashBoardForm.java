/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.ijse.pharmacy.views;

import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import lk.ijse.pharmacy.controler.DashBoardController;

/**
 *
 * @author Tharaka Dasunpriya
 */
public class DashBoardForm extends javax.swing.JFrame {

    /**
     * Creates new form DashBoardForm
     */
    public DashBoardForm() {
        initComponents();
         loadAllCustomerCount();
        loadAllMedicineCount();
        loadAllSuppliersCount();
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
        jPanel4 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jPanel8 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jPanel9 = new javax.swing.JPanel();
        jPanel7 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        lblTotalSuppliers = new javax.swing.JLabel();
        jPanel10 = new javax.swing.JPanel();
        jPanel11 = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        lblTotalMedicine = new javax.swing.JLabel();
        jPanel12 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        lblTotalCustomer = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        btnSuppliers = new javax.swing.JButton();
        btnDashBoard = new javax.swing.JButton();
        btnCust = new javax.swing.JButton();
        btnMedi = new javax.swing.JButton();
        jLabel12 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel4.setBackground(new java.awt.Color(52, 73, 94));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(236, 240, 241));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/survival-bag.png"))); // NOI18N
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 20, 100, 60));

        jLabel2.setBackground(new java.awt.Color(52, 152, 219));
        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel2.setText("Chamara");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 0, 130, 50));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons8-pharmacy-shop-50 (1)_1.png"))); // NOI18N
        jPanel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 50, 60, 80));

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel7.setText("Pharmacy Managment System");
        jPanel2.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 40, 410, 50));

        jLabel17.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/ph black.png"))); // NOI18N
        jPanel2.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 0, 240, 150));

        jPanel4.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, 900, 160));

        jPanel8.setBackground(new java.awt.Color(41, 128, 185));
        jPanel8.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Dash Board");
        jPanel8.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 20, 280, 30));

        jPanel4.add(jPanel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 200, 810, 60));

        jPanel9.setBackground(new java.awt.Color(149, 165, 166));

        jPanel7.setBackground(new java.awt.Color(52, 152, 219));
        jPanel7.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel5.setBackground(new java.awt.Color(255, 255, 255));
        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Total Suppliers");
        jPanel7.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 0, 270, 72));

        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons8-procurement-80_1.png"))); // NOI18N
        jPanel7.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(24, 62, 100, 84));

        lblTotalSuppliers.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        lblTotalSuppliers.setForeground(new java.awt.Color(255, 255, 255));
        lblTotalSuppliers.setText("0");
        jPanel7.add(lblTotalSuppliers, new org.netbeans.lib.awtextra.AbsoluteConstraints(202, 115, 77, 55));

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, 208, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel4.add(jPanel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 600, 420, 230));

        jPanel10.setBackground(new java.awt.Color(49, 165, 166));

        jPanel11.setBackground(new java.awt.Color(52, 152, 219));
        jPanel11.setForeground(new java.awt.Color(255, 255, 255));
        jPanel11.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel13.setBackground(new java.awt.Color(255, 255, 255));
        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("Total Medicine");
        jPanel11.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(107, 22, 185, 49));

        jLabel14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons8-pills-64.png"))); // NOI18N
        jPanel11.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(26, 64, 75, -1));

        lblTotalMedicine.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        lblTotalMedicine.setForeground(new java.awt.Color(255, 255, 255));
        lblTotalMedicine.setText("0");
        jPanel11.add(lblTotalMedicine, new org.netbeans.lib.awtextra.AbsoluteConstraints(195, 99, 75, 55));

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel11, javax.swing.GroupLayout.DEFAULT_SIZE, 208, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel4.add(jPanel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 290, 400, 230));

        jPanel12.setBackground(new java.awt.Color(149, 165, 166));

        jPanel5.setBackground(new java.awt.Color(52, 152, 219));
        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setBackground(new java.awt.Color(255, 255, 255));
        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Total Customer");
        jPanel5.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(33, 13, 192, 49));

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons8-customer-80.png"))); // NOI18N
        jPanel5.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 68, 78, 68));

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel10.setText("0");
        jPanel5.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 440, 97, 51));

        lblTotalCustomer.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        lblTotalCustomer.setForeground(new java.awt.Color(255, 255, 255));
        lblTotalCustomer.setText("0");
        jPanel5.add(lblTotalCustomer, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 104, 60, 60));

        javax.swing.GroupLayout jPanel12Layout = new javax.swing.GroupLayout(jPanel12);
        jPanel12.setLayout(jPanel12Layout);
        jPanel12Layout.setHorizontalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel12Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(13, Short.MAX_VALUE))
        );
        jPanel12Layout.setVerticalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel12Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel4.add(jPanel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 290, -1, 230));

        jPanel1.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 0, 1010, 900));

        jPanel3.setBackground(new java.awt.Color(44, 62, 80));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnSuppliers.setBackground(new java.awt.Color(44, 62, 80));
        btnSuppliers.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnSuppliers.setForeground(new java.awt.Color(255, 255, 255));
        btnSuppliers.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons8-procurement-50.png"))); // NOI18N
        btnSuppliers.setText("Suppliers");
        btnSuppliers.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        btnSuppliers.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSuppliersActionPerformed(evt);
            }
        });
        jPanel3.add(btnSuppliers, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 560, 200, 120));

        btnDashBoard.setBackground(new java.awt.Color(41, 128, 185));
        btnDashBoard.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnDashBoard.setForeground(new java.awt.Color(255, 255, 255));
        btnDashBoard.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons8-product-50.png"))); // NOI18N
        btnDashBoard.setText("DashBoard");
        btnDashBoard.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        btnDashBoard.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDashBoardActionPerformed(evt);
            }
        });
        jPanel3.add(btnDashBoard, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 130, 200, 110));

        btnCust.setBackground(new java.awt.Color(44, 62, 80));
        btnCust.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnCust.setForeground(new java.awt.Color(255, 255, 255));
        btnCust.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons8-customer-50.png"))); // NOI18N
        btnCust.setText("Customer");
        btnCust.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        btnCust.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCustActionPerformed(evt);
            }
        });
        jPanel3.add(btnCust, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 240, 200, 110));

        btnMedi.setBackground(new java.awt.Color(44, 62, 80));
        btnMedi.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnMedi.setForeground(new java.awt.Color(255, 255, 255));
        btnMedi.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons8-pills-50.png"))); // NOI18N
        btnMedi.setText("Medicine");
        btnMedi.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        btnMedi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMediActionPerformed(evt);
            }
        });
        jPanel3.add(btnMedi, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 450, 200, 110));

        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/images (23).jpg"))); // NOI18N
        jPanel3.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 200, 130));

        jButton2.setBackground(new java.awt.Color(44, 62, 80));
        jButton2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons8-supplier-50 (1)_1.png"))); // NOI18N
        jButton2.setText("Purchase");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 670, 200, 100));

        jButton7.setBackground(new java.awt.Color(44, 62, 80));
        jButton7.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton7.setForeground(new java.awt.Color(255, 255, 255));
        jButton7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons8-box-important-50.png"))); // NOI18N
        jButton7.setText("Place Order");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton7, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 350, 200, 100));

        jButton1.setBackground(new java.awt.Color(44, 62, 80));
        jButton1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons8-logout-rounded-down-48.png"))); // NOI18N
        jButton1.setText("Log out");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 770, 200, 110));

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 200, 900));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSuppliersActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSuppliersActionPerformed
        
        new SupplierForm().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnSuppliersActionPerformed

    private void btnDashBoardActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDashBoardActionPerformed
        
    }//GEN-LAST:event_btnDashBoardActionPerformed

    private void btnCustActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCustActionPerformed
      new CustomerForm().setVisible(true);
      this.dispose();
    }//GEN-LAST:event_btnCustActionPerformed

    private void btnMediActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMediActionPerformed
        new MedicineForm().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnMediActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
       new newLoginForm().setVisible(true);
       this.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
         new purchaseForm().setVisible(true);
       this.dispose();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
          new CustomerPlaceOrderForm().setVisible(true);
       this.dispose();
    }//GEN-LAST:event_jButton7ActionPerformed

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
            java.util.logging.Logger.getLogger(DashBoardForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DashBoardForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DashBoardForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DashBoardForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DashBoardForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCust;
    private javax.swing.JButton btnDashBoard;
    private javax.swing.JButton btnMedi;
    private javax.swing.JButton btnSuppliers;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton7;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JLabel lblTotalCustomer;
    private javax.swing.JLabel lblTotalMedicine;
    private javax.swing.JLabel lblTotalSuppliers;
    // End of variables declaration//GEN-END:variables

    private void loadAllCustomerCount() {
        try {
            int customerCount=new DashBoardController().getCustomerCount();
            lblTotalCustomer.setText(String.valueOf(customerCount));
        } catch (SQLException | ClassNotFoundException ex) {
            Logger.getLogger(DashBoardForm.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    private void loadAllMedicineCount() {
        try {
            int medicineCount=new DashBoardController().getMedicineCount();  
            lblTotalMedicine.setText(String.valueOf(medicineCount));
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(DashBoardForm.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    private void loadAllSuppliersCount() {
        try {
            int SuppliersCount=new DashBoardController().getSuppliersCount();     
            lblTotalSuppliers.setText(String.valueOf(SuppliersCount));
        } catch (SQLException | ClassNotFoundException ex) {
            Logger.getLogger(DashBoardForm.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
