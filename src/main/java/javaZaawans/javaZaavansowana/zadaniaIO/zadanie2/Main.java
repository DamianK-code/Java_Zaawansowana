package javaZaawans.javaZaavansowana.zadaniaIO.zadanie2;

public class Main {

    public static void main(String[] args) {

        Bridge bridge = new Bridge();
        Car car1 = new Car("BMW", "kombi");
        Car car2 = new Car("Polonez", "sport");
        Car car3 = new Car("Citroen", "sedan");

        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
            bridge.driveThrough(car1);
            }
        });
        Thread thread2 = new Thread(new Runnable() {
            @Override
            public void run() {
                bridge.driveThrough(car2);
            }
        });
        Thread thread3 = new Thread(new Runnable() {
            @Override
            public void run() {
                bridge.driveThrough(car3);
            }
        });

        thread.start();
        thread2.start();
        thread3.start();
    }
}
