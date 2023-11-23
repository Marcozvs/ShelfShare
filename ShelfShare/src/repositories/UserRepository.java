package repositories;

import java.util.HashSet;

import models.entities.UserModel;

public class UserRepository {
    private HashSet<UserModel> users;
	
	public UserRepository() {
		this.users = new HashSet<UserModel>();
    }

    public boolean addUserModel(UserModel user) {	
		return this.users.add(user);
	}
	
	public boolean removeUserModel(UserModel user) {
		return this.users.remove(user);
	}
	
	public HashSet<UserModel> getUsers(){
		return new HashSet<UserModel>(this.users);
	}
}
