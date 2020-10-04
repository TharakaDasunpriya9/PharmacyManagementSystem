
package lk.ijse.pharmacy.modal;

import java.util.ArrayList;

public class Order {
       private String oid;
	 private String order_date;
        private String cust_id;
       private ArrayList<OrderDetail> list;

    public Order() {
    }

    public Order(String oid, String order_date, String cust_id, ArrayList<OrderDetail> list) {
        this.oid = oid;
        this.order_date = order_date;
        this.cust_id = cust_id;
        this.list = list;
    }

    
       
    public String getOid() {
        return oid;
    }

    /**
     * @param oid the oid to set
     */
    public void setOid(String oid) {
        this.oid = oid;
    }

    /**
     * @return the order_date
     */
    public String getOrder_date() {
        return order_date;
    }

    /**
     * @param order_date the order_date to set
     */
    public void setOrder_date(String order_date) {
        this.order_date = order_date;
    }

    /**
     * @return the cust_id
     */
    public String getCust_id() {
        return cust_id;
    }

    /**
     * @param cust_id the cust_id to set
     */
    public void setCust_id(String cust_id) {
        this.cust_id = cust_id;
    }

    /**
     * @return the list
     */
    public ArrayList<OrderDetail> getList() {
        return list;
    }

    /**
     * @param list the list to set
     */
    public void setList(ArrayList<OrderDetail> list) {
        this.list = list;
    }

    @Override
    public String toString() {
   return "Order{" + "oid=" + oid + ", order_date=" + order_date + ",cust_id=" + cust_id+ ", list=" + list + '}';
    
    }
    
   }
