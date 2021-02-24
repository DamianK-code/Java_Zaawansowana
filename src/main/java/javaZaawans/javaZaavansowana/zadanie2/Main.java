package javaZaawans.javaZaavansowana.zadanie2;

public class Main {

    public static void main(String[] args) {

        MojaLista<String> stringMojaLista = new MojaLista<>(2);

        System.out.println(stringMojaLista.dodaj("pierwszy"));
        System.out.println(stringMojaLista.dodaj("drugi"));
        System.out.println(stringMojaLista.dodaj("trzeci"));

        System.out.println(stringMojaLista);
    }
}
