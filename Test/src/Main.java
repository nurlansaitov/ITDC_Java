public class Main {
    public static void main(String[] args) {
        Circle firstCircle = new Circle();
        System.out.println(" Площадь окружности с радиусом " + firstCircle.radius + " is " + firstCircle.getArea());

        Circle secondCircle = new Circle(25);
        System.out.println(" Площадь окружности с радиусом " + secondCircle.radius + " is " + secondCircle.getArea());

        Circle thirdCircle = new Circle(125);
        System.out.println(" Площадь окружности с радиусом " + thirdCircle.radius + " is " + thirdCircle.getArea());

        secondCircle.setRadius(100);
        System.out.println(" Площадь окружности с радиусом " + secondCircle.radius + " is " + secondCircle.getArea() + " Периметр = " + secondCircle.getPerimeter());
    }
}
