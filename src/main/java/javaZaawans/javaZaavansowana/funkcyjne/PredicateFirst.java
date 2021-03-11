package javaZaawans.javaZaavansowana.funkcyjne;

import java.util.function.Predicate;

public class PredicateFirst {

    public static void main(String[] args) {
        Predicate<Integer> predicate = value -> value % 2 != 0;

        checkFirst(predicate,7);
        checkFirst(predicate,10);
        checkFirst(predicate,17);
        checkFirst(predicate,16);

    }

    static void checkFirst(Predicate<Integer> predicate, int valueToCheck){
        System.out.println(predicate.test(valueToCheck));
    }

}
