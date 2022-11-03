package animals;

public class Bear extends Cornivorous implements Run, Voice, Swim {

    public String toString() {
        return "Медведь";
    }

    @Override
    public void canRun() {
        System.out.println("Медведь бежит");
    }

    @Override
    public String makeVoice() {
        return "рычит";
    }


    @Override
    public void canSwim() {
        System.out.println(toString() + " плавает в пруду");
    }
}
