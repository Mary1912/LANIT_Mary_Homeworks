package employee;

public class Man implements Info {
    public String name;

    public Man(String name) {
        this.name = name;
    }

    @Override
    public void showInfo() {
        System.out.println("Имя мужчины "+this.name);
    }
}
