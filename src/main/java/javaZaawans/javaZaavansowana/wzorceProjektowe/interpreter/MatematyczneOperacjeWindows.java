package javaZaawans.javaZaavansowana.wzorceProjektowe.interpreter;

public class MatematyczneOperacjeWindows implements MatematycznyInterpreter{
    private double liczb1;
    private double liczb2;
    public MatematyczneOperacjeWindows(double liczb1, double liczb2) {
        this.liczb1 = liczb1;
        this.liczb2 = liczb2;
    }
    @Override
    public double interpretuj(MatematyczneOperacje operacja) {
        switch(operacja){
            case DODAJ_WINDOWS:
                return liczb1 + liczb2;
            case ODEJMIJ_WINDOWS:
                return liczb1 - liczb2;
            case PODZIEL_WINDOWS:
                return liczb1 / liczb2;
            default:
                System.out.println("Tej operacji nie obsługujemy: " + operacja);
                throw new RuntimeException();
        }
    }
}
