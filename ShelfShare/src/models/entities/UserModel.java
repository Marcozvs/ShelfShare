package models.entities;

import models.interfaces.IUser;

public class UserModel implements IUser {
    private static int nextId = 1;

    private int id;
    private String name;
    private int age;
    private String genere;
    private String userType;
    private String password;
    private String user;
    private String bookFavType;

    public UserModel(String name, int age, String genere, String userType,
                   String password, String user, String bookFavType) {
        this.id = nextId++;
        this.name = name;
        this.age = age;
        this.genere = genere;
        this.userType = userType;
        this.password = password;
        this.user = user;
        this.bookFavType = bookFavType;
    }

    public UserModel() {
        this.id = nextId++;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
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

    public String getGenere() {
        return genere;
    }

    public void setGenere(String genere) {
        this.genere = genere;
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

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getBookFavType() {
        return bookFavType;
    }

    public void setBookFavType(String bookFavType) {
        this.bookFavType = bookFavType;
    }
}
