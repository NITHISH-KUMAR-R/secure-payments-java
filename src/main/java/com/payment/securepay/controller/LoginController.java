package com.payment.securepay.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.payment.securepay.service.LoginService;

@RestController
@RequestMapping("/payment") 
public class LoginController {
	
	LoginService loginService;
	
	public LoginController(LoginService loginService) {
		this.loginService = loginService;	
	}
	
	
	@GetMapping("/login")
	public ResponseEntity<String> loginCheck(@RequestParam String userName, @RequestParam String password){
		boolean s = loginService.loginCheck(userName,password);
		String returnResponse ="notDone";
		if(s) {
			returnResponse = "done";
		}
		return new ResponseEntity<String>(returnResponse, HttpStatus.OK);
	}

}
