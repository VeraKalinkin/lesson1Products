public abstract class Product {

    private String name;
    private int cost;

    public Product(String name, int cost){
        this.cost = cost;
        this.name = name;
    }

    public int getCost() {
        return cost;
    }

    public String getName() {
        return name;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Название: " + name + "\n" +
                "Цена: " + cost;
    }
}
