package javaZaawans.javaZaavansowana.polimorfizm_zadania.symulatorFarby;

public class Main {

    public static void main(String[] args) {

        Kwadrat kwadrat = new Kwadrat(3);
        Kwadrat kwadrat1 = new Kwadrat(2);
        Kolo kolo = new Kolo(3.2);
        Trapez trapez = new Trapez(2,3,2.2);

        Figura[] tablicaFigur =  new Figura[]{kwadrat,kwadrat1,kolo,trapez};

        System.out.println(SymulatorFarby.obliczZapotrzebowanieNaFarbe(tablicaFigur, 3.0));
    }
}
