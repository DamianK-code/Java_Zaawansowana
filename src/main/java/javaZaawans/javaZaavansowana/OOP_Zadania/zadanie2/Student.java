package javaZaawans.javaZaavansowana.OOP_Zadania.zadanie2;


public class Student extends Person {

    String typStudiow;
    int rokStudiow;
    double kosztStudiow;


    public Student(String name, String address, String typStudiow, int rokStudiow, double kosztStudiow) {
        super(name, address);
        this.typStudiow = typStudiow;
        this.rokStudiow = rokStudiow;
        this.kosztStudiow = kosztStudiow;
    }


    @Override
    public void Person(String name, String address) {

    }

    @Override
    public String toString() {
        return "Student{" +
                "name= " + getName() + '\'' +
                ", address= " + getAddress() + '\'' +
                ", typStudiow= " + typStudiow + '\'' +
                ", rokStudiow= " + rokStudiow +
                ", kosztStudiow= " + kosztStudiow +
                '}';
    }
}
