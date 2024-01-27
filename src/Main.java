abstract class Product {
    private String name;
    private int id;
    private double price;

    public Product(String name, int id, double price) {
        this.name = name;
        this.id = id;
        this.price = price;
    }

    // Abstract method to calculate the total cost
    public abstract double total();

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    public double getPrice() {
        return price;
    }
}

class Category extends Product {
    private String type;
    private double discount;

    public Category(String name, int id, double price, String type, double discount) {
        super(name, id, price);
        this.type = type;
        this.discount = discount;
    }

    // Override the abstract method to calculate the total cost with discounts
    @Override
    public double total() {
        double discountedPrice = getPrice() * (1 - discount / 100);
        return discountedPrice;
    }

    public String getType() {
        return type;
    }

    public double getDiscount() {
        return discount;
    }
}

class Delivery extends Category {
    private boolean doorDelivery;
    private double deliveryCharge;

    public Delivery(String name, int id, double price, String type, double discount, boolean doorDelivery, double deliveryCharge) {
        super(name, id, price, type, discount);
        this.doorDelivery = doorDelivery;
        this.deliveryCharge = deliveryCharge;
    }

    // Override the total method to include delivery charge
    @Override
    public double total() {
        double totalWithoutDelivery = super.total();
        if (doorDelivery) {
            return totalWithoutDelivery + deliveryCharge;
        } else {
            return totalWithoutDelivery;
        }
    }

    public boolean isDoorDelivery() {
        return doorDelivery;
    }

    public double getDeliveryCharge() {
        return deliveryCharge;
    }
}

public class Main {
    public static void main(String[] args) {
        // Create a Product object
        Product product = new Delivery("Laptop", 101, 1000.0, "Electronics", 10.0, true, 20.0);

        // Calculate the total cost
        double totalCost = product.total();

        // Display product details and total cost
        System.out.println("Product Details:");
        System.out.println("Name: " + product.getName());
        System.out.println("ID: " + product.getId());
        System.out.println("Price: $" + product.getPrice());
        System.out.println("Type: " + ((Delivery) product).getType());
        System.out.println("Discount: " + ((Delivery) product).getDiscount() + "%");
        System.out.println("Door Delivery: " + ((Delivery) product).isDoorDelivery());
        System.out.println("Delivery Charge: $" + ((Delivery) product).getDeliveryCharge());
        System.out.println("Total Cost: $" + totalCost);
    }
}
