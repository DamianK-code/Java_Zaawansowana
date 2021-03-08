package javaZaawans.javaZaavansowana.Zadania_z_Gita_Marcina.Highway;


import lombok.Data;

import java.time.LocalDateTime;

@Data
public class VehicleInfo {

    private final String registrationNumber;
    private final CarType carType;
    private final LocalDateTime entryTime;


}
