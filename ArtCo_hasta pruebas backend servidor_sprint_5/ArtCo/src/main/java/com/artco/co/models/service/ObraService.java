package com.artco.co.models.service;

import java.util.List;
import java.util.Optional;

import com.artco.co.models.entity.Obra;

public interface ObraService {
	
	public Optional<Obra>findById(Integer id);
	public List<Obra>findAll();
	public Obra save(Obra obra);
	public void deleteById(Integer id);

}
