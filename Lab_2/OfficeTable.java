public class OfficeTable extends Table {
    private boolean hasDrawers;

    public OfficeTable(String material, double price, String color, int legs, boolean hasDrawers) {
        super(material, price, color, legs);
        this.hasDrawers = hasDrawers;
    }

    @Override
    public void use() {
        System.out.println("Офисный стол используется для работы за компьютером.");
    }

    @Override
    public String toString() {
        return "Офисный стол {" + super.toString() + ", Ящики: " + hasDrawers + "}";
    }
}