package polimorfizm_zadania.symulatorFarby;

import polimorfizm_zadania.symulatorFarby.Figura;

public class Kolo extends Figura {
    double promien;
    public Kolo(double promien) {
        this.promien = promien;
    }

    @Override
    public double obliczPole() {
        return Math.PI * Math.pow(promien,2);
    }

}
