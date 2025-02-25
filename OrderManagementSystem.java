class OrderManagementSystem {
    public static void main(String[] args) {
        Customer customer = new Customer("John Doe", CustomerType.VIP.getName(), CustomerType.VIP.getDiscount());
        Order order = new Order(customer);

        order.addItem(Items.LAPTOP.getName(), Items.LAPTOP.getPrice());
        order.addItem(Items.MOUSE.getName(), Items.MOUSE.getPrice());
        order.addItem(Items.KEYBOARD.getName(), Items.KEYBOARD.getPrice());

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
