import java.util.Scanner;

    public class Main {
        public static void main(String[] args){
            Scanner scanner = new Scanner(System.in);
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            int result_a = a + b;
            a = result_a - a;
            b = result_a - b;
            System.out.print(a + " " + b);

        }
    }