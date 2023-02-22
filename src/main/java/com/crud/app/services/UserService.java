package com.crud.app.services;

import java.util.ArrayList;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.crud.app.models.UserModel;
import com.crud.app.repositories.IUserRepository;

@Service
public class UserService {
	@Autowired	
	IUserRepository userRepository;
	
	
	public ArrayList<UserModel> getUSers(){
		return (ArrayList<UserModel>) userRepository.findAll();
	}
	
	public UserModel saveUser(UserModel user) {
		return userRepository.save(user);
	}
	public Optional<UserModel> getById (Long id) {
		return userRepository.findById(id);
		
	}
	public UserModel updateById(UserModel request, Long id){
		UserModel user = userRepository.findById(id).get();
		user.setNombre(request.getNombre());
		user.setUser(request.getUser());
		return user;
	}
	
}
