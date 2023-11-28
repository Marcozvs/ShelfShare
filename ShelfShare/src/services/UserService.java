package services;

import models.interfaces.IUser;
import repositories.UserRepository;

public class UserService {

    private final UserRepository userRepository;

    public UserService() {
        this.userRepository = new UserRepository();
    }

    public boolean getUser(String username, String password) {
        return userRepository.getUser(username, password);
    }

    public boolean createUser(IUser userModel) {
        return userRepository.addUser(userModel);
    }
}
