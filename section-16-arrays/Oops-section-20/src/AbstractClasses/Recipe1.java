package AbstractClasses;

public class Recipe1 extends AbstractRecipe {
    void getReady() {
        System.out.println("Get the raw materials");
    }

    void doTheDish() {
        System.out.println("Cook the dish");
    }

    void cleanup() {
        System.out.println("Clean the utensils");
    }
}
