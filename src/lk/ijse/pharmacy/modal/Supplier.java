
package lk.ijse.pharmacy.modal;


public class Supplier {
         private String supplier_id;
	 private String supplier_name;
	private String supplier_address;
	private String supplier_email;
	private Integer supplier_tele;
	private String supplier_regNo;

    public Supplier() {
    }

    public Supplier(String supplier_id, String supplier_name, String supplier_address, String supplier_email, Integer supplier_tele, String supplier_regNo) {
        this.supplier_id = supplier_id;
        this.supplier_name = supplier_name;
        this.supplier_address = supplier_address;
        this.supplier_email = supplier_email;
        this.supplier_tele = supplier_tele;
        this.supplier_regNo = supplier_regNo;
    }

   
    public String getSupplier_id() {
        return supplier_id;
    }

    /**
     * @param supplier_id the supplier_id to set
     */
    public void setSupplier_id(String supplier_id) {
        this.supplier_id = supplier_id;
    }

    /**
     * @return the supplier_name
     */
    public String getSupplier_name() {
        return supplier_name;
    }

    /**
     * @param supplier_name the supplier_name to set
     */
    public void setSupplier_name(String supplier_name) {
        this.supplier_name = supplier_name;
    }

    /**
     * @return the supplier_address
     */
    public String getSupplier_address() {
        return supplier_address;
    }

    /**
     * @param supplier_address the supplier_address to set
     */
    public void setSupplier_address(String supplier_address) {
        this.supplier_address = supplier_address;
    }

    /**
     * @return the supplier_email
     */
    public String getSupplier_email() {
        return supplier_email;
    }

    /**
     * @param supplier_email the supplier_email to set
     */
    public void setSupplier_email(String supplier_email) {
        this.supplier_email = supplier_email;
    }

    /**
     * @return the supplier_tele
     */
    public Integer getSupplier_tele() {
        return supplier_tele;
    }

    /**
     * @param supplier_tele the supplier_tele to set
     */
    public void setSupplier_tele(Integer supplier_tele) {
        this.supplier_tele = supplier_tele;
    }

    /**
     * @return the supplier_regNo
     */
    public String getSupplier_regNo() {
        return supplier_regNo;
    }

    /**
     * @param supplier_regNo the supplier_regNo to set
     */
    public void setSupplier_regNo(String supplier_regNo) {
        this.supplier_regNo = supplier_regNo;
    }
}
