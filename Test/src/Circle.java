public class Circle {

    double radius;

    Circle() {
        radius = 1.0;
    }

    Circle(double newRadius) {
        radius = newRadius;
    }


    void setRadius(double newRadius) {
        radius = newRadius;
    }

    double getArea() {
        return  Math.PI * radius * radius;
    }

    double getPerimeter() {
        return 2.0 * Math.PI * radius;
    }
}
