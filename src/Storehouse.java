import java.util.HashMap;
import java.util.Map;

public class Storehouse {
    private Map<String, Integer> map;

    public Storehouse(){
        this.map = new HashMap<>();
    }

    public void addProduct(String product, int price, int stock){
        this.map.put(product, price);
    }

    public int price(String product){
        if (this.map.get(product) != null){
            return this.map.get(product);
        }
        else{
            return -99;
        }
    }
}
