package kolekcje.zadanie2;

public class Kwadrat extends Figura{
    private double bokA;

    public Kwadrat(double bokA) {
        this.bokA = bokA;
    }

    @Override
    double obliczPole() {
        return bokA *bokA;
    }

    @Override
    public String toString() {
        return super.toString();
    }

}
