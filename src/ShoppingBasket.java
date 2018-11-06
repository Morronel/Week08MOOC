import java.util.HashMap;
import java.util.Map;

public class ShoppingBasket {
    private Map<Purchase, Integer> list;

    public ShoppingBasket(){
        this.list = new HashMap<>();
    }

    //ТАК, БЛЕТ. Последний раз я закончил на том, что доделывал этот метод.
    public void add(String product, int price){
        if (list.get(product) >= 1){
            list.put()
        }
        else{
            list.put(new Purchase(product, 1, price), 1);
        }
    }

    public int price(){
        int totalPrice = 0;

        for(Purchase purchase : list){
            totalPrice += purchase.price();
        }
        return totalPrice;
    }

    public void print(){
        for(Purchase purchase : list){
            System.out.println(purchase);
        }
    }
}
