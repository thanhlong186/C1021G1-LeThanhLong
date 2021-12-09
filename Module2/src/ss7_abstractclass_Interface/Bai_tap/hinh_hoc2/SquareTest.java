package ss7_abstractclass_Interface.Bai_tap.hinh_hoc2;

public class SquareTest {
    public static void main(String[] args) {
        Shape1[] shape1 = new Shape1[3];
        shape1[0] = new Circle1(10,"black", true);
        System.out.println(shape1[0].toString());
        shape1[1] = new Square1("gray",false, 20);
        System.out.println(shape1[1].toString());
        shape1[2] = new Rectangle1("white", true, 20, 40);
        System.out.println(shape1[2].toString());

        System.out.println(((Square1) shape1[1]).howToColor());
            }
        }
        
