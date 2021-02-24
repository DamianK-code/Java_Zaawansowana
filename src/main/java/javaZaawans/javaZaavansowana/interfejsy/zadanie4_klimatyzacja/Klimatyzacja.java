package javaZaawans.javaZaavansowana.interfejsy.zadanie4_klimatyzacja;

public class Klimatyzacja implements Grzeje, Chlodzi {

    private double aktualnaTemperatura;


    @Override
    public void schlodz() {
        aktualnaTemperatura -= 1;

    }

    @Override
    public double pobierzTemp(double aktualnaTemperatura) {
        return this.aktualnaTemperatura = aktualnaTemperatura;
    }



    @Override
    public void zwiekszTemp() {
        aktualnaTemperatura += 1;
    }

    @Override
    public void wyswietlTemp() {
        System.out.println("„Aktualna temperatura w pomieszczeniu wynosi: " + this.aktualnaTemperatura + " stopni Celsjusza");
    }
}
