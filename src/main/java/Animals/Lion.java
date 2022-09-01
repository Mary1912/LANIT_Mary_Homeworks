package Animals;

import food.Food;
import food.Meat;

public class Lion extends Cornivorous implements Run,Voice,Swim{

    @Override
    public String setVoice() {
        return "ааааа";
    }

    @Override
    public void run() {
        System.out.println("Лев бежит");

    }

    public String toString() {
        return "Лев";
    }

    @Override
    public void swim() {
        System.out.println(toString() + " плавает в пруду");
    }
}
