package java_core;

import java.util.ArrayList;

public class Task3 {
    public String classifyOrbit(double heightKm){
        if(heightKm <= 0){
            return "INVALID";
        }
        if(heightKm <= 2000){
            return "LEO";
        }else if(heightKm >=2001 && heightKm <= 35785){
            return "MEO";
        }else if(heightKm > 35785){
            return "GEO";
        }
        return "Unknown orbit type";
    }

    public int countByType(ArrayList<Double> heights, String type){
        if(heights == null || heights.size() == 0 || type == null){
            return -1;
        }
        int count = 0;
        for(int i =0; i < heights.size(); i++){
            if(classifyOrbit(heights.get(i)).equals(type)){
                count++;
            }
        }
        return count;
    }

    public double findHighestOrbit(ArrayList<Double> heights){
        if(heights == null || heights.size() == 0){
            return -1;
        }
        double maxHeight = heights.get(0);
        for(int i = 0; i < heights.size(); i++){
            if(heights.get(i) > maxHeight){
                maxHeight = heights.get(i);
            }
        }
        return maxHeight;
    }

}
