package tyyftyg;
import java.util.Comparator;
import java.util.PriorityQueue;

public class ShoppingCart {

  public static void main(String[] args) {
    CartItem item1 = new CartItem("Leather wallet", 1100, 18, 1);
    CartItem item2 = new CartItem("Umbrella", 900, 12, 4);
    CartItem item3 = new CartItem("Cigarette", 200, 28, 3);
    CartItem item4 = new CartItem("Honey", 100, 0, 2);

    PriorityQueue<CartItem> pq = new PriorityQueue<>(new Comparator<CartItem>() {
      @Override
      public int compare(CartItem item1, CartItem item2) {
        return Double.compare((item2.getGstRate() / 100.0 * item2.getPrice() * item2.getQuantity()), 
                              (item1.getGstRate() / 100.0 * item1.getPrice() * item1.getQuantity()));
      }
    });

    pq.add(item1);
    pq.add(item2);
    pq.add(item3);
    pq.add(item4);

    System.out.println("Highest gst amount paid item: " + pq.peek());
    
    double amount = 0.0;
    for (CartItem item : pq) {
      double itemPrice = item.getPrice();
      if (itemPrice >= 500) {
        itemPrice = itemPrice - (itemPrice * 0.05);
      }  
      amount += (itemPrice + (itemPrice * item.getGstRate() / 100)) * item.getQuantity();
    }
    System.out.println("Amount to be paid: " + amount);
  }
}
