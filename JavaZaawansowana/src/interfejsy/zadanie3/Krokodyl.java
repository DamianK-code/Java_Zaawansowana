package interfejsy.zadanie3;

public class Krokodyl implements Jedzacy {


    int iloscZjedzonychPosilkow = 0;
    int iloscGramowZjedzone = 0;

    @Override
    public void jedz(Pokarm pokarm) {
        if (pokarm.typPokarmu == TypPokarmu.MIESO) {
            System.out.println("Krokodyl je " + TypPokarmu.MIESO + ".");
            iloscZjedzonychPosilkow += 1;
            iloscGramowZjedzone += pokarm.waga;
        }

    }

    @Override
    public int ilePosilkowZjedzone() {
        return iloscZjedzonychPosilkow;
    }

    @Override
    public int ileGramowJedzenia() {
        return iloscGramowZjedzone;
    }

    @Override
    public String toString() {
        return "Krokodyl{" +
                "iloscZjedzonychPosilkow = " + iloscZjedzonychPosilkow +
                ", iloscGramowZjedzone = " + iloscGramowZjedzone +
                '}';
    }
}
