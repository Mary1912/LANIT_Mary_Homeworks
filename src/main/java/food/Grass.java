package food;

public class Grass extends Food {
    public String toString (){
        return "Трава";
    }
    private int satiety = 2;

    public int getSatiety() {
        return satiety++;
    }
}
