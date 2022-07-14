package com.example.micro1;

import com.example.micro1.model.Narc;
import com.example.micro1.repository.NarcRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.List;

@SpringBootApplication
public class Micro1Application {

  public static void main(String[] args) {
    SpringApplication.run(Micro1Application.class, args);
  }

  @Bean
  CommandLineRunner runner(NarcRepository repository) {
    return args -> {
      var n1 = Narc.builder().fullName("Erlich Bachman").isPenalized(true).build();
      var n2 = Narc.builder().fullName("David Reyes").isPenalized(false).build();
      var n3 = Narc.builder().fullName("Richard Hendricks").isPenalized(false).build();
      var n4 = Narc.builder().fullName("Jared Joestar").isPenalized(false).build();
      var n5 = Narc.builder().fullName("Johnny Joestar").isPenalized(false).build();
//      repository.saveAll(List.of(n1, n2, n3, n4, n5));
    };
  }
}
