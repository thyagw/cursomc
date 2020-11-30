package com.neioalves.cursomc.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.Optional;
import com.neioalves.cursomc.domain.Cliente;
import com.neioalves.cursomc.repositories.ClienteRepository;



@Service 
public class ClienteService {
	
	@Autowired 
	private ClienteRepository repo;
	
		
	public Cliente find(Integer id) {
		Optional<Cliente> obj = repo.findById(id);
		return obj.orElseThrow(() -> new com.neioalves.cursomc.services.exceptions.ObjectNotFoundException(
				"Objeto nÃ£o encontrado! Id: " + id + ", Tipo: " + Cliente.class.getName()));
	}
	
}

    