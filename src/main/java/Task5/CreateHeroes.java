package Task5;

import java.util.ArrayList;
import java.util.List;

public class CreateHeroes {

    List heroes = new ArrayList();


    public void addHeroes(Character hero) {
        heroes.add(hero);
        hero.feature();
    }
}