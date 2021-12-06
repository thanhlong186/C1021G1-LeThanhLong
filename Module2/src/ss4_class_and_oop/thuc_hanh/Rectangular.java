package ss4_class_and_oop.thuc_hanh;

import java.util.Scanner;

    public class Rectangular {
        double width, height;

        public Rectangular() {
        }
        public Rectangular(double width, double height) {
            this.width = width;
            this.height = height;
        }
        public double getArea(){
            return this.width * this.height;
        }
        public double getPerimeter(){
            return   (this.width +this.height) *2;
        }
        public String display() {
            return "Rectangular{"+"width="+width+",height="+height+"}";
        }
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Enter the width:");
            double width = scanner.nextDouble();
            System.out.print("Enter the height:");
            double height = scanner.nextDouble();
            Rectangular rectangular = new Rectangular(width, height);
            System.out.println("Your Rectangular \n"+ rectangular.display());
            System.out.println("Perimeter of the Rectangular: "+ rectangular.getPerimeter());
            System.out.println("Area of the Rectangular: "+ rectangular.getArea());
        }
    }

