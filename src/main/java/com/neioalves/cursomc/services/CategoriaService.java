package com.neioalves.cursomc.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.Optional;
import com.neioalves.cursomc.domain.Categoria;
import com.neioalves.cursomc.repositories.CategoriaRepository;



@Service 
public class CategoriaService {
	
	@Autowired 
	private CategoriaRepository repo;
	
		
	public Categoria find(Integer id) {
		Optional<Categoria> obj = repo.findById(id);
		return obj.orElseThrow(() -> new com.neioalves.cursomc.services.exceptions.ObjectNotFoundException(
				"Objeto nÃ£o encontrado! Id: " + id + ", Tipo: " + Categoria.class.getName()));
	}
	
}

