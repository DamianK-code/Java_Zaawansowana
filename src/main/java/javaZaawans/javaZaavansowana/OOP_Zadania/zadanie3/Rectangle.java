package javaZaawans.javaZaavansowana.OOP_Zadania.zadanie3;

public class Rectangle extends Shape {

    double width;
    double lenght;

    public Rectangle() {
        this.color = Color.UNKNOWN;
        this.isFilled = false;
        this.width = 1;
        this.lenght = 1;
    }

    public Rectangle(Color color, boolean isFilled, double width, double lenght) {
        super(color, isFilled);
        this.width = width;
        this.lenght = lenght;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getLenght() {
        return lenght;
    }

    public void setLenght(double lenght) {
        this.lenght = lenght;
    }

    public double getArea() {
        return getLenght() * getWidth();
    }

    public double getPerimeter() {
        return 2 * getLenght() + 2 * getWidth();
    }

    @Override
    public String toString() {
        return "Rectangle with width=" + getWidth() +
                ", and lenght=" + getLenght() +
                " witch is subclass off " + super.toString();
    }
}
