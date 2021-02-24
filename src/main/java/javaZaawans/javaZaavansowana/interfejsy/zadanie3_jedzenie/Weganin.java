package javaZaawans.javaZaavansowana.interfejsy.zadanie3_jedzenie;

public class Weganin implements Jedzacy {

    int iloscZjedzonychPosilkow = 0;
    int iloscGramowZjedzone = 0;

    @Override
    public void jedz(Pokarm pokarm) {
        if (pokarm.typPokarmu == TypPokarmu.OWOCE) {
            System.out.println("Weganin je " + TypPokarmu.OWOCE + ".");
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
        return "Weganin{" +
                "iloscZjedzonychPosilkow = " + iloscZjedzonychPosilkow +
                ", iloscGramowZjedzone = " + iloscGramowZjedzone +
                '}';
    }
}
