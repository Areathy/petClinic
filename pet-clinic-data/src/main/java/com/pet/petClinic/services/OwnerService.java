package com.pet.petClinic.services;
/**
 * Created by Henrietha 26/06/2021
 */
import com.pet.petClinic.model.Owner;

public interface OwnerService extends CrudService<Owner, Long>{

    Owner findByLastName(String lastName);
}
