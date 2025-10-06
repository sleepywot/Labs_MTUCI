import java.util.Scanner;

public class RectangleArea {

    public static double rectangleArea(double length, double width) {
        return length * width;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double length = scanner.nextDouble();
        double width = scanner.nextDouble();

        double result = rectangleArea(length, width);

        if (result == (int)result) {
            System.out.println((int)result);
        } else {
            System.out.println(result);
        }

        scanner.close();
    }
}