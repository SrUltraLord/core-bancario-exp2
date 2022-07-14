package com.example.micro1.controller;

import com.example.micro1.model.Narc;
import com.example.micro1.service.NarcService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.websocket.server.PathParam;

@RestController
@RequestMapping("/narcs")
@RequiredArgsConstructor
public class NarcController {
  private final NarcService narcService;

  @GetMapping("/search")
  public ResponseEntity<Narc> findByFullName(@PathParam("fullName") String fullName) {
    return ResponseEntity.ok(narcService.findByName(fullName));
  }
}
