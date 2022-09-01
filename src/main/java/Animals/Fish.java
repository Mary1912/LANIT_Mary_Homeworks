package Animals;

import food.Food;
import food.Meat;

public class Fish extends Herbivore implements Swim{
    @Override
    public void swim() {
        System.out.println(toString() + " плавает в пруду");
    }
    public String toString() {
        return "Рыба";
    }


}
