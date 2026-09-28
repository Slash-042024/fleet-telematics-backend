package com.caterpillar.telematics.model;

public class Truck {
    private Long truckID;
    private String modelName;
    private String operationalStatus;
    private double engineTemperature;

    public Truck(Long truckID, String modelName, String operationalStatus, double engineTemperature){
        this.truckID = truckID;
        this.modelName = modelName;
        this.operationalStatus = operationalStatus;
        this.engineTemperature = engineTemperature;
    }

    public Long getTruckID() {return truckID; }
    public void setTruckID(Long truckID) {this.truckID = truckID; }

    public String getModelName() { return modelName; }

    public void setModelName(String modelName) {
        this.modelName = modelName;
    }

    public String getOperationalStatus() { return operationalStatus;}


    public void setOperationalStatus(String operationalStatus) {
        this.operationalStatus = operationalStatus;
    }

    public double getEngineTemperature() { return engineTemperature; }
    public void setEngineTemperature(double engineTemperature) {
        this.engineTemperature = engineTemperature;}
}
