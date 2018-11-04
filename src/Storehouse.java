import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Storehouse {
    private Map<String, Integer> map;
    private Map<String, Integer> stockMap;

    public Storehouse(){
        this.map = new HashMap<>();
        this.stockMap = new HashMap<>();
    }

    public Set<String> products(){
        return map.keySet();
    }

    public int stock(String product){
        if (this.stockMap.get(product) != null){
            return this.stockMap.get(product);
        }
        else{
            return 0;
        }
    }

    public boolean take(String product){
        if (this.stockMap.get(product) != null && this.stockMap.get(product) > 0){
            this.stockMap.replace(product, this.stockMap.get(product) - 1);
            return true;
        }
        else{
            return false;
        }
    }

    public void addProduct(String product, int price, int stock){
        this.map.put(product, price);
        this.stockMap.put(product, stock);
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
