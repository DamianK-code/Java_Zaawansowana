package javaZaawans.javaZaavansowana.kolekcje.zadanie5;

import java.util.HashMap;
import java.util.Map;

public class WordCounter {


    public static Map<String, Integer> zliczWystapieniaSlow(String tekst) {
        String[] slowa = tekst.toLowerCase().replaceAll("[.,;]", " ").split("\\s+");
        Map<String, Integer> stringIntegerMap = new HashMap<>();
        for (String string : slowa) {
            if (stringIntegerMap.containsKey(slowa)) {
                stringIntegerMap.put(string, stringIntegerMap.get(string) + 1);
            } else {
                stringIntegerMap.put(string, 1);
            }
        }
        return stringIntegerMap;
    }



    /*public Map<String, Integer> zliczWystapieniaSlow(String tekst) {
        Map<String, Integer> stringIntegerMap = new HashMap<>();
        List<String> stringList = new LinkedList<>();
        stringList.

            stringIntegerMap.putIfAbsent(tekst.split(" "), )
        }

    }*/

}
