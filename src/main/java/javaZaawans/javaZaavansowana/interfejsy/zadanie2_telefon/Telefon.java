package javaZaawans.javaZaavansowana.interfejsy.zadanie2_telefon;

import java.util.Random;

public class Telefon implements Dzwoni {

    String numerTelefonu;
    int lacznyCzasRozmowy;


    @Override
    public void zadzwon(String numerTelefonu) {
        Random random = new Random();
        int czasRozmowy = 0;
        if (random.nextInt(10) > 1) {
            System.out.println("Dzwonie pod numer: " + numerTelefonu);
            lacznyCzasRozmowy += random.nextInt(60) + 1;
            czasRozmowy += lacznyCzasRozmowy;
            System.out.println("Czas romowy to: " + czasRozmowy + " minut.");
        } else {
            System.out.println("Błąd połączenia");
        }

    }

    @Override
    public void zadzwonNaNumerAlarmowy() {
        zadzwon(Dzwoni.numerAlarmowy);
    }

}
