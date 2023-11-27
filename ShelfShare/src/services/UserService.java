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

    public boolean createUser(UserModel userModel) {
        //Criar usuário no banco de dados ou em alguma estrutura de dados
        boolean users = this.userRepository.addUserModel(userModel);
        return true;
    }

    public List<IUser> GetAllUsers(){

        List<IUser> UsersFiltrados = new ArrayList<IUser>(
				this.userRepository.getUsers() );
		
		return UsersFiltrados;
	}
	
}
