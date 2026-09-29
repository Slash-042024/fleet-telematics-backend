package com.caterpillar.telematics.service;

import com.caterpillar.telematics.model.Truck;
import com.caterpillar.telematics.repository.TruckRepository;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

@Service
public class TruckService {
    private final TruckRepository truckRepository;

    public TruckService(TruckRepository truckRepository) {
        this.truckRepository = truckRepository;
    }

    public List<Truck> getAllTrucks() {
        return truckRepository.findAll();
    }

    public Optional<Truck> addNewTruck(Truck truck) {
        if (truck == null) {
            return Optional.empty();
        }
        truckRepository.save(truck);
        return Optional.of(truck);
    }
}