package javaZaawans.javaZaavansowana.kolekcje.zadanie2;

import java.util.*;

public class Main {

    public static void main(String[] args) {

        Kwadrat kwadrat = new Kwadrat(2);
        Kwadrat kwadrat1 = new Kwadrat(5);
        Prostokat prostokat = new Prostokat(3, 4);
        Prostokat prostokat1 = new Prostokat(2, 5);


        Set<Figura> figuraSet = new TreeSet<>(new Comparator<Figura>() {
            @Override
            public int compare(Figura o1, Figura o2) {
                return (int) (o1.obliczPole() - o2.obliczPole());
            }
        });
        figuraSet.add(kwadrat);
        figuraSet.add(kwadrat1);
        figuraSet.add(prostokat);
        figuraSet.add(prostokat1);
        System.out.println(figuraSet);


    }
}
