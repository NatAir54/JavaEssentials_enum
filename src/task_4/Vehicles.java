package task_4;

public enum Vehicles {
    AUDI(19000, "grey"), FORD(11000, "black"),
    BMW(22000, "white"), JEEP(25000, "red");

    private int price;
    private String color;

    public String getColor() {
        return color;
    }

    Vehicles (int price, String color) {
        this.price = price;
        this.color = color;
    }

    @Override
    public String toString() {
        return this.name() + ": " + getColor() + " color, " + price + " $\n";
    }
}
