package services;

import models.enums.TipoLivroEnum;
import models.enums.TipoUsuarioEnum;
import models.interfaces.IUsuario;
import repositories.UsuarioRepositorio;

import java.util.ArrayList;
import java.util.List;

import models.entities.UsuarioModelo;

public class UsuarioService {

    public UsuarioRepositorio usuario;
    
    public UsuarioService() {
        this.usuario = new UsuarioRepositorio();
    }

    public boolean createUsuario(int id, String nome, int idade, char sexo, TipoUsuarioEnum tipoUsuario, String senha, String Usuario, TipoLivroEnum tiposFavLivros){
        UsuarioModelo user = new UsuarioModelo();
        user.Usuario(id,nome,idade,sexo,tipoUsuario, senha, Usuario,tiposFavLivros);
        return this.usuario.addUsuarioModelo(user);
	}

    public List<IUsuario> GetAllUsuarios(){

        List<IUsuario> usuariosFiltrados = new ArrayList<IUsuario>(
				this.usuario.getUsuarios() );
		
		return usuariosFiltrados;
	}
	
}
