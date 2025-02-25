enum CustomerType {
    REGULAR(0.05),
    PREMIUM(0.10),
    VIP(0.20);

    private final double discount;

    CustomerType(double discount) {
        this.discount = discount;
    }

    public double getDiscount() {
        return discount;
    }
}