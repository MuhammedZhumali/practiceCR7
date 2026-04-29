package java_core;

import java.util.List;
import java.util.ArrayList;

public class Task1 {

    private static final double G = 6.67430e-11; // Gravitational constant
    private static final double M = 5.972e24; // Mass of the Earth
    private static final double R = 6371000; // Radius of the Earth

    public double calculateHeightSatellite(double velocity){
        if(velocity <= 0){
            System.out.println("Velocity must be greater than zero.");
            return -1;
        }
        double h = (((G * M) / Math.pow(velocity, 2)) - R)/1000;
        if(h < 0){
            System.out.println("The velocity is too high for a stable orbit. The satellite would crash into the Earth.");
            return -1;
        }
        return h;
    }

    public List<Double> calculateMultipleHeights(List<Double> velocity){
        ArrayList<Double> heights = new ArrayList<>();
        for(int i = 0; i < velocity.size(); i++){
            heights.add(calculateHeightSatellite(velocity.get(i)));
        }
        return heights;
    }
}
