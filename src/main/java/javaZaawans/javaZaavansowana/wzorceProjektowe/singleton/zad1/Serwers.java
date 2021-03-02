package javaZaawans.javaZaavansowana.wzorceProjektowe.singleton.zad1;

import java.util.Set;

public class Serwers {
    private Set<String> listaSerwerow;

    public boolean dodajSerwer(String nazwaSerwera) {
        String nazwaSerweraTemp = nazwaSerwera.toLowerCase();
        if (!nazwaSerweraTemp.isEmpty()) {
            if (nazwaSerwera.startsWith("http") || nazwaSerwera.startsWith("http")) {
                return listaSerwerow.add(nazwaSerwera);
            }
        }
        return false;
    }

    public boolean isHttp(String nazwaSerwera) {
        return nazwaSerwera.toLowerCase().startsWith("http");
    }

    public boolean isHttps(String nazwaSerwera) {
        return nazwaSerwera.toLowerCase().startsWith("https");
    }
}
