import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите уровень сложности: ");
        int rate = scanner.nextInt();
        String rateName = "";

        if (rate >= 4 && rate <= 5 ) {
            rateName = "Прфессионал";
        } else if (2 <= rate && rate <= 3 ) {
            rateName = "Опытный игрок";
        } else if (rate == 1 ) {
            rateName = "любитель";
        } else if (rate == 0) {
            rateName = "Полный чайник";
        } else {
            System.err.print("Неправильно введен уровень игрока!");
            System.exit(-1);
        }
        System.out.println(rateName);
    }

}
