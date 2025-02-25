public enum CustomerType {
    REGULAR("Regular", 0.05),
    PREMIUM("Premium", 0.1),
    VIP("VIP", 0.2);

    CustomerType(String name, double discount) {
        this.name = name;
        this.discount = discount;
    }

    private String name;
    private double discount;


    public String getName() {
        return name;

    }

    public double getDiscount() {
        return discount;

    }

}
