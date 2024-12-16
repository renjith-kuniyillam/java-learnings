package AbstractClasses;

public class RecipeWithMicroWave extends AbstractRecipe {
    void getReady() {
        System.out.println("Get the raw materials");
    }

    void doTheDish() {
        System.out.println("Put in microwave for 5 minutes");
        switchOn();

    }

    void cleanup() {
        switchOff();
        System.out.println("Clean the utensils");
    }

    void switchOff() {
        System.out.println("Switch off the microwave");
    }

    void switchOn() {
        System.out.println("Switch on the microwave");
    }
}
