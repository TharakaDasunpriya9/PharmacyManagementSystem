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
import lk.ijse.pharmacy.controler.MedicineController;
import lk.ijse.pharmacy.modal.Medicine;

/**
 *
 * @author Tharaka Dasunpriya
 */
public class MedicineForm extends javax.swing.JFrame {

    /**
     * Creates new form MedicineForm
     */
    public MedicineForm() {
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
        jButton7 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        txtUnitPrice = new javax.swing.JTextField();
        txtMDescription = new javax.swing.JTextField();
        txtMID = new javax.swing.JTextField();
        txtQTY = new javax.swing.JTextField();
        btnMUpdate = new javax.swing.JButton();
        btnMAdd = new javax.swing.JButton();
        btnMDelete = new javax.swing.JButton();
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
        tblMedi = new javax.swing.JTable();

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

        jButton4.setBackground(new java.awt.Color(44, 62, 80));
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

        jButton5.setBackground(new java.awt.Color(41, 128, 185));
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
        jPanel3.add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 450, 200, 110));

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
        jPanel3.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 780, 200, 110));

        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/images (23).jpg"))); // NOI18N
        jPanel3.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 200, 130));

        jButton9.setBackground(new java.awt.Color(44, 62, 80));
        jButton9.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton9.setForeground(new java.awt.Color(255, 255, 255));
        jButton9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons8-supplier-50 (1)_1.png"))); // NOI18N
        jButton9.setText("Purchase");
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton9, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 680, 200, 100));

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

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 200, 940));

        jPanel2.setBackground(new java.awt.Color(52, 73, 94));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel5.setBackground(new java.awt.Color(236, 240, 241));
        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setText("Medicine ID");
        jPanel5.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 40, 160, 40));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setText("Medicine Description");
        jPanel5.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 40, 160, 30));

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel8.setText("Medicine Selling price");
        jPanel5.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 40, 160, 30));

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel9.setText("Medicine QTY on Hand");
        jPanel5.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 140, 160, 30));

        txtUnitPrice.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txtUnitPrice.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtUnitPriceActionPerformed(evt);
            }
        });
        jPanel5.add(txtUnitPrice, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 80, 240, 40));

        txtMDescription.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txtMDescription.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtMDescriptionActionPerformed(evt);
            }
        });
        jPanel5.add(txtMDescription, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 80, 280, 40));

        txtMID.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txtMID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtMIDActionPerformed(evt);
            }
        });
        jPanel5.add(txtMID, new org.netbeans.lib.awtextra.AbsoluteConstraints(19, 80, 170, 40));

        txtQTY.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txtQTY.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtQTYActionPerformed(evt);
            }
        });
        jPanel5.add(txtQTY, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 170, 200, 40));

        btnMUpdate.setBackground(new java.awt.Color(230, 126, 34));
        btnMUpdate.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnMUpdate.setText("Update Medicine");
        btnMUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMUpdateActionPerformed(evt);
            }
        });
        jPanel5.add(btnMUpdate, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 240, 180, 30));

        btnMAdd.setBackground(new java.awt.Color(41, 128, 185));
        btnMAdd.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnMAdd.setText("Add Medicine");
        btnMAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMAddActionPerformed(evt);
            }
        });
        jPanel5.add(btnMAdd, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 240, 170, 30));

        btnMDelete.setBackground(new java.awt.Color(192, 57, 43));
        btnMDelete.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnMDelete.setText("Delete Medicine");
        btnMDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMDeleteActionPerformed(evt);
            }
        });
        jPanel5.add(btnMDelete, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 240, 190, 30));

        jPanel2.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 260, 890, 300));

        jPanel8.setBackground(new java.awt.Color(41, 128, 185));
        jPanel8.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Medicine Form");
        jPanel8.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 20, 280, 30));

        jPanel2.add(jPanel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 190, 810, 60));

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

        jPanel2.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 20, 900, 160));

        jPanel6.setBackground(new java.awt.Color(236, 240, 241));
        jPanel6.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tblMedi.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        tblMedi.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "MedicineId", "MedicineDescription", "MedicineSellingPrice", "MedicineQTYonHand"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.Double.class, java.lang.Integer.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        tblMedi.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblMediMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblMedi);

        jPanel6.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 30, 700, 170));

        jPanel2.add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 580, 840, 270));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 0, 1040, 940));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 1244, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 939, Short.MAX_VALUE)
                .addContainerGap())
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

    private void txtUnitPriceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtUnitPriceActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtUnitPriceActionPerformed

    private void txtMDescriptionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtMDescriptionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtMDescriptionActionPerformed

    private void txtMIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtMIDActionPerformed
       if(txtMID.getText().trim().length()>0){
           try {
               Medicine OBJ=new MedicineController().getMedicineAdd(txtMID.getText().trim());
               
               
               if(OBJ!=null){
                   txtMID.setText(OBJ.getMedi_id());
                   txtMDescription.setText(OBJ.getDescription());
                   txtUnitPrice.setText(OBJ.getMedi_SellingUnitPrice().toString());
                   txtQTY.setText(OBJ.getMedi_QTYonHand().toString());
                   
                   
               }else{
                   JOptionPane.showMessageDialog(this, "No results Found","Warning",JOptionPane.WARNING_MESSAGE);
               }
           } catch (ClassNotFoundException | SQLException ex) {
               Logger.getLogger(MedicineForm.class.getName()).log(Level.SEVERE, null, ex);
           }
               }     
            else{
            JOptionPane.showMessageDialog(this, "Please Insert an ID","Error",JOptionPane.ERROR_MESSAGE);
        }    
        
        
    }//GEN-LAST:event_txtMIDActionPerformed

    private void txtQTYActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtQTYActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtQTYActionPerformed

    private void formWindowClosed(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosed
         
    }//GEN-LAST:event_formWindowClosed

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
        new purchaseForm().setVisible(true);
       this.dispose();
    }//GEN-LAST:event_jButton9ActionPerformed

    private void btnMAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMAddActionPerformed
        try {
            String MID=txtMID.getText();
            String MDescription=txtMDescription.getText();
            Double MSelling=Double.parseDouble(txtUnitPrice.getText());
            Integer MQTY=Integer.parseInt(txtQTY.getText());
            
            
            
            Medicine m1=new Medicine(
                    MID,
                    MDescription,
                    MSelling,
                    MQTY
                   
            );
            boolean isSaved=new MedicineController().saveMedicine(m1);
            if(isSaved){
                JOptionPane.showMessageDialog(null, "Saved");
                 DefaultTableModel dtm = (DefaultTableModel)tblMedi .getModel();
				Object[] rowData = {
					m1.getMedi_id(),
                                    m1.getDescription(),
                                    m1.getMedi_SellingUnitPrice(),
                                    m1.getMedi_QTYonHand(),
				};
				dtm.addRow(rowData);
				txtMID.setText(null);
				txtMDescription.setText(null);
				txtUnitPrice.setText(null);
				txtQTY.setText(null);
		
            }else{
                JOptionPane.showMessageDialog(null, "Try again");
            }
        } catch (ClassNotFoundException | SQLException ex) {
           JOptionPane.showMessageDialog(this,ex.getMessage());
        }
        
        
    }//GEN-LAST:event_btnMAddActionPerformed

    private void tblMediMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblMediMouseClicked
       int selectedRow = tblMedi.getSelectedRow();
		txtMID.setText(tblMedi.getValueAt(selectedRow, 0).toString());
		txtMDescription.setText(tblMedi.getValueAt(selectedRow, 1).toString());
		txtUnitPrice.setText(tblMedi.getValueAt(selectedRow, 2).toString());
		txtQTY.setText(tblMedi.getValueAt(selectedRow, 3).toString());
        
        
    }//GEN-LAST:event_tblMediMouseClicked

    private void btnMDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMDeleteActionPerformed
         if(txtMID.getText().trim().length()>0){
             try {
                 if (new MedicineController().dropMedicine(txtMID.getText().trim())) {
                     JOptionPane.showMessageDialog(null,"Deletetd...");
                     getAll();
                 }else{
                     JOptionPane.showMessageDialog(null,"Something went Wrong!!!", "WARNING",JOptionPane.WARNING_MESSAGE);
                 }
             } catch (ClassNotFoundException | SQLException ex) {
                 Logger.getLogger(MedicineForm.class.getName()).log(Level.SEVERE, null, ex);
             }
         }else{
            JOptionPane.showMessageDialog(null, "Please Insert an ID","ERROR",JOptionPane.ERROR_MESSAGE);
        }
        
        
    }//GEN-LAST:event_btnMDeleteActionPerformed

    private void btnMUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMUpdateActionPerformed
        if(txtMID.getText().trim().length()>0){
            try {
                String MID=txtMID.getText();
                String MDescription=txtMDescription.getText();
                Double MSelling=Double.parseDouble(txtUnitPrice.getText());
                Integer MQTY=Integer.parseInt(txtQTY.getText());
                
                
                
                Medicine m1=new Medicine(
                        MID,
                        MDescription,
                        MSelling,
                        MQTY
                        
                );
                if(new MedicineController().updateMedi(m1)){
                    JOptionPane.showMessageDialog(null,"Done...");
                    getAll();
                }else{
                    JOptionPane.showMessageDialog(null,"Please Try Again","WARNING",JOptionPane.WARNING_MESSAGE);
                } 
            } catch (ClassNotFoundException | SQLException ex) {
                Logger.getLogger(MedicineForm.class.getName()).log(Level.SEVERE, null, ex);
            }
                }else{
            JOptionPane.showMessageDialog(null,"Please Insert an ID","ERROR",JOptionPane.ERROR_MESSAGE);
        }
            
        
        
    }//GEN-LAST:event_btnMUpdateActionPerformed

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
            java.util.logging.Logger.getLogger(MedicineForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MedicineForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MedicineForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MedicineForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MedicineForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnMAdd;
    private javax.swing.JButton btnMDelete;
    private javax.swing.JButton btnMUpdate;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton9;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel12;
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
    private javax.swing.JTable tblMedi;
    private javax.swing.JTextField txtMDescription;
    private javax.swing.JTextField txtMID;
    private javax.swing.JTextField txtQTY;
    private javax.swing.JTextField txtUnitPrice;
    // End of variables declaration//GEN-END:variables

    private void getAll() {
        try {
            ArrayList<Medicine> allmedicine = MedicineController.getAllMedicine();
            DefaultTableModel dtm = (DefaultTableModel)tblMedi.getModel();
            dtm.setRowCount(0);
            for (Medicine m: allmedicine) {
                Object[] rowData = {
                    m.getMedi_id(),
                    m.getDescription(),
                    m.getMedi_SellingUnitPrice(),
                    m.getMedi_QTYonHand()};
                
                dtm.addRow(rowData);
            }
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(MedicineForm.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
    }
}