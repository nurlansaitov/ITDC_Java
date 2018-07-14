import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();

        int a1, a2;
        a1 = n % m;
        a2 = m % n;
        int result = a1 * a2 + 1;

        System.out.println(result);
    }
}