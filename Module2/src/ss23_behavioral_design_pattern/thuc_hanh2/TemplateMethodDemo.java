package ss23_behavioral_design_pattern.thuc_hanh2;

public class TemplateMethodDemo {
    public static void main(String[] args) {
        Meal meal1 = new HamburgerMeal();
        meal1.doMeal();

        System.out.println();

        Meal meal2 = new TacoMeal();
        meal2.doMeal();
    }
}
