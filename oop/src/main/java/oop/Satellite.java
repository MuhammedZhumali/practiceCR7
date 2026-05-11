package oop;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Satellite {
    private String name;
    private double batteryPercent;
    private double signalPercent;
    private double orbitHeightKm;
    private double velocityMs;
}
