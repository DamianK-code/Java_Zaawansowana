package javaZaawans.javaZaavansowana.wzorceProjektowe.singleton.zad1;

import java.util.HashSet;
import java.util.Set;

public enum Servers {
    INSTANS;

    private Set<String> servers = new HashSet<>();

    public boolean dodaj(String nazwaSerwera) {
        if (sprawdzSewrwer(nazwaSerwera)) {
            return servers.add(nazwaSerwera);
        }
        return false;
    }

    private boolean sprawdzSewrwer(String nazwaSerwera) {
        String nazwaSerweraTemp = nazwaSerwera.toLowerCase();
        if (!nazwaSerweraTemp.isEmpty()) {
            return nazwaSerweraTemp.startsWith("http") || nazwaSerweraTemp.startsWith("https");
        }
        return false;

    }

    private boolean isHttp(String nazwaSerwera) {
        return nazwaSerwera.toLowerCase().startsWith("http");
    }

    private boolean isHttps(String nazwaSerwera) {
        return nazwaSerwera.toLowerCase().startsWith("https");
    }

    public Set<String> getHttpList() {
        Set<String> serversHttp = new HashSet<>();
        for (String server : servers) {
            if (isHttp(server) && !isHttps(server)) {
                serversHttp.add(server);
            }
        }
        return serversHttp;
    }
}
