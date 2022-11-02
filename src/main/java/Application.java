import animals.Kotik;

public class Application {
    Kotik kotik1 = new Kotik();
    Kotik kotik2 = new Kotik();
    public static void main(String[] args) {
        Kotik kotik1 = new Kotik("Васька", "Мяу", 7, 9);
        Kotik kotik2 = new Kotik();
        kotik2.setName("Барсик");
        //kotik1.setVoice("Мяу");
        kotik2.setVoice("Мяу");
        kotik2.setSatiety(2);
        kotik2.setWeight(4);
        kotik2.getInfo();

        public static boolean compareVoice(Kotik kotik1, Kotik kotik2){
            if (kotik1.getVoice().equals(kotik2.getVoice())) {
                System.out.println("тру");
                return true;
            }
            return false;
        }
        //System.out.println(kotik1.getVoice().equals(kotik2.getVoice()));


        String[] s = kotik2.liveAnotherDay();
        for (String array : s) {
            System.out.println("=========================");
            System.out.println(array + "/n");
        }
        kotik1.printCountKotiks();
    }
}

