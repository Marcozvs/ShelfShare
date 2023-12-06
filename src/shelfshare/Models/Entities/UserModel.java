
package shelfshare.Models.Entities;

import shelfshare.Models.Enums.TypeFavBookEnum;
import shelfshare.Models.Enums.UserTypeEnum;

import java.util.UUID;

public class UserModel {
    

    private UUID id;
    private String name;
    private int age;
    private char gender;
    private UserTypeEnum userType;
    private String password;
    private String username;
    private TypeFavBookEnum bookFavType;

    public UserModel(UUID id, String name, int age, char gender, UserTypeEnum userType,
                     String password, String username, TypeFavBookEnum bookFavType) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.userType = userType;
        this.password = password;
        this.username = username;
        this.bookFavType = bookFavType;
    }

    public UserModel() {}
    
    public UUID getId() {
        return id;
    }
    
    public void setId(UUID id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public UserTypeEnum getUserType() {
        return userType;
    }

    public void setUserType(UserTypeEnum userType) {
        this.userType = userType;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }
    
    public TypeFavBookEnum getBookFavType() {
        return bookFavType;
    }

    public void setBookFavType(TypeFavBookEnum bookFavType) {
        this.bookFavType = bookFavType;
    }
}
