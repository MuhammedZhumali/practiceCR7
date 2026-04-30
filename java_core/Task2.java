package java_core;

import java.util.ArrayList;

public class Task2 {
    

    public boolean isLowEarthOrbitSpeed(double velocity){
        return velocity >= 7000 && velocity <= 8000;
    }

    public int countLowEarthOrbitSpeeds(ArrayList<Double> velocities){
        if(velocities == null || velocities.size() == 0){
            return -1;
        }
        int count = 0;
        for(int i = 0; i < velocities.size(); i++){
            if(isLowEarthOrbitSpeed(velocities.get(i))){
                count++;
            }
        }
        return count;
    }

    public double maxVelocityList(ArrayList<Double> velocities){
        if(velocities == null || velocities.size() == 0){
            return -1;
        }
        double maxVelocity = velocities.get(0);
        for(int i = 0; i < velocities.size(); i++){
            if(velocities.get(i) > maxVelocity){
                maxVelocity = velocities.get(i);
            }
        }
        return maxVelocity;
    }


}
