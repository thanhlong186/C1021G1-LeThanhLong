package ss21_design_patterns.thuc_hanh;


import ss7_abstractclass_Interface.thuc_hanh.Animal.Animal;

public class AnimalFactory {
    public Animals getAnimal(String type) {
        if ("canine".equals(type)) {
            return new Dog();
        } else {
            return new Cat();
        }
    }
}

