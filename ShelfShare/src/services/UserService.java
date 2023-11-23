package services;

import models.enums.TipoLivroEnum;
import models.enums.UserTypeEnum;
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

    public boolean createUser(int id, String name, int age, char genere, UserTypeEnum userType, String password, String user, TipoLivroEnum tiposFavLivros){
        UserModel userModel = new UserModel();
        userModel.User(id, name, age, genere, userType, password, user,tiposFavLivros);
        return this.userRepository.addUserModel(userModel);
	}

    public List<IUser> GetAllUsers(){

        List<IUser> UsersFiltrados = new ArrayList<IUser>(
				this.userRepository.getUsers() );
		
		return UsersFiltrados;
	}
	
}
