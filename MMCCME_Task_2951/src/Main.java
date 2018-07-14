import java.util.Scanner;

    public class Main {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            int a = scanner.nextInt();
            Scanner scanner2 = new Scanner(System.in);
            int b = scanner.nextInt();
            Scanner scanner3 = new Scanner(System.in);
            int n = scanner.nextInt();

            int vsegoB = (a * 100 + b) * n;
            int som = vsegoB / 100;
            int tiyin = vsegoB % 100;


            System.out.println(som + " " + tiyin);
        }
    }