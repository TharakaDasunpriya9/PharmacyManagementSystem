
package lk.ijse.pharmacy.modal;

public class Item {
     private String medi_id;
    private String medi_description ;
    private double medi_SellingUnitPrice ;
    private int medi_QTYonHand;

    public Item() {
    }

    public Item(String medi_id, String medi_description, double medi_SellingUnitPrice, int medi_QTYonHand) {
        this.medi_id = medi_id;
        this.medi_description = medi_description;
        this.medi_SellingUnitPrice = medi_SellingUnitPrice;
        this.medi_QTYonHand = medi_QTYonHand;
    }
    
    

    
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
     * @return the medi_description
     */
    public String getMedi_description() {
        return medi_description;
    }

    /**
     * @param medi_description the medi_description to set
     */
    public void setMedi_description(String medi_description) {
        this.medi_description = medi_description;
    }

    /**
     * @return the medi_SellingUnitPrice
     */
    public double getMedi_SellingUnitPrice() {
        return medi_SellingUnitPrice;
    }

    /**
     * @param medi_SellingUnitPrice the medi_SellingUnitPrice to set
     */
    public void setMedi_SellingUnitPrice(double medi_SellingUnitPrice) {
        this.medi_SellingUnitPrice = medi_SellingUnitPrice;
    }

    /**
     * @return the medi_QTYonHand
     */
    public int getMedi_QTYonHand() {
        return medi_QTYonHand;
    }

    /**
     * @param medi_QTYonHand the medi_QTYonHand to set
     */
    public void setMedi_QTYonHand(int medi_QTYonHand) {
        this.medi_QTYonHand = medi_QTYonHand;
    }

    @Override
    public String toString() {
      return "Item{" + "medi_id=" + medi_id+ ", medi_description=" + medi_description+ ", medi_SellingunitPrice=" + medi_SellingUnitPrice + ", medi_QtyOnHand=" + medi_QTYonHand+ '}';
      
    }
    
    
}
