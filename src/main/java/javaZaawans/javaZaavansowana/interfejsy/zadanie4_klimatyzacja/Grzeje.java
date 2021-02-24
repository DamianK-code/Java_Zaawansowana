package javaZaawans.javaZaavansowana.interfejsy.zadanie4_klimatyzacja;

public interface Grzeje {
    double aktualnaTemperatura = 0;

    double pobierzTemp(double aktualnaTemperatura);

    void zwiekszTemp();

    void wyswietlTemp();
}
