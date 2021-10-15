package com.artco.co.models.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.artco.co.models.entity.Obra;
import com.artco.co.repository.ObraRepository;

@Service
public class ObraServiceImple implements ObraService{
	
	@Autowired
	ObraRepository obraRepository;
	
	@Override
	public Optional<Obra> findById(Integer id){
		// TODO Auto-generated method stub
		return obraRepository.findById(id);
	}
	
	@Override
	public List<Obra> findAll(){
		// TODO Auto-generated method stub
		return obraRepository.findAll();
	}

	@Override
	public Obra save(Obra obra) {
		// TODO Auto-generated method stub
		return obraRepository.save(obra);
	}

	@Override
	public void deleteById(Integer id) {
		obraRepository.deleteById(id);	
	}

}
