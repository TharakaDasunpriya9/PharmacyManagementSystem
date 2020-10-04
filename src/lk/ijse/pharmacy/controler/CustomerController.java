
package lk.ijse.pharmacy.controler;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import lk.ijse.pharmacy.db.DBConnection;
import lk.ijse.pharmacy.modal.Customer;
import lk.ijse.pharmacy.modal.CustomerAdd;


public class CustomerController {

    public static ArrayList<CustomerAdd> getAllCustomers() throws ClassNotFoundException, SQLException {
        
		Connection con = DBConnection.getInstance().getConnection();
		String sql = "SELECT * FROM Customer";
		Statement stm = con.createStatement();
		ResultSet set = stm.executeQuery(sql);

		ArrayList<CustomerAdd> list = new ArrayList<>();

		while (set.next()) {
			CustomerAdd c= new CustomerAdd();
			c.setCust_id(set.getString(1));
			c.setCust_name(set.getString(2));
			c.setCust_address(set.getString(3));
			c.setCust_email(set.getString(4));
			c.setCust_tele(set.getInt(5));
			c.setCust_age(set.getInt(6));
                        c.setCust_desease(set.getString(7));
			list.add(c);

		}
		return list;
	
        
        
        
    }
   public ArrayList<String> getAllIDS() throws ClassNotFoundException, SQLException{
        ResultSet set = DBConnection.getInstance().getConnection().prepareStatement("SELECT cust_id FROM Customer").executeQuery();
        ArrayList<String> list= new ArrayList<>();
        while(set.next()){
            list.add(set.getString(1));
     
        }
        return list;
    } 
    public Customer getCustomer(String id) throws ClassNotFoundException, SQLException{
       ResultSet set= DBConnection.getInstance().getConnection().prepareStatement("SELECT * FROM Customer WHERE cust_id='"+id+"'").executeQuery();
       
       if(set.next()){
           return new Customer(
                   set.getString(1),
                   set.getString(2),
                   set.getString(3),
                   set.getInt(5)
           );
       }
       return null;
}

    public boolean saveCustomer(CustomerAdd c1) throws SQLException, ClassNotFoundException {
       Connection con=DBConnection.getInstance().getConnection();
        PreparedStatement stm = con.prepareStatement("INSERT INTO Customer VALUES(?,?,?,?,?,?,?)");
        stm.setString(1, c1.getCust_id());
        stm.setString(2, c1.getCust_name());
        stm.setString(3, c1.getCust_address());
        stm.setString(4, c1.getCust_email());
        stm.setInt(5, c1.getCust_tele());
        stm.setInt(6, c1.getCust_age());
        stm.setString(7, c1.getCust_desease());
        return stm.executeUpdate()>0;
    }

    public CustomerAdd getCustomerADD(String requestcust_id) throws ClassNotFoundException, SQLException {
       Connection connection=DBConnection.getInstance().getConnection();
        ResultSet set=connection.
                prepareStatement("SELECT * FROM Customer WHERE cust_id=+'"+requestcust_id+"'")
                .executeQuery();
        if(set.next()){
            return new CustomerAdd(
                    set.getString(1),
                    set.getString(2),
                    set.getString(3),
                    set.getString(4),
                    set.getInt(5),
                    set.getInt(6),
                    set.getString(7)
                    
            );
        }
        return null;
        
        
        
        
        
    }

    public boolean dropCustomer(String requestCID) throws ClassNotFoundException, SQLException {
         Connection connection=DBConnection.getInstance().getConnection();
        return connection.prepareStatement("DELETE FROM Customer WHERE cust_id='"+requestCID+"'")
                .executeUpdate()>0;
        
        
    }

    public boolean updateState(CustomerAdd c1) throws ClassNotFoundException, SQLException {
        Connection connection=DBConnection.getInstance().getConnection();
       PreparedStatement stm=connection.prepareStatement("UPDATE Customer SET cust_name=?,cust_address=?,cust_email=?,"
               + " cust_tele=?,cust_age=?,cust_desease=? WHERE cust_id=?");
       stm.setObject(1, c1.getCust_name());
       stm.setObject(2, c1.getCust_address());
       stm.setObject(3, c1.getCust_email());
       stm.setObject(4, c1.getCust_tele());
       stm.setObject(5, c1.getCust_age());
       stm.setObject(6, c1.getCust_desease());
      stm.setObject(7, c1.getCust_id());
      
       return stm.executeUpdate()>0;
        
        
    }
        
        
    }


