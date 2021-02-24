package javaZaawans.javaZaavansowana.kolekcje.zadanie1;

import java.util.ArrayList;
import java.util.List;

public class zadanie1 {
    public static void main(String[] args) {


        List<String> stringList = new ArrayList<>();

        stringList.add("Mieszko");
        stringList.add("pierwszy");
        stringList.add("mały");
        stringList.add("lubi");
        stringList.add("wojowac");
        System.out.println(stringList);

        stringList.set(2,"dumny");
        System.out.println(stringList);

        System.out.println(stringList.indexOf("mały"));

        System.out.println(stringList.lastIndexOf("lubi"));

        System.out.println(stringList.remove("wojowac"));
        System.out.println(stringList.remove(2));


    }

}
