package org.example.garden_me.repository;

import org.example.garden_me.model.Garden;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GardenRepository extends JpaRepository<Garden, Integer> {
    Garden findGardenByGardenId(Integer gardenId);

}
