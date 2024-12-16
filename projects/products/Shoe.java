package projects.products;

public class Shoe implements Products {

    String name;
    int price;

    @Override
    public String getName() {
        return name;
    }

    @Override
    public int getPrice() {
        return price;
    }

    public Shoe(String name, int price) {
        this.name = name;
        this.price = price;
    }

}
