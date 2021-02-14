package interfejsy.Zadanie4;

public interface Grzeje {
    double aktualnaTemperatura = 0;

    double pobierzTemp(double aktualnaTemperatura);

    void zwiekszTemp();

    void wyswietlTemp();
}
