package ss6_inhertance.bai_tap;

public class CircleTest {
    public static void main(String[] args) {
        Circle circle = new Circle(5,"red");
        System.out.println(circle);

        System.out.println("color:" + circle.getColor());
        System.out.println("Area: " + circle.getArea());
    }

}
