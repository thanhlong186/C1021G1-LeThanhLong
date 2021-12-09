package ss7_abstractclass_Interface.Bai_tap.hinh_hoc;

public class Rectangle extends Shape {
        public double width;
        public double height;

        public Rectangle(){
        }

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    public Rectangle(String color, boolean filled, double width, double height) {
        super(color, filled);
        this.width = width;
        this.height = height;
    }

    public double getWidth() {

            return width;
    }

    public void setWidth(double width) {

            this.width = width;
    }

    public double getHeight() {

            return height;
    }

    public void setHeight(double height) {

            this.height = height;
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "width=" + width + "\t" +
                "height=" + height + " \t" +
                ", color='" + color + '\'' +
                ", filled=" + filled +
                '}';
    }

    @Override
    public void resize(double percent) {
        this.width *= (percent/100);
        this.height *= (percent/100);
    }
}
