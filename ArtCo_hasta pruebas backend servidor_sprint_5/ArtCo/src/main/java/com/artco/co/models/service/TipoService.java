package com.artco.co.models.service;

import java.util.List;
import java.util.Optional;

import com.artco.co.models.entity.Tipo;

public interface TipoService {
	
	public Optional<Tipo>findById(Integer id);
	public List<Tipo>findAll();
	public Tipo save(Tipo tipo);
	public void deleteById(Integer id);

}
