package com.payment.securepay.serviceImpl;

import org.springframework.stereotype.Service;

import com.payment.securepay.repository.UserRespository;
import com.payment.securepay.service.LoginService;

@Service
public class LoginServiceImpl  implements LoginService{
	
	UserRespository respository;
	
	public LoginServiceImpl(UserRespository respository) {
		this.respository = respository;
	}

	@Override
	public boolean loginCheck(String userName, String password) {
		 boolean check = respository.existsByuserName(userName);
		return check;
	}
	
	

}
