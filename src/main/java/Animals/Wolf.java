package Animals;

import food.Food;
import food.Meat;

public class Wolf extends Cornivorous implements Run,Voice{

    @Override
    public String setVoice() {
        return "ауууу";
    }

    @Override
    public void run() {
        System.out.println("Волк бежит");
    }

    public String toString() {
        return "Волк";
    }

}
