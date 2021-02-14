package interfejsy.zadanie3;

public class Main {

    public static void main(String[] args) {


        Krokodyl krokodyl = new Krokodyl();
        Weganin weganin = new Weganin();
        Programista programista = new Programista();

        Jedzacy[] szamacze = new Jedzacy[]{krokodyl, weganin, programista};

        for (int i = 0; i < szamacze.length; i++) {
            szamacze[i].jedz(new Pokarm("Kurczak", TypPokarmu.MIESO,120));
            szamacze[i].jedz(new Pokarm("Jabło", TypPokarmu.OWOCE,90));
            szamacze[i].jedz(new Pokarm("Ser biały", TypPokarmu.NABIAL,45));
        }

        int maxPosilkow = 0;
        int indeksMaxPosilkow = -1;
        for (int i = 0; i < szamacze.length; i++) {
            if (szamacze[i].ilePosilkowZjedzone() > maxPosilkow) {
                maxPosilkow = szamacze[i].ilePosilkowZjedzone();
                indeksMaxPosilkow = i;
            }
        }
        System.out.println("Najwięcej posiłków zjadł: " + szamacze[indeksMaxPosilkow] + ".");
        int maxGramow = 0;
        int indeksMaxGramow = -1;
        for (int i = 0; i < szamacze.length; i++) {
            if (szamacze[i].ileGramowJedzenia() > maxGramow) {
                maxGramow = szamacze[i].ileGramowJedzenia();
                indeksMaxGramow = i;
            }
        }
        System.out.println("Najwięcej gramow zjadł: " + szamacze[indeksMaxGramow] + ".");
    }
}
