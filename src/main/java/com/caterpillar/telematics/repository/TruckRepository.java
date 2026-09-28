package com.caterpillar.telematics.repository;

import com.caterpillar.telematics.model.Truck;
import org.springframework.stereotype.Repository;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Repository

public class TruckRepository {
    // 4. Create a private data structure to hold your truck objects in memory (Hint: use a List of type Truck)
    private final List<Truck> truckList = new ArrayList<>();
    // 5. Write a method called "findAll" that returns the entire list of trucks
    public List<Truck> findAll(){
        return truckList;
    }
    // 6. Write a method called "save" that takes a Truck object as a parameter and adds it to your list
    public void save(Truck truck) {
        truckList.add(truck);
    }

    // 7. Write a method called "findById" that takes a Long truckId and searches your list to return a matching truck (Hint: you can use Java streams or a simple loop)
    public Optional<Truck> findByID(Long id) {
        if (id == null){
            return Optional.empty();
        }

        return truckList.stream()
                .filter(truck -> id.equals(truck.getTruckID()))
                .findFirst();
    }

}

