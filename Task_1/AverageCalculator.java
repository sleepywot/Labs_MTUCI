import java.util.Scanner;

public class AverageCalculator {


    public static double average(int a, int b, int c) {
        return (a + b + c) / 3.0;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();

        double result = average(a, b, c);

        if (result == (int)result) {
            System.out.println((int)result);
        } else {
            System.out.println(result);
        }

        scanner.close();
    }
}