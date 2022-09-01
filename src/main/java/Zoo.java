import Animals.*;
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



        Worker worker = new Worker("Bob");
        worker.feed(monkey, grass);
        worker.getVoice(monkey);

//        Swim duck2 = new Duck();
//        Swim fish2 = new Fish();
//        Swim lion2 = new Lion();
//        Swim bear2 = new Bear();

        public static void outputInfo(Swim swim){
            swim.showInfo();
        }
        outputInfo(duck);

        Swim [] pond = {duck, fish, lion, bear};
        for (int i = 0; i < pond.length; i++) {
            pond[i].swim();
        }

    }

}



