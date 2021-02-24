package javaZaawans.javaZaavansowana.kolekcje.zadanie2;


public abstract class Figura  {

    abstract double obliczPole();


/*    @Override
    public int compareTo(Figura f) {
        return Double.compare(this.obliczPole(), f.obliczPole()); // lub  return this.obliczPole() - f.obliczPole();
    }*/

    @Override
    public String toString() {
        return "Figura{pole=" + obliczPole() + "}";
    }
}
