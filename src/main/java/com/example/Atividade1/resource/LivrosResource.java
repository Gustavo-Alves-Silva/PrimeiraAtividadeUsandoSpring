package com.example.Atividade1.resource;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.Atividade1.entidade.Livro;
import com.example.Atividade1.repository.LivrosRepository;

@RestController
@RequestMapping(value = "/livros")
public class LivrosResource {
	
	@Autowired
	private LivrosRepository livrosRepository;
	
	@GetMapping
	public ResponseEntity<List<Livro>> findAll(){
		
		List<Livro> list = livrosRepository.findAll();
		
		return ResponseEntity.ok().body(list);
	}
	
	@GetMapping(value = "/{id}")
	public ResponseEntity<Livro> findById(@PathVariable long  id){
		Livro livro = livrosRepository.findById(id).get();
		
		return ResponseEntity.ok().body(livro);
	}

}
