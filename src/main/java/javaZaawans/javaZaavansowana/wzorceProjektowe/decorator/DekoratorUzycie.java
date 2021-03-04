package javaZaawans.javaZaavansowana.wzorceProjektowe.decorator;

public class DekoratorUzycie {
    public static void main(String[] args) {
        PakietStantardowy pakietStantardowy = new PakietStantardowy();
        SilverPakiet pakietSilver = new SilverPakiet(pakietStantardowy);
        GoldPakiet pakietGold = new GoldPakiet(pakietSilver);
        PakietPlatinium pakietPlatinium = new PakietPlatinium(pakietGold);
        pakietPlatinium.umyjSamochod();
    }
}
