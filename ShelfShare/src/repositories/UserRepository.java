package repositories;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import models.interfaces.IUser;

public class UserRepository {
    private Connection connection;

    public UserRepository() {
        this.connection = createConnection();
    }

    private Connection createConnection() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            String url = "jdbc:mysql://localhost:3306/SHELFSHARE";
            String user = "root";
            String password = "";
            return DriverManager.getConnection(url, user, password);
        } catch (ClassNotFoundException | SQLException e) {
            throw new RuntimeException("Falha ao criar conexão com o banco de dados", e);
        }
    }

    public boolean getUser(String username, String password) {
        String query = "SELECT * FROM USUARIO WHERE Usuario = ? AND Senha = ?";
        try (PreparedStatement preparedStatement = connection.prepareStatement(query)) {
            preparedStatement.setString(1, username);
            preparedStatement.setString(2, password);

            try (ResultSet resultSet = preparedStatement.executeQuery()) {
                return resultSet.next();
            }
        } catch (SQLException e) {
            throw new RuntimeException("Erro ao obter usuário", e);
        }
    }

    public boolean addUser(IUser user) {
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
        } catch (SQLException e) {
            throw new RuntimeException("Erro ao adicionar usuário", e);
        }
    }
}
