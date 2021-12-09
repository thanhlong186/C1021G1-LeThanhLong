package ss7_abstractclass_Interface.thuc_hanh.Animal;

public class Chicken extends Animal implements Edible {
    @Override
    public String makeSound() {
        return "Chicken: Khong say khong ve anh em!";
    }
    @Override
    public String howToEat() {
        return "could be fried";
    }
}
