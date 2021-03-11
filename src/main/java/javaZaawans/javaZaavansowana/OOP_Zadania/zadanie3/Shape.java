package javaZaawans.javaZaavansowana.OOP_Zadania.zadanie3;

public class Shape {

    Color color;
    boolean isFilled;

    public Shape() {
        this.color = Color.UNKNOWN;
        this.isFilled = false;
    }

    public Shape(Color color, boolean isFilled) {
        this.color = color;
        this.isFilled = isFilled;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public boolean isFilled() {
        return isFilled;
    }

    public void setFilled(boolean filled) {
        isFilled = filled;
    }

    @Override
    public String toString() {
        return "Shape{" +
                "color=" + getColor() +
                ", isFilled=" + isFilled() + '}';
    }
}
