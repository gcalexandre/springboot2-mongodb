package com.alexandrecastilho.workshopmongo.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.alexandrecastilho.workshopmongo.domain.User;
import com.alexandrecastilho.workshopmongo.dto.UserDTO;
import com.alexandrecastilho.workshopmongo.repository.UserRepository;
import com.alexandrecastilho.workshopmongo.services.exception.ObjectnotFoundException;

@Service
public class UserService {
	
	@Autowired
	private UserRepository repo;
	public List<User> findAll() {
		return repo.findAll();
		
	}
	
	public User findById(String id) {
		Optional<User> obj = repo.findById(id);
				return obj.orElseThrow(()-> new ObjectnotFoundException("objeto não encontrado"));
		}
		
	public User insert(User obj) {
		return repo.insert(obj);
	}
	
	public User fromDTO(UserDTO objDto) {
		return new User(objDto.getId(), objDto.getName(), objDto.getEmail());
		
	}

		
	}


