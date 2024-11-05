package org.example.garden_me.service;

import org.example.garden_me.model.Garden;
import org.example.garden_me.model.Plant;
import org.example.garden_me.repository.GardenRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public interface GardenService {
    Optional<Garden> findByGardenId(Integer id);
    Optional<Garden> addNewGarden(Garden garden);
    Garden updateGarden(Garden garden);
    void deleteGarden(Integer id);
    List<Plant> addNewPlant(Integer plantId, Garden garden);
}
