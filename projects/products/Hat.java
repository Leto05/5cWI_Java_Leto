package projects.products;

public class Hat implements Products {

    String name;
    int price;

    @Override
    public String getName() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getName'");
    }

    @Override
    public int getPrice() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getPrice'");
    }

    public Hat(String name, int price) {
        this.name = name;
        this.price = price;
    }

}
