abstract class Product {

    private int productId;
    private String productName;

    Product(int productId, String productName) {
        this.productId = productId;
        this.productName = productName;
    }

    public int getProductId() {
        return productId;
    }

    public String getProductName() {
        return productName;
    }

    abstract void calculatePrice();
}

class Electronics extends Product {

    Electronics(int productId, String productName) {
        super(productId, productName);
    }

    @Override
    void calculatePrice() {
        System.out.println("Electronics Price = 50000");
    }
}

class Clothing extends Product {

    Clothing(int productId, String productName) {
        super(productId, productName);
    }

    @Override
    void calculatePrice() {
        System.out.println("Clothing Price = 2000");
    }
}

public class pillars3 {

    public static void main(String[] args) {

        Product p;

        p = new Electronics(101, "Laptop");

        System.out.println("ID: " + p.getProductId());
        System.out.println("Name: " + p.getProductName());

        p.calculatePrice();

        p = new Clothing(102, "T-Shirt");

        System.out.println("ID: " + p.getProductId());
        System.out.println("Name: " + p.getProductName());

        p.calculatePrice();
    }
}