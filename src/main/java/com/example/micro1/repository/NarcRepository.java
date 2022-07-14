package com.example.micro1.repository;

import com.example.micro1.model.Narc;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.Optional;

public interface NarcRepository extends MongoRepository<Narc, String> {
  Optional<Narc> findByFullName(String fullName);
}
