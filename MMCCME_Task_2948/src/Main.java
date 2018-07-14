import java.util.Scanner;

    public class Main {
        public static void main(String[] args) {
            System.out.printf("%d:%02d:%02d",
                    n / hs % 24,
                    (((n - hs*(n / hs))) / ms) % 60,
                    n - (hs * (n / hs)) - (ms * ((n - hs * (n / hs)) / ms))
                    );

        }
    }