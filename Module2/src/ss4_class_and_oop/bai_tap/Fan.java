package ss4_class_and_oop.bai_tap;

import java.util.Scanner;

public class Fan {
    private final int SLOW = 1;
    private final int MEDIUM = 2;
    private final int FAST = 3;
    private int speed = 1;
    private double radius = 5;
    private boolean on = false;
    private String color = "blue";

    public int getSLOW() {
        return SLOW;
    }

    public int getMEDIUM() {
        return MEDIUM;
    }

    public int getFAST() {
        return FAST;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public int getSpeed() {
        return speed;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public boolean isOn() {
        return on;
    }

    public void setOn(boolean on) {
        this.on = on;
    }

    public Fan() {
    }

    public Fan(int speed, boolean on, String color, double radius) {
        this.speed = speed;
        this.color = color;
        this.radius = radius;
        this.on = on;
    }

    public String toString() {
        String status = " ";
        if (this.isOn()) {
            status += ("Fan is on: \n ");
            status += ("speed:" + this.speed + "\n");
        } else {
            status += ("Fan is off \n");
        }
        status += ("Color: " + this.color + "\n");
        status += ("Radius: " + this.radius + "\n");
        return status;
    }

    public static void main(String[] args) {
        Fan fan_1 = new Fan(3, true, "yellow", 10);
        System.out.println(fan_1.toString());
        Fan fan_2 = new Fan(5, false, "blue", 5);
        System.out.println(fan_2.toString());
    }
}



