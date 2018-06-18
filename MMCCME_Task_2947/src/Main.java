import java.util.Scanner;

    public class Main {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            int n = scanner.nextInt();


            System.out.print((n / 60 % 24) + " " + (n % 60 % 60));
        }
        }