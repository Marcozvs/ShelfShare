package models.entities;

import java.util.UUID;

import models.interfaces.IAvaliacao;

public class AvaliacaoModelo implements IAvaliacao {
    private int id;
    private UUID idUsuario;
    private int idLivro;
    private float notaLivro;

    public AvaliacaoModelo(UUID idUsuario, int idLivro, float notaLivro) {
        this.idUsuario = idUsuario;
        this.idLivro = idLivro;
        this.notaLivro = notaLivro;
    }

    public AvaliacaoModelo() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public UUID getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(UUID idUsuario) {
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