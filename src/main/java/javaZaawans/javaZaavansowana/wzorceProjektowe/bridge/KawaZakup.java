package javaZaawans.javaZaavansowana.wzorceProjektowe.bridge;

import java.util.List;

public class KawaZakup implements DrinkZakup{

    @Override
    public Drink kup(List<Dodatki> dodatki) {
        return new Kawa(dodatki);
    }
}
