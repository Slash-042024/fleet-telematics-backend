package com.caterpillar.telematics.service;

import com.caterpillar.telematics.model.Truck;
import com.caterpillar.telematics.repository.TruckRepository;
import org.springframework.stereotype.Service;
import java.util.List;

@Service

public class TruckService {
    private final TruckRepository truckRepository;

    public TruckService(TruckRepository truckRepository) {
        this.truckRepository = truckRepository;
    }
    public List<Truck> getAllTrucks() {
        return truckRepository.findAll();
    }

    public <Truck> Object addNewTruck(Truck truck) {
        return null;
    }
