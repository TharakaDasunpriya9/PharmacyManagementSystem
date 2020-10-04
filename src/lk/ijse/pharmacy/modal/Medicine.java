
package lk.ijse.pharmacy.modal;


public class Medicine {
      private String medi_id;
       private String description;
       private Double medi_SellingUnitPrice;
      private Integer medi_QTYonHand;

    public Medicine() {
    }

    public Medicine(String medi_id, String description, Double medi_SellingUnitPrice, Integer medi_QTYonHand) {
        this.medi_id = medi_id;
        this.description = description;
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
     * @return the description
     */
    public String getDescription() {
        return description;
    }

    /**
     * @param description the description to set
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * @return the medi_SellingUnitPrice
     */
    public Double getMedi_SellingUnitPrice() {
        return medi_SellingUnitPrice;
    }

    /**
     * @param medi_SellingUnitPrice the medi_SellingUnitPrice to set
     */
    public void setMedi_SellingUnitPrice(Double medi_SellingUnitPrice) {
        this.medi_SellingUnitPrice = medi_SellingUnitPrice;
    }

    /**
     * @return the medi_QTYonHand
     */
    public Integer getMedi_QTYonHand() {
        return medi_QTYonHand;
    }

    /**
     * @param medi_QTYonHand the medi_QTYonHand to set
     */
    public void setMedi_QTYonHand(Integer medi_QTYonHand) {
        this.medi_QTYonHand = medi_QTYonHand;
    }
}
