package javaZaawans.javaZaavansowana.wzorceProjektowe.factory.restauracja;

import java.util.Arrays;

public class McDonald implements Restauracja {
    @Override
    public Burger zamów(BurgerTyp burgerTyp){
        switch(burgerTyp){
            case BIG_MAC:
                return new Burger.Builder()
                        .withBurgerTyp(BurgerTyp.BIG_MAC)
                        .withCena(17.0)
                        .withWaga(Waga.G_300)
                        .withSkladniki(Arrays.asList(Skladniki.WOLOWINA,Skladniki.CEBULA, Skladniki.BULKA, Skladniki.OGOREK, Skladniki.SER, Skladniki.SALATE,Skladniki.SOS_MAJONEZOWY))
                        .stwórz();
            case MC_ROYAL:
                return new Burger.Builder()
                        .withBurgerTyp(BurgerTyp.MC_ROYAL)
                        .withCena(10.0)
                        .withWaga(Waga.G_500)
                        .withSkladniki(Arrays.asList(Skladniki.PODWÓJNA_WOŁOWINA,Skladniki.CEBULA, Skladniki.BULKA, Skladniki.OGOREK, Skladniki.SER, Skladniki.SALATE,Skladniki.SOS_ARABSKI))
                        .stwórz();
            case CHEESE_BURGER:
                return new Burger.Builder()
                        .withBurgerTyp(BurgerTyp.CHEESE_BURGER)
                        .withSkladniki(Arrays.asList(Skladniki.PODWÓJNY_SER,Skladniki.BULKA,Skladniki.OGOREK,Skladniki.SOS_MAJONEZOWY))
                        .withWaga(Waga.G_300)
                        .withCena(4.5)
                        .stwórz();
            default:
                System.out.println("Nie serwujemy takiego burgera");
                throw new RuntimeException();
        }
    }
}