package com.geekster.Mapping_Practice.models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Laptop {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long ID;
    private String name;
    private String brand;
    private Integer price;

    @Embedded
    @OneToOne
    private Student student;
}
