import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите исходную координату ");
        int a = scanner.nextInt();
        System.out.print("Введите первую точку ");
        int b = scanner.nextInt();
        System.out.print("Введите вторую точку ");
        int c = scanner.nextInt();

        int resFromMethod[] = (abs(a,b,c));
            if (resFromMethod[0] == 1) {
                System.out.println("Первая точка ближе второй. Дистанция равна " + resFromMethod[1]);
            } else {
                System.out.println("Вторая точка ближе первой. Дистанция равна " + resFromMethod[1]);
            }
    }

    public static int[] abs(int ishCoord, int perToch, int vtorToch){

        int raznF, raznS, result, znach;
        if ((perToch - ishCoord) < 0) {
            raznF = ishCoord - perToch;
        } else {
            raznF = perToch - ishCoord;
        }

        if ((vtorToch - ishCoord) < 0) {
            raznS = ishCoord - vtorToch;
        } else {
            raznS = vtorToch - ishCoord;
        }

        if (raznF < raznS) {
            result = raznF;
            znach = 1;
        } else {
            result = raznS;
            znach = 2;
        }
        return new int[] {znach, result};


    }
}