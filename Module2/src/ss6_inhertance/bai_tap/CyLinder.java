package ss6_inhertance.bai_tap;

public class CyLinder extends Circle {
    public double height;

    public CyLinder() {
    }
    public CyLinder(double height) {
        this.height = height;
     }

    public CyLinder(double radius, String color, double height) {
        super(radius, color);
        this.height = height;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getVolume() {
        return Math.PI*radius*radius*height;
    }


    @Override
    public String toString() {
        return "CyLinder{" +
                "height=" + height +
                ", volume=" +getVolume()+
                '}';
    }
}
