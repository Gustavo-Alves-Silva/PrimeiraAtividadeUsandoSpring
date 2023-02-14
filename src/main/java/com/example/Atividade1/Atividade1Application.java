package com.example.Atividade1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.Atividade1.entidade.Genero;
import com.example.Atividade1.entidade.Livro;
import com.example.Atividade1.repository.GeneroRepository;
import com.example.Atividade1.repository.LivrosRepository;

@SpringBootApplication
public class Atividade1Application implements CommandLineRunner{
	
	@Autowired
	private GeneroRepository generoRepository;
	
	@Autowired
	private LivrosRepository livrosRepository;

	public static void main(String[] args) {
		SpringApplication.run(Atividade1Application.class, args);
	}
	
	@Override
	public void run(String... args) throws Exception {
		Genero romance = new Genero("romance");
		Genero acao = new Genero("ação");
		Genero ficcao = new Genero("ficção");
		
		Livro Anna_Karenina = new Livro("Anna Karênia","Liev",romance);
		Livro Wuthering_Heights = new Livro("Wuthering Heights","Emily",romance);
		Livro Romeu_e_Julieta = new Livro("Romeu e Julieta","Shakespeare",romance);
		Livro O_hobbit = new Livro("O hobbit","Tolkien",acao);
		Livro Divergente = new Livro("Divergente","Veronica",acao);
		Livro A_Esperanca = new Livro("A Esperanca","Suzanne",acao);
		Livro I_Robot = new Livro("I,Robot","Issac",ficcao);
		Livro Duna = new Livro("Duna","Frank",ficcao);
		Livro Frankenstein = new Livro("Frankenstein","Mary",ficcao);
		
		generoRepository.save(romance);
		generoRepository.save(acao);
		generoRepository.save(ficcao);
		
		livrosRepository.save(Anna_Karenina);
		livrosRepository.save(Wuthering_Heights);
		livrosRepository.save(Romeu_e_Julieta);
		livrosRepository.save(O_hobbit);
		livrosRepository.save(Divergente);
		livrosRepository.save(A_Esperanca);
		livrosRepository.save(I_Robot);
		livrosRepository.save(Duna);
		livrosRepository.save(Frankenstein);
		
	}

}
