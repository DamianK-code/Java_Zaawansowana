package javaZaawans.javaZaavansowana.interfejsy.zadanie3_jedzenie;

public class Programista implements Jedzacy {


    int iloscZjedzonychPosilkow = 0;
    int iloscGramowZjedzone = 0;

    @Override
    public void jedz(Pokarm pokarm) {
        System.out.println("Programista je wszystko.");
        iloscZjedzonychPosilkow += 1;
        iloscGramowZjedzone += pokarm.waga;

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
        return "Programista{" +
                "iloscZjedzonychPosilkow = " + iloscZjedzonychPosilkow +
                ", iloscGramowZjedzone = " + iloscGramowZjedzone +
                '}';
    }
}
