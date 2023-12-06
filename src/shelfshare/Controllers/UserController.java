
package shelfshare.Controllers;

import java.util.List;
import java.util.UUID;
import shelfshare.Models.Entities.UserModel;
import shelfshare.Models.Interfaces.IUser;
import shelfshare.Services.UserService;

public class UserController {
    

    private final UserService userService;

    private static IUser currentUser;

    public UserController() {
        this.userService = new UserService();
    }

    public boolean login(String username, String password) {
        return userService.login(username, password);
    }
    
    public UserModel getUser(String username, String password) {
        return userService.getUser(username, password);
    }
    
    public UserModel getUserById(UUID userId) {
        return userService.getUserById(userId);
    }
    
    public boolean createUser(UserModel userModel) {
        return userService.createUser(userModel);
    }
    
    public boolean updateUser(UUID userId, UserModel updatedUser) {
        return userService.updateUser(userId, updatedUser);
    }
    
    public boolean deleteUser(UUID userId) {
        return userService.deleteUser(userId);
    }
    
    public List<UserModel> getUsers() {
        return userService.getUsers();
    }
}
