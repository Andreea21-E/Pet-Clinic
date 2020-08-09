package com.andreea.petsClinic.controller;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.Date;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Entity
public class PetController {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int petId;

    private String race;
    private Date petDate;
    private Date petBirthday;
    private boolean isVaccinate;
}
