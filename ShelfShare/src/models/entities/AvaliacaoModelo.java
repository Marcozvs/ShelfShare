package models.entities;

import models.interfaces.IAvaliacao;

public class AvaliacaoModelo implements IAvaliacao {
    private int id;
    private int idUsuario;
    private int idLivro;
    private float notaLivro;

    public void Avaliacao(int id, int idUsuario, int idLivro, float notaLivro) {
        this.id = id;
        this.idUsuario = idUsuario;
        this.idLivro = idLivro;
        this.notaLivro = notaLivro;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(int idUsuario) {
        this.idUsuario = idUsuario;
    }

    public int getIdLivro() {
        return idLivro;
    }

    public void setIdLivro(int idLivro) {
        this.idLivro = idLivro;
    }

    public float getNotaLivro() {
        return notaLivro;
    }

    public void setNotaLivro(float notaLivro) {
        this.notaLivro = notaLivro;
    }
}