import java.util.ArrayList;

public class Box implements ToBeStored {
    private int maxWeight;
    private ArrayList<ToBeStored> itemList;

    public Box(int maxWeight){
        this.maxWeight = maxWeight;
        this.itemList = new ArrayList<ToBeStored>();
    }

    public void add(ToBeStored thing){
        if (thing.weight() + this.weight() <= this.maxWeight){
            itemList.add(thing);
        }
    }

    @Override
    public double weight() {
        double weight = 0;
        for (ToBeStored thing : itemList){
            weight += thing.weight();
        }
        return weight;
    }

    @Override
    public String toString(){
        return ("Box: " + itemList.size() + " things, total weight " + this.weight() + " kg");
    }
}
