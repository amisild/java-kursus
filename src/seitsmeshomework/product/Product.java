package seitsmeshomework.product;

import java.util.Objects;

public class Product {
    private String name;
    private  int size;

    public Product(String name, int size) {
        this.name = name;
        this.size = size;
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Product product = (Product) o;
        return size == product.size &&
                Objects.equals(name, product.name);
    }

    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                ", size=" + size +
                '}';
    }
}
