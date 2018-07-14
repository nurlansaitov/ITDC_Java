import java.util.Scanner;

    public class Main{

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            int startMin = 540;
            int numberUrok = scanner.nextInt();
            int kolChetUrok = numberUrok / 2;
            int kolNeChetUrok = numberUrok % 2 + ((numberUrok / 2) * 1);

            int minusChet = 5 * (kolNeChetUrok - kolChetUrok);
            int minusNechet = 15 * ((numberUrok + 1) % 2);
            int dlitVsego = (numberUrok * 45) + (kolChetUrok * 15) + (kolNeChetUrok * 5) - minusChet - minusNechet;
            int chas = (startMin + dlitVsego) / 60;
            int minuty = (startMin + dlitVsego) % 60;

            System.out.println(chas + " " + minuty);

        }
    }