package javaZaawans.javaZaavansowana.zadaniaIO.zad64;

import java.util.Scanner;

public class Mecz {

    public static String getTeamName() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter team name: ");
        String teamName = scanner.nextLine();
        return teamName;

    }

    public static int getNumberOfGoals() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number of goals: ");
        int numberOfGoals = scanner.nextInt();
        return numberOfGoals;
    }

}
