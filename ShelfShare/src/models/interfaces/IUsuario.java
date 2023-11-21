package models.interfaces;

import models.enums.TipoLivroEnum;
import models.enums.TipoUsuarioEnum;

public interface IUsuario {
    int getId();

    void setId(int id);

    String getNome();

    void setNome(String nome);

    int getIdade();

    void setIdade(int idade);

    char getSexo();

    void setSexo(char sexo);

    TipoUsuarioEnum getTipoUsuario();

    void setTipoUsuario(TipoUsuarioEnum tipoUsuario);

    String getSenha();

    void setSenha(String senha);

    String getUsuario();

    void setUsuario(String usuario);

    TipoLivroEnum getTiposFavLivros();

    void setTiposFavLivros(TipoLivroEnum tiposFavLivros);
}
