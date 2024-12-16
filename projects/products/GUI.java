package projects.products;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class GUI {

    private List<Products> productList = new ArrayList<Products>();
    private Scanner scanner = new Scanner(System.in);

    public void run() {
        while (true) {
            System.out.println("1 to see products");
            System.out.println("2 to show prices");

            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    showProducts();
                    break;
                case 2:
                    showPrices();
                    break;

                default:
                    break;
            }
        }
    }

    public void addProduct(Products product) {
        this.productList.add(product);

    }

    public void showProducts() {
        for (Products product : productList) {
            System.out.println("Name " + product.getName());
        }
    }

    public void showPrices() {
        for (Products product : productList) {
            System.out.println("Name: " + product.getName() + "Preis: " + product.getPrice());
        }
    }

    public List<Products> getList() {
        return productList;
    }

}