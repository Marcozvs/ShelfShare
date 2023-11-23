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

    public boolean createUser(UserModel user){
        UserModel userModel = new UserModel();
        userModel.User(user.id, user.getName(), user.getAge(), user.getGenere(), user.getUserType(), user.getPassword(), user.getUser(), user.getBookFavType());
        return this.userRepository.addUserModel(userModel);
	}

    public List<IUser> GetAllUsers(){

        List<IUser> UsersFiltrados = new ArrayList<IUser>(
				this.userRepository.getUsers() );
		
		return UsersFiltrados;
	}
	
}
