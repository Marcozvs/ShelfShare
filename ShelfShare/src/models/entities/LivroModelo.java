package models.entities;

import java.util.Objects;

import models.enums.TipoLivroEnum;
import models.interfaces.ILivro;

public class LivroModelo implements ILivro {
    private int id;
    private String titulo;
    private String autor;
    private float nota;
    private float notaMedia;
    private TipoLivroEnum tipo;

    public LivroModelo(int id, String titulo, String autor, float nota, float notaMedia) {
        this.id = id;
        this.titulo = titulo;
        this.autor = autor;
        this.nota = nota;
        this.notaMedia = notaMedia;
    }

    public LivroModelo() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public TipoLivroEnum getTipo() {
        return tipo;
    }

    public void setTipo(TipoLivroEnum tipo) {
        this.tipo = tipo;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public float getNota() {
        return nota;
    }

    public void setNota(float nota) {
        this.nota = nota;
    }

    public float getNotaMedia() {
        return notaMedia;
    }

    public void setNotaMedia(float notaMedia) {
        this.notaMedia = notaMedia;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;
        if (o == null || getClass() != o.getClass())
            return false;
        LivroModelo that = (LivroModelo) o;
        return Float.compare(that.notaMedia, notaMedia) == 0 &&
                Objects.equals(autor, that.autor) &&
                tipo == that.tipo &&
                Objects.equals(titulo, that.titulo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(autor, tipo, titulo, notaMedia);
    }
}
