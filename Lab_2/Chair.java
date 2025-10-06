public class Chair extends Furniture {
    private boolean hasBack;

    public Chair(String material, double price, String color, boolean hasBack) {
        super(material, price, color);
        this.hasBack = hasBack;
    }

    @Override
    public void use() {
        System.out.println("На стуле можно сидеть.");
    }

    @Override
    public String toString() {
        return "Стул {" + super.toString() + ", Со спинкой: " + hasBack + "}";
    }
}