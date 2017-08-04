package br.com.loginservice.service;

import org.springframework.stereotype.Service;

import br.com.loginservice.model.Login;

@Service
public class LoginService {
	
	public Login logIn(Login login){
		return new Login();
	}

}
