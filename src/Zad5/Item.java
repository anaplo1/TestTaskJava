package Zad5;

public class Item {

    private int weight;
    private int price;
    private String name;

    public Item(int weight, int price, String name){
        this.weight = weight;
        this.price = price;
        this.name = name;
    }

    public int getWeight() {
        return weight;
    }

    public int getPrice() {
        return price;
    }

    public String getName() {
        return name;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public void setName(String name) {
        this.name = name;
    }
}
