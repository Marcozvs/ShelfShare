package models.interfaces;

import models.enums.TipoLivroEnum;
import models.enums.UserTypeEnum;

public interface IUser {
    int getId();

    void setId(int id);

    String getName();

    void setName(String name);

    int getAge();

    void setAge(int age);

    char getGenere();

    void setGenere(char genere);

    UserTypeEnum getUserType();

    void setUserType(UserTypeEnum userType);

    String getPassword();

    void setPassword(String password);

    String getUser();

    void setUser(String user);

    TipoLivroEnum getBookFavType();

    void setBookFavType(TipoLivroEnum bookFavType);
}
