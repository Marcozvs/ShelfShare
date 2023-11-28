package repositories;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import models.entities.LivroModelo;
import models.enums.TipoLivroEnum;

public class LivroRepositorio {

	private Connection connection;

	public LivroRepositorio() {
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

	public boolean cadastrarLivro(LivroModelo livro) {
		try {
			String query = "INSERT INTO LIVRO (Autor, Tipo, Titulo, NotaMedia) VALUES (?, ?, ?, ?)";
			try (PreparedStatement preparedStatement = connection.prepareStatement(query)) {
				preparedStatement.setString(1, livro.getAutor());
				preparedStatement.setInt(2, livro.getTipo().ordinal());
				preparedStatement.setString(3, livro.getTitulo());
				preparedStatement.setFloat(4, livro.getNotaMedia());

				int rowsAffected = preparedStatement.executeUpdate();
				return rowsAffected > 0;
			}
		} catch (SQLException e) {
			e.printStackTrace();
			return false;
		}
	}

	public boolean removerLivro(LivroModelo livro) {
		try {
			String query = "DELETE FROM LIVRO WHERE Id = ?";
			try (PreparedStatement preparedStatement = connection.prepareStatement(query)) {
				preparedStatement.setInt(1, livro.getId());
				int rowsAffected = preparedStatement.executeUpdate();
				return rowsAffected > 0;
			}
		} catch (SQLException e) {
			e.printStackTrace();
			return false;
		}
	}

	public List<LivroModelo> visualizarLivros() {
		List<LivroModelo> livros = new ArrayList<>();
		try {
			String query = "SELECT * FROM LIVRO";
			try (PreparedStatement preparedStatement = connection.prepareStatement(query)) {
				try (ResultSet resultSet = preparedStatement.executeQuery()) {
					while (resultSet.next()) {
						LivroModelo livro = new LivroModelo();
						livro.setId(resultSet.getInt("Id"));
						livro.setAutor(resultSet.getString("Autor"));
						livro.setTipo(TipoLivroEnum.valueOf(resultSet.getString("Tipo")));
						livro.setTitulo(resultSet.getString("Titulo"));
						livro.setNotaMedia(resultSet.getFloat("NotaMedia"));
						livros.add(livro);
					}
				}
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return livros;
	}

}
