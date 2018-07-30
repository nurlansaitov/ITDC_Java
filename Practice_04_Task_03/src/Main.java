import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int min_chislo = -100;
        int max_chislo = 100;



        System.out.print("Введие количество тестов: ");
        int kol_zadach = scanner.nextInt();
        int rightAnswer = 0;
        int wrongAnswer = 0;
        for (int i = 1; i <= kol_zadach; i++) {
            int a = (int) (min_chislo + Math.random() * (max_chislo - min_chislo + 1));
            int b = (int) (min_chislo + Math.random() * (max_chislo - min_chislo + 1));
            int result = a + b;
            System.out.print(i + ") " + a + " + " + b + " = ");
            int otv = scanner.nextInt();
            if (otv == result) {
                rightAnswer++;
            } else {
                wrongAnswer++;
            }
        }
        System.out.printf("Количество правильных ответов: %d%n" + "Количество неправильных ответов:  %d%n", rightAnswer, wrongAnswer);
    }
}