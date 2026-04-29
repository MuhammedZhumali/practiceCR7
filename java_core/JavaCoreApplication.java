package java_core;

import java.util.ArrayList;
import java.util.Scanner;

public class JavaCoreApplication {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Task1 task = new Task1();
        System.out.println("Enter velocity: " );
        double v = sc.nextDouble();
        System.out.println("Height of orbit:" + task.calculateHeightSatellite(v));

        System.out.println("Enter number of velocities: ");
        int count = sc.nextInt();
        ArrayList<Double> vs = new ArrayList<>();
        for(int i = 0; i < count; i++){
            System.out.println("Enter velocity " + (i + 1) + ": ");
            vs.add(sc.nextDouble());
        }
        System.out.println("Height of orbits: " + task.calculateMultipleHeights(vs));
    }
}
