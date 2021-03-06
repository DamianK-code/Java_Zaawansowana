package javaZaawans.javaZaavansowana.wzorceProjektowe.command;

import javaZaawans.javaZaavansowana.wzorceProjektowe.chainOfResponsibility.Produkt;

public interface PrzyciskKoszyka {
    void dodaj(Produkt produkt);
    void usun(Produkt produkt);
}
