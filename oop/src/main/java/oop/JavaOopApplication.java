package oop;

import oop.Satellite;

public class JavaOopApplication {
    
    public static void main(String[] args){
        Satellite sat = new Satellite("ISS", 75.5, 80.0, 400, 7700);
        Satellite sat2 = new Satellite("Hubble", 60.0, 90.0, 550, 7500);
        Satellite sat3 = new Satellite("Galileo", 80.0, 75.0, 23222, 3333);

        System.out.println(sat);
        System.out.println(sat2);
        System.out.println(sat3);

        System.out.println(sat.isLowEarthOrbitSpeed());
        System.out.println(sat2.isLowEarthOrbitSpeed());
        System.out.println(sat3.isLowEarthOrbitSpeed());

        sat.getStatus();
        sat2.getStatus();
        sat3.getStatus();

        sat.getSignalType();
        sat2.getSignalType();
        sat3.getSignalType();

        sat.getOrbitType();
        sat2.getOrbitType();
        sat3.getOrbitType();

        
    }
}
