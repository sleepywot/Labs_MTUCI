public class Bed extends Furniture {
    private int size;

    public Bed(String material, double price, String color, int size) {
        super(material, price, color);
        this.size = size;
    }

    @Override
    public void use() {
        System.out.println("На кровати можно спать.");
    }

    @Override
    public String toString() {
        return "Кровать {" + super.toString() + ", Размер: " + size + "}";
    }
}