import java.util.Scanner;

    public class Main {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Введите первое число: ");
            int number1 = scanner.nextInt();
            System.out.print("Введите второе число: ");
            int number2 = scanner.nextInt();
            System.out.print("Введите третье число: ");
            int number3 = scanner.nextInt();

            if (number1 > number2 && number1 > number3) {
                System.out.printf("Значение %d является максимальным.", number1);
            } else if (number2 > number1 && number2 > number3) {
                System.out.printf("Значение %d является максимальным.", number2);
            } else {
                System.out.printf("Значение %d является максимальным.", number3);
            }


        }
    }