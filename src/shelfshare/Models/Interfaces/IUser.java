
package shelfshare.Models.Interfaces;

import java.util.UUID;

import shelfshare.Models.Enums.TypeFavBookEnum;
import shelfshare.Models.Enums.UserTypeEnum;

public interface IUser {
    
    UUID getId();
    void setId(UUID id);

    String getName();
    void setName(String name);

    int getAge();
    void setAge(int age);

    char getGender();
    void setGender(char gender);

    UserTypeEnum getUserType();
    void setUserType(UserTypeEnum userType);

    String getPassword();
    void setPassword(String password);

    String getUsername();
    void setUsername(String username);

    TypeFavBookEnum getBookFavType();
    void setBookFavType(TypeFavBookEnum bookFavType);
}
