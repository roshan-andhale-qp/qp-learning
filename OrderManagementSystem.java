

class OrderManagementSystem {
    public static void main(String[] args) {
        Customer customer = new Customer("John Doe", "VIP");
        Order order = new Order(customer);

        order.addItem(Items.Laptop.getName(), Items.Laptop.getPrice());
        order.addItem(Items.Mouse.getName(), Items.Mouse.getPrice());
        order.addItem(Items.Keyboard.getName(), Items.Keyboard.getPrice());

        order.printOrder();

        generateInvoice(order);
    }

    private static void generateInvoice(Order order) {
        System.out.println("Generating Invoice...");
        System.out.println("Customer: " + order.customer.name);
        System.out.println("Total: $" + order.totalPrice);
        System.out.println("Discounted Total: $" + order.discountedPrice);
        System.out.println("Items: " + order.items);
        System.out.println("Thank you for shopping with us!");
    }
}
