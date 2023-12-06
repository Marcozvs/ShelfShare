
package shelfshare.Services;

import java.util.List;
import java.util.UUID;
import shelfshare.Models.Entities.UserModel;
import shelfshare.Repositories.UserRepository;

public class UserService {
    private final UserRepository userRepository;

    public UserService() {
        this.userRepository = new UserRepository();
    }

    public boolean login(String username, String password) {
        return userRepository.login(username, password);
    }
    
    public UserModel getUser(String username, String password) {
        return userRepository.getUser(username, password);
    }
    
    public UserModel getUserById(UUID userId) {
        return userRepository.getUserById(userId);
    }
    
    public boolean createUser(UserModel userModel) {
        return userRepository.addUser(userModel);
    }
    
    public boolean updateUser(UUID userId, UserModel updatedUser) {
        return userRepository.updateUser(userId, updatedUser);
    }
    
    public boolean deleteUser(UUID userId) {
        return userRepository.deleteUser(userId);
    }
    
    public List<UserModel> getUsers() {
        return userRepository.getUsers();
    }
}
