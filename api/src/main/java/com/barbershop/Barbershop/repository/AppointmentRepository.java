package com.barbershop.Barbershop.repository;

import com.barbershop.Barbershop.model.Appointment;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface AppointmentRepository extends MongoRepository<Appointment, String> {
}
