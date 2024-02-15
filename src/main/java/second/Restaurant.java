package second;

import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Lazy
public class Restaurant implements FoodProvider {
    public Restaurant() {
        System.out.println("RESTAURANT INIT");
    }

    @Override
    public void provideFood() {
        System.out.println("Человек приходит в ресторан и делает заказ.");
        System.out.println("Долгое ожидание и еда уже на столе.");
        System.out.println("В кошельке пусто.");
    }
}
