package animals;

public class Wolf extends Cornivorous implements Run,Voice{

    public String toString() {
        return "Волк";
    }

    @Override
    public String makeVoice() {
        return "воет";
    }

    @Override
    public void canRun() {
        System.out.println(toString() + "бежит");
    }

}
