package javaZaawans.javaZaavansowana.OOP_Zadania.zadanie2;

public class Main {
    public static void main(String[] args) {


        Student student = new Student("Marian","Zadupie 14", "Stacjonarne",3,3200);
        Lecturer lecturer = new Lecturer("Grzegorz","Wiśniowa 95", "dziewiarstwo",4500);

        System.out.println(student.toString());
        System.out.println(lecturer.toString());


    }
}
