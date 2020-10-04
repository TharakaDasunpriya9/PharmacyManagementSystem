/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.ijse.pharmacy.controler;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import lk.ijse.pharmacy.db.DBConnection;
import lk.ijse.pharmacy.modal.OrderDetail;

/**
 *
 * @author Tharaka Dasunpriya
 */
public class OrderDetailsController {

    boolean saveOrderDetail(ArrayList<OrderDetail> list) throws ClassNotFoundException, SQLException {
     for (OrderDetail temp : list) {
            PreparedStatement stm = DBConnection.getInstance().getConnection().prepareStatement("INSERT INTO Order_details VALUES(?,?,?,?)");

            stm.setObject(1, temp.getOid());
            stm.setObject(2, temp.getMedi_id());
            stm.setObject(3, temp.getOrderQTY());
            stm.setObject(4, temp.getUnitPrice());

            boolean issaved = stm.executeUpdate() > 0;
            if (!issaved) {
                return false;
            }

        }

        return true;

        

    
    }
    
}
