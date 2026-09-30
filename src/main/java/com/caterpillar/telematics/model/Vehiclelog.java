package com.caterpillar.telematics.model;

import jakarta.persistence.*;
import org.hibernate.annotations.Audited;

import java.time.LocalDateTime;

@Entity
@Table(name = "vehicle_logs")

public class Vehiclelog {

    @Id@GeneratedValue(strategy = GenerationType.IDENTITY)
    private  Long id;

    @Column(name = "vehicle_id", nullable = false)
    private  String vehicleId;
    @Column(nullable = false)
    private  double speed;
    @Column(nullable = false)
    private  LocalDateTime timestamp;

    // Constructors

    public Vehiclelog(){}

    public Vehiclelog(String vehicleId, double speed, LocalDateTime timestamp) {
        this.vehicleId = vehicleId;
        this.speed = speed;
        this.timestamp = timestamp;
    }

    public Long getId(){return id; }
    public String getVehicleId() {return vehicleId; }
    public void setVehicleId(String vehicleId) {this.vehicleId = vehicleId; }
    public double getSpeed() { return speed; }
    public void setSpeed(double speed) { this.speed = speed; }
    public LocalDateTime getTimestamp() { return timestamp; }
    public void setTimestamp(LocalDateTime timestamp) { this.timestamp = timestamp; }

}
