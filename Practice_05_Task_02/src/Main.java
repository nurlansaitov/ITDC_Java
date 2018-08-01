
import java.util.Scanner;

    public class Main {

        public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите год: ");
        int year = scanner.nextInt();
        System.out.print("Введите номер месяца: ");
        int month = scanner.nextInt();

        System.out.println(getDaysOfMonth(year, month));
        }

        public static int getDaysOfMonth(int year, int month) {
            int days;
            switch (month) {
                case 1:
                case 3:
                case 5:
                case 7:
                case 8:
                case 10:
                case 12:
                    days = 31;
                    break;
                case 2:
                    if (isLeapYear(year) == 1) {
                        days = 29;
                    } else {
                        days = 28;
                    }
                    break;
                case 4:
                case 6:
                case 9:
                case 11:
                    days = 30;
                    break;

                default:
                    days = 0;
                    break;
            }
            return days;


        }



        public static int isLeapYear(int year) {
            int lispY;
            if (year % 400 == 0) {
                lispY = 1;
            } else if (year % 100 == 0) {
                lispY = 0;
            } else if (year % 4 == 0) {
                lispY = 1;
            } else lispY = 2;

            return lispY;
        }
    }
//год, номер которого кратен 400, — високосный;
//остальные годы, номер которых кратен 100, — невисокосные;
//остальные годы, номер которых кратен 4, — високосные.