package repositories;

import java.util.HashSet;

import models.entities.LivroModelo;

public class LivroRepositorio {
    private HashSet<LivroModelo> livros;
	
	public LivroRepositorio() {
		this.livros = new HashSet<LivroModelo>();
    }

    public boolean addLivroModelo(LivroModelo livro) {	
		return this.livros.add(livro);
	}
	
	public boolean removeLivroModelo(LivroModelo livro) {
		return this.livros.remove(livro);
	}
	
	public HashSet<LivroModelo> getLivros(){
		return new HashSet<LivroModelo>(this.livros);
	}
}
