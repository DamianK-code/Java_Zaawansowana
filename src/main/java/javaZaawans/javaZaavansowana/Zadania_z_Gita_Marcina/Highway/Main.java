package javaZaawans.javaZaavansowana.Zadania_z_Gita_Marcina.Highway;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws Exception {

        Scanner scanner = new Scanner(System.in);
        Highway highway = new Highway();
        String polecenie;
        do {
            System.out.println("Podaj polecenie:");
            polecenie = scanner.nextLine();
            String[] words = polecenie.split(" ");
            if (words.length >= 2) {
                if (words[0].equalsIgnoreCase("wyjazd")) {
                    highway.vehicleLeave(words[1]);
                } else if (words[0].equalsIgnoreCase("wjazd")) {
                    highway.vehicleEntry(words[1], CarType.valueOf(words[2]));
                } else if (words[0].equalsIgnoreCase("sprawdz")) {
                    highway.searchVehicle(words[1]);
                }
            }

        }
        while (!polecenie.equalsIgnoreCase("Stop"));

    }
}
