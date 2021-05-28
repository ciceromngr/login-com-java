package br.com.telalogin.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.telalogin.model.UserLogin;

public interface UserLoginRepository extends JpaRepository<UserLogin, Long>{

	UserLogin findByEmail(String email);
}
