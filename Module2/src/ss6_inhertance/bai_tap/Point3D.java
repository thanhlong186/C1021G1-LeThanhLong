package ss6_inhertance.bai_tap;

public class Point3D extends Point2d {
    private float z ;

    public Point3D() {
    }

    public Point3D(float x, float y, float z) {
        super(x, y);
        this.z = z;
    }

    public float getZ() {
        return z;
    }

    public void setZ(float z) {
        this.z = z;
    }

    public void setXYZ(float x, float y, float z) {
        super.getXY();
        this.z = z;
    }
    public float[] getXYZ() {
        float[] xyz = {this.getX(),this.getY(), this.z};
        return xyz;
    }

    @Override
    public String toString() {
        return "Point3D " + super.getX() + "\t" + super.getY() + "\t" + getZ();
    }

    public static void main(String[] args) {
        Point3D point3D = new Point3D(4, 5 ,7);
        System.out.println(point3D);
    }
}
