import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите четырехзначное число? ");
        int number = scanner.nextInt();

        int sum1 = number / 1000;
        int sum2 = (number - 1000 * sum1) / 100;
        int sum3 = (number - 1000 * sum1- 100 * sum2)/ 10;
        int sum4 = number % 10;

        System.out.print("Сумма всех цифр числа " + number + " равна " + (sum1 + sum2 + sum3 + sum4));
    }
}
