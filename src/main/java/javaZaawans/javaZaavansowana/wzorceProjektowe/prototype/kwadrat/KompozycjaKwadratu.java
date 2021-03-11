package javaZaawans.javaZaavansowana.wzorceProjektowe.prototype.kwadrat;

import java.util.List;

public class KompozycjaKwadratu implements Kwadrat{

    private List<Kwadrat> namalowaneKwadraty;

    public KompozycjaKwadratu (List<Kwadrat> namalowaneKwadraty){
        this.namalowaneKwadraty = namalowaneKwadraty;
    }
    @Override
    public void draw() {
        for (Kwadrat kwadrat : namalowaneKwadraty) {
            kwadrat.draw();
        }
    }
}
