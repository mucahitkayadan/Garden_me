package org.example.garden_me;

import lombok.RequiredArgsConstructor;
import org.example.garden_me.model.Garden;
import org.example.garden_me.model.Plant;
import org.example.garden_me.service.GardenService;
import org.example.garden_me.service.PlantService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.time.LocalDate;
import java.util.Collections;

@SpringBootApplication
@RequiredArgsConstructor
public class GardenMeApplication {
    private final GardenService gardenService;
    private final PlantService plantService;

    public static void main(String[] args) {
        SpringApplication.run(GardenMeApplication.class, args);
    }

    @Bean
    public CommandLineRunner commandLineRunner() {
        return args -> {
            Garden garden1 = new Garden("Vegetable Patch", 50.0);
            garden1.setGardenId(1);
            Garden garden2 = new Garden("Herb", 20.0);
            garden2.setGardenId(2);
            Plant plant1 = new Plant("Tomato", "Vegetable", LocalDate.of(2024,3,10));
            plant1.setGarden(garden1);
            garden1.addPlant(plant1);
            Plant plant2 = new Plant("Carrot", "Vegetable", LocalDate.of(2024,2,20));
            plant2.setGarden(garden1);
            garden1.addPlant(plant2);
            Plant plant3 = new Plant( "Basil", "Herb", LocalDate.of(2024,4,5));
            plant3.setGarden(garden2);
            garden2.addPlant(plant3);

            System.out.println(garden1);
            System.out.println(garden2);

        };
    }
}
