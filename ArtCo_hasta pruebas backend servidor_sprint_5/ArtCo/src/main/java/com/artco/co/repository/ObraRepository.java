package com.artco.co.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.artco.co.models.entity.Obra;
//import org.springframework.stereotype.Repository;

public interface ObraRepository extends JpaRepository<Obra, Integer> {

}
