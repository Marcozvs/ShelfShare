package repositories;

import java.util.HashSet;

import models.entities.UsuarioModelo;

public class UsuarioRepositorio {
    private HashSet<UsuarioModelo> usuarios;
	
	public UsuarioRepositorio() {
		this.usuarios = new HashSet<UsuarioModelo>();
    }

    public boolean addUsuarioModelo(UsuarioModelo usuario) {	
		return this.usuarios.add(usuario);
	}
	
	public boolean removeUsuarioModelo(UsuarioModelo usuario) {
		return this.usuarios.remove(usuario);
	}
	
	public HashSet<UsuarioModelo> getUsuarios(){
		return new HashSet<UsuarioModelo>(this.usuarios);
	}
}
