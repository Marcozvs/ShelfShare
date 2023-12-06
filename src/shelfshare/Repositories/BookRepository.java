package shelfshare.Repositories;

import shelfshare.Models.Entities.BookModel;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import shelfshare.Models.Entities.BookModel;
import shelfshare.Models.Enums.TypeFavBookEnum;

public class BookRepository {

    private Connection connection;

    public BookRepository() {
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
    
    public BookModel getBookById(UUID bookId) {
        String query = "SELECT * FROM LIVRO WHERE Id=?";

        try (PreparedStatement preparedStatement = connection.prepareStatement(query)) {
            preparedStatement.setString(1, bookId.toString());

            ResultSet resultSet = preparedStatement.executeQuery();

            if (resultSet.next()) {
                String author = resultSet.getString("Autor");
                int typeValue = resultSet.getInt("Tipo");
                String title = resultSet.getString("Titulo");
                float averageScore = resultSet.getFloat("NotaMedia");
                TypeFavBookEnum typeBook = TypeFavBookEnum.fromValue(typeValue);

                return new BookModel(bookId, title, author, averageScore, typeBook);
            } else {
                return null;
            }
        } catch (SQLException e) {
            throw new RuntimeException("Erro ao obter livro por ID", e);
        }
    }

    public boolean addBook(BookModel book) {
        String query = "INSERT INTO LIVRO (Id, Autor, Tipo, Titulo, NotaMedia) VALUES (?, ?, ?, ?, ?)";
        try (PreparedStatement preparedStatement = connection.prepareStatement(query)) {
            UUID uuid = UUID.randomUUID();

            preparedStatement.setString(1, uuid.toString());
            preparedStatement.setString(2, book.getAuthor());
            preparedStatement.setInt(3, book.getTypeBook().getValue());
            preparedStatement.setString(4, book.getTitle());
            preparedStatement.setFloat(5, book.getAverageScore());

            int rowsAffected = preparedStatement.executeUpdate();
            return rowsAffected > 0;
        } catch (SQLException e) {
            throw new RuntimeException("Erro ao adicionar livro", e);
        }
    }
    
    public List<BookModel> getAllBooks() {
        List<BookModel> books = new ArrayList<>();
        String query = "SELECT * FROM LIVRO";

        try (PreparedStatement preparedStatement = connection.prepareStatement(query)) {
            ResultSet resultSet = preparedStatement.executeQuery();

            while (resultSet.next()) {
                UUID id = UUID.fromString(resultSet.getString("Id"));
                String author = resultSet.getString("Autor");
                int typeValue = resultSet.getInt("Tipo");
                String title = resultSet.getString("Titulo");
                float averageScore = resultSet.getFloat("NotaMedia");
                TypeFavBookEnum typeBook = TypeFavBookEnum.fromValue(typeValue);

                BookModel book = new BookModel(id, title, author, averageScore, typeBook);
                books.add(book);
            }
        } catch (SQLException e) {
            throw new RuntimeException("Erro ao obter todos os livros", e);
        }

        return books;
    }

    public boolean updateBook(BookModel book) {
        String query = "UPDATE LIVRO SET Autor=?, Tipo=?, Titulo=?, NotaMedia=? WHERE Id=?";
        try (PreparedStatement preparedStatement = connection.prepareStatement(query)) {
            preparedStatement.setString(1, book.getAuthor());
            preparedStatement.setInt(2, book.getTypeBook().getValue());
            preparedStatement.setString(3, book.getTitle());
            preparedStatement.setFloat(4, book.getAverageScore());
            preparedStatement.setString(5, book.getId().toString());

            int rowsAffected = preparedStatement.executeUpdate();
            return rowsAffected > 0;
        } catch (SQLException e) {
            throw new RuntimeException("Erro ao atualizar livro", e);
        }
    }

    public boolean removeBook(UUID bookId) {
        String query = "DELETE FROM LIVRO WHERE Id=?";
        try (PreparedStatement preparedStatement = connection.prepareStatement(query)) {
            preparedStatement.setString(1, bookId.toString());

            int rowsAffected = preparedStatement.executeUpdate();
            return rowsAffected > 0;
        } catch (SQLException e) {
            throw new RuntimeException("Erro ao remover livro", e);
        }
    }


}
