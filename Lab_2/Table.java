public class Table extends Furniture {
    private int legs;

    public Table(String material, double price, String color, int legs) {
        super(material, price, color);
        this.legs = legs;
    }

    public int getLegs() { return legs; }
    public void setLegs(int legs) { this.legs = legs; }

    @Override
    public void use() {
        System.out.println("На столе можно писать и работать.");
    }

    @Override
    public String toString() {
        return "Стол {" + super.toString() + ", Ножек: " + legs + "}";
    }
}