package com.barbershop.Barbershop.repository;

import com.barbershop.Barbershop.model.Haircut;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface HaircutRepository extends MongoRepository<Haircut, Integer> {
}
