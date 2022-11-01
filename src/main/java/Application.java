import animals.Kotik;

public class Application {
    public static void main(String[] args) {
        Kotik kotik = new Kotik("Васька", "Мяу", 9, 7);
        String[] s = kotik.liveAnotherDay();
        for (String array : s) {
            System.out.println("=========================");
            System.out.println(array + "/n");
        }

        Kotik kotik1 = new Kotik("Sonya", "Мяу-мяу", 9, 7);
        Kotik kotik2 = new Kotik();
        kotik2.setName("Barsik");
        kotik2.setWeight(10);
        kotik2.setVoice("Мяу мяу");
        kotik1.eat();

        System.out.println(kotik1.getVoice().equals(kotik2.getVoice()));
        kotik1.getInfo();
        kotik1.liveAnotherDay();
        kotik1.printCountKotiks();
    }
}

