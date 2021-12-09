package ss7_abstractclass_Interface.Bai_tap.hinh_hoc;

import com.sun.javafx.geom.ShapePair;

public class Square extends Shape {
    public double side = 1.0;

    public Square() {
    }

    public Square(double side) {
        this.side = side;
    }

    public Square(String color, boolean filled, double side) {
        super(color, filled);
        this.side = side;
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }

    @Override
    public String toString() {
        return "Square{" +
                "color='" + color + '\'' +
                ", filled=" + filled +
                ", side=" + this.side;
    }

    @Override
    public void resize(double percent) {
        this.side *= (percent/100);
    }
}
