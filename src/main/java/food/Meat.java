package food;

public class Meat extends Food {

    public String toString (){
        return "мясо";
    }
    private int satiety = 2;

    public int getSatiety() {
        return satiety++;
    }
}
