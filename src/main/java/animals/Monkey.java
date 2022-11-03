package animals;

public class Monkey extends Herbivore implements Run,Voice{

    public String toString() {
        return "Обезьяна";
    }

    @Override
    public String makeVoice() {
        return "хихикает";
    }

    @Override
    public void canRun() {
        System.out.println(toString() + "бегает");
    }

}
