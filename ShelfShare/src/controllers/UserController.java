package controllers;

import models.entities.UserModel;
import services.UserService;

public class UserController {
	
	private UserService userService;
	
	public UserController() {
		this.userService = new UserService();
	}
	
	public boolean createUser(UserModel userModel) {
		
		return userService.createUser(userModel);		
	}
}
