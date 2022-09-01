package Animals;

import food.Food;
import food.Meat;

public class Monkey extends Herbivore implements Run,Voice{

    @Override
    public String setVoice() {
        return "хи хи";
    }

    @Override
    public void run() {
        System.out.println("Обезьяна бегает");
    }

    public String toString() {
        return "Обезьяна";
    }

}
