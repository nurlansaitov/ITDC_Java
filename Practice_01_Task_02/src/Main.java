public class Main {
    public static void main(String[] args) {

        System.out.println("**************");
        System.out.println("*Привет, Мир!*");
        System.out.println("**************");

        // В этом решение есть лишние вызовы операционной системе
        System.out.println("**************\n*Привет, Мир!*\n**************");
        System.out.println(
                "**************\n"+
                "*Привет, Мир!*\n"+
                "**************"
        );
    }
}
