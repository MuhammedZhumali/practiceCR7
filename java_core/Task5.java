package java_core;


public class Task5 {
    
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
}
