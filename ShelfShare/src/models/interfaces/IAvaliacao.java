package models.interfaces;

public interface IAvaliacao {
    int getId();

    void setId(int id);

    int getIdUsuario();

    void setIdUsuario(int idUsuario);

    int getIdLivro();

    void setIdLivro(int idLivro);

    float getNotaLivro();

    void setNotaLivro(float notaLivro);
}
