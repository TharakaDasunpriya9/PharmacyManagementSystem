
package lk.ijse.pharmacy.modal;


    public class Customer {
   private String cust_id;
   private String cust_name;
    private String cust_address;
    private Integer cust_tele;

    public Customer() {
    }

    public Customer(String cust_id, String cust_name, String cust_address, Integer cust_tele) {
        this.cust_id = cust_id;
        this.cust_name = cust_name;
        this.cust_address = cust_address;
        this.cust_tele = cust_tele;
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
     * @return the cust_name
     */
    public String getCust_name() {
        return cust_name;
    }

    /**
     * @param cust_name the cust_name to set
     */
    public void setCust_name(String cust_name) {
        this.cust_name = cust_name;
    }

    /**
     * @return the cust_address
     */
    public String getCust_address() {
        return cust_address;
    }

    /**
     * @param cust_address the cust_address to set
     */
    public void setCust_address(String cust_address) {
        this.cust_address = cust_address;
    }

    /**
     * @return the cust_tele
     */
    public Integer getCust_tele() {
        return cust_tele;
    }

    /**
     * @param cust_tele the cust_tele to set
     */
    public void setCust_tele(Integer cust_tele) {
        this.cust_tele = cust_tele;
    }

    @Override
    public String toString() {
        return "Customer{" + "cust_id=" + cust_id + ", cust_name=" + cust_name + ", cust_address=" + cust_address+ ", cust_tele=" + cust_tele + '}';
    }
    
    
    

    }

