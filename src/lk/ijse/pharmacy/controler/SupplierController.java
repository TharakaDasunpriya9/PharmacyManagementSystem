
package lk.ijse.pharmacy.controler;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import lk.ijse.pharmacy.db.DBConnection;
import lk.ijse.pharmacy.modal.Supplier;
import lk.ijse.pharmacy.modal.SuppliersSup;





public class SupplierController {

    public static ArrayList<Supplier> getAllSuppliers() throws ClassNotFoundException, SQLException {
       Connection con = DBConnection.getInstance().getConnection();
		String sql = "SELECT * FROM Suppliers";
		Statement stm = con.createStatement();
		ResultSet set = stm.executeQuery(sql);

		ArrayList<Supplier> list = new ArrayList<>();

		while (set.next()) {
	  Supplier s= new Supplier();
			s.setSupplier_id(set.getString(1));
			s.setSupplier_name(set.getString(2));
			s.setSupplier_address(set.getString(3));
			s.setSupplier_email(set.getString(4));
			s.setSupplier_tele(set.getInt(5));
			s.setSupplier_regNo(set.getString(6));
                       
			list.add(s);

		}
		return list;
	}

        
        
    

    public boolean saveSupplier(Supplier s1) throws ClassNotFoundException, SQLException {
       Connection con=DBConnection.getInstance().getConnection();
        PreparedStatement stm = con.prepareStatement("INSERT INTO Suppliers VALUES(?,?,?,?,?,?)");
        stm.setString(1,s1.getSupplier_id());
        stm.setString(2, s1.getSupplier_name());
        stm.setString(3, s1.getSupplier_address());
        stm.setString(4, s1.getSupplier_email());
        stm.setInt(5, s1.getSupplier_tele());
        stm.setString(6, s1.getSupplier_regNo());
        
        return stm.executeUpdate()>0;
    }

    public Supplier getSupplierAdd(String requestsupplier_id) throws ClassNotFoundException, SQLException {
          Connection connection=DBConnection.getInstance().getConnection();
        ResultSet set=connection.
                prepareStatement("SELECT * FROM Suppliers WHERE supplier_id=+'"+requestsupplier_id+"'")
                .executeQuery();
        if(set.next()){
            return new Supplier(
                    set.getString(1),
                    set.getString(2),
                    set.getString(3),
                    set.getString(4),
                    set.getInt(5),
                   
                    set.getString(6)
                    
            );
        }
        return null;
    }

    public boolean dropSupplier(String requestSID) throws ClassNotFoundException, SQLException{
       Connection connection=DBConnection.getInstance().getConnection();
        return connection.prepareStatement("DELETE FROM Suppliers WHERE supplier_id='"+requestSID+"'")
                .executeUpdate()>0;
        
        
        
        
    }

    public boolean updateState(Supplier s1) throws ClassNotFoundException, SQLException {
         Connection connection=DBConnection.getInstance().getConnection();
       PreparedStatement stm=connection.prepareStatement("UPDATE Suppliers SET supplier_name=?,supplier_address=?,supplier_email=?,"
               + " supplier_tele =?,supplier_regNo=? WHERE supplier_id=?");
       stm.setObject(1, s1.getSupplier_name());
       stm.setObject(2, s1.getSupplier_address());
       stm.setObject(3, s1.getSupplier_email());
       stm.setObject(4, s1.getSupplier_tele());
       stm.setObject(5, s1.getSupplier_regNo());
       stm.setObject(6, s1.getSupplier_id());
      
      
       return stm.executeUpdate()>0;
    }

   public ArrayList<String> getAllIDS() throws ClassNotFoundException, SQLException{
        ResultSet set = DBConnection.getInstance().getConnection().prepareStatement("SELECT supplier_id FROM Suppliers").executeQuery();
        ArrayList<String> list= new ArrayList<>();
        while(set.next()){
            list.add(set.getString(1));
     
        }
        return list;
    }

    public SuppliersSup getSupplier(String id) throws ClassNotFoundException, SQLException {
    ResultSet set= DBConnection.getInstance().getConnection().prepareStatement("SELECT * FROM  Suppliers WHERE supplier_id='"+id+"'").executeQuery();
       
       if(set.next()){
           return new SuppliersSup(
                   set.getString(1),
                   set.getString(2),
                   set.getString(3),
                   set.getInt(5)
           );
       }
       return null;
    
    }

   

    
    
}
    
    

