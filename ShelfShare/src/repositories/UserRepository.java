package repositories;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.HashSet;

import models.entities.UserModel;

public class UserRepository {
    private Connection connection;

    public UserRepository() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            String url = "jdbc:mysql://localhost:3306/SHELFSHARE";
            String user = "root";
            String password = "";
            connection = DriverManager.getConnection(url, user, password);

        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }
    }

    public boolean addUserModel(UserModel user) {
        try {
            String query = "INSERT INTO USUARIO (Id, Nome, Idade, Sexo, Senha, Usuario, TiposFavoritos) VALUES (?, ?, ?, ?, ?, ?, ?)";
            try (PreparedStatement preparedStatement = connection.prepareStatement(query)) {
                preparedStatement.setString(1, user.getId().toString());
                preparedStatement.setString(2, user.getName());
                preparedStatement.setInt(3, user.getAge());
                preparedStatement.setString(4, user.getGender());
                preparedStatement.setString(5, user.getPassword());
                preparedStatement.setString(6, user.getUsername());
                preparedStatement.setString(7, user.getBookFavType());

                int rowsAffected = preparedStatement.executeUpdate();
                return rowsAffected > 0;
            }
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }

    // public boolean removeUserModel(int id) {
    //     try {
    //         String query = "DELETE FROM USUARIO WHERE Id = ?";
    //         try (PreparedStatement preparedStatement = connection.prepareStatement(query)) {
    //             preparedStatement.setInt(1, id);

    //             int rowsAffected = preparedStatement.executeUpdate();
    //             return rowsAffected > 0;
    //         }
    //     } catch (SQLException e) {
    //         e.printStackTrace();
    //         return false;
    //     }
    // }

    public HashSet<UserModel> getUsers() {
        HashSet<UserModel> users = new HashSet<>();
        try {
            String query = "SELECT * FROM USUARIO";
            try (PreparedStatement preparedStatement = connection.prepareStatement(query)) {
                ResultSet resultSet = preparedStatement.executeQuery();
                while (resultSet.next()) {
                    UserModel user = new UserModel(
                            resultSet.getString("Nome"),
                            resultSet.getInt("Idade"),
                            resultSet.getString("Sexo"),
                            resultSet.getString("TipoUsuario"),
                            resultSet.getString("Senha"),
                            resultSet.getString("Usuario"),
                            resultSet.getString("TiposFavoritos")
                    );
                    users.add(user);
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return users;
    }
}