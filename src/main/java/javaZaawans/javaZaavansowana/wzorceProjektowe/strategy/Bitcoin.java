package javaZaawans.javaZaavansowana.wzorceProjektowe.strategy;

public class Bitcoin implements Payment {
    @Override
    public void oplac(double cena) {
        System.out.println("Oplacone przez portal bitcoin: " + cena);
    }
}
