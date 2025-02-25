// Represents a customer in the system
class Customer {
    String name;
    String type;
    double discount;

    public Customer(String name, String type, double discount) {
        this.name = name;
        this.type = type;
        this.discount = discount;
    }

    public double getDiscount() {
        return discount;
    }

    public void setDiscount(double discount) {
        this.discount = discount;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
