import java.util.ArrayList;
import java.util.List;

class Order {
    Customer customer;
    List<String> items;
    List<Double> prices;
    double totalPrice;
    double discountedPrice;

    public Order(Customer customer) {
        this.customer = customer;
        this.items = new ArrayList<>();
        this.prices = new ArrayList<>();
    }

    public void addItem(String item, double price) {
        items.add(item);
        prices.add(price);
        calculateTotal();
    }

    private void calculateTotal() {
        totalPrice = 0;
        for (double price : prices) {
            totalPrice += price;
        }
        applyDiscount();
    }

    public void applyDiscount() {
        discountedPrice = totalPrice - (totalPrice * getDiscount());
    }

    private double getDiscount() {
        if (customer.getType().equals("Regular")) {
           return 0.05;
        } else if (customer.getType().equals("Premium")) {
            return  0.1;
        } else if (customer.getType().equals("VIP")) {
            return  0.2;
        }
        return 0;
    }

    public void printOrder() {
        System.out.println("Customer: " + customer.name);
        System.out.println("Items: " + items);
        System.out.println("Total Price: " + totalPrice);
        System.out.println("Discounted Price: " + discountedPrice);
    }
}
