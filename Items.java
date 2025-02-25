public enum Items {
    Laptop("Laptop", 1000),
    Mouse("Mouse", 50),
    Keyboard("KeyBoard", 80);

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
