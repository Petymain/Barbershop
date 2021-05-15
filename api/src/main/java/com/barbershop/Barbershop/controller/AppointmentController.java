package com.barbershop.Barbershop.controller;

import com.barbershop.Barbershop.model.Appointment;
import com.barbershop.Barbershop.repository.AppointmentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "*", allowedHeaders = "*")
@RestController
public class AppointmentController {

    @Autowired
    private AppointmentRepository repository;

    @GetMapping("/appointment")
    public List<Appointment> getAll() {
        return repository.findAll();
    }
    
    @PostMapping("/appointment")
    public String create(@RequestBody Appointment appointment) {
        repository.save(appointment);
        return "Appointment: " + appointment.getId() + " added !";
    }


    @DeleteMapping("/appointment/{id}")
    public void delete(@PathVariable String id) {
        repository.deleteById(id);
    }
}
