package br.com.telalogin.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.telalogin.dto.UserLoginDto;
import br.com.telalogin.model.UserLogin;
import br.com.telalogin.service.UserLoginService;

@RestController
@RequestMapping("/lg")
@CrossOrigin(origins = "/")
public class UserLoginController {
	
	@Autowired
	UserLoginService userService;
	
	@PostMapping("/criar")
	public UserLogin criarConta(@RequestBody UserLogin user) throws Exception {
		return userService.criarConta(user);
	}
	
	@PostMapping("/logar")
	public UserLogin fazerLogin(@RequestBody UserLoginDto user) throws Exception {
		return userService.fazerLogin(user);
	}
	
	@GetMapping("/")
	public List<UserLogin> getAllUser() throws Exception{
		return userService.getAllUser();
	}
}
