import java.util.Scanner;

    public class Main {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            int n = scanner.nextInt();
            int m = scanner.nextInt();

            System.out.println(m / n + (m % n + n - 1) / n);

        }
    }