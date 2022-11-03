import animals.*;
import food.Food;
import food.Grass;
import food.Meat;

public class Zoo {


    public static void main(String[] args) {
        Bear bear = new Bear();
        Duck duck = new Duck();
        Fish fish = new Fish();
        Lion lion = new Lion();
        Monkey monkey = new Monkey();
        Wolf wolf = new Wolf();

        Food food = new Food();
        Grass grass = new Grass();
        Meat meat = new Meat();



        Worker worker = new Worker("Вася");
        System.out.println(worker.getName() + " работник зоопарка, он кормит животных");
        worker.feed(monkey, grass);
        worker.getVoice(monkey);

        Swim duck2 = new Duck();
        Swim fish2 = new Fish();
        Swim lion2 = new Lion();
        Swim bear2 = new Bear();

        Swim [] pond = {duck2, fish2, lion2, bear2};
        for (int i = 0; i < pond.length; i++) {
            pond[i].canSwim();
        }

    }

}



