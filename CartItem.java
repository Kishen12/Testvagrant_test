package tyyftyg;

public class CartItem {
  
  private String productName;
  private double price, gstRate, quantity;

  public CartItem(String productName, double price, double gstRate, double quantity) {
    this.productName = productName;
    this.price = price;
    this.gstRate = gstRate;
    this.quantity = quantity;
  }

  public String getProductName() {
    return productName;
  }

  public void setProductName(String productName) {
    this.productName = productName;
  }

  public double getPrice() {
    return price;
  }

  public void setPrice(double price) {
    this.price = price;
  }

  public double getGstRate() {
    return gstRate;
  }

  public void setGstRate(double gstRate) {
    this.gstRate = gstRate;
  }

  public double getQuantity() {
    return quantity;
  }

  public void setQuantity(double quantity) {
    this.quantity = quantity;
  }
  
  @Override
  public String toString() {
    return "CartItem {productName: " + this.productName + ", price: " + this.price + ", gstRate: " + this.gstRate + ", quantity: " + this.quantity + "}";
  }
}

