package javaZaawans.javaZaavansowana.wzorceProjektowe.bridge;

import java.util.Arrays;

public class BridgeUzycie {
    public static void main(String[] args) {
        HerbataZakup herbataZakup = new HerbataZakup();
        KawaZakup kawaZakup = new KawaZakup();
        PiwoZakup piwoZakup = new PiwoZakup();
        Pub pub = new Pub(herbataZakup);
        pub.wyświetlZakupyKlienta(Arrays.asList(Dodatki.CYTRYNA, Dodatki.MIOD, Dodatki.MLEKO));
        pub.wyświetlZakupyKlienta(Arrays.asList(Dodatki.Z_SOKIEM, Dodatki.MIOD));
    }
}
