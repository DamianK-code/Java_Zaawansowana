package javaZaawans.javaZaavansowana.wzorceProjektowe.bridge;

import java.util.List;

public class PiwoZakup implements DrinkZakup{

    @Override
    public Drink kup(List<Dodatki> dodatki) {
        return new Piwo(dodatki);
    }
}
