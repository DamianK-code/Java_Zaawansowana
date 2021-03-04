package javaZaawans.javaZaavansowana.wzorceProjektowe.flyweight;

import java.util.Map;

public class CarFactory {
    private static final Map<String, Silnik> grupaSilników = Map.of(
            "Nowy", new Silnik(TypSilnika.DIESEL, "2.0"),
            "Stary", new Silnik(TypSilnika.DIESEL, "5.0"),
            "Cienki", new Silnik(TypSilnika.BENZYNA,"0,9")
    );
    public static Car stwórzSamochód(String rodzajSilnika){
        switch(rodzajSilnika){
            case "Nowy":
                return new Car("OPEL", grupaSilników.get(rodzajSilnika), "Czarny");
            case "Stary":
                return new Car("AUDI", grupaSilników.get(rodzajSilnika), "Czerwony");
            case "Cienki":
                return new Car("Fiat", grupaSilników.get(rodzajSilnika), "Granatowy");
            default:
                throw new RuntimeException();
        }
    }
}
