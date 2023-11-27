package services;

import models.interfaces.IUser;
import repositories.UserRepository;

import java.util.ArrayList;
import java.util.List;

import models.entities.UserModel;

public class UserService {

    public UserRepository userRepository;
    
    public UserService() {
        this.userRepository = new UserRepository();
    }

    public boolean getUser(String username, String password) {
        UserModel user = userRepository.getUserByUsernameAndPassword(username, password);
        if (user != null) {
            return true;
        } else {
            return false;
        }	
	}

    public boolean createUser(UserModel userModel) {
        if(this.userRepository.addUserModel(userModel)){
            return true;
        } else {
            return false;
        }
        
    }

    public List<IUser> GetAllUsers(){

        List<IUser> UsersFiltrados = new ArrayList<IUser>(
				this.userRepository.getUsers() );
		
		return UsersFiltrados;
	}
	
}
