package AbstractClasses;

public class RecipeRunner {
    public static void main(String[] args) {
        Recipe1 recipe1 = new Recipe1();
        recipe1.execute();

        System.out.println("************");

        RecipeWithMicroWave recipeWithMicroWave = new RecipeWithMicroWave();
        recipeWithMicroWave.execute();
    }
}
