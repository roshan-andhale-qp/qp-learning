public class OrderManagementSystem {
    public static void main(String[] args) {
        Customer customer = new Customer("John Doe", CustomerType.VIP);
        Order order = new Order(customer);

        order.addItem("Laptop", 1000);
        order.addItem("Mouse", 50);
        order.addItem("Keyboard", 80);

        order.printOrder();
        generateInvoice(order);
    }

    public static void generateInvoice(Order order) {
        System.out.println("----- Invoice -----");
        System.out.println("Customer: " + order.getCustomer().getName());
        System.out.printf("Total: $%.2f%n", order.calculateTotal());
        System.out.printf("Discounted Total: $%.2f%n", order.calculateDiscountedTotal());
        System.out.println("Items: " + order.getItems());
        System.out.println("Thank you for shopping with us!");
    }
}