package projects.products;

public class Main {
    public static void main(String[] args) {

        Hat h1 = new Hat("Pork-Pie", 80);
        Hat h2 = new Hat("Filzhut", 30);
        Shoe s1 = new Shoe("Sneaker", 90);
        Shoe s2 = new Shoe("Crocs", 30);
        Car c1 = new Car("VW", 20000);

        GUI gui = new GUI();
        gui.addProduct(h2);
        gui.addProduct(s1);
        gui.addProduct(c1);
        gui.run();
    }
}
