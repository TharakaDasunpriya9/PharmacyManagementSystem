
package lk.ijse.pharmacy.modal;


public class CustomerAdd {
    private String cust_id ;
	private String cust_name;
	private String cust_address;
	private String cust_email;
	private Integer cust_tele;
	private Integer cust_age;
	private String cust_desease;

    public CustomerAdd() {
    }

    public CustomerAdd(String cust_id, String cust_name, String cust_address, String cust_email, Integer cust_tele, Integer cust_age, String cust_desease) {
        this.cust_id = cust_id;
        this.cust_name = cust_name;
        this.cust_address = cust_address;
        this.cust_email = cust_email;
        this.cust_tele = cust_tele;
        this.cust_age = cust_age;
        this.cust_desease = cust_desease;
    }

    
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
     * @return the cust_email
     */
    public String getCust_email() {
        return cust_email;
    }

    /**
     * @param cust_email the cust_email to set
     */
    public void setCust_email(String cust_email) {
        this.cust_email = cust_email;
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

    /**
     * @return the cust_age
     */
    public Integer getCust_age() {
        return cust_age;
    }

    /**
     * @param cust_age the cust_age to set
     */
    public void setCust_age(Integer cust_age) {
        this.cust_age = cust_age;
    }

    /**
     * @return the cust_desease
     */
    public String getCust_desease() {
        return cust_desease;
    }

    /**
     * @param cust_desease the cust_desease to set
     */
    public void setCust_desease(String cust_desease) {
        this.cust_desease = cust_desease;
    }
}
