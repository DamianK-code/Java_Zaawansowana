package javaZaawans.javaZaavansowana.wzorceProjektowe.bridge;

import java.util.List;

public class HerbataZakup implements DrinkZakup{

    @Override
    public Drink kup(List<Dodatki> dodatki) {
        return new Herbata(dodatki);
    }
}
