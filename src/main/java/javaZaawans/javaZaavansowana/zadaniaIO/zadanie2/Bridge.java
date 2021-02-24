package javaZaawans.javaZaavansowana.zadaniaIO.zadanie2;

public class Bridge {

    public synchronized void driveThrough(Car car) {
        System.out.println(car.getCarName()+ " " + car.getType() + " Jadę przez most");
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(car.getCarName() + " " + car.getType() + " Przejechałem");
    }
}
