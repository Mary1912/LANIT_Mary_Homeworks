package animals;

public class Fish extends Herbivore implements Swim{

    public String toString() {
        return "Рыба";
    }

    @Override
    public void canSwim() {
        System.out.println(toString() + " плавает в пруду");
    }


}
