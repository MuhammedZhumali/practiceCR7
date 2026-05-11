package oop;

public class Satellite {
    private String name;
    private double batteryPercent;
    private double signalPercent;
    private double orbitHeightKm;
    private double velocityMs;

    public Satellite() {
    }

    public Satellite(String name, double batteryPercent, double signalPercent, double orbitHeightKm, double velocityMs) {
        this.name = name;
        this.batteryPercent = batteryPercent;
        this.signalPercent = signalPercent;
        this.orbitHeightKm = orbitHeightKm;
        this.velocityMs = velocityMs;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getBatteryPercent() {
        return batteryPercent;
    }

    public void setBatteryPercent(double batteryPercent) {
        this.batteryPercent = batteryPercent;
    }

    public double getSignalPercent() {
        return signalPercent;
    }

    public void setSignalPercent(double signalPercent) {
        this.signalPercent = signalPercent;
    }

    public double getOrbitHeightKm() {
        return orbitHeightKm;
    }

    public void setOrbitHeightKm(double orbitHeightKm) {
        this.orbitHeightKm = orbitHeightKm;
    }

    public double getVelocityMs() {
        return velocityMs;
    }

    public void setVelocityMs(double velocityMs) {
        this.velocityMs = velocityMs;
    }

    public String getOrbitType(){
        if(orbitHeightKm < 2000){
            return "Low Earth Orbit";
        } else if (orbitHeightKm < 35786) {
            return "Medium Earth Orbit";
        } else {
            return "Geostationary Orbit";
        }
    }

    public String getStatus(){
        if(batteryPercent < 20){
            return "Low Battery";
        }else if(signalPercent < 20){
            return "Weak Signal";
        }else{
            return "Normal";
        }
    }

    public String getSignalType(){
        if(signalPercent < 0 || signalPercent > 100){
            return "INVALID";
        }else if(signalPercent >= 1 && signalPercent <=30){
            return "WEAK";
        }else if(signalPercent >= 31 && signalPercent <= 70){
            return "MEDIUM";
        }
        else if(signalPercent >= 71 && signalPercent <=100){
            return "STRONG";
        }
        return "Unknown signal type";
    }

    public boolean isLowEarthOrbitSpeed(){
        return velocityMs >= 7000 && velocityMs <= 8000;
    }

    public String classifyVelocity(){
        if(isLowEarthOrbitSpeed()){
            return "LEO SPEED";
        }
        return "NON LEO SPEED";
    }

    @Override
    public String toString() {
        return "Satellite{" +
                "name='" + name + '\'' +
                ", batteryPercent=" + batteryPercent +
                ", signalPercent=" + signalPercent +
                ", orbitHeightKm=" + orbitHeightKm +
                ", velocityMs=" + velocityMs +
                '}';
    }
}
