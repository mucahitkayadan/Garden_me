package org.example.garden_me.service.impl;

import lombok.RequiredArgsConstructor;
import org.example.garden_me.model.Garden;
import org.example.garden_me.model.Plant;
import org.example.garden_me.repository.GardenRepository;
import org.example.garden_me.repository.PlantRepository;
import org.example.garden_me.service.GardenService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@RequiredArgsConstructor
@Service
public class GardenServiceImpl implements GardenService {
    private final GardenRepository gardenRepository;
    private final PlantRepository plantRepository;

    @Override
    public Optional<Garden> findByGardenId(Integer id) {
        return Optional.of(gardenRepository.findGardenByGardenId(id));
    }

    @Override
    public Optional<Garden> addNewGarden(Garden garden) {
        return Optional.of(gardenRepository.save(garden));
    }

    @Override
    public Garden updateGarden(Garden garden) {
        return gardenRepository.save(garden);
    }

    @Override
    public void deleteGarden(Integer id) {
        gardenRepository.deleteById(id);
    }

    @Override
    public List<Plant> addNewPlant(Integer plantId, Garden garden) {
        garden.addPlant(plantRepository.findPlantByPlantId(plantId));
        return garden.getPlants();
    }
}
