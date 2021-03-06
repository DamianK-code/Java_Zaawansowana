package javaZaawans.javaZaavansowana.wzorceProjektowe.interpreter;

public class InterpreterUzycie {
    public static void main(String[] args) {
        MatematycznyInterpreter matematycznyInterpreterWindows = new MatematyczneOperacjeWindows(10,20);
        System.out.println("Wynik operacji dodaj w Windows:" + matematycznyInterpreterWindows.interpretuj(MatematyczneOperacje.DODAJ_WINDOWS));
        System.out.println("Wynik operacji odejmij w Windows:" + matematycznyInterpreterWindows.interpretuj(MatematyczneOperacje.ODEJMIJ_WINDOWS));
        MatematycznyInterpreter matematycznyInterpreterLinux = new MatematyczneOperacjeLinux(10,20);
        System.out.println("Wynik operacji dodaj w Linux:" + matematycznyInterpreterLinux.interpretuj(MatematyczneOperacje.DODAJ_LINUX));
        System.out.println("Wynik operacji odejmij w Linux:" + matematycznyInterpreterLinux.interpretuj(MatematyczneOperacje.ODEJMIJ_LINUX));
        System.out.println("Wynik operacji odejmij w Linux:" + matematycznyInterpreterLinux.interpretuj(MatematyczneOperacje.DODAJ_WINDOWS));
    }
}
