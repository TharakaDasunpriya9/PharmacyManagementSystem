
package lk.ijse.pharmacy.controler;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import lk.ijse.pharmacy.db.DBConnection;
import lk.ijse.pharmacy.modal.Item;
import lk.ijse.pharmacy.modal.Medicine;
import lk.ijse.pharmacy.modal.OrderDetail;


public class MedicineController {

    public static ArrayList<Medicine> getAllMedicine() throws ClassNotFoundException, SQLException {
     Connection con = DBConnection.getInstance().getConnection();
		String sql = "SELECT * FROM Medicine";
		Statement stm = con.createStatement();
		ResultSet set = stm.executeQuery(sql);

		ArrayList<Medicine> list = new ArrayList<>();

		while (set.next()) {
		 Medicine m= new Medicine();
			m.setMedi_id(set.getString(1));
                        m.setDescription(set.getString(2));
                        m.setMedi_SellingUnitPrice(set.getDouble(3));
                        m.setMedi_QTYonHand(set.getInt(4));
			list.add(m);

		}
		return list;
        
    }
     public ArrayList<String> getAllIDS() throws ClassNotFoundException, SQLException{
        ResultSet set = DBConnection.getInstance().getConnection().prepareStatement("SELECT medi_id FROM Medicine").executeQuery();
        ArrayList<String> list= new ArrayList<>();
        while(set.next()){
            list.add(set.getString(1));
     
        }
        return list;
    
}
     public Item getItem(String id) throws ClassNotFoundException, SQLException{
       ResultSet set= DBConnection.getInstance().getConnection().prepareStatement("SELECT * FROM Medicine WHERE medi_Id='"+id+"'").executeQuery();
       
       if(set.next()){
           return new Item(
                   set.getString(1),
                   set.getString(2),
                   set.getDouble(3),
                   set.getInt(4)
           );
       }
       return null;
    }

    public boolean saveMedicine(Medicine m1) throws ClassNotFoundException, SQLException {
          Connection con=DBConnection.getInstance().getConnection();
        PreparedStatement stm = con.prepareStatement("INSERT INTO Medicine VALUES(?,?,?,?)");
        stm.setString(1,m1.getMedi_id());
        stm.setString(2,m1.getDescription());
        stm.setDouble(3,m1.getMedi_SellingUnitPrice());
        stm.setInt(4,m1.getMedi_QTYonHand());
        
        return stm.executeUpdate()>0;
    }

    public Medicine getMedicineAdd(String requestmedi_id) throws ClassNotFoundException, SQLException {
         Connection connection=DBConnection.getInstance().getConnection();
        ResultSet set=connection.
                prepareStatement("SELECT * FROM Medicine WHERE medi_id=+'"+requestmedi_id+"'")
                .executeQuery();
        if(set.next()){
            return new Medicine(
                    set.getString(1),
                    set.getString(2),
                    set.getDouble(3),
                    set.getInt(4)
                   
            );
        }
        return null;
    }

    public boolean dropMedicine(String requestMID) throws ClassNotFoundException, SQLException {
        Connection connection=DBConnection.getInstance().getConnection();
        return connection.prepareStatement("DELETE FROM Medicine WHERE medi_id='"+requestMID+"'")
                .executeUpdate()>0;
        
    }

    public boolean updateMedi(Medicine m1) throws ClassNotFoundException, SQLException {
        Connection connection=DBConnection.getInstance().getConnection();
       PreparedStatement stm=connection.prepareStatement("UPDATE Medicine SET medi_description=?,medi_SellingUnitPrice=?,medi_QTYonHand =?  WHERE medi_id=?");
       stm.setObject(1, m1.getDescription());
       stm.setObject(2, m1.getMedi_SellingUnitPrice());
       stm.setObject(3, m1.getMedi_QTYonHand());
         stm.setObject(4, m1.getMedi_id());
      
      
       return stm.executeUpdate()>0;
        
    }

    boolean updateQTY(ArrayList<OrderDetail> list) throws ClassNotFoundException, SQLException {
         PreparedStatement stm = DBConnection.getInstance().getConnection().prepareStatement("UPDATE Medicine SET medi_QTYonHand=(medi_QTYonHand-?) WHERE medi_id=?");
         
         for (OrderDetail temp : list) {
             stm.setObject(1,temp.getOrderQTY());
             stm.setObject(2,temp.getMedi_id());
             
             boolean isUpdated=stm.executeUpdate()>0;
             
             if(!isUpdated)return false;
         }
         return true;
         }
  }

