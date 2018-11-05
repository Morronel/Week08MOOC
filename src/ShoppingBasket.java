import java.util.ArrayList;
import java.util.List;

public class ShoppingBasket {
    private List<Purchase> list;

    public ShoppingBasket(){
        this.list = new ArrayList<Purchase>();
    }

    public void add(String product, int price){
        Purchase purchase = new Purchase(product, 1, price);
        list.add(purchase);
    }

    public int price(){
        int totalPrice = 0;

        for(Purchase purchase : list){
            totalPrice += purchase.price();
        }
        return totalPrice;
    }
}
