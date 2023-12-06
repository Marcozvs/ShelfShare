package shelfshare.Repositories;

import shelfshare.Models.Entities.AssessmentModel;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.UUID;
import java.sql.ResultSet;

public class AssessmentRepository {

    private Connection connection;

    public AssessmentRepository() {
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

    public boolean addAssessment(AssessmentModel assessment) {
        String query = "INSERT INTO AVALIACAO (Id, IdUsuario, IdLivro, Notalivro) VALUES (?, ?, ?, ?)";
        try (PreparedStatement preparedStatement = connection.prepareStatement(query)) {
            UUID uuid = UUID.randomUUID();

            preparedStatement.setString(1, uuid.toString());
            preparedStatement.setString(2, assessment.getUserId().toString());
            preparedStatement.setString(3, assessment.getBookId().toString());
            preparedStatement.setFloat(4, assessment.getBookRating());

            int rowsAffected = preparedStatement.executeUpdate();
            return rowsAffected > 0;
        } catch (SQLException e) {
            throw new RuntimeException("Erro ao adicionar avaliação", e);
        }
    }
    
    public float getMediaReviewBook(UUID idLivro) {
        String query = "SELECT AVG(Notalivro) AS MediaAvaliacao FROM AVALIACAO WHERE IdLivro = ?";
        try (PreparedStatement preparedStatement = connection.prepareStatement(query)) {
            preparedStatement.setString(1, idLivro.toString());

            try (ResultSet resultSet = preparedStatement.executeQuery()) {
                if (resultSet.next()) {
                    return resultSet.getFloat("MediaAvaliacao");
                }
            }
        } catch (SQLException e) {
            throw new RuntimeException("Erro ao obter a média de avaliações para o livro", e);
        }
        return 0.0f;
    }
}
