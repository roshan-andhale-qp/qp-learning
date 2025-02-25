import java.util.ArrayList;
import java.util.List;

class Order {
    private final Customer customer;
    private final List<String> items;
    private final List<Double> prices;

    public Order(Customer customer) {
        this.customer = customer;
        this.items = new ArrayList<>();
        this.prices = new ArrayList<>();
    }

    public void addItem(String item, double price) {
        items.add(item);
        prices.add(price);
    }

    public double calculateTotal() {
        double totalPrice = 0;
        for (double price : prices) {
            totalPrice += price;
        }
        return totalPrice;
    }

    public double calculateDiscountedTotal() {
        return (calculateTotal() - calculateTotal() * customer.getDiscount());
    }

    public void printOrder() {
        System.out.println("----- Order Summary -----");
        System.out.println("Customer: " + customer.getName());
        System.out.println("Items: " + items);
        System.out.printf("Total Price: $%.2f%n", calculateTotal());
        System.out.printf("Discounted Price: $%.2f%n", calculateDiscountedTotal());
    }

    public Customer getCustomer() {
        return customer;
    }

    public List<String> getItems() {
        return items;
    }
}
