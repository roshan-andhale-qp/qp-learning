public enum Items {
    LAPTOP("Laptop", 1000),
    MOUSE("Mouse", 50),
    KEYBOARD("KeyBoard", 80);

    Items(String name, long price) {
        this.name = name;
        this.price = price;
    }
    private String name;
    private long price;

    public String getName() {
        return  name;
    }

    public long getPrice() {
        return price;
    }
}
