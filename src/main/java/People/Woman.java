package People;

public class Woman implements Info {
    public String name;

    public Woman(String name) {
        this.name = name;
    }

    @Override
    public void showInfo() {
        System.out.println("Имя женщины "+this.name);
    }
}
