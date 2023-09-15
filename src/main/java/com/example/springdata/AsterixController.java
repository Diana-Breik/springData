package com.example.springdata;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api")
public class AsterixController {
    private List<Character> characterList;

    public AsterixController(List<Character> characterList) {
        this.characterList = characterList;
    }

    @GetMapping("/asterix/characters")
    public List<Character> getCharacterList(){
        return characterList;
    }


}
