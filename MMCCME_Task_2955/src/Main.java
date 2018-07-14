import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int h = scanner.nextInt();
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int shag;
        int vys;
        vys = h - a;
        shag = a - b;
        int result = 1 + vys / shag + ( vys % shag + shag - 1) / shag;
        System.out.println(result);

    }
}