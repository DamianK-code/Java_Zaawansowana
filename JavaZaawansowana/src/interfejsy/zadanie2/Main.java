package interfejsy.zadanie2;

public class Main {
    public static void main(String[] args) {

        Telefon[] kontakty = new Telefon[50];
        for (int i = 0; i < kontakty.length; i++) {
            kontakty[i] = new Telefon();
        }
        for (Telefon telefon : kontakty){
            telefon.zadzwon("123 654 741");
        }
        System.out.println("<--------------------------------------------------------------->");
        System.out.println("Dzwonie na numery alarmowe: ");
        for (Telefon telefon : kontakty) {
            telefon.zadzwonNaNumerAlarmowy();
        }

    }


}
