package com.artco.co.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.artco.co.models.entity.Artista;

public interface ArtistaRepository extends JpaRepository<Artista, Integer> {

}
