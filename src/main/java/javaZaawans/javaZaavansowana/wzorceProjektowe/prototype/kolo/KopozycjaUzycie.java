package javaZaawans.javaZaavansowana.wzorceProjektowe.prototype.kolo;

import javaZaawans.javaZaavansowana.wzorceProjektowe.prototype.kwadrat.*;

import java.util.Arrays;

public class KopozycjaUzycie {
    public static void main(String[] args) {
        Koło duzeKolo = new DuzeKolo();
        Koło maleKolo = new MałeKolo();
        Koło owalneKolo = new OwalneKolo();
        KompozycjaKola kompozycjaKola = new KompozycjaKola(Arrays.asList(duzeKolo, maleKolo, owalneKolo));
        kompozycjaKola.draw();

        Kwadrat czerwonyKwadrat = new CzerwonyKwadrat();
        Kwadrat zielonyKwadrat = new ZielonyKwadrat();
        Kwadrat blekitnyKwadrat = new BlekitnyKwadrat();
        KompozycjaKwadratu kompozycjaKwadratu = new KompozycjaKwadratu(Arrays.asList(czerwonyKwadrat,zielonyKwadrat,blekitnyKwadrat));
        kompozycjaKwadratu.draw();
    }
}
