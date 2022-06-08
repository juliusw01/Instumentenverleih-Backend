package Ingo.Instrumentenverleih.repositories;

import java.util.Optional;
import java.util.UUID;

import org.springframework.data.repository.CrudRepository;

import Ingo.Instrumentenverleih.model.Benutzer;

public interface BenutzerRepository extends CrudRepository<Benutzer, UUID>{
    Optional<Benutzer> findByname(String name);
}
