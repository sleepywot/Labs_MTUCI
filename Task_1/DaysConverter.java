import java.util.Scanner;

public class DaysConverter {

    private static String getForm(int n, String[] forms) {
        n = Math.abs(n);
        if (n % 10 == 1 && n % 100 != 11) return forms[0];
        if (n % 10 >= 2 && n % 10 <= 4 && (n % 100 < 10 || n % 100 >= 20)) return forms[1];
        return forms[2];
    }

    public static String convertDays(int days) {
        int weeks = days / 7;
        int remainingDays = days % 7;
        return weeks + " " + getForm(weeks, new String[]{"неделя", "недели", "недель"}) + " и " +
                remainingDays + " " + getForm(remainingDays, new String[]{"день", "дня", "дней"});
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int days = scanner.nextInt();
        System.out.println(convertDays(days));
        scanner.close();
    }
}