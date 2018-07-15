import java.util.Scanner;

    public class Main {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Введите первое число: ");
            int number1 = scanner.nextInt();
            System.out.print("Введите второе число: ");
            int number2 = scanner.nextInt();

            if (number1 > number2) {
                System.out.printf("Первеое число %d больше второго числа %d.", number1, number2);
            } else {
                System.out.printf("Второе число %d больше или равно первого числа %d.", number2, number1);
            }
        }
    }