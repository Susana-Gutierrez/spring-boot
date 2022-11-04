package com.susie.dao;

import com.susie.model.Person;

import java.util.UUID;

public interface PesonDao {

    int insertPerson(UUID id, Person person);
    default int addPerson(Person person){
        UUID id = UUID.randomUUID();
        return insertPerson(id, person);
    }

}
