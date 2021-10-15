package com.artco.co.models.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.artco.co.models.entity.Artista;
import com.artco.co.repository.ArtistaRepository;

@Service
public class ArtistaServiceImple implements ArtistaService{
	
	@Autowired
	ArtistaRepository artistaRepository;
	
	@Override
	public Optional<Artista>findById (Integer id) {
	
		return artistaRepository.findById(id);
	}

	@Override
	public List<Artista> findAll() {
		
		return artistaRepository.findAll();
	}

	@Override
	public Artista save(Artista artista) {
		
		return artistaRepository.save(artista);
	}

	@Override
	public void deleteById (Integer id) {
	 artistaRepository.deleteById(id);
		
	}

}
