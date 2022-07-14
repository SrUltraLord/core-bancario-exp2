package com.example.micro1.service;

import com.example.micro1.exception.NotFoundException;
import com.example.micro1.model.Narc;
import com.example.micro1.repository.NarcRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class NarcService {
  private final NarcRepository narcRepository;

  public Narc findByName(String fullName) {
    return narcRepository
        .findByFullName(fullName)
        .orElseThrow(
            () -> new NotFoundException("No se ha encontrado un narco con el nombre " + fullName));
  }
}
