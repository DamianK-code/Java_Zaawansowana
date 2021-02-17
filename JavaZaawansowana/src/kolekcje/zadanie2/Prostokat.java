package kolekcje.zadanie2;

public class Prostokat extends Figura {
    private double bokA, bokB;

    public Prostokat(double bokA, double bokB) {
        this.bokA = bokA;
        this.bokB = bokB;
    }

    @Override
    double obliczPole() {
        return bokA * bokB;
    }
}
