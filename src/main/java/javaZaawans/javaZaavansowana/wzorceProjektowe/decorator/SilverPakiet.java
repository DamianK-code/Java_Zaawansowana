package javaZaawans.javaZaavansowana.wzorceProjektowe.decorator;

public class SilverPakiet implements MyjniaSamochodowa {

    private PakietStantardowy pakietStantardowy;

    public SilverPakiet(PakietStantardowy pakietStantardowy) {
        this.pakietStantardowy = pakietStantardowy;
    }

    @Override
    public void umyjSamochod() {
        System.out.println("Pakiet silver myjni samochodowej");
        pakietStantardowy.umyjSamochod();
    }
}
