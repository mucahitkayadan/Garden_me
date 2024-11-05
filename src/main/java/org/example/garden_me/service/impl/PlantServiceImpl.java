package org.example.garden_me.service.impl;

import lombok.RequiredArgsConstructor;
import org.example.garden_me.model.Plant;
import org.example.garden_me.repository.PlantRepository;
import org.example.garden_me.service.PlantService;
import org.springframework.stereotype.Service;

import java.util.Optional;

@RequiredArgsConstructor
@Service
public class PlantServiceImpl implements PlantService {
    private final PlantRepository plantRepository;

    @Override
    public Optional<Plant> getPlant(Integer id) {
        return Optional.ofNullable(plantRepository.findPlantByPlantId(id));
    }

    @Override
    public Optional<Plant> addNewPlant(Plant plant) {
        return Optional.of(plantRepository.save(plant));
    }

    @Override
    public Optional<Plant> updatePlant(Plant plant) {
        return Optional.of(plantRepository.save(plant));
    }

    @Override
    public void deletePlant(Integer id) {
        plantRepository.deleteById(id);
    }

}
