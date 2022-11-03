package food;

public class Grass extends Food {

    public String toString (){
        return "траву";
    }
    private int satiety = 1;

    public int getSatiety() {
        return satiety++;
    }
}
