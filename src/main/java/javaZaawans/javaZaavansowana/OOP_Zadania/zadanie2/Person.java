package javaZaawans.javaZaavansowana.OOP_Zadania.zadanie2;

public abstract class Person {

    private String name;
    private String address;

    public Person() {
        this.name = null;
        this.address = null;
    }

    public Person(String name, String address) {
        this.name = name;
        this.address = address;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return name + " -> " + address;
    }

    public abstract void Person(String name, String address);
}
