public class FurnitureMain {
    public static void main(String[] args) {
        Furniture m1 = new OfficeTable("Дерево", 12000, "Коричневый", 4, true);
        Furniture m2 = new GameChair("Кожа", 8000, "Черный", true, "DXRacer");
        Furniture m3 = new DoubleBed("Металл", 20000, "Белый", 200, true);

        m1.use();
        m2.use();
        m3.use();

        System.out.println(m1);
        System.out.println(m2);
        System.out.println(m3);

        System.out.println("Всего мебели создано: " + Furniture.getCounter());
    }
}