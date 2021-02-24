package javaZaawans.javaZaavansowana.zadanie2;

import java.util.Arrays;

public class MojaLista<E> {

    private E[] tablicaElementów;

    public MojaLista(int n) {
        this.tablicaElementów = (E[]) new Object[n];
    }

    public boolean zawiera(E element) {
        for (E e : tablicaElementów) {
            if (element.equals(e)) {
                return true;
            }
        }
        return false;
    }

    public int rozmiar(){
        int ileElementoNiePustych = 0;
        for (E e : tablicaElementów) {
            if (e != null){
                ileElementoNiePustych++;
            }
        }
        return ileElementoNiePustych;
    }

    public boolean dodaj(E element){
        for (int i = 0; i < tablicaElementów.length; i++) {
            if (tablicaElementów[i] == null){
                tablicaElementów[i] = element;
                return true;
            }
        }
        return false;
    }

    @Override
    public String toString() {
        return "MojaLista" + Arrays.toString(tablicaElementów);
    }
}
