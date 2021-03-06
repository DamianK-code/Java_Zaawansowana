package javaZaawans.javaZaavansowana.wzorceProjektowe.command;

import javaZaawans.javaZaavansowana.wzorceProjektowe.chainOfResponsibility.Produkt;

public class CommandUzycie {
    public static void main(String[] args) {
        KoszykProduktów koszykProduktów =  new KoszykProduktów();
        SpecjalnyKoszykProduktów specjalnyKoszyk = new SpecjalnyKoszykProduktów();
        koszykProduktów.dodaj(Produkt.IPHONE);
        koszykProduktów.dodaj(Produkt.TABLET);
//        System.out.println(koszykProduktów.getKoszyk());
        koszykProduktów.usun(Produkt.IPHONE);
//        System.out.println(koszykProduktów.getKoszyk());
        specjalnyKoszyk.dodaj(Produkt.LAPTOP_GAMINOWY);
        System.out.println(specjalnyKoszyk.getKoszyk());
    }
}
