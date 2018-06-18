import java.util.Scanner;

public class Java {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        final int L = 109;
        int v = scanner.nextInt();
        int t = scanner.nextInt();

        int stopKm = (L * (Math.abs(v) * t) + (v * t)) % L;

        System.out.print(stopKm);
 }
}
