package java_core;

import java.util.ArrayList;
import java.util.Scanner;

public class JavaCoreApplication {
    
    public static void main(String[] args) {
        /* TASK 1
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
         */

        /* TASK 2
        Scanner sc = new Scanner(System.in);
        Task2 task = new Task2();
        System.out.println("Enter number of velocities: ");
        int count = sc.nextInt();
        if(count <= 0){
            System.out.println("Number of velocities must be greater than zero.");
            return;
        }
        ArrayList<Double> vs = new ArrayList<>(count);
        for(int i = 0; i < count; i++){
            System.out.println("Enter velocities: ");
            double velocity = sc.nextDouble();
            if(velocity <= 0){
                System.out.println("Velocity must be greater than zero.");
            } else {
                vs.add(velocity);
            }
        }
        if(vs.size() == 0){
            System.out.println("No velocities entered.");
            return;
        }

        System.out.println("Output: ");
        System.out.println("LEO count: " + task.countLowEarthOrbitSpeeds(vs));
        System.out.println("Max Velocity: " + task.maxVelocityList(vs));
        for(int i = 0; i < vs.size(); i++){
            String status;
            if(task.isLowEarthOrbitSpeed(vs.get(i))){
                status = "LEO";
            } else {
                status = "NOT LEO";
            }
            System.out.println(vs.get(i) + " m/s -> " + status);
        }
            */
        
        Scanner sc = new Scanner(System.in);
        Task3 task = new Task3();
        System.out.println("Enter number of heights: ");
        int count = sc.nextInt();
        if(count <= 0){
            System.out.println("Number of heights must be greater than zero.");
            return;
        }
        ArrayList<Double> heights = new ArrayList<>(count);
        for(int i = 0; i < count; i++){
            System.out.println("Enter height: ");
            double height = sc.nextDouble();
            if(height <= 0){
                continue;
            } else {
                heights.add(height);
            }
        }
        if(heights.size() == 0){
            System.out.println("No heights entered.");
            return;
        }
        for(int i = 0; i < heights.size(); i++){
            System.out.println(heights.get(i) + " km -> " + task.classifyOrbit(heights.get(i)));
        }
        System.out.println("LEO count: " + task.countByType(heights, "LEO"));
        System.out.println("MEO count: " + task.countByType(heights, "MEO"));
        System.out.println("GEO count: " + task.countByType(heights, "GEO"));
        System.out.println("Highest orbit: " + task.findHighestOrbit(heights) + " km");
    

    }
}
