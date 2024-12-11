package projects.products;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class GUI {
    private List<Products> productList;
    private Scanner scanner = new Scanner(System.in);

    public GUI() {
        this.productList = new ArrayList<>();
    }

    public void saveFile(Products product) {
        productList.add(product);

    }
}