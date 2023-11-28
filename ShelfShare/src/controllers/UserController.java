package controllers;

import models.interfaces.IUser;
import services.UserService;

public class UserController {

    private final UserService userService;

    public UserController() {
        this.userService = new UserService();
    }

    public boolean getUser(String username, String password) {
        return userService.getUser(username, password);
    }

    public boolean createUser(IUser userModel) {
        return userService.createUser(userModel);
    }

    public IUser[] getAllUsers() {
        return userService.getAllUsers();
    }
}
