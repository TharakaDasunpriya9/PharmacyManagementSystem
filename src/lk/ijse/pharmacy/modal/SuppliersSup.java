
package lk.ijse.pharmacy.modal;


public class SuppliersSup {
         private String supplier_id;
         private String supplier_name;
	 private String supplier_address;
         private Integer supplier_tele;

    public SuppliersSup() {
    }

    public SuppliersSup(String supplier_id, String supplier_name, String supplier_address, Integer supplier_tele) {
        this.supplier_id = supplier_id;
        this.supplier_name = supplier_name;
        this.supplier_address = supplier_address;
        this.supplier_tele = supplier_tele;
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

    @Override
    public String toString() {
       return " SuppliersSup{" + "supplier_id=" + supplier_id + ",supplier_name=" + supplier_name+ ", supplier_address=" +supplier_address+ ", cust_tele=" + supplier_tele + '}';
    }
    
	

} 