package javaZaawans.javaZaavansowana.rekurencja;

public class Main {
    public static void main(String[] args) {

        int[] tablicaLiczb = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9};

        System.out.println(sumujTabliceRekurencyjnie(tablicaLiczb));
        System.out.println(silnia1(4));
        System.out.println(fibonacci(6));

    }


    public static int gcd(int a, int b) {
        return b != 0 ? gcd(b, a % b) : a;
    }

    public static int gcd2(int a, int b) {
        if (b != 0) {
            return gcd2(b, a % b);
        } else {
            return a;
        }
    }

    public static int sumujTabliceIteracyjnie(int[] tablica) {
        int sum = 0;
        for (int i : tablica) {
            sum += i;
        }
        return sum;
    }

    public static int sumujTabliceRekurencyjnie(int[] tablica) {
        return sumujTabliceRekurencyjnie(tablica, tablica.length - 1);
    }

    private static int sumujTabliceRekurencyjnie(int[] tablica, int i) {
        if (i > 0) {
            return tablica[i] + sumujTabliceRekurencyjnie(tablica, i - 1);
        } else {
            return tablica[i];
        }
    }

    public static int silnia(int a) {
        int toDoCzegoSieDomnaza = 1;
        for (int i = 1; i <= a; i++) {
            toDoCzegoSieDomnaza *= i;
        }
        return toDoCzegoSieDomnaza;
    }

    private static int silnia1(int a) {
        if (a < 2) {
            return 1;
        } else {
            return a * silnia1(a - 1);
        }
    }


    public static int fibonacci(int n) {
        if ((n == 1) || (n == 2)) {
            return 1;
        } else {
            return fibonacci(n - 1) + fibonacci(n - 2);
        }
    }
}
