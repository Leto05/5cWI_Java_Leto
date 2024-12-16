package projects.products;

public class Hat implements Products {

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

    public Hat(String name, int price) {
        this.name = name;
        this.price = price;
    }

}
