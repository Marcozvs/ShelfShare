package repositories;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.sql.Statement;

import models.entities.LivroModelo;
import models.enums.TipoLivroEnum;

public class BookRepositorio {

	private Connection connection;

	public BookRepositorio() {
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

	public LivroModelo cadastrarLivro(LivroModelo livro) {
		try {
			String query = "INSERT INTO LIVRO (Autor, Tipo, Titulo, NotaMedia) VALUES (?, ?, ?, ?)";
			try (PreparedStatement preparedStatement = connection.prepareStatement(query,
					Statement.RETURN_GENERATED_KEYS)) {
				preparedStatement.setString(1, livro.getAutor());
				preparedStatement.setInt(2, livro.getTipo().ordinal());
				preparedStatement.setString(3, livro.getTitulo());
				preparedStatement.setFloat(4, livro.getNota());

				int rowsAffected = preparedStatement.executeUpdate();

				if (rowsAffected > 0) {
					try (ResultSet generatedKeys = preparedStatement.getGeneratedKeys()) {
						if (generatedKeys.next()) {
							int generatedId = generatedKeys.getInt(1);
							livro.setId(generatedId);
						} else {
							throw new SQLException("Falha ao obter o ID gerado.");
						}
					}
				}

				return livro;

			}
		} catch (SQLException e) {
			e.printStackTrace();
			return null;
		}
	}

	public boolean updateLivro(LivroModelo livro) {
		try {
			String query = "UPDATE LIVRO SET Autor = ?, Tipo = ?, Titulo = ?, NotaMedia = ? WHERE Id = ?";
			try (PreparedStatement preparedStatement = connection.prepareStatement(query)) {
				preparedStatement.setString(1, livro.getAutor());
				preparedStatement.setInt(2, livro.getTipo().ordinal());
				preparedStatement.setString(3, livro.getTitulo());
				preparedStatement.setFloat(4, livro.getNotaMedia());
				preparedStatement.setInt(5, livro.getId()); // Supondo que Id seja a chave primária

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
						livro.setTipo(parseLivroTypeEnum(resultSet.getString("Tipo")));
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

	public LivroModelo getLivro(int IdLivro) {
		LivroModelo livro = new LivroModelo();
		try {
			String query = "SELECT * FROM LIVRO Where Id = ?";
			try (PreparedStatement preparedStatement = connection.prepareStatement(query)) {
				preparedStatement.setInt(1, IdLivro);
				try (ResultSet resultSet = preparedStatement.executeQuery()) {
					while (resultSet.next()) {
						livro.setId(resultSet.getInt("Id"));
						livro.setAutor(resultSet.getString("Autor"));
						livro.setTipo(parseLivroTypeEnum(resultSet.getString("Tipo")));
						livro.setTitulo(resultSet.getString("Titulo"));
						livro.setNotaMedia(resultSet.getFloat("NotaMedia"));
					}
				}
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return livro;
	}

	public boolean existeLivro(LivroModelo livro) {
		boolean exist = false;
		try {
			String query = "SELECT * FROM LIVRO Where Autor = ? And Tipo =? And Titulo = ?";
			try (PreparedStatement preparedStatement = connection.prepareStatement(query)) {
				preparedStatement.setString(1, livro.getAutor());
				preparedStatement.setInt(2, parseLivroTypeToInt(livro.getTipo()));
				preparedStatement.setString(3, livro.getTitulo());
				try (ResultSet resultSet = preparedStatement.executeQuery()) {
					while (resultSet.next()) {
						exist = true;
					}
				}
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return exist;
	}

	public int getIdLivro(LivroModelo livro) {
		int Id = 0;
		try {
			String query = "SELECT * FROM LIVRO Where Autor = ? And Tipo =? And Titulo = ?";
			try (PreparedStatement preparedStatement = connection.prepareStatement(query)) {
				preparedStatement.setString(1, livro.getAutor());
				preparedStatement.setInt(2, parseLivroTypeToInt(livro.getTipo()));
				preparedStatement.setString(3, livro.getTitulo());
				try (ResultSet resultSet = preparedStatement.executeQuery()) {
					while (resultSet.next()) {
						Id = resultSet.getInt("Id");
					}
				}
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return Id;
	}

	private TipoLivroEnum parseLivroTypeEnum(String livroTypeString) {

		switch (livroTypeString) {
			case "0":
				return TipoLivroEnum.ROMANCE;
			case "1":
				return TipoLivroEnum.TECNICO;
			case "2":
				return TipoLivroEnum.DRAMA;
			default:
				throw new IllegalArgumentException("Valor desconhecido para TipoLivroEnum: ");
		}
	}

	private int parseLivroTypeToInt(TipoLivroEnum type) {
		switch (type) {
			case ROMANCE:
				return 0;
			case TECNICO:
				return 1;
			case DRAMA:
				return 2;
			default:
				throw new IllegalArgumentException("Valor desconhecido para TipoLivroEnum: ");
		}
	}

}
