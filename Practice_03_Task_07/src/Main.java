import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите номер месяца: ");
        int monthNumber = scanner.nextInt();

        if (monthNumber == 12 ||
            monthNumber == 1  ||
            monthNumber == 2) {
            System.out.print("Зима");
        } else if (monthNumber == 3 ||
                   monthNumber == 4  ||
                   monthNumber == 5) {
                   System.out.print("Весна");
        } else if (monthNumber == 6 ||
                   monthNumber == 7  ||
                   monthNumber == 8) {
                   System.out.print("Лето");
        } else if (monthNumber == 9 ||
                   monthNumber == 10  ||
                   monthNumber == 11) {
                   System.out.print("Осень");
        } else     System.err.print("Неправильно введена номер месяца!");
    }
}