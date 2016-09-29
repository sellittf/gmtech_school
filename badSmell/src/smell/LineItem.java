package smell;
 
class LineItem {
    protected int productId;
    private int ImageID;
    private int qty;
    private int Unitprice;
 
    public LineItem(int prodID, int ImageID, int inQty, int unitPrice) {
        productId = prodID;
        this.ImageID = ImageID;
        qty = inQty;
        Unitprice = unitPrice;
    }
  
    int getProductID() {
        return productId;
    }
 
    int getImageID() {
        return ImageID;
    }
 
    int getQuantity() {
        return qty;
    }
 
    int getTotalPrice() {
        return Unitprice * qty;
    }
 
    public void setProductID(int id) {
        productId = id;
    }
 
    public void setImageID(int ID) {
        ImageID = ID;
    }
 
    public void setQty(int qty) {
        this.qty = qty;
    }
 
    public void setUnitPrice(int i) {
        Unitprice = i;
    }
}
