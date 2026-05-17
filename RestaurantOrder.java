class RestaurantOrder {

    private String customerName;
    private String foodItem;
    private int quantity;

    public void setCustomerName(String name) {
        this.customerName = name;
    }

    public void setFoodItem(String item) {
        this.foodItem = item;
    }

    public void setQuantity(int qty) {
        if(qty > 0 && qty <= 20) {
            this.quantity = qty;
        } else {
            System.out.println("Quantity must be between 1 and 20! ❌");
        }
    }

    public String getCustomerName() { return customerName; }
    public String getFoodItem() { return foodItem; }
    public int getQuantity() { return quantity; }
}

public class RestaurantOrder {
    public static void main(String[] args) {

        RestaurantOrder o = new RestaurantOrder();
        o.setCustomerName("Rahul");
        o.setFoodItem("Pizza");
        o.setQuantity(2);
        o.setQuantity(50);   // invalid

        System.out.println("Customer: " + o.getCustomerName());
        System.out.println("Food: " + o.getFoodItem());
        System.out.println("Quantity: " + o.getQuantity());
    }
}
