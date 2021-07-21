package com.pet.petClinic.bootstrap;

import com.pet.petClinic.model.Owner;
import com.pet.petClinic.model.Vet;
import com.pet.petClinic.services.OwnerService;
import com.pet.petClinic.services.VetService;
import com.pet.petClinic.services.map.OwnerServiceMap;
import com.pet.petClinic.services.map.VetServiceMap;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoader  implements CommandLineRunner {

    private final OwnerService ownerService;
    private final VetService vetService;

    public DataLoader(OwnerService ownerService, VetService vetService) {
        this.ownerService = ownerService;
        this.vetService = vetService;
    }

    @Override
    public void run(String... args) throws Exception {

        Owner owner1 = new Owner();
        owner1.setId(1L);
        owner1.setFirstName("John");
        owner1.setLastName("Doe");

        ownerService.save(owner1);

        Owner owner2 = new Owner();
        owner2.setId(2L);
        owner2.setFirstName("Amaka");
        owner2.setLastName("Mike");

        ownerService.save(owner2);

        System.out.println("Loaded owners...");

        Vet vet1 = new Vet();
        vet1.setId(1L);
        vet1.setFirstName("Alex");
        vet1.setLastName("Jack");

        vetService.save(vet1);

        Vet vet2 = new Vet();
        vet2.setId(2L);
        vet2.setFirstName("Tony");
        vet2.setLastName("Smith");

        vetService.save(vet2);

        System.out.println("Loaded vets...");
    }
}
