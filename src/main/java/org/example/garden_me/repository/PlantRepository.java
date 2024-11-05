package org.example.garden_me.repository;

import org.example.garden_me.model.Plant;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface PlantRepository extends JpaRepository<Plant, Integer> {
    Plant findPlantByPlantId(Integer id);
}
