class Product {

    private String productName;
    private double price;

    public void setProductName(String name) {
        this.productName = name;
    }

    public void setPrice(double price) {
        if(price > 0) {
            this.price = price;
        } else {
            System.out.println("Price cannot be zero or negative! ❌");
        }
    }

    public String getProductName() {
        return productName;
    }

    public double getPrice() {
        return price;
    }
}

public class Code5_ProductPrice {
    public static void main(String[] args) {

        Product p = new Product();
        p.setProductName("Laptop");
        p.setPrice(45000);
        p.setPrice(-100);

        System.out.println(p.getProductName());
        System.out.println(p.getPrice());
    }
}
