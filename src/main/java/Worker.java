import animals.Animal;
import animals.Voice;
import food.Food;

public class Worker {
    private String name;

    public Worker(String name) {
        this.name = name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void feed (Animal аnimal, Food food){

        аnimal.eat(food);
    }

    public void getVoice(Voice animal){

        System.out.println(animal.toString() + " " + animal.makeVoice());
    }
}
