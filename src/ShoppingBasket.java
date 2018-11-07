import java.util.HashMap;
import java.util.Map;

public class ShoppingBasket {
    private Map<String, Purchase> map;

    public ShoppingBasket(){
        this.map = new HashMap<>();
    }

    public void add(String product, int price){
        if (map.containsKey(product)){
            map.get(product).increaseAmount();
        }
        else{
            map.put(product, new Purchase(product, 1, price));
        }
    }

    public int price(){
        int totalPrice = 0;

        for(Purchase purchase : map.values()){
            totalPrice += purchase.price();
        }
        return totalPrice;
    }

    public void print(){
        for(Purchase purchase : map.values()){
            System.out.println(purchase);
        }
    }
}
