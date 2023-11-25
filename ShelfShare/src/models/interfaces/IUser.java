package models.interfaces;

public interface IUser {
    int getId();

    void setId(int id);

    String getName();

    void setName(String name);

    int getAge();

    void setAge(int age);

    String getGenere();

    void setGenere(String genere);

    String getUserType();

    void setUserType(String userType);

    String getPassword();

    void setPassword(String password);

    String getUser();

    void setUser(String user);

    String getBookFavType();

    void setBookFavType(String bookFavType);
}
