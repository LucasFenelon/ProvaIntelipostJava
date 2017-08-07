package br.com.loginservice.controller;

import org.slf4j.Logger;
import org.slf4j.impl.Log4jLoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.client.RestClientResponseException;
import org.springframework.web.servlet.ModelAndView;

import br.com.loginservice.model.Login;
import br.com.loginservice.service.LoginService;

@Controller
@Scope(value = "request")
public class LoginController {
	Logger log = new Log4jLoggerFactory().getLogger(LoginController.class.toString());
	
	@Autowired
	LoginService serviceLogin;
	
	@RequestMapping(method=RequestMethod.GET, value="/")
	public ModelAndView login(@RequestBody Login userLogin) throws RestClientResponseException{
		log.info("method login - init");
		ModelAndView view = new ModelAndView();
		
		try{
			serviceLogin.logIn(userLogin);
			view.addObject("userLogin", userLogin);
			log.info("method login - sucess");
		}catch (Exception e) {
			log.error(e.getMessage());
			log.error(e.getStackTrace().toString());
			view.setStatus(HttpStatus.BAD_REQUEST);			
		}
		
//		log.info("method login - done");
		return view;
	}
}
