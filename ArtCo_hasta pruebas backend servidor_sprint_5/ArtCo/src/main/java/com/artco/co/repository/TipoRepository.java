package com.artco.co.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.artco.co.models.entity.Tipo;
import org.springframework.stereotype.Repository;

@Repository
public interface TipoRepository extends JpaRepository<Tipo, Integer>{

}
