package com.barbershop.Barbershop.controller;

import com.barbershop.Barbershop.model.Appointment.Appointment;
import com.barbershop.Barbershop.repository.AppointmentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class AppointmentController {

    @Autowired
    private AppointmentRepository repository;

    @PostMapping("/appointment")
    public List<Appointment> getAppointments() {
        return repository.findAll();
    }


    @GetMapping("/appointment")
    public String createAppointment(@RequestBody Appointment appointment) {
        repository.save(appointment);
        return "Appointment: " + appointment.getId() + " added !";
    }
}
