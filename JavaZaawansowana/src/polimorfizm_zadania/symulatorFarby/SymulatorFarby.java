package polimorfizm_zadania.symulatorFarby;

import polimorfizm_zadania.symulatorFarby.Figura;

public class SymulatorFarby {


    public static int obliczZapotrzebowanieNaFarbe(Figura[] tablicaFigur, double wielkoscPomalowanejPowierzchniZJednejPuszkiFarby) {
        double sum = 0.0;

        for (int i = 0; i < tablicaFigur.length; i++) {
            sum += tablicaFigur[i].obliczPole();
        }
        return (int) Math.ceil(sum / wielkoscPomalowanejPowierzchniZJednejPuszkiFarby);
    }


}
