
package lk.ijse.pharmacy.controler;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import lk.ijse.pharmacy.db.DBConnection;
import lk.ijse.pharmacy.modal.Order;


public class OrderController {
     public String getOrderID() throws ClassNotFoundException, SQLException {
        ResultSet set = DBConnection.getInstance().getConnection().prepareStatement("select oid from Cust_order ORDER BY oid DESC Limit 1").executeQuery();

        if (set.next()) {
            String tempID = set.getString(1);
            String[] arr = tempID.split("X");
            int oid = Integer.parseInt(arr[1]);
            oid +=1;
            if (oid <10) {
                return "X00" + oid;
            } else if (oid <100) {
                return "X0" + oid;
            } else {
                return "X" + oid;
            }
        } else {
            return "X001";
        }

    }

    public boolean saveOrder(Order order) throws ClassNotFoundException, SQLException {
   Connection c=DBConnection.getInstance().getConnection();
        try {
            Connection con = DBConnection.getInstance().getConnection();
            PreparedStatement stm = con.prepareStatement("INSERT INTO Cust_order VALUES(?,?,?)");
        
             c.setAutoCommit(false);
             
            stm.setObject(1, order.getOid());
            stm.setObject(2, order.getOrder_date());
            stm.setObject(3, order.getCust_id());

            if (stm.executeUpdate() > 0) {
                boolean detailIsSaved = new OrderDetailsController().saveOrderDetail(order.getList());
                
                if(detailIsSaved){
                    boolean finalBool=new MedicineController().updateQTY(order.getList());
                    if(finalBool){
                        c.commit();
                        return true;
                    }else{
                                c.rollback();
                            }
                }
               
                
                
            }   
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(OrderController.class.getName()).log(Level.SEVERE, null, ex);
        }
         
           finally{
                    c.setAutoCommit(true);
                }
         return false;
    }

    
    }

    

