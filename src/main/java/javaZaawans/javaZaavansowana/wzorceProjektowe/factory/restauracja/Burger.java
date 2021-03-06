package javaZaawans.javaZaavansowana.wzorceProjektowe.factory.restauracja;

import java.util.List;

public class Burger {
    private BurgerTyp BurgerTyp;
    private List<Skladniki> skladniki;
    private double cena;
    private Waga waga;

    private Burger(BurgerTyp BurgerTyp,List<Skladniki> skladniki, double cena, Waga waga) {
        this.BurgerTyp = BurgerTyp;
        this.skladniki = skladniki;
        this.cena = cena;
        this.waga = waga;
    }

    public BurgerTyp getBurgerTyp() {
        return BurgerTyp;
    }

    public List<Skladniki> getSkladniki() {
        return skladniki;
    }

    public double getCena() {
        return cena;
    }

    public Waga getWaga() {
        return waga;
    }

    @Override
    public String toString() {
        return "BurgerTyp='" + BurgerTyp + '\'' +
                ", skladniki=" + skladniki +
                ", cena=" + cena +
                ", waga=" + waga +
                '}';
    }

    public static class Builder {
        private BurgerTyp BurgerTyp;
        private List<Skladniki> skladniki;
        private double cena;
        private Waga waga;

        public Builder withBurgerTyp(BurgerTyp BurgerTyp){
            this.BurgerTyp = BurgerTyp;
            return this;
        }

        public Builder withSkladniki(List<Skladniki> skladniki) {
            this.skladniki = skladniki;
            return this;
        }

        public Builder withCena(double cena) {
            this.cena = cena;
            return this;
        }

        public Builder withWaga(Waga waga) {
            this.waga = waga;
            return this;
        }

        public Burger stwórz() {
            return new Burger(BurgerTyp,skladniki, cena, waga);
        }
    }
}

