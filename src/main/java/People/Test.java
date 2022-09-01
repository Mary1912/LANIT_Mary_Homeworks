package People;

public class Test {
    public static void main(String[] args) {
        Man man1 = new Man("Ben");
        Woman woman1 = new Woman("Jane");
        outputInfo(man1);
        outputInfo(woman1);
    }

    public static void outputInfo (Info info) {
        info.showInfo();

    }
}
