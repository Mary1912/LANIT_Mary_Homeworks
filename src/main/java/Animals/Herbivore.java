package Animals;

import food.Food;
import food.Grass;

import java.sql.SQLOutput;

public abstract class Herbivore extends Animal {

    public String toString() {
        return "Травоядное";
    }

    @Override
    public void eat(Food food) {
        if (food instanceof Grass){
            System.out.println(toString() + " ест траву");
            System.out.println("Степень сытости: "+((Grass)food).getSatiety());
        } else {
            System.out.println(toString() + " не ест мясо");
        }
    }
}