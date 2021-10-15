package com.artco.co.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.artco.co.models.entity.Obra;
import com.artco.co.models.service.ObraService;

@RestController
@RequestMapping("/api/obras")
@CrossOrigin(origins="*", methods= {RequestMethod.GET, RequestMethod.POST, RequestMethod.PUT, RequestMethod.DELETE})
public class ObraController {
	
	@Autowired
	ObraService obraService;
	
	@GetMapping("/{id}")
	public Optional<Obra>buscarPorId(@PathVariable Integer id){
		
		return obraService.findById(id);	
	}
	
	@GetMapping("/listar")
	public List<Obra> listarTodos(){
         
		return obraService.findAll();
	}
	
	@PostMapping
	public Obra guardar(@RequestBody Obra obra) {
		return obraService.save(obra);
	}
	
	@PutMapping("/actualizar/{id}")
	public Obra actualizar(@RequestBody Obra obra, @PathVariable Integer id) {
		
		Obra OnBD=obraService.findById(id).get();
		
		System.out.println("o por body: "+obra);
		System.out.println("on DB"+OnBD);
		OnBD.setTitulo(obra.getTitulo());
		OnBD.setAutor(obra.getAutor());
		OnBD.setTipo(obra.getTipo());
		OnBD.setTecnica(obra.getTecnica());
		OnBD.setAño(obra.getAño());
		OnBD.setDimensiones(obra.getDimensiones());
		OnBD.setEstado(obra.getEstado());
		OnBD.setUbicacion(obra.getUbicacion());
		OnBD.setAvaluo(obra.getAvaluo());
		OnBD.setIdArtista(obra.getIdArtista());
		
		System.out.println("Así quedó en DB"+OnBD);
		
		obraService.save(OnBD);
		return obra;	
	}
	
	@DeleteMapping("{id}")
	public void eliminar(@PathVariable Integer id) {
		
		obraService.deleteById(id);
	}

}
