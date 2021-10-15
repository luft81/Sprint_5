package com.artco.co.models.service;

import java.util.List;
import java.util.Optional;
import com.artco.co.models.entity.Artista;

public interface ArtistaService {
	
	public Optional<Artista>findById(Integer id);
	public List<Artista> findAll();
	public Artista save(Artista artista);
	public void deleteById(Integer id);
}
