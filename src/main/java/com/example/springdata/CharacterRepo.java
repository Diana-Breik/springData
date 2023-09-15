package com.example.springdata;

import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

public interface CharacterRepo extends MongoRepository<Character, String> {
    Character getCharacterById(String id);
    void removeCharacterBy(String id);
    List <Character> findAllBy(String profession);

}
