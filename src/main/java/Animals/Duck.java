package Animals;

import food.Food;
import food.Meat;

public class Duck extends Herbivore implements Fly,Swim,Voice {

    public String toString() {
        return "Утка";
    }

    @Override
    public String setVoice() {
        return "кря кря";
    }

    @Override
    public void fly() {
        System.out.println("Утка летает");
    }

    @Override
    public void swim() {

        System.out.println(toString() + " плавает в пруду");
    }

}

