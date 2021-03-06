package javaZaawans.javaZaavansowana.wzorceProjektowe.factory.restauracja;

import java.util.Arrays;

public class Kfc implements Restauracja {
    @Override
    public Burger zamów(BurgerTyp burgerTyp){
        switch(burgerTyp){
            case GRANDER:
                return new Burger.Builder()
                        .withCena(17.0)
                        .withWaga(Waga.G_300)
                        .withSkladniki(Arrays.asList(Skladniki.WOLOWINA,Skladniki.CEBULA, Skladniki.BULKA, Skladniki.OGOREK, Skladniki.SER, Skladniki.SALATE,Skladniki.SOS_MAJONEZOWY))
                        .stwórz();
            case ZINGER:
                return new Burger.Builder()
                        .withCena(10.0)
                        .withWaga(Waga.G_500)
                        .withSkladniki(Arrays.asList(Skladniki.PODWÓJNA_WOŁOWINA,Skladniki.CEBULA, Skladniki.BULKA, Skladniki.OGOREK, Skladniki.SER, Skladniki.SALATE,Skladniki.SOS_ARABSKI))
                        .stwórz();
            case CHEESE_BURGER:
            default:
                System.out.println("Nie serwujemy takiego burgera");
                throw new RuntimeException();
        }
    }
}
