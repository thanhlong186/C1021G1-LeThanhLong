package ss6_inhertance.bai_tap;
import ss6_inhertance.thuc_hanh.Shape;
public class Triangle extends Shape {
    public double side1;
    public double side2;
    public double side3;


    public Triangle() {
    }

    public Triangle(double side1, double side2, double side3) {
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;

    }

    public Triangle(String color, boolean filled, double side1, double side2, double side3) {
        super(color, filled);
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    public double getSide1() {
        return side1;
    }

    public void setSide1(double side1) {
        this.side1 = side1;
    }

    public double getSide2() {
        return side2;
    }

    public void setSide2(double side2) {
        this.side2 = side2;
    }

    public double getSide3() {
        return side3;
    }

    public void setSide3(double side3) {
        this.side3 = side3;
    }

    public double getArea(){
        double p = this.getPerimeter()/2;
        return Math.sqrt(p*(p-this.side1)*(p-this.side2)*(p-this.side3));
    }
    public double getPerimeter() {
        return side1 + side2 + side3;
    }

    @Override
    public String toString() {
        return "Triangle{" +
                "side1=" + side1 + "\t" +
                ", side2=" + side2 + "\t" +
                ", side3=" + side3 + "\t" +
                "area=" + getArea() + "\t" +
                "Perimeter=" + getPerimeter() + "\t" +
                '}';
    }

    public static void main(String[] args) {
        Triangle triangle = new Triangle(7, 14, 10);
        System.out.println("Area is: " + triangle.getArea());
        System.out.println("Perimeter is: " + triangle.getPerimeter());
    }
}
