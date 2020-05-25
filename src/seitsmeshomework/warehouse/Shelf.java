package seitsmeshomework.warehouse;

import seitsmeshomework.product.Product;

public class Shelf {

    private String shelfLocation;
    private Product product;

    public Shelf(String shelfLocation, Product product) {
        this.shelfLocation = shelfLocation;
        this.product = product;
    }

    public String getShelfLocation() {
        return shelfLocation;
    }

    public Product getProduct() {
        return product;
    }

}
