package javaZaawans.javaZaavansowana.wzorceProjektowe.bridge;

import java.util.List;

public class Szampan implements Drink{


    public Szampan(List<Dodatki> dodatki) {
    }

    @Override
    public String nazwa() {
        return "Szampan";
    }

    @Override
    public int pojemnosc() {
        return 1000;
    }

    @Override
    public double cena() {
        return 30;
    }

    @Override
    public boolean czyJestAlkohol() {
        return true;
    }
}
