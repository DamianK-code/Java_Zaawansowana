package javaZaawans.javaZaavansowana.OOP_Zadania.zadanie3;

public class Square extends Rectangle{



    public Square(Color color, boolean isFilled, double width, double lenght) {
        super(color, isFilled, width, lenght);
    }

    public Square(){
        super(Color.UNKNOWN,false,1,1);
    }


    @Override
    public String toString() {
        return "Square{" +
                "width=" + width +
                ", lenght=" + lenght +
                '}';
    }
}
