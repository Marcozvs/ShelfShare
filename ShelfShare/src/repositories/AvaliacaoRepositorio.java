package repositories;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import models.entities.AvaliacaoModelo;

public class AvaliacaoRepositorio {
	private Connection connection;

	public AvaliacaoRepositorio() {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			String url = "jdbc:mysql://localhost:3306/shelfshare";
			String user = "root";
			String password = "";
			connection = DriverManager.getConnection(url, user, password);
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
	}

	public boolean cadastrarAvaliacao(AvaliacaoModelo avaliacaoModelo) {
		try {
			String query = "INSERT INTO avaliacao ( IdUsuario, IdLivro, NotaLivro) VALUES ( ?, ?, ?)";
			try (PreparedStatement preparedStatement = connection.prepareStatement(query)) {
				preparedStatement.setString(1, avaliacaoModelo.getIdUsuario().toString());
				preparedStatement.setInt(2, avaliacaoModelo.getIdLivro());
				preparedStatement.setDouble(3, avaliacaoModelo.getNotaLivro());

				int rowsAffected = preparedStatement.executeUpdate();
				return rowsAffected > 0;
			}
		} catch (SQLException e) {
			e.printStackTrace();
			return false;
		}
	}

	public List<AvaliacaoModelo> getAvaliacoesLivro(int IdLivro) {
		List<AvaliacaoModelo> avaliacaoModelos = new ArrayList<>();
		try {
			String query = "SELECT * FROM avaliacao Where IdLivro = ?";
			try (PreparedStatement preparedStatement = connection.prepareStatement(query)) {
				preparedStatement.setInt(1, IdLivro);
				try (ResultSet resultSet = preparedStatement.executeQuery()) {
					while (resultSet.next()) {
						AvaliacaoModelo avaliacao = new AvaliacaoModelo();
						avaliacao.setId(resultSet.getInt("Id"));
						avaliacao.setIdUsuario(UUID.fromString(resultSet.getString("IdUsuario")));
						avaliacao.setIdLivro(resultSet.getInt("IdLivro"));
						avaliacao.setNotaLivro(resultSet.getFloat("NotaLivro"));
						avaliacaoModelos.add(avaliacao);
					}
				}
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return avaliacaoModelos;
	}

	/*
	 * public boolean removerLivro(AvaliacaoModelo avaliacaoModelo) {
	 * try {
	 * String query = "DELETE FROM Avalicacao WHERE Id = ?";
	 * try (PreparedStatement preparedStatement =
	 * connection.prepareStatement(query)) {
	 * preparedStatement.setInt(1, avaliacaoModelo.getId());
	 * int rowsAffected = preparedStatement.executeUpdate();
	 * return rowsAffected > 0;
	 * }
	 * } catch (SQLException e) {
	 * e.printStackTrace();
	 * return false;
	 * }
	 * }
	 * 
	 * public List<LivroModelo> visualizarLivros() {
	 * List<LivroModelo> livros = new ArrayList<>();
	 * try {
	 * String query = "SELECT * FROM LIVRO";
	 * try (PreparedStatement preparedStatement =
	 * connection.prepareStatement(query)) {
	 * try (ResultSet resultSet = preparedStatement.executeQuery()) {
	 * while (resultSet.next()) {
	 * LivroModelo livro = new LivroModelo();
	 * livro.setId(resultSet.getInt("Id"));
	 * livro.setAutor(resultSet.getString("Autor"));
	 * livro.setTipo(parseLivroTypeEnum(resultSet.getString("Tipo")));
	 * livro.setTitulo(resultSet.getString("Titulo"));
	 * livro.setNotaMedia(resultSet.getFloat("NotaMedia"));
	 * livros.add(livro);
	 * }
	 * }
	 * }
	 * } catch (SQLException e) {
	 * e.printStackTrace();
	 * }
	 * return livros;
	 * }
	 */
}
