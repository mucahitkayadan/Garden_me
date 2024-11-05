package org.example.garden_me.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.example.garden_me.service.GardenService;

import java.time.LocalDate;

@Entity
@Table(name = "plants")
@NoArgsConstructor
@Getter
@Setter
public class Plant {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name = "plant_id")
    private Integer plantId;

    @NotBlank(message = "Enter plant name")
    private String plantName;
    @NotBlank(message = "Enter plant type")
    private String plantType;

    private LocalDate plantDate;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "garden_id")
    private Garden garden;


    public Plant(String plantName, String plantType) {
        this.plantName = plantName;
        this.plantType = plantType;
    }

    public Plant(String plantName, String plantType, LocalDate plantDate) {
        this.plantName = plantName;
        this.plantType = plantType;
        this.plantDate = plantDate;
    }

    @Override
    public String toString() {
        return "Plant{" +
                "plantId=" + plantId +
                ", plantName='" + plantName + '\'' +
                ", plantType='" + plantType + '\'' +
                ", plantDate=" + plantDate +
                '}';
    }

}
