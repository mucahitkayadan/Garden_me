package org.example.garden_me.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "gardens")
@Getter
@Setter
@NoArgsConstructor
public class Garden {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "garden_id")
    private Integer gardenId;

    @NotBlank(message = "Enter garden name")
    private String gardenName;

    private double gardenSize;

    @OneToMany(mappedBy = "garden")
//    @JoinTable(
//            name = "garden_plant",
//            joinColumns = @JoinColumn(name = "garden_id"),
//            inverseJoinColumns = @JoinColumn(name = "plant_id")
//    )
    private List<Plant> plants = new ArrayList<>();

    public Garden(String gardenName, double gardenSize) {
        this.gardenName = gardenName;
        this.gardenSize = gardenSize;
    }

    public void addPlant(Plant plant) {
       this.plants.add(plant);
    }

    @Override
    public String toString() {
        return "Garden{" +
                "gardenId=" + gardenId +
                ", gardenName='" + gardenName + '\'' +
                ", gardenSize=" + gardenSize +
                ", plants=" + plants +
                '}';
    }
}
