package javaZaawans.javaZaavansowana.Zadania_z_Gita_Marcina.Highway;

import java.time.Duration;
import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Map;

public class Highway {

    public static Map<String, VehicleInfo> carTypeMap = new HashMap<>();

    public void vehicleEntry(String registrationNumber, CarType type) {
        if (carTypeMap.containsKey(registrationNumber)) {
            throw new VehicleAlreadyOnHighwayExeption();
        }
        LocalDateTime czasWjazdu = LocalDateTime.now();
        carTypeMap.put(registrationNumber, new VehicleInfo(registrationNumber, type, czasWjazdu));
        System.out.println("Auto: " + carTypeMap + " wjechało na autostradę o: " + czasWjazdu);
    }

    public void searchVehicle(String registrationNumber) {
        if (!carTypeMap.containsKey(registrationNumber)) {
            throw new VehicleNotFoundExeption();
        }

        System.out.println(carTypeMap.get(registrationNumber));
    }

    public void vehicleLeave(String registrationNumber) {
        if (!carTypeMap.containsKey(registrationNumber)) {
            throw new VehicleNotFoundExeption();
        }
        LocalDateTime czasWjazdu = carTypeMap.get(registrationNumber).getEntryTime();
        LocalDateTime czasWyjazdu = LocalDateTime.now();
        int czasNaAutostradzie = Duration.between(czasWjazdu, czasWyjazdu).getNano();
        CarType carType = carTypeMap.get(registrationNumber).getCarType();

        double oplata = 1;
        if (carType.equals(CarType.CAR)) {
            oplata = czasNaAutostradzie * 0.0001;
        } else if (carType.equals(CarType.TRUCK)) {
            oplata = czasNaAutostradzie * 0.002;
        }
        System.out.println("opłata wynosi: " + oplata);
        carTypeMap.remove(registrationNumber);

    }
}
