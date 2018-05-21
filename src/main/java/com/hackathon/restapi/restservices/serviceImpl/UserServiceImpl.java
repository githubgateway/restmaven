package com.hackathon.restapi.restservices.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

//import com.hackathon.restapi.restservices.entity.UserEntity;
//import com.hackathon.restapi.restservices.repository.UserRepository;
import com.hackathon.restapi.restservices.service.UserService;

@Service
public class UserServiceImpl implements UserService{
	//@Autowired
	//UserRepository userRepository;
	
	
	public String updateUser(String userId, String password) {
		// TODO Auto-generated method stub
	/*	List<UserEntity> userentities = userRepository.findAll();
		for(UserEntity userentity : userentities){
			System.out.println(userentity.getUserId() + " " + userentity.getPassword());
		}
		return "1"; */
		return "sucess";	
	}
		
}
