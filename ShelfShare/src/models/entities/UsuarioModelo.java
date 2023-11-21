package models.entities;

import models.enums.TipoLivroEnum;
import models.enums.TipoUsuarioEnum;

import models.interfaces.IUsuario;

public class UsuarioModelo implements IUsuario{
    private int id;
    private String nome;
    private int idade;
    private char sexo;
    private TipoUsuarioEnum tipoUsuario;
    private String senha;
    private String Usuario;
    private TipoLivroEnum tiposFavLivros;

    public UsuarioModelo(int id, String nome, int idade, char sexo, TipoUsuarioEnum tipoUsuario,
                   String senha, String Usuario, TipoLivroEnum tiposFavLivros) {
        this.id = id;
        this.nome = nome;
        this.idade = idade;
        this.sexo = sexo;
        this.tipoUsuario = tipoUsuario;
        this.senha = senha;
        this.Usuario = Usuario;
        this.tiposFavLivros = tiposFavLivros;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public char getSexo() {
        return sexo;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

    public TipoUsuarioEnum getTipoUsuario() {
        return tipoUsuario;
    }

    public void setTipoUsuario(TipoUsuarioEnum tipoUsuario) {
        this.tipoUsuario = tipoUsuario;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getUsuario() {
        return Usuario;
    }

    public void setUsuario(String Usuario) {
        this.Usuario = Usuario;
    }

    public TipoLivroEnum getTiposFavLivros() {
        return tiposFavLivros;
    }

    public void setTiposFavLivros(TipoLivroEnum tiposFavLivros) {
        this.tiposFavLivros = tiposFavLivros;
    }
}
