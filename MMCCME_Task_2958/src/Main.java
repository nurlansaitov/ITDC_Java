import java.util.Scanner;

    public class Main {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            int a = scanner.nextInt();
            int b = scanner.nextInt();

//            int resultA = (a - b + a - 1) / a;
//            int resultB = (b - a + b - 1) / b;
//            int result = a * resultA + b * resultB;
            int result = ( a / b * a + b / a * b ) / ( a / b + b / a ) ;

            System.out.println(result);
        }
    }