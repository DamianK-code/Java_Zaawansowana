package javaZaawans.javaZaavansowana.OOP_Zadania.zadanie3;

public class Circle extends Shape{

    double radius;
    Color color;
    boolean isFilled;

    public Circle() {
        this.color = Color.UNKNOWN;
        this.isFilled = false;
        this.radius = 1;
    }

    public Circle(double radius, Color color, boolean isFilled) {
        this.radius = radius;
        this.color = color;
        this.isFilled = isFilled;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getArea(){
        return Math.PI * Math.sqrt(getRadius());
    }
    public double getPerimeter(){
        return 2*Math.PI * getRadius();
    }

    @Override
    public String toString() {
        return "Circle with radius=" + getRadius() +
                " which is a subclass off " + super.toString();
    }
}
