
package lk.ijse.pharmacy.controler;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import lk.ijse.pharmacy.db.DBConnection;

public class DashBoardController {

    public int getCustomerCount() throws SQLException, ClassNotFoundException {
  
       Connection conn = DBConnection.getInstance().getConnection();
        ResultSet rst = conn.prepareStatement("SELECT COUNT(*) FROM Customer").executeQuery();
        
        if(rst.next()){
            return rst.getInt(1);
        }
        return 0;  
    }
    

    public int getMedicineCount() throws ClassNotFoundException, SQLException {
     Connection conn = DBConnection.getInstance().getConnection();
        ResultSet rst = conn.prepareStatement("SELECT COUNT(*) FROM Medicine").executeQuery();
        
        if(rst.next()){
            return rst.getInt(1);
        }
        return 0;  
       
    }

    public int getSuppliersCount() throws SQLException, ClassNotFoundException {
    Connection conn = DBConnection.getInstance().getConnection();
        ResultSet rst = conn.prepareStatement("SELECT COUNT(*) FROM Suppliers").executeQuery();
        
        if(rst.next()){
            return rst.getInt(1);
        }
        return 0;  
    }
    
    }
    
    
    
    

