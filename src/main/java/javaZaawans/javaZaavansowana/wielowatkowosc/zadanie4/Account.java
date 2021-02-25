package javaZaawans.javaZaavansowana.wielowatkowosc.zadanie4;

public class Account {

    private double saldo = 0;

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    synchronized void wpłata(double kwotaWplaty) {
        saldo += kwotaWplaty;
        System.out.println("Przelana kwota to: " + kwotaWplaty);
        System.out.println("Twoje saldo po wplacie wynosi: " + saldo);
        notify();
    }

    synchronized void wypłata(double kwotaWyplaty) throws InterruptedException {
        while (saldo < kwotaWyplaty){
            System.out.println("Za mało środków na koncie, nie mogę wypłacić.");
            wait();
        }
        saldo -= kwotaWyplaty;
        System.out.println("Wypłacam kwotę: " + kwotaWyplaty);
        System.out.println("Twoje saldo po wypłacie wynosi: " + saldo);

    }
}
