package models.entities;

import models.enums.TipoLivroEnum;
import models.enums.UserTypeEnum;
import models.interfaces.IUser;

public class UserModel implements IUser {
    public int id;
    private String name;
    private int age;
    private char genere;
    private UserTypeEnum userType;
    private String password;
    private String user;
    private TipoLivroEnum bookFavType;

    public void User(int id, String name, int age, char genere, UserTypeEnum userType,
                   String password, String user, TipoLivroEnum bookFavType) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.genere = genere;
        this.userType = userType;
        this.password = password;
        this.user = user;
        this.bookFavType = bookFavType;
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

    public char getGenere() {
        return genere;
    }

    public void setGenere(char genere) {
        this.genere = genere;
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

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public TipoLivroEnum getBookFavType() {
        return bookFavType;
    }

    public void setBookFavType(TipoLivroEnum bookFavType) {
        this.bookFavType = bookFavType;
    }
}
