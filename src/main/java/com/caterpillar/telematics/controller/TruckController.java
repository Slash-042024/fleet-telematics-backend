package com.caterpillar.telematics.controller;

import com.caterpillar.telematics.model.Truck;
import com.caterpillar.telematics.service.TruckService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/trucks")
public class TruckController {

    private final TruckService truckService;

    public TruckController(TruckService truckService) {
        this.truckService = truckService;
    }

    @GetMapping
    public List<Truck> getAllTrucks() {
        return truckService.getAllTrucks();
    }

    @PostMapping
    public ResponseEntity<Truck> addTruck(@RequestBody Truck truck) {
        Optional<Truck> savedTruck = (Optional<Truck>) truckService.addNewTruck(truck);

        if (savedTruck.isPresent()) {
            return ResponseEntity.ok(savedTruck.get());
        } else {
            return ResponseEntity.badRequest().build();
        }
    }
}