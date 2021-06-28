package com.pet.petClinic.services;
/**
 * Created by Henrietha 26/06/2021
 */
import com.pet.petClinic.model.Owner;

import java.util.Set;

public interface OwnerService {

    Owner findByLastName(String lastName);
    Owner findById(Long id);
    Owner save(Owner owner);
    Set<Owner> findAll();
}
