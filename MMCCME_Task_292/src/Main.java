import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();

        if (a <= b) {
            System.out.println(b);
        } else {
            System.out.println(a);
        }
    }
}
