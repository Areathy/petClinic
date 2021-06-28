package com.pet.petClinic.services;
/**
 * Created by Henrietha 26/06/2021
 */
import com.pet.petClinic.model.Vet;

import java.util.Set;

public interface VetService {

    Vet findById(Long id);
    Vet save(Vet vet);
    Set<Vet> findAll();
}
