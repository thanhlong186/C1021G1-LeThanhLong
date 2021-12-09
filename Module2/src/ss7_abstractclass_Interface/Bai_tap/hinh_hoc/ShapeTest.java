package ss7_abstractclass_Interface.Bai_tap.hinh_hoc;

public class ShapeTest {
    public static void main(String[] args) {
        Shape[] shapes = new Shape[3];
        shapes[0] = new Square("blue",true, 10);
        shapes[1] = new Circle();
        shapes[2] = new Rectangle("pink",false,10,20);

        System.out.println("Trước khi resize");
        for (Shape shape: shapes){
            System.out.println(shape + "\n");
        }

        System.out.println("Sau khi resize");
        for (Shape shape: shapes){
            shape.resize(Math.random()*100);
            System.out.println(shape+"\n");
        }
    }
}
