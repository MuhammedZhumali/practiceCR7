package java_core;

import java.util.ArrayList;

public class Task6 {
    

    public String checkSatelliteStatus(String name, int battery, int signal, double orbitHeight){
        if(name == null || name.trim().isEmpty() || battery < 0 || battery > 100 || signal < 0 || signal > 100 || orbitHeight <=0){
            return "INVALID";
        }
        if(battery == 0 || signal == 0){
            return "OFFLINE";
        }
        else if(battery < 20){
            return "LOW BATTERY";
        }else if(signal < 30){
            return "WEAK SIGNAL";
        }else if(orbitHeight < 200){
            return "DECAY RISK";
        }

        return "OPERATIONAL";
    }

    public int countStatus(ArrayList<String> statuses, String targetStatus){
        if(statuses == null || statuses.size() == 0 || targetStatus == null){
            return -1;
        }

        int count = 0;
        for(int i = 0; i < statuses.size(); i++){
            if(statuses.get(i).equals(targetStatus)){
                count++;
            }
        }
        return count;
    }

    public boolean hasCriticalSatellite(ArrayList<String> statuses){
        if(statuses == null || statuses.size() == 0){
            return false;
        }
        for(int i = 0; i < statuses.size(); i++){
            if(statuses.get(i).equals("OFFLINE") || statuses.get(i).equals("LOW BATTERY") || statuses.get(i).equals("WEAK SIGNAL") || statuses.get(i).equals("DECAY RISK")){
                return true;
            }
        }
        return false;
    }
}
