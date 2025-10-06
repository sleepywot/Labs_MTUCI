public class DoubleBed extends Bed {
    private boolean orthopedic;

    public DoubleBed(String material, double price, String color, int size, boolean orthopedic) {
        super(material, price, color, size);
        this.orthopedic = orthopedic;
    }

    @Override
    public void use() {
        System.out.println("Двуспальная кровать с ортопедическим матрасом.");
    }

    @Override
    public String toString() {
        return "Двуспальная кровать {" + super.toString() + ", Ортопедическая: " + orthopedic + "}";
    }
}