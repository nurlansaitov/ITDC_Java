import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print(sing(scanner.nextInt()));

    }
    static int sing(int x){
        int result;
        if (x > 0) {
            result = 1;
        } else if (x < 0){
            result = -1;
        } else {
            result = 0;
        }

        return result;

    }
}
