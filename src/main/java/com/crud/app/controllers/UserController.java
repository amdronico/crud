package com.crud.app.controllers;

import java.util.ArrayList;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.crud.app.models.UserModel;
import com.crud.app.services.UserService;

@RestController
@RequestMapping("/user")
public class UserController {
	
	@Autowired
	private UserService userService;
	@GetMapping
	public ArrayList<UserModel> getUser(){
		return this.userService.getUSers();
	}
	
	@PostMapping
	public UserModel saveUser(@RequestBody UserModel user) {
		return this.userService.saveUser(user);
	}
	@GetMapping(path = "/{id}")
	public Optional<UserModel> getUserbyId(@PathVariable("id") Long id){
		return this.userService.getById(id);
	}
	@PutMapping (path = "/{id}")
	public UserModel updateUserBy(@RequestBody UserModel request, @PathVariable("id") Long id) {
		return this.userService.updateById(request, id);
	}

	
}
