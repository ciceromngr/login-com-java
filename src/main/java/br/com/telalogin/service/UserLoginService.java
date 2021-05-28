package br.com.telalogin.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.telalogin.dto.UserLoginDto;
import br.com.telalogin.model.UserLogin;
import br.com.telalogin.repository.UserLoginRepository;

@Service
public class UserLoginService {

	@Autowired
	UserLoginRepository userRepository;
	
	public UserLogin criarConta(UserLogin user) throws Exception {
		return userRepository.save(user);
	}
	
	public UserLogin fazerLogin(UserLoginDto user) throws Exception {
		UserLogin userLogin = userRepository.findByEmail(user.getEmail());
		
		if(user.getSenha() == userLogin.getSenha()) {
			return userLogin;			
		}
		
		return null;
	}
	
	public List<UserLogin> getAllUser() throws Exception {
		return userRepository.findAll();
	}
}