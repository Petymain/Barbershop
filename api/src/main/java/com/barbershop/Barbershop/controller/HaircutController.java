package com.barbershop.Barbershop.controller;

import com.barbershop.Barbershop.model.Haircut;
import com.barbershop.Barbershop.repository.HaircutRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class HaircutController {

    @Autowired
    private HaircutRepository repository;


    @PostMapping("/haircut")
    public String addHaircut(@RequestBody Haircut haircut) {
        repository.save(haircut);
        return "Haircut saved !";
    }

    @GetMapping("/haircut")
    public List<Haircut> getHaircuts() {
        return repository.findAll();
    }

    @DeleteMapping("/haircut/{id}")
    public void delete(@PathVariable int id) {
        repository.deleteById(id);
    }
}
