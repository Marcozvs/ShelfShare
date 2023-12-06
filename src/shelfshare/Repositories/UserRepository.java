package shelfshare.Repositories;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import shelfshare.Models.Entities.UserModel;
import shelfshare.Models.Enums.TypeFavBookEnum;
import shelfshare.Models.Enums.UserTypeEnum;

public class UserRepository {

    private Connection connection;

    public UserRepository() {
        this.connection = createConnection();
    }

    private Connection createConnection() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            String url = "jdbc:mysql://sql10.freemysqlhosting.net:3306/sql10667639";
            String user = "sql10667639";
            String password = "wV5AJ1L6M7";
            return DriverManager.getConnection(url, user, password);
        } catch (ClassNotFoundException | SQLException e) {
            throw new RuntimeException("Falha ao criar conexão com o banco de dados", e);
        }
    }

    public boolean login(String username, String password) {
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

    public UserModel getUser(String username, String password) {
        String query = "SELECT * FROM USUARIO WHERE Usuario = ? AND Senha = ?";
        try (PreparedStatement preparedStatement = connection.prepareStatement(query)) {
            preparedStatement.setString(1, username);
            preparedStatement.setString(2, password);

            try (ResultSet resultSet = preparedStatement.executeQuery()) {
                if (resultSet.next()) {
                    UserModel user = new UserModel();
                    user.setId(UUID.fromString(resultSet.getString("Id")));
                    user.setName(resultSet.getString("Nome"));
                    user.setAge(resultSet.getInt("Idade"));
                    user.setGender(resultSet.getString("Sexo").charAt(0));

                    int userTypeValue = resultSet.getInt("TipoUsuario");
                    int bookFavTypeValue = resultSet.getInt("TiposFavoritos");

                    user.setUserType(UserTypeEnum.fromValue(userTypeValue));
                    user.setBookFavType(TypeFavBookEnum.fromValue(bookFavTypeValue));
                    user.setPassword(resultSet.getString("Senha"));
                    user.setUsername(resultSet.getString("Usuario"));

                    return user;
                } else {
                    return null;
                }
            }
        } catch (SQLException e) {
            throw new RuntimeException("Erro ao obter usuário", e);
        }
    }


    public boolean addUser(UserModel user) {
        String query = "INSERT INTO USUARIO (Id, Nome, Idade, Sexo, TipoUsuario, Senha, Usuario, TiposFavoritos) VALUES (?, ?, ?, ?, ?, ?, ?, ?)";
        try (PreparedStatement preparedStatement = connection.prepareStatement(query)) {
            UUID uuid = UUID.randomUUID();
            
            preparedStatement.setString(1, uuid.toString());
            preparedStatement.setString(2, user.getName());
            preparedStatement.setInt(3, user.getAge());
            preparedStatement.setString(4, String.valueOf(user.getGender()));
            preparedStatement.setInt(5, user.getUserType().getValue());
            preparedStatement.setString(6, user.getPassword());
            preparedStatement.setString(7, user.getUsername());
            preparedStatement.setInt(8, user.getBookFavType().getValue());

            int rowsAffected = preparedStatement.executeUpdate();
            return rowsAffected > 0;
        } catch (SQLException e) {
            throw new RuntimeException("Erro ao adicionar usuário", e);
        }
    }
    
    public boolean updateUser(UUID userId, UserModel updatedUser) {
        
        String query = "UPDATE USUARIO SET Nome = ?, Idade = ?, Sexo = ?, TipoUsuario = ?, Senha = ?, Usuario = ?, TiposFavoritos = ? WHERE Id = ?";
        try (PreparedStatement preparedStatement = connection.prepareStatement(query)) {
            preparedStatement.setString(1, updatedUser.getName());
            preparedStatement.setInt(2, updatedUser.getAge());
            preparedStatement.setString(3, String.valueOf(updatedUser.getGender()));
            preparedStatement.setInt(4, updatedUser.getUserType().getValue());
            preparedStatement.setString(5, updatedUser.getPassword());
            preparedStatement.setString(6, updatedUser.getUsername());
            preparedStatement.setInt(7, updatedUser.getBookFavType().getValue());
            preparedStatement.setString(8, userId.toString());

            int rowsAffected = preparedStatement.executeUpdate();
            
            return rowsAffected > 0;
        } catch (SQLException e) {
            throw new RuntimeException("Erro ao atualizar usuário", e);
        }
    }

    
    public boolean deleteUser(UUID userId) {
        String query = "DELETE FROM USUARIO WHERE Id = ?";
        try (PreparedStatement preparedStatement = connection.prepareStatement(query)) {
            preparedStatement.setString(1, userId.toString());

            int rowsAffected = preparedStatement.executeUpdate();
            return rowsAffected > 0;
        } catch (SQLException e) {
            throw new RuntimeException("Erro ao excluir usuário", e);
        }
    }
    
    public UserModel getUserById(UUID userId) {
        String query = "SELECT * FROM USUARIO WHERE Id = ?";
        try (PreparedStatement preparedStatement = connection.prepareStatement(query)) {
            preparedStatement.setString(1, userId.toString());

            try (ResultSet resultSet = preparedStatement.executeQuery()) {
                return resultSet.next() ? mapResultSetToUserModel(resultSet) : null;
            }
        } catch (SQLException e) {
            throw new RuntimeException("Erro ao obter usuário por ID", e);
        }
    }



    public List<UserModel> getUsers() {
        String query = "SELECT * FROM USUARIO";
        List<UserModel> userList = new ArrayList<>();

        try (PreparedStatement preparedStatement = connection.prepareStatement(query);
             ResultSet resultSet = preparedStatement.executeQuery()) {

            while (resultSet.next()) {
                UserModel user = mapResultSetToUserModel(resultSet);
                userList.add(user);
            }

        } catch (SQLException e) {
            throw new RuntimeException("Erro ao obter usuários", e);
        }

        return userList;
    }

    private UserModel mapResultSetToUserModel(ResultSet resultSet) throws SQLException {
        UserModel user = new UserModel();
        user.setId(UUID.fromString(resultSet.getString("Id")));
        user.setName(resultSet.getString("Nome"));
        user.setAge(resultSet.getInt("Idade"));
        user.setGender(resultSet.getString("Sexo").charAt(0));
        user.setUserType(mapUserTypeEnum(resultSet.getString("TipoUsuario")));
        user.setPassword(resultSet.getString("Senha"));
        user.setUsername(resultSet.getString("Usuario"));
        user.setBookFavType(mapTypeFavBookEnum(resultSet.getString("TiposFavoritos")));
        return user;
    }

    private UserTypeEnum mapUserTypeEnum(String userType) {
        int userTypeValue = Integer.parseInt(userType);
        return UserTypeEnum.fromValue(userTypeValue);
    }

    private TypeFavBookEnum mapTypeFavBookEnum(String bookTypeFav) {
        int bookTypeFavValue = Integer.parseInt(bookTypeFav);
        return TypeFavBookEnum.fromValue(bookTypeFavValue);
    }
}
