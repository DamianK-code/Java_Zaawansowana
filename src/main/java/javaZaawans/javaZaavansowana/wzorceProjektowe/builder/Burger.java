package javaZaawans.javaZaavansowana.wzorceProjektowe.builder;

import java.util.List;

public class Burger {
    private List<String> skladniki;
    private String waga;
    private double cena;

    public Burger(List<String> skladniki, String waga, double cena) {
        this.skladniki = skladniki;
        this.waga = waga;
        this.cena = cena;
    }

    public List<String> getSkladniki() {
        return skladniki;
    }

    public String getWaga() {
        return waga;
    }

    public double getCena() {
        return cena;
    }

    public static class Builder {
        private List<String> skladniki;
        private String waga;
        private double cena;

        public Builder withSkladniki(final List<String> skladniki) {
            this.skladniki = skladniki;
            return this;
        }

        public Builder withWaga(final String waga) {
            this.waga = waga;
            return this;
        }

        public Builder withCena(final double cena) {
            this.cena = cena;
            return this;
        }

        public Burger build() {
            return new Burger(skladniki, waga, cena);
        }
    }
}
