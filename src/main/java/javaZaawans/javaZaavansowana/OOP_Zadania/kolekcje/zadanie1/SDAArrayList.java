package javaZaawans.javaZaavansowana.OOP_Zadania.kolekcje.zadanie1;

import java.util.Arrays;

public class SDAArrayList<T> {

    private static final int INITIAL_SIZE = 3;
    T[] elements;
    int size;

    public SDAArrayList() {
        elements = (T[]) new Object[INITIAL_SIZE];
    }

    public SDAArrayList(int initialSize) {
        elements = (T[]) new Object[initialSize];

    }

    public boolean add(T elementToAdd) {
        if (elements.length == size) {
            doubleCapacity();
        }
        elements[size++] = elementToAdd;
        return true;
    }

    private void doubleCapacity() {
        elements = Arrays.copyOf(elements, elements.length * 2);
    }

    public T remove(int index) {
        T temp = elements[index];
        for (int i = index; i < size-1; i++) {
            elements[i] = elements[i + 1];
        }
        size--;
        return temp;
    }

    public T get(int index) {
        return (T) elements[index];
    }

    public void display() {
        for (int i = 0; i < size; i++) {
            System.out.println(elements[i]);
        }
    }
}
