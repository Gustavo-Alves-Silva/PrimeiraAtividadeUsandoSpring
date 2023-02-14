package com.example.Atividade1.resource;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.Atividade1.entidade.Genero;
import com.example.Atividade1.repository.GeneroRepository;

@RestController
@RequestMapping(value = "/generos")
public class GeneroResource {
	
	@Autowired
	private GeneroRepository generoRepository;
	
	@GetMapping
	public ResponseEntity<List<Genero>> findAll(){
		
		List<Genero> list = generoRepository.findAll();
		
		return ResponseEntity.ok().body(list);
	}
	
	@GetMapping(value = "/{id}")
	public ResponseEntity<Genero> findById(@PathVariable long  id){
		Genero genero = generoRepository.findById(id).get();
		
		return ResponseEntity.ok().body(genero);
	}

}
