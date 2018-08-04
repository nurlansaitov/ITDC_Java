import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("А = ");
        long a = scanner.nextLong();
        System.out.print("B = ");
        long b = scanner.nextLong();


        try {
            long nod = gcd_eucclid_recursive(a, b);
            System.out.printf("НОД(%d, %d) = %d%n", a, b, nod);
        } catch (IllegalArgumentException e) {
            System.out.printf("НОД(0, 0) не определен, " + e.getMessage());

        }

    }

    public static long gcd(long a, long b) {
        if (a == 0 && b == 0) {
            throw new IllegalArgumentException("Числа не может быть нулем!");
        } else if (a == 0) {
            return b;
        }
        while (b != 0) {
            long temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }


 public  static  long gcd_eucclid_recursive(long a, long b) {
        return b == 0 ? a : gcd_eucclid_recursive(b, a % b);
    }
}