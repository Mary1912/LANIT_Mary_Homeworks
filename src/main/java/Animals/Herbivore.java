package Animals;

import food.Food;
import food.Grass;

import java.sql.SQLOutput;

public class Herbivore extends Animal {

    @Override
    public void eat(Food food) {
        if (food instanceof Grass){
            System.out.println("Травоядное ест траву");
        } else {
            System.out.println("Травоядное не ест траву");
        }
    }
}