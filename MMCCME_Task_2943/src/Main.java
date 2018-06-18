import java.util.Scanner;

    public class Main {
        public static void main(String[] args) {
            Scanner  scanner = new Scanner(System.in);
            int a = scanner.nextInt();

            System.out.print((a % 100 - a % 10) / 10);

        }
    }
