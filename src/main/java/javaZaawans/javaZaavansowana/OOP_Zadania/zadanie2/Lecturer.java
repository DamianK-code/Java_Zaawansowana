package javaZaawans.javaZaavansowana.OOP_Zadania.zadanie2;

public class Lecturer extends Person {

    String specjalizacja;
    int wynagrodzenie;


    public Lecturer(String name, String address, String specjalizacja, int wynagrodzenie) {
        super(name, address);
        this.specjalizacja = specjalizacja;
        this.wynagrodzenie = wynagrodzenie;
    }


    @Override
    public void Person(String name, String address) {

    }

    public String getSpecjalizacja() {
        return specjalizacja;
    }

    public void setSpecjalizacja(String specjalizacja) {
        this.specjalizacja = specjalizacja;
    }

    public int getWynagrodzenie() {
        return wynagrodzenie;
    }

    public void setWynagrodzenie(int wynagrodzenie) {
        this.wynagrodzenie = wynagrodzenie;
    }

    @Override
    public String toString() {
        return "Lecturer{" + "name=" + getName() + '\'' +
                ", address=" + getAddress() + '\'' +
                ", specjalizacja=" + specjalizacja + '\'' +
                ", wynagrodzenie=" + wynagrodzenie + '}';
    }
}
