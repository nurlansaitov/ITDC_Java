import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        int beg, end;
        beg = number / 100;
        end = number % 100;
        end = end % 10 * 10 + end / 10;

        System.out.println(beg - end + 1);
    }
}