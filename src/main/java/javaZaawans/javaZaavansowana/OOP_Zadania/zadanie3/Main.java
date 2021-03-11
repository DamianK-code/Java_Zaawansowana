package javaZaawans.javaZaavansowana.OOP_Zadania.zadanie3;

public class Main {
    public static void main(String[] args) {

        Circle circle = new Circle(5, Color.BLUE, false);
        System.out.println(circle);
        Rectangle rectangle = new Rectangle(Color.BLACK,true,2,3);
        System.out.println(rectangle);
        Square square = new Square(Color.GREEN,true,2,2);
        System.out.println(square);

        Square square1 = new Square();
        square1.setFilled(true);
        square1.setLenght(5);

    }
}
