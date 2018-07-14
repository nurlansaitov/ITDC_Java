import java.util.Scanner;

    public class Main{
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            int ch1 = scanner.nextInt();
            int min1 = scanner.nextInt();
            int sec1 = scanner.nextInt();
            int ch2 = scanner.nextInt();
            int min2 = scanner.nextInt();
            int sec2 = scanner.nextInt();


            int secund1 = ch1 * 60 * 60 + min1 * 60 + sec1;
            int secund2 = ch2 * 60 * 60 + min2 * 60 + sec2;
            int raznitsa = secund2 - secund1;

            System.out.print(raznitsa);
        }
    }