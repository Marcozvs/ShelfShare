package models.interfaces;

import models.enums.TipoLivroEnum;

public interface ILivro {
    int getId();

    void setId(int id);

    String getTitulo();

    void setTitulo(String titulo);

    String getAutor();

    void setAutor(String autor);

    float getNota();

    void setNota(float nota);

    float getNotaMedia();

    void setNotaMedia(float notaMedia);

    TipoLivroEnum getTipo();

    void setTipo(TipoLivroEnum tipo);
}
