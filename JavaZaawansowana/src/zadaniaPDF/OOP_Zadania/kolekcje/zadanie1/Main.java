package zadaniaPDF.OOP_Zadania.kolekcje.zadanie1;

public class Main {

    public static void main(String[] args) {

        SDAArrayList<String> stringSDAArrayList = new SDAArrayList<>();
        stringSDAArrayList.add("Mieszko");
        stringSDAArrayList.add("Mieszko1");
        stringSDAArrayList.add("Mieszko2");
        stringSDAArrayList.add("Mieszko3");
        stringSDAArrayList.add("Mieszko4");
        stringSDAArrayList.add("Mieszko5");

        stringSDAArrayList.display();
        stringSDAArrayList.remove(5);
        stringSDAArrayList.display();

    }
}
