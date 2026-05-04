package java_core;

import java.util.ArrayList;

public class Task4 {
    
    public String classifySignal(int signalStrength){
        if(signalStrength < 0 || signalStrength > 100){
            return "INVALID";
        }
        else if(signalStrength >= 1 && signalStrength <= 30){
            return "WEAK";
        }
        else if(signalStrength >= 31 && signalStrength <=70){
            return "MEDIUM";
        }
        else if(signalStrength >= 71 && signalStrength <=100){
            return "STRONG";
        }else if(signalStrength == 0){
            return "NO SIGNAL";
        }
        return "Unknown signal type";
    }

    public int countBySignalType(ArrayList<Integer> signals, String type){
        if(signals == null || signals.size() == 0 || type == null){
            return -1;
        }
        int count = 0;
        for(int i = 0; i < signals.size(); i++){
            if(signals.get(i) >= 0 && signals.get(i) <= 100){
                if(classifySignal(signals.get(i)).equals(type)){
                    count++;
                }
            } else {
                continue;
            }
        }
        return count;
    }

    public double calculateAverageSignal(ArrayList<Integer> signals){
        if(signals == null || signals.size() == 0){
            return -1;
        }
        int sum = 0;
        for(int i = 0; i < signals.size(); i++){
            sum += signals.get(i);
        }
        return (double) sum / signals.size();
    }
}
