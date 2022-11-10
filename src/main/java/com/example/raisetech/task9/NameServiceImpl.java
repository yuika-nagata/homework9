package com.example.raisetech.task9;

import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class NameServiceImpl implements NameService {

    private NameMapper nameMapper;

    public NameServiceImpl(NameMapper nameMapper) {
        this.nameMapper = nameMapper;
    }

    @Override
    public List<Name> findAll() {return nameMapper.findAll();
    }

    @Override
    public Optional<Name> findById(int id) {
        Optional<Name> users = nameMapper.findById(id);
        return users;
    }
}
