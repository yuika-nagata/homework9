package com.example.raisetech.task9;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
public class NameController {

    private final NameMapper nameMapper;

    public NameController(NameMapper nameMapper) {
        this.nameMapper = nameMapper;
    }

    @GetMapping("/names")
    public List<Name> getName(){
        List<Name> names=nameMapper.findAll();
        return names;
    }
    @GetMapping("/{id}")
    public Optional<Name> getUser(@RequestParam("id")int id){
        Optional<Name> users=nameMapper.findById(id);
        return users;
    }
}
