package javaZaawans.javaZaavansowana.wzorceProjektowe.restauracja;

public interface Restauracja {

    /**
     * Pozwala zamówić burgera określonego typu
     * @param burgerTyp typ burgera
     * @return zwraca nam konkretnego burgera
     */
    Burger zamów(BurgerTyp burgerTyp);
}
