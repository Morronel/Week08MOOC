public class Box {
    private int maxWeight;
    private int storedThingsCounter;
    private double currentWeight;

    public Box(int maxWeight){
        this.maxWeight = maxWeight;
    }

    public void add(Book book){
        if (book.weight() + this.currentWeight <= this.maxWeight){
            this.storedThingsCounter++;
            this.currentWeight += book.weight();
        }
    }

    public void add(CD cd){
        if (cd.weight() + this.currentWeight <= this.maxWeight){
            this.storedThingsCounter++;
            this.currentWeight += cd.weight();
        }
    }

    @Override
    public String toString(){
        return ("Box: " + storedThingsCounter + " things, total weight " + currentWeight + " kg");
    }
}
