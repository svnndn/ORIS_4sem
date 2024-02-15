package second;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Human {
    @Autowired
    private FoodProvider foodProvider;

    public Human() {
        System.out.println("HUMAN INIT");
    }

    public void eat() {
        System.out.println("Человек хочет есть.");
        foodProvider.provideFood();
    }
}