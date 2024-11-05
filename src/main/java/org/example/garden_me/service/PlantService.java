package org.example.garden_me.service;

import org.example.garden_me.model.Plant;

import java.util.List;
import java.util.Optional;

public interface PlantService {
    Optional<Plant> getPlant(Integer id);
    Optional<Plant> addNewPlant(Plant plant);
    Optional<Plant> updatePlant(Plant plant);
    void deletePlant(Integer id);
    List<Plant> getAllPlants();
    List<Plant> sortPlants();
}
