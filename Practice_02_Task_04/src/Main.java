import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        final double SM_IN_INCH = 2.54;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите значение в дюймах? ");
        double inch = scanner.nextDouble();

        double sm = inch * SM_IN_INCH;
        System.out.printf("%.2f дюйм. = %.2f см.\n", inch, sm);
    }

}
