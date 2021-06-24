package com.proyectoIntegrador.proyecto_integrador.repository;

import com.proyectoIntegrador.proyecto_integrador.model.Encuesta;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

import javax.persistence.EntityManager;
import java.util.List;

public interface EncuestaRepository extends JpaRepository<Encuesta, Long> {
}

