package models.interfaces;

import java.util.UUID;

public interface IUser {
    UUID getId();

    void setId(UUID id);

    String getName();

    void setName(String name);

    int getAge();

    void setAge(int age);

    String getGender();

    void setGender(String gender);

    String getUserType();

    void setUserType(String userType);

    String getPassword();

    void setPassword(String password);

    String getUsername();

    void setUsername(String user);

    String getBookFavType();

    void setBookFavType(String bookFavType);
}
