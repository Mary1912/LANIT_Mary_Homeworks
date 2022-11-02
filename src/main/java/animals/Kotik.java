package animals;

import java.util.HashMap;
import java.util.Map;

public class Kotik {
    private String name, voice;
    private int satiety, weight;
    private String food = "fish";

    private static int count = 0;
    private static final int METHODS = 5;

    public Kotik() {
        count++;
    }

    public Kotik(String name, String voice, int satiety, int weight) {
        this.name = name;
        this.voice = voice;
        this.satiety = satiety;
        this.weight = weight;
        count++;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getWeight() {
        return weight;
    }

    public void setVoice(String name) {
        this.voice = voice;
    }

    public String getVoice() {
        return voice;
    }

    public void setFood(String food) {
        this.food = food;
    }

    public String getFood() {
        return food;
    }

    public void setSatiety(int satiety) {
        this.satiety = satiety;
    }

    public int getSatiety() {
        return satiety;
    }

    public void getInfo() {
        System.out.println("Hello! My name is " + name + " , my weight is " + weight);
    }

    public void printCountKotiks() {
        System.out.println("Количество котиков: " + count);
    }

    public void eat() {
        System.out.println(name + " хочет есть");
        eat(satiety, food);
    }

    public void eat(int satiety) {
        this.satiety = satiety;
        System.out.println("Степень сытости " + name + " равна " + satiety);
        this.satiety++;
    }

    public void eat(int satiety, String food) {
        this.satiety = satiety;
        this.food = food;
        System.out.println("Степень сытости " + name + " равна " + satiety + ", он ест " + food);
        this.satiety = satiety + 5;
    }

    boolean play() {
        if (satiety <= 0) {
            eat();
            return false;
        } else {
            System.out.println(name + " играет");
            satiety--;
        }
        return true;
    }

    boolean sleep() {
        if (satiety <= 0) {
            eat();
            return false;
        } else {
            System.out.println(name + " спит");
            satiety--;
        }
        return true;
    }

    boolean hunt() {
        if (satiety <= 0) {
            eat();
            return false;
        } else {
            System.out.println(name + " охотится");
            satiety--;
        }
        return true;
    }

    boolean wash() {
        if (satiety <= 0) {
            eat();
            return false;
        } else {
            System.out.println(name + " умывается");
            satiety--;
        }
        return true;
    }

    boolean walk() {
        if (satiety <= 0) {
            eat();
            return false;
        } else {
            System.out.println(name + " гуляет");
            satiety--;
        }
        return true;
    }

    public String[] liveAnotherDay() {
        int rnd;
        Map<Integer, String> list = new HashMap<>();

        for (int i = 0; i < 24; i++) {
            rnd = (int) (Math.random() * METHODS + 1);
            switch (rnd) {
                case 1:
                    play();
                    list.put(i, "играет");
                    break;
                case 2:
                    sleep();
                    list.put(i, "спит");
                    break;
                case 3:
                    hunt();
                    list.put(i, "охотится");
                    break;
                case 4:
                    wash();
                    list.put(i, "умывается");
                    break;
                case 5:
                    walk();
                    list.put(i, "гуляет");
                    break;
            }
        }
        return new String[] {list.toString()};
    }
}


















