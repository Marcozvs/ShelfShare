package models.entities;

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
}
