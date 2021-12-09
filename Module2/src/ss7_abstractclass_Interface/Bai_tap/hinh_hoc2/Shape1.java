package ss7_abstractclass_Interface.Bai_tap.hinh_hoc2;

public class Shape1 {
    public String color;
    public boolean filled;

    public Shape1() {
    }

    public Shape1(String color, boolean filled) {
        this.color = color;
        this.filled = filled;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isFilled() {
        return filled;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "color='" + color + '\'' +
                ", filled=" + filled +
                '}';
    }
}
