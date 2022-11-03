package animals;

import food.Food;
import food.Meat;

public class Cornivorous extends Animal {

    public String toString() {
      return "Хищник";
    }

    @Override
    public void eat(Food food) {
        if (food instanceof Meat){
            System.out.println(toString() + " ест мясо");
            System.out.println("Степень сытости: "+((Meat)food).getSatiety());
        } else {
            System.out.println(toString() + " не ест траву");
        }
    }
}
