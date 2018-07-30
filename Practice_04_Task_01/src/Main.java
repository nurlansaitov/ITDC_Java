import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = scanner.nextInt();
        int k = 0;
        double sredn = 0;
        while (number != 0) {
            k++;
            sredn += number;
            number = scanner.nextInt();
        }

            System.out.println("Среднее арифметическое " + sredn / k);
            System.out.println("Кол введенных цифр " + k);
    }
}