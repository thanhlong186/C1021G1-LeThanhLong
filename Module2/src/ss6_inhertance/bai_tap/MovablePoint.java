package ss6_inhertance.bai_tap;

public class MovablePoint extends Point {
    public float xSpeed;
    public float ySpeed;

    public MovablePoint() {
    }
    public MovablePoint(float xSpeed, float ySpeed){
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    public MovablePoint(float x, float y, float xSpeed, float ySpeed) {
        super(x, y);
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    public float getxSpeed() {
        return xSpeed;
    }

    public void setxSpeed(float xSpeed) {
        this.xSpeed = xSpeed;
    }

    public float getySpeed() {
        return ySpeed;
    }

    public void setySpeed(float ySpeed) {
        this.ySpeed = ySpeed;
    }
    public void setSpeed(float xSpeed, float ySpeed) {
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }
    public float[] getSpeed(){
        float[] Speed = {this.xSpeed, this.ySpeed};
        return Speed;
    }

    @Override
    public String toString() {
        return "MovablePoint{" +
                "xSpeed=" + xSpeed + "\t" +
                ", ySpeed=" + ySpeed + "\t" +
                "x=" + x + "\t" + "y=" + y + "\t" +
                '}';
    }
    public MovablePoint move(){
        this.setX(this.getX() + this.xSpeed);
        this.setY(this.getY() + this.ySpeed);
        return this;
    }

    public static void main(String[] args) {
        MovablePoint movablePoint = new MovablePoint(5, 10);
        System.out.println(movablePoint);
        MovablePoint movablePoint1 = new MovablePoint(2,4, 6,8);
        System.out.println(movablePoint1);
//        System.out.println(movablePoint1.xSpeed);
        System.out.println(movablePoint1.move());
    }

}
