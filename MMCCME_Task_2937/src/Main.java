import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();

        System.out.printf("The next number for the number %d is %d.\nThe previous number for the number %d is %d.", a, a + 1, a, a - 1);

    }
}
