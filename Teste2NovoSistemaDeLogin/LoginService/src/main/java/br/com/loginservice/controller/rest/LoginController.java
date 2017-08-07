package br.com.loginservice.controller.rest;

import org.slf4j.Logger;
import org.slf4j.impl.Log4jLoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.client.RestClientResponseException;

import br.com.loginservice.model.Login;
import br.com.loginservice.service.LoginService;

public class LoginController {
	Logger log = new Log4jLoggerFactory().getLogger(LoginController.class.toString());
	
	@Autowired
	LoginService serviceLogin;
	
	@RequestMapping(method=RequestMethod.POST, produces=MediaType.APPLICATION_JSON_VALUE,
			consumes=MediaType.APPLICATION_JSON_VALUE, value="/login")
	public ResponseEntity<Login> saveCampanha(@RequestBody Login userLogin) throws RestClientResponseException{		
		try{
			return new ResponseEntity<Login>(serviceLogin.logIn(userLogin), HttpStatus.CREATED);
		}catch (Exception e) {
			log.error(e.getMessage());
			log.error(e.getStackTrace().toString());
			throw new RestClientResponseException(e.getMessage(), 500, null, null, new byte[0], null);
		}
	}
}
