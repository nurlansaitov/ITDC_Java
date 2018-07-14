import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите значение старооны a: ");
        int storonaA = scanner.nextInt();
        System.out.print("Введите значение старооны b: ");
        int storonaB = scanner.nextInt();
        System.out.print("Введите значение старооны c: ");
        int storonaC = scanner.nextInt();


        int result = storonaA * storonaB * storonaC;
        System.out.println("Первый вариант: Объем параллелепипеда (" + storonaA + "*" + storonaB + "*" + storonaC + ") равен " + result);
        System.out.printf("Второй вариант: Объем параллелепипеда (%d*%d*%d) равен %d\n", storonaA, storonaB, storonaC, result);
    }
}