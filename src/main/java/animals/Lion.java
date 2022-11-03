package animals;

public class Lion extends Cornivorous implements Run,Voice,Swim{

    public String toString() {
        return "Лев";
    }

    @Override
    public String makeVoice() {
        return "рычит";
    }

    @Override
    public void canRun() {
        System.out.println(toString() + "бежит");

    }

    @Override
    public void canSwim() {
        System.out.println(toString() + " плавает в пруду");
    }
}
