package ss7_abstractclass_Interface.Bai_tap.hinh_hoc2;

public class Circle1 extends Shape1 {
    public double radius = 1.0;

    public Circle1() {
    }

    public Circle1(double radius) {
        this.radius = radius;
    }

    public Circle1(double radius, String color, boolean filled) {
        super(color, filled);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }


    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                ", color='" + color + '\'' +
                ", filled=" + filled +
                '}';
    }

//    @Override
//    public String howToColor() {
//        return "Color all four sides";
//    }
}

