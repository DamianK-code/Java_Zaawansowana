package javaZaawans.javaZaavansowana.wzorceProjektowe.command;

import javaZaawans.javaZaavansowana.wzorceProjektowe.chainOfResponsibility.Produkt;

import java.util.ArrayList;
import java.util.List;

public class SpecjalnyKoszykProduktów implements PrzyciskKoszyka{
    private List<Produkt> koszyk =  new ArrayList<>();
    @Override
    public void dodaj(Produkt produkt) {
        System.out.println("Do każdego produktu dodajemy ładowarke w gratisie");
        koszyk.add(produkt);
        koszyk.add(Produkt.LADOWARKA);
    }
    @Override
    public void usun(Produkt produkt) {
        koszyk.remove(produkt);
        koszyk.remove(Produkt.LADOWARKA);
    }
    public List<Produkt> getKoszyk() {
        System.out.println("Nasz koszyk specjalnych produktów to: ");
        return koszyk;
    }
}
