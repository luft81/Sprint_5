package com.artco.co.models.service;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.artco.co.models.entity.Tipo;
import com.artco.co.repository.TipoRepository;

@Service
public class TipoServiceImple implements TipoService{
	
	@Autowired
	TipoRepository tipoRepository;
	
	@Override
	public Optional<Tipo> findById(Integer id){
		// TODO Auto-generated method stub
		return tipoRepository.findById(id);
	}
	
	@Override
	public List<Tipo> findAll(){
		// TODO Auto-generated method stub
		return tipoRepository.findAll();
	}

	@Override
	public Tipo save(Tipo tipo) {
		// TODO Auto-generated method stub
		return tipoRepository.save(tipo);
	}

	@Override
	public void deleteById(Integer id) {
		tipoRepository.deleteById(id);	
	}
}
