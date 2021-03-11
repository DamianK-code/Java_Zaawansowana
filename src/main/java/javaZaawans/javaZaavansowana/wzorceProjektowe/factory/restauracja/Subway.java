package javaZaawans.javaZaavansowana.wzorceProjektowe.factory.restauracja;

import java.util.Arrays;

public class Subway implements Restauracja{
    @Override
    public Burger zamów(BurgerTyp burgerTyp) {
        switch (burgerTyp){
            case CHICKEN_BURGER :
                return new Burger.Builder()
                        .withBurgerTyp(BurgerTyp.CHICKEN_BURGER)
                        .withCena(16.50)
                        .withWaga(Waga.G_500)
                        .withSkladniki(Arrays.asList(Skladniki.BULKA,Skladniki.PAPRYKA,Skladniki.KURCZAK,Skladniki.SOS_ARABSKI))
                        .stwórz();
            case WIES_MAC:
                return new Burger.Builder()
                        .withBurgerTyp(BurgerTyp.WIES_MAC)
                        .withCena(24)
                        .withWaga(Waga.G_1000)
                        .withSkladniki(Arrays.asList(Skladniki.BULKA,Skladniki.PODWÓJNA_WOŁOWINA,Skladniki.SER,Skladniki.SALATE,Skladniki.SOS_TKAZIKI))
                        .stwórz();

            default:
                System.out.println("Nie serwujemy takiego burgera");
                throw new RuntimeException();
        }

    }
}
