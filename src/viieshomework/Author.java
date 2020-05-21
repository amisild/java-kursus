package viieshomework;

public class Author extends Product {

    private String authorName;

    public Author(Vendor vendor, String authorName) {
        super(vendor);
        this.authorName = authorName;
    }

    public String getAuthorName() {
        return authorName;
    }

    public void setAuthorName(String authorName) {
        this.authorName = authorName;
    }

    @Override
    public String toString() {
        return "Author{" +
                "authorName='" + authorName + '\'' +
                '}';
    }

    @Override
    public double quantityPrice() {
        return super.quantityPrice() * 1.05;
    }
}
