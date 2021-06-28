package com.pet.petClinic.services;
/**
 * Created by Henrietha 26/06/2021
 */

import com.pet.petClinic.model.Pet;

import java.util.Set;

public interface PetService {

    Pet findById(Long id);
    Pet save(Pet pet);
    Set<Pet> findAll();
}
