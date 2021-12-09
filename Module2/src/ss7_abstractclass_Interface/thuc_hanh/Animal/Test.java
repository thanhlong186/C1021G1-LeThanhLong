package ss7_abstractclass_Interface.thuc_hanh.Animal;

public class Test {
    public static void main(String[] args) {
        Animal[] animals = new Animal[2];
        animals[0] = new Tiger();
        animals[1] = new Chicken();
        Fruit[] fruits = new Fruit[2];
        fruits[0] = new Orange();
        fruits[1] = new Apple();
        for (Fruit fruit : fruits) {
            System.out.println(fruit.howToEat());
        }
        for (Animal animal : animals) {
            System.out.println(animal.makeSound());

            if (animal instanceof Edible) {
                Edible edibler = (Chicken) animal;
                System.out.println(edibler.howToEat());
//                ((Edible) animal).howToEat();
            }

        }
    }
    }