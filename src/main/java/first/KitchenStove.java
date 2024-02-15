package first;

import org.springframework.stereotype.Component;

@Component
public class KitchenStove implements FoodProvider{
    public KitchenStove() {
        System.out.println("KITCHEN STOVE INIT");
    }
    @Override
    public void provideFood() {
        System.out.println("Плита не может сама готовить, придется человеку потрудиться.");
        System.out.println("Человек долго готовит, пачкает всю посуду на кухне, устает как собака.");
        System.out.println("Еда готова.");
    }
}
