import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int kolMalch = scanner.nextInt();

        int kolYablok = scanner.nextInt();

        System.out.print(kolYablok/kolMalch);
    }

}