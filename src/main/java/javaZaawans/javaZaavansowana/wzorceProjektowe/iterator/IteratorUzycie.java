package javaZaawans.javaZaavansowana.wzorceProjektowe.iterator;

import java.util.Iterator;

public class IteratorUzycie {
    public static void main(String[] args) {
        NaszMałyParking naszMałyParking =  new NaszMałyParking();
        naszMałyParking.addSamochod(new Samochod(Model.AUDI));
        naszMałyParking.addSamochod(new Samochod(Model.VOLVO));
        naszMałyParking.addSamochod(new Samochod(Model.SKODA));
        naszMałyParking.addSamochod(new Samochod(Model.AUDI));
//        Parking parking = new Parking(Arrays.asList(new Samochod(Model.AUDI), new Samochod(Model.VOLVO)));
        Iterator<Samochod> parkingInterator = naszMałyParking.iterator();
        while(czyJestJeszczeJakisSamochodNaParking(parkingInterator)){
            Samochod nastepnySamochod = podajNastepnySamochodNaParkingu(parkingInterator);
            System.out.println("Samochod na parkingu to: " + nastepnySamochod.getModel());
        }
    }
    private static boolean czyJestJeszczeJakisSamochodNaParking(Iterator<Samochod> parkingInterator){
        return parkingInterator.hasNext();
    }
    private static Samochod podajNastepnySamochodNaParkingu(Iterator<Samochod> parkingInterator){
        return parkingInterator.next();
    }
}
