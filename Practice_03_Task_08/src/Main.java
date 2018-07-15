import java.util.Scanner;

    public class Main {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Введите номер месяца: ");
            int monthNumber = scanner.nextInt();

            String season = "";
            switch (monthNumber) {
                case 12:
                case 1:
                case 2:
                    season = "Зима";
                    break;
                case 3:
                case 4:
                case 5:
                    season = "Весна";
                    break;
                case 6:
                case 7:
                case 8:
                    season = "Лето";
                    break;
                case 9:
                case 10:
                case 11:
                    season = "Осень";
                    break;
                default:
                    System.err.printf("Номер месяца %d является некоректным.", monthNumber);
                    System.exit(-1);
            }
            System.out.printf(season);
        }
    }