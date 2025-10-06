import java.util.Scanner;

public class Main {

    public static int toFahrenheit(int celsius) {
        return celsius * 9 / 5 + 32;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int celsius = scanner.nextInt();
        int result = toFahrenheit(celsius);
        System.out.println(result);
        scanner.close();
    }
}