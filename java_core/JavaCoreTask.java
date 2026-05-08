package java_core;

import java.util.ArrayList;

public class JavaCoreTask {
    

    public String checkSatelliteStatus(String name, int battery, int signal, double orbitHeight){
        if(name == null || name.trim().isEmpty() || battery < 0 || battery > 100 || signal < 0 || signal > 100 || orbitHeight <= 0){
            return "INVALID";
        }
        if(battery == 0 || signal == 0){
            return "OFFLINE";
        }else if(battery < 20){
            return "LOW BATTERY";
        }
        else if(signal < 30){
            return "WEAK SIGNAL";
        }
        else if(orbitHeight < 200){
            return "DECAY RISK";
        }
        return "OPERATIONAL";
    }

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

    public String classifySignal(int signalStrength){
        if(signalStrength == 0){
            return "NO SIGNAL";
        }
        else if(signalStrength >= 1 && signalStrength <= 30){
            return "WEAK";
        }
        else if(signalStrength >= 31 && signalStrength <=70){
            return "MEDIUM";
        }
        else if(signalStrength >= 71 && signalStrength <= 100){
            return "STRONG";
        }
        return "INVALID";
    }

    public boolean isLowEarthOrbitSpeed(double velocity){
        return velocity >= 7000 && velocity <= 8000;
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

    public int countBySignalType(ArrayList<Integer> signals, String type){
        if(signals == null || signals.size() == 0 || type == null){
            return -1;
        }
        int count = 0;
        for(int i = 0; i < signals.size(); i++){
            if(signals.get(i) >= 0 && signals.get(i)<=100){
                if(classifySignal(signals.get(i)).equals(type)){
                    count++;
                }
            }else{
                continue;
            }
        }
        return count;
    }

    public int countByType(ArrayList<Double> heihgts, String type){
        if(heihgts == null || heihgts.size() == 0 || type == null){
            return -1;
        }
        int count = 0;
        for(int i = 0; i < heihgts.size(); i++){
            if(classifyOrbit(heihgts.get(i)).equals(type)){
                count++;
            }
        }
        return count;
    }

    public double calculateAverageSignal(ArrayList<Integer> signalList){
        if(signalList == null || signalList.size() == 0){
            return -1;
        }
        int avg = 0;
        for(int i = 0; i < signalList.size(); i++){
            avg+= signalList.get(i);
        }
        return (double) avg / signalList.size();
    }

    public double calculateAverageOrbitHeight(ArrayList<Double> heihgts){
        if(heihgts == null || heihgts.size() == 0){
            return -1;
        }
        double avg = 0;
        for(int i = 0; i < heihgts.size(); i++){
            avg += heihgts.get(i);
        }
        return (double) avg/heihgts.size();
    }

    public boolean hasCriticalSatellite(ArrayList<String> statuses){
        if(statuses == null || statuses.size() == 0){
            return false;
        }
        if(statuses.contains("OFFLINE") || statuses.contains("LOW BATTERY") || statuses.contains("WEAK SIGNAL") || statuses.contains("DECAY RISK")){
            return true;
        }
        return false;
    }
}
