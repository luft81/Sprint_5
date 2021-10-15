package com.artco.co.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.artco.co.models.entity.Tipo;
import com.artco.co.models.service.TipoService;

@RestController
@RequestMapping ("/api/tipos")
public class TipoController {
	
	@Autowired
	TipoService tipoService;
	
	@GetMapping("/{id}")
	public Optional<Tipo>buscarPorId(@PathVariable Integer id){
		
		return tipoService.findById(id);	
	}
	
	@GetMapping("/listar")
	public List<Tipo> listarTodos(){
         
		return tipoService.findAll();
	}
	
	@PostMapping
	public Tipo guardar(@RequestBody Tipo tipo) {
		return tipoService.save(tipo);
	}
	
	@PutMapping("/actualizar/{id}")
	public Tipo actualizar(@RequestBody Tipo tipo, @PathVariable Integer id) {
		
		Tipo TnBD=tipoService.findById(id).get();
		
		System.out.println("t por body: "+tipo);
		System.out.println("tn DB"+TnBD);
		TnBD.setNombre(tipo.getNombre());
		TnBD.setDescripcion(tipo.getDescripcion());
		System.out.println("Así quedó en DB"+TnBD);
		
		tipoService.save(TnBD);
		return tipo;	
	}
	
	@DeleteMapping("{id}")
	public void eliminar(@PathVariable Integer id) {
		
		tipoService.deleteById(id);
	}

}
