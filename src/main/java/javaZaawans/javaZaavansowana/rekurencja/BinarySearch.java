package javaZaawans.javaZaavansowana.rekurencja;

import lombok.Data;

@Data
public class BinarySearch {


    int[] tablicaDoPrzeszukania;
    int szukanyElement;


    public int binarySearch(int[] tablicaDoPrzeszukania, int szukanyElement) {
        int left = 0;
        int right = tablicaDoPrzeszukania.length - 1;
        int m;

        while (left <= right) {
            m = (int) Math.floor((left + right) / 2);
            if (tablicaDoPrzeszukania[m] < szukanyElement) {
                left = m + 1;
            } else if (tablicaDoPrzeszukania[m] > szukanyElement) {
                right = m - 1;
            } else {
                return szukanyElement;
            }
        }

        return -1;
    }
}
