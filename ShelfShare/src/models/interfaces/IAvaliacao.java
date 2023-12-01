package models.interfaces;

import java.util.UUID;

public interface IAvaliacao {
    int getId();

    void setId(int id);

    UUID getIdUsuario();

    void setIdUsuario(UUID idUsuario);

    int getIdLivro();

    void setIdLivro(int idLivro);

    float getNotaLivro();

    void setNotaLivro(float notaLivro);
}
