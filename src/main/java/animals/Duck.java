package animals;

public class Duck extends Herbivore implements Fly,Swim,Voice {

    public String toString() {
        return "Утка";
    }

    @Override
    public String makeVoice() {
        return "крякает";
    }

    @Override
    public void canFly() {
        System.out.println(toString() + " летит");
    }

    @Override
    public void canSwim() {

        System.out.println(toString() + " плавает в пруду");
    }

}

