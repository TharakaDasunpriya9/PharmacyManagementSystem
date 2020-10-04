
package lk.ijse.pharmacy.controler;

import java.sql.ResultSet;
import java.sql.SQLException;
import lk.ijse.pharmacy.db.DBConnection;



public class SupplierOrderController {

    public String getOrderID() throws ClassNotFoundException, SQLException {
    ResultSet set = DBConnection.getInstance().getConnection().prepareStatement("select Sup_oid from Sup_order ORDER BY Sup_oid DESC Limit 1").executeQuery();

        if (set.next()) {
            String tempID = set.getString(1);
            String[] arr = tempID.split("y");
            int oid = Integer.parseInt(arr[1]);
            oid +=1;
            if (oid <10) {
                return "y00" + oid;
            } else if (oid <100) {
                return "y0" + oid;
            } else {
                return "y" + oid;
            }
        } else {
            return "y001";
        }

    
    }
    

    }

    
    
    
    

