package BuilderPattern;

public class BuilderPatternDemo {
    public static void main(String[] args) {
        MealBuilder mealBuilder = new MealBuilder();
        Meal vegMeal = mealBuilder.prepareVegMeal();
        System.out.println("------------------Veg Meal-----------------");
        vegMeal.showItems();
        System.out.println("Total Bill : "+vegMeal.getCost());
        System.out.println();
        System.out.println("--------------------------------------------------");

        Meal nonVegMeal = mealBuilder.prepareNonVegMeal();
        System.out.println("------------------Non Veg Meal-----------------");
        nonVegMeal.showItems();
        System.out.println();
        System.out.println("Total Bill : "+nonVegMeal.getCost());
        System.out.println("--------------------------------------------------");
    }
}