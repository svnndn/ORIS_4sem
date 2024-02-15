package first;

import org.springframework.stereotype.Component;

@Component
public class TheBestSkatertSamobranka implements FoodProvider {
    public TheBestSkatertSamobranka() {
        System.out.println("THE BEST SKATERT SAMOBRANKA INIT");
    }

    @Override
    public void provideFood() {
        System.out.println("Самая лучшая в мире скатерть самобранка раскладывается.");
        System.out.println("Самая лучшая в мире скатерть самобранка готовит много разных блюд.");
        System.out.println("Блюда раскладываются перед человеком.");
    }
}
