/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.ijse.pharmacy.views;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import lk.ijse.pharmacy.controler.CustomerController;
import lk.ijse.pharmacy.modal.CustomerAdd;

/**
 *
 * @author Tharaka Dasunpriya
 */
public class CustomerForm extends javax.swing.JFrame {

    /**
     * Creates new form CustomerForm
     */
    public CustomerForm() {
        initComponents();
        getAll();
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
        jPanel3 = new javax.swing.JPanel();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jLabel12 = new javax.swing.JLabel();
        jButton9 = new javax.swing.JButton();
        jButton10 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        txtCAddress = new javax.swing.JTextField();
        txtDesease = new javax.swing.JTextField();
        txtCName = new javax.swing.JTextField();
        txtCID = new javax.swing.JTextField();
        txtEmail = new javax.swing.JTextField();
        txtTele = new javax.swing.JTextField();
        txtAge = new javax.swing.JTextField();
        btnUpdate = new javax.swing.JButton();
        btnAdd = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        jPanel8 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        CustomerTable = new javax.swing.JTable();
        jButton11 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosed(java.awt.event.WindowEvent evt) {
                formWindowClosed(evt);
            }
        });

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel3.setBackground(new java.awt.Color(44, 62, 80));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton2.setBackground(new java.awt.Color(44, 62, 80));
        jButton2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons8-procurement-50.png"))); // NOI18N
        jButton2.setText("Suppliers");
        jButton2.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 560, 200, 120));

        jButton3.setBackground(new java.awt.Color(44, 62, 80));
        jButton3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton3.setForeground(new java.awt.Color(255, 255, 255));
        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons8-product-50.png"))); // NOI18N
        jButton3.setText("DashBoard");
        jButton3.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 130, 200, 110));

        jButton4.setBackground(new java.awt.Color(41, 128, 185));
        jButton4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton4.setForeground(new java.awt.Color(255, 255, 255));
        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons8-customer-50.png"))); // NOI18N
        jButton4.setText("Customer");
        jButton4.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 240, 200, 110));

        jButton5.setBackground(new java.awt.Color(44, 62, 80));
        jButton5.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton5.setForeground(new java.awt.Color(255, 255, 255));
        jButton5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons8-pills-50.png"))); // NOI18N
        jButton5.setText("Medicine");
        jButton5.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 450, 200, 120));

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
        jPanel3.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 790, 200, 110));

        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/images (23).jpg"))); // NOI18N
        jPanel3.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 200, 130));

        jButton9.setBackground(new java.awt.Color(41, 128, 185));
        jButton9.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton9.setForeground(new java.awt.Color(255, 255, 255));
        jButton9.setText("Add Order");
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton9, new org.netbeans.lib.awtextra.AbsoluteConstraints(930, 940, 220, 50));

        jButton10.setBackground(new java.awt.Color(44, 62, 80));
        jButton10.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton10.setForeground(new java.awt.Color(255, 255, 255));
        jButton10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons8-supplier-50 (1)_1.png"))); // NOI18N
        jButton10.setText("Purchase");
        jButton10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton10ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton10, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 680, 200, 110));

        jButton6.setBackground(new java.awt.Color(44, 62, 80));
        jButton6.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton6.setForeground(new java.awt.Color(255, 255, 255));
        jButton6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons8-box-important-50.png"))); // NOI18N
        jButton6.setText("Place Order");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 350, 200, 100));

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 200, 930));

        jPanel2.setBackground(new java.awt.Color(52, 73, 94));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel5.setBackground(new java.awt.Color(236, 240, 241));
        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setText("Customer ID");
        jPanel5.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 40, 160, 40));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setText("Customer Name");
        jPanel5.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 40, 160, 30));

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel8.setText("Customer Address");
        jPanel5.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 40, 160, 30));

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel9.setText("Customer email");
        jPanel5.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 140, 160, 30));

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel10.setText("Customer Tele");
        jPanel5.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 140, 160, 30));

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel11.setText("Customer Age");
        jPanel5.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 140, 160, 30));

        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel13.setText("Customer Desease");
        jPanel5.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 130, 160, 30));

        txtCAddress.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txtCAddress.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCAddressActionPerformed(evt);
            }
        });
        jPanel5.add(txtCAddress, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 80, 240, 40));

        txtDesease.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txtDesease.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDeseaseActionPerformed(evt);
            }
        });
        jPanel5.add(txtDesease, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 170, 200, 40));

        txtCName.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txtCName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCNameActionPerformed(evt);
            }
        });
        jPanel5.add(txtCName, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 80, 240, 40));

        txtCID.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txtCID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCIDActionPerformed(evt);
            }
        });
        jPanel5.add(txtCID, new org.netbeans.lib.awtextra.AbsoluteConstraints(19, 80, 170, 40));

        txtEmail.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txtEmail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtEmailActionPerformed(evt);
            }
        });
        jPanel5.add(txtEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 170, 170, 40));

        txtTele.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txtTele.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTeleActionPerformed(evt);
            }
        });
        jPanel5.add(txtTele, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 170, 240, 40));

        txtAge.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txtAge.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtAgeActionPerformed(evt);
            }
        });
        jPanel5.add(txtAge, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 170, 180, 40));

        btnUpdate.setBackground(new java.awt.Color(230, 126, 34));
        btnUpdate.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnUpdate.setText("Update Customer");
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });
        jPanel5.add(btnUpdate, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 270, 180, 30));

        btnAdd.setBackground(new java.awt.Color(41, 128, 185));
        btnAdd.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnAdd.setText("Add Customer");
        btnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddActionPerformed(evt);
            }
        });
        jPanel5.add(btnAdd, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 270, 170, 30));

        btnDelete.setBackground(new java.awt.Color(192, 57, 43));
        btnDelete.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnDelete.setText("Delete Customer");
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });
        jPanel5.add(btnDelete, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 270, 190, 30));

        jPanel2.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 260, 960, 330));

        jPanel8.setBackground(new java.awt.Color(41, 128, 185));
        jPanel8.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Customer Form");
        jPanel8.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 20, 280, 30));

        jPanel2.add(jPanel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 190, 780, 60));

        jPanel4.setBackground(new java.awt.Color(236, 240, 241));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/survival-bag.png"))); // NOI18N
        jPanel4.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 20, 100, 60));

        jLabel2.setBackground(new java.awt.Color(52, 152, 219));
        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel2.setText("Chamara");
        jPanel4.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 0, 130, 50));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons8-pharmacy-shop-50 (1)_1.png"))); // NOI18N
        jPanel4.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 50, 60, 80));

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel7.setText("Pharmacy Managment System");
        jPanel4.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 40, 410, 50));

        jLabel17.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/ph black.png"))); // NOI18N
        jPanel4.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 0, 240, 150));

        jPanel2.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, 900, 160));

        jPanel6.setBackground(new java.awt.Color(236, 240, 241));
        jPanel6.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        CustomerTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "CustomerID", "CustomerName", "CustomerAddress", "CuastomerEmail", "CustomerTele", "CustomerAge", "CustomerDesease"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        CustomerTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                CustomerTableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(CustomerTable);

        jPanel6.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, 750, 170));

        jPanel2.add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 610, 830, 220));

        jButton11.setBackground(new java.awt.Color(41, 128, 185));
        jButton11.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton11.setText("Add Order");
        jButton11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton11ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton11, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 860, 210, 50));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 0, 1080, 930));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
         new SupplierForm().setVisible(true);
        this.dispose();
        
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
       new DashBoardForm().setVisible(true);
        this.dispose();
        
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
       new CustomerForm().setVisible(true);
      this.dispose();

    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
       new MedicineForm().setVisible(true);
        this.dispose();

    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
      new newLoginForm().setVisible(true);
       this.dispose();

        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void txtCAddressActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCAddressActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCAddressActionPerformed

    private void txtDeseaseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDeseaseActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDeseaseActionPerformed

    private void txtCNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCNameActionPerformed

    private void txtCIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCIDActionPerformed
         if(txtCID.getText().trim().length()>0){
             try {
                 CustomerAdd OBJ=new CustomerController().getCustomerADD(txtCID.getText().trim());
                 
                 
                 if(OBJ!=null){
                     txtCID.setText(OBJ.getCust_id());
                     txtCName.setText(OBJ.getCust_name());
                     txtCAddress.setText(OBJ.getCust_address());
                     txtEmail.setText(OBJ.getCust_email());
                     txtTele.setText(OBJ.getCust_tele().toString());
                     
                     txtAge.setText(OBJ.getCust_age().toString());
                     txtDesease.setText(OBJ.getCust_desease());
                     
                     
                 }else{
                     JOptionPane.showMessageDialog(this, "No results Found","Warning",JOptionPane.WARNING_MESSAGE);
                 }
             } catch (ClassNotFoundException ex) {
                 Logger.getLogger(CustomerForm.class.getName()).log(Level.SEVERE, null, ex);
             } catch (SQLException ex) {
                 Logger.getLogger(CustomerForm.class.getName()).log(Level.SEVERE, null, ex);
             }
         }     
            else{
            JOptionPane.showMessageDialog(this, "Please Insert an ID","Error",JOptionPane.ERROR_MESSAGE);
        }
        
        
        
    }//GEN-LAST:event_txtCIDActionPerformed

    private void txtEmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtEmailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtEmailActionPerformed

    private void txtTeleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTeleActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTeleActionPerformed

    private void txtAgeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtAgeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtAgeActionPerformed

    private void formWindowClosed(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosed
      
    }//GEN-LAST:event_formWindowClosed

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
       new CustomerPlaceOrderForm().setVisible(true);
       this.dispose();
    }//GEN-LAST:event_jButton9ActionPerformed

    private void jButton10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton10ActionPerformed
       new purchaseForm().setVisible(true);
       this.dispose();
    }//GEN-LAST:event_jButton10ActionPerformed

    private void jButton11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton11ActionPerformed
        new CustomerPlaceOrderForm().setVisible(true);
       this.dispose();
        
    }//GEN-LAST:event_jButton11ActionPerformed

    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed
        try {
            String cId=txtCID.getText();
            String Cname=txtCName.getText();
            String Caddress=txtCAddress.getText();
            String Cemail=txtEmail.getText();
            Integer Ctele = Integer.parseInt(txtTele.getText());
            int Cage = Integer.parseInt(txtAge.getText());
            String Cdesease=txtDesease.getText();
            
            CustomerAdd c1=new CustomerAdd(
                    cId,
                    Cname,
                    Caddress,
                    Cemail,
                    Ctele,
                    Cage,
                    Cdesease
                    
            );
            boolean isSaved=new CustomerController().saveCustomer(c1);
            if(isSaved){
                JOptionPane.showMessageDialog(null, "Saved");
                DefaultTableModel dtm = (DefaultTableModel) CustomerTable.getModel();
                Object[] rowData = {
                    c1.getCust_id(),
                    c1.getCust_name(),
                    c1.getCust_address(),
                    c1.getCust_email(),
                    c1.getCust_tele(),
                    c1.getCust_age(),
                    c1.getCust_desease(),
                };
                dtm.addRow(rowData);
                txtCID.setText(null);
                txtCName.setText(null);
                txtCAddress.setText(null);
                txtEmail.setText(null);
                txtTele.setText(null);
                txtAge.setText(null);
                txtDesease.setText(null);
                
            }else{
                JOptionPane.showMessageDialog(null, "Try again");
            }
        } catch (SQLException | ClassNotFoundException ex) {
           JOptionPane.showMessageDialog(this,ex.getMessage());
        }
            
        
        
        
    }//GEN-LAST:event_btnAddActionPerformed

    private void CustomerTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CustomerTableMouseClicked
       int selectedRow = CustomerTable.getSelectedRow();
		txtCID.setText(CustomerTable.getValueAt(selectedRow, 0).toString());
		txtCName.setText(CustomerTable.getValueAt(selectedRow, 1).toString());
		txtCAddress.setText(CustomerTable.getValueAt(selectedRow, 2).toString());
		txtEmail.setText(CustomerTable.getValueAt(selectedRow, 3).toString());
		txtTele.setText(CustomerTable.getValueAt(selectedRow, 4).toString());
		txtAge.setText(CustomerTable.getValueAt(selectedRow, 5).toString());
                txtDesease.setText(CustomerTable.getValueAt(selectedRow, 6).toString());
                
        
        
        
    }//GEN-LAST:event_CustomerTableMouseClicked

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
      
    if(txtCID.getText().trim().length()>0){
        try {
            if (new CustomerController().dropCustomer(txtCID.getText().trim())) {
                JOptionPane.showMessageDialog(null,"Deletetd...");
                getAll();
            }else{
                JOptionPane.showMessageDialog(null,"Something went Wrong!!!", "WARNING",JOptionPane.WARNING_MESSAGE);
            }
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(CustomerForm.class.getName()).log(Level.SEVERE, null, ex);
        }
        }else{
            JOptionPane.showMessageDialog(null, "Please Insert an ID","ERROR",JOptionPane.ERROR_MESSAGE);
        }
        
    }//GEN-LAST:event_btnDeleteActionPerformed

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
         if(txtCID.getText().trim().length()>0){
             try {
                 String cId=txtCID.getText();
                 String Cname=txtCName.getText();
                 String Caddress=txtCAddress.getText();
                 String Cemail=txtEmail.getText();
                 Integer Ctele = Integer.parseInt(txtTele.getText());
                 int Cage = Integer.parseInt(txtAge.getText());
                 String Cdesease=txtDesease.getText();
                 
                 CustomerAdd c1=new CustomerAdd(
                         cId,
                         Cname,
                         Caddress,
                         Cemail,
                         Ctele,
                         Cage,
                         Cdesease
                         
                 );
                 if(new CustomerController().updateState(c1)){
                     JOptionPane.showMessageDialog(null,"Done...");
                     getAll();
                 }else{
                     JOptionPane.showMessageDialog(null,"Please Try Again","WARNING",JOptionPane.WARNING_MESSAGE);
                 }
             } catch (ClassNotFoundException ex) {
                 Logger.getLogger(CustomerForm.class.getName()).log(Level.SEVERE, null, ex);
             } catch (SQLException ex) {
                 Logger.getLogger(CustomerForm.class.getName()).log(Level.SEVERE, null, ex);
             }
                  }else{
            JOptionPane.showMessageDialog(null,"Please Insert an ID","ERROR",JOptionPane.ERROR_MESSAGE);
        }
        
    }//GEN-LAST:event_btnUpdateActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
          new CustomerPlaceOrderForm().setVisible(true);
       this.dispose();
        
        
        
    }//GEN-LAST:event_jButton6ActionPerformed

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
            java.util.logging.Logger.getLogger(CustomerForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CustomerForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CustomerForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CustomerForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CustomerForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable CustomerTable;
    private javax.swing.JButton btnAdd;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnUpdate;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton11;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton9;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField txtAge;
    private javax.swing.JTextField txtCAddress;
    private javax.swing.JTextField txtCID;
    private javax.swing.JTextField txtCName;
    private javax.swing.JTextField txtDesease;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtTele;
    // End of variables declaration//GEN-END:variables

    private void getAll() {
        try {
            ArrayList<CustomerAdd> allcustomers = CustomerController.getAllCustomers();
            DefaultTableModel dtm = (DefaultTableModel) CustomerTable.getModel();
            dtm.setRowCount(0);
            for (CustomerAdd c : allcustomers) {
                Object[] rowData = {
                    c.getCust_id(),
                    c.getCust_name(),
                    c.getCust_address(),
                    c.getCust_email(),
                    c.getCust_tele(),
                    c.getCust_age(),
                    c.getCust_desease()};
                dtm.addRow(rowData);
            }
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(CustomerForm.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
    }
}
