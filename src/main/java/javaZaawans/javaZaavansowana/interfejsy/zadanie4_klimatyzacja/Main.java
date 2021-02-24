package javaZaawans.javaZaavansowana.interfejsy.zadanie4_klimatyzacja;

public class Main {
    public static void main(String[] args) {

        Wiatrak wiatrak = new Wiatrak();
        wiatrak.pobierzTemp(12.5);
        wiatrak.schlodz();
        wiatrak.wyswietlTemp();

        Klimatyzacja klimatyzacja = new Klimatyzacja();
        klimatyzacja.pobierzTemp(10);
        klimatyzacja.schlodz();
        klimatyzacja.wyswietlTemp();
        klimatyzacja.zwiekszTemp();
        klimatyzacja.wyswietlTemp();

        Farelka farelka = new Farelka();
        farelka.pobierzTemp(15);
        farelka.zwiekszTemp();
        farelka.wyswietlTemp();
    }
}
