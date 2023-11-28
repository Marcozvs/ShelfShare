package models.interfaces;

import java.util.UUID;

import models.enums.UserTypeEnum;

public interface IUser {
    UUID getId();

    void setId(UUID id);

    String getName();

    void setName(String name);

    int getAge();

    void setAge(int age);

    String getGender();

    void setGender(String gender);

    UserTypeEnum getUserType();

    void setUserType(UserTypeEnum userType);

    String getPassword();

    void setPassword(String password);

    String getUsername();

    void setUsername(String user);

    String getBookFavType();

    void setBookFavType(String bookFavType);
}
