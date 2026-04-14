interface MealPlan {}

class VegetarianMeal implements MealPlan {}
class VeganMeal implements MealPlan {}

class Meal<T extends MealPlan> {
    T plan;

    Meal(T plan) {
        this.plan = plan;
    }
}

class MealGenerator {
    public static <T extends MealPlan> void generateMeal(T plan) {
        System.out.println("Generated: " + plan.getClass().getSimpleName());
    }
}