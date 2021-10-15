package com.artco.co.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.artco.co.models.entity.Artista;
import com.artco.co.models.service.ArtistaService;

@RestController
@RequestMapping("/api/artistas")
public class ArtistaController {
	
	@Autowired 
	ArtistaService artistaService;
	
	@GetMapping("/{id}")
	public Optional<Artista> BuscarPorId(@PathVariable Integer id) {
		
		return artistaService.findById(id);
	}
	
	@GetMapping("/listar")
	public List<Artista> listar(){
		
		return artistaService.findAll();
	}
	
	@PostMapping 
	public Artista guardar(@RequestBody Artista artista) {
		
		return artistaService.save(artista);
	}
	
	@DeleteMapping("/{id}")
	public void eliminar(@PathVariable Integer id) {
		
		artistaService.deleteById(id);
	}
	
	@PostMapping("/actualizar")
	public Artista actualizar(@RequestBody Artista artista) {
		
		Artista AnBD = artistaService.findById(artista.getIdArtista()).get();
	
	AnBD.setNombre(artista.getNombre());
	AnBD.setApellido(artista.getApellido());
	AnBD.setEdad(artista.getEdad());
	AnBD.setMedio(artista.getMedio());
	AnBD.setDireccion(artista.getDireccion());
	AnBD.setTelefono(artista.getTelefono());
	AnBD.setEmail(artista.getEmail());
	AnBD.setEstado(artista.getEstado());
	
	return artistaService.save(AnBD);
	}

}
