package com.example.raisetech.task9;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
public class NameController {

    private final NameService nameService;

    public NameController(NameService nameService) {
        this.nameService = nameService;
    }

    @GetMapping("/names")
    public List<Name> getNames() {
        return nameService.findAll();

    }

    @GetMapping("/{id}")
    public Optional<Name> getUser(@RequestParam("id") int id) {
        return nameService.findById(id);
    }
}
