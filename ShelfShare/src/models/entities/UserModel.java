package models.entities;

import java.util.UUID;

import models.interfaces.IUser;

public class UserModel implements IUser {

    private UUID id;
    private String name;
    private int age;
    private String gender;
    private String userType;
    private String password;
    private String username;
    private String bookFavType;

    public UserModel(String name, int age, String gender, String userType,
                   String password, String username, String bookFavType) {
        this.id = UUID.randomUUID();
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.userType = userType;
        this.password = password;
        this.username = username;
        this.bookFavType = bookFavType;
    }

    public UserModel(String name, int age, String gender,
                   String password, String username, String bookFavType) {
        this.id = UUID.randomUUID();
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.password = password;
        this.username = username;
        this.bookFavType = bookFavType;
    }
    

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

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getUserType() {
        return userType;
    }

    public void setUserType(String userType) {
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

    public String getBookFavType() {
        return bookFavType;
    }

    public void setBookFavType(String bookFavType) {
        this.bookFavType = bookFavType;
    }
}
