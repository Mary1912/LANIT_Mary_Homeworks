package Animals;

public abstract class Animal {
    public String food;

    public Animal(String food) {
        this.food = food;
    }

    public abstract void eat ();

}
