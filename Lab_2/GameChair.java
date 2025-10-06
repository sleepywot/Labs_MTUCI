public class GameChair extends Chair {
    private String brand;

    public GameChair(String material, double price, String color, boolean hasBack, String brand) {
        super(material, price, color, hasBack);
        this.brand = brand;
    }

    @Override
    public void use() {
        System.out.println("Игровой стул создан для долгого сидения за играми.");
    }

    @Override
    public String toString() {
        return "Игровой стул {" + super.toString() + ", Бренд: " + brand + "}";
    }
}