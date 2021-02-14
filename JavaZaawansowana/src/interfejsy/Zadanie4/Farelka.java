package interfejsy.Zadanie4;

public class Farelka implements Grzeje {
    private double aktualnaTemperatura;


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
