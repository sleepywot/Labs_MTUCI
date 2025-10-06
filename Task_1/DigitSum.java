import java.util.Scanner;

public class DigitSum {

    public static int digitSum(int number) {
        int sum = 0;
        int n = Math.abs(number);
        while (n > 0) {
            sum += n % 10;
            n /= 10;
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        int result = digitSum(number);
        System.out.println(result);
        scanner.close();
    }
}