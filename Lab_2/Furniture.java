public abstract class Furniture {
    private String material;
    private double price;
    private String color;

    private static int counter = 0;

    public Furniture() {
        counter++;
    }

    public Furniture(String material, double price, String color) {
        this.material = material;
        this.price = price;
        this.color = color;
        counter++;
    }

    public String getMaterial() { return material; }
    public void setMaterial(String material) { this.material = material; }

    public double getPrice() { return price; }
    public void setPrice(double price) { this.price = price; }

    public String getColor() { return color; }
    public void setColor(String color) { this.color = color; }

    public abstract void use();

    public static int getCounter() {
        return counter;
    }

    @Override
    public String toString() {
        return "Материал: " + material + ", Цена: " + price + ", Цвет: " + color;
    }
}