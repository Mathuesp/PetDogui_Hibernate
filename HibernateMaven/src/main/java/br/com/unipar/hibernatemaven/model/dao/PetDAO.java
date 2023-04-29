package br.com.unipar.hibernatemaven.model.dao;

import br.com.unipar.hibernatemaven.model.Pet;

public class PetDAO extends GenericDAO<Pet> {
    
    public PetDAO() {
        super(Pet.class);
    }
}
