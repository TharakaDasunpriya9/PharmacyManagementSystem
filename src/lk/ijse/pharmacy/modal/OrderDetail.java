
package lk.ijse.pharmacy.modal;

public class OrderDetail {
     private String  oid;
	private String medi_id;
	 private int OrderQTY; 
        private double  unitPrice;

    public OrderDetail() {
    }

    public OrderDetail(String oid, String medi_id, int OrderQTY, double unitPrice) {
        this.oid = oid;
        this.medi_id = medi_id;
        this.OrderQTY = OrderQTY;
        this.unitPrice = unitPrice;
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
     * @return the medi_id
     */
    public String getMedi_id() {
        return medi_id;
    }

    /**
     * @param medi_id the medi_id to set
     */
    public void setMedi_id(String medi_id) {
        this.medi_id = medi_id;
    }

    /**
     * @return the OrderQTY
     */
    public int getOrderQTY() {
        return OrderQTY;
    }

    /**
     * @param OrderQTY the OrderQTY to set
     */
    public void setOrderQTY(int OrderQTY) {
        this.OrderQTY = OrderQTY;
    }

    /**
     * @return the unitPrice
     */
    public double getUnitPrice() {
        return unitPrice;
    }

    /**
     * @param unitPrice the unitPrice to set
     */
    public void setUnitPrice(double unitPrice) {
        this.unitPrice = unitPrice;
    }

    @Override
    public String toString() {
       return "OrderDetail{" + "oid=" + oid + ", medi_id=" + medi_id + ", OrderQTY=" +OrderQTY + ", unitPrice=" + unitPrice + '}';
  
    
    }
    
}
