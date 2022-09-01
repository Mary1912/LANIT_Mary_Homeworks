package Animals;

import food.Food;
import food.Meat;

public class Bear extends Cornivorous implements Run, Voice, Swim {

    public String toString() {
        return "Медведь";
    }

    @Override
    public void run() {
        System.out.println("Медведь бежит");
    }

    @Override
    public String setVoice() {
        return "Ууууу";
    }


    @Override
    public void swim() {
        System.out.println(toString() + " плавает в пруду");
    }
}
