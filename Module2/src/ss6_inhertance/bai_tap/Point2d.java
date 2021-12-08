package ss6_inhertance.bai_tap;

public class Point2d{
    private float x;
    private float y ;

    public Point2d() {
    }
    public Point2d(float x, float y) {
        this.x = x;
        this.y = y;
    }

    public float getX() {

        return x;
    }

    public void setX(float x) {
        this.x = x;
    }

    public float getY() {

        return y;
    }

    public void setY(float y) {

        this.y = y;
    }

    public void setXY(float x, float y) {
        this.x = x;
        this.y = y;
    }
    public float[] getXY() {
        float[] xy = {this.x,this.y};
        return xy;
    }

    @Override
    public String toString() {
        return "Point2d{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }

    public static void main(String[] args) {
        Point2d point2d = new Point2d();
        System.out.println(point2d);
    }
}
