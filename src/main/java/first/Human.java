package first;

public class Human {

    private final FoodProvider foodProvider;

    public Human(FoodProvider foodProvider) {
        System.out.println("HUMAN INIT");
        this.foodProvider = foodProvider;
    }

    public void eat() {
        System.out.println("Человек хочет есть.");
        this.getFoodProvider().provideFood();
    }

    public FoodProvider getFoodProvider() {
        return foodProvider;
    }
}