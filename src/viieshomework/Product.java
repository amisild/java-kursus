package viieshomework;

public class Product {
    private Integer productNumber;
    private String productName;
    private Integer numberOfUnitsInStock;
    private Double productPrice;
    private Vendor vendor;
    private Author author;

    public Product(Integer productNumber, String productName, Integer numberOfUnitsInStock, Double productPrice, Vendor vendor, Author author) {
        this.productNumber = productNumber;
        this.productName = productName;
        this.numberOfUnitsInStock = numberOfUnitsInStock;
        this.productPrice = productPrice;
        this.vendor = vendor;
        this.author = author;
    }

    public Product(Integer productNumber, String productName, Integer numberOfUnitsInStock, Double productPrice) {
        this.productNumber = productNumber;
        this.productName = productName;
        this.numberOfUnitsInStock = numberOfUnitsInStock;
        this.productPrice = productPrice;
    }

    public Product (Vendor vendor){
    }

    public Product (Author author) {
    }

    public Integer getProductNumber() {

        return productNumber;
    }

    public void setProductNumber(Integer productNumber) {

        this.productNumber = productNumber;
    }

    public String getProductName() {

        return productName;
    }

    public void setProductName(String productName) {

        this.productName = productName;
    }

    public Integer getNumberOfUnitsInStock() {

        return numberOfUnitsInStock;
    }

    public void setNumberOfUnitsInStock(Integer numberOfUnitsInStock) {
        this.numberOfUnitsInStock = numberOfUnitsInStock;
    }

    public Double getProductPrice() {

        return productPrice;
    }

    public void setProductPrice(Double productPrice) {

        this.productPrice = productPrice;
    }

    public Vendor getVendor() {
        return vendor;
    }

    public void setVendor(Vendor vendor) {
        this.vendor = vendor;
    }

    public Author getAuthor() {
        return author;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }

    public double quantityPrice() {
        return productPrice * numberOfUnitsInStock * 1.05;
    }

    @Override
    public String toString() {
        return "Product{" +
                "productNumber=" + productNumber +
                ", productName='" + productName + '\'' +
                ", numberOfUnitsInStock=" + numberOfUnitsInStock +
                ", productPrice=" + productPrice +
                ", vendor=" + vendor +
                ", quantity price=" + quantityPrice() +
                '}';
    }
}
