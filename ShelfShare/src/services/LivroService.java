package services;

import java.util.ArrayList;
//import java.util.HashSet;
import java.util.List;

import models.entities.LivroModelo;
import models.interfaces.ILivro;
import repositories.LivroRepositorio;

public class LivroService {


    public LivroRepositorio livro;
    
    public LivroService() {
        this.livro = new LivroRepositorio();
    }


    public boolean createLivro(int id, String titulo, String autor, float nota, float notaMedia){
        LivroModelo book = new LivroModelo();
        book.Livro(id, titulo, autor, nota, notaMedia);
        return this.livro.addLivroModelo(book);
	}


    public List<ILivro> GetAllLivrosOrdenados(){
		List<ILivro> livrosFiltrados = new ArrayList<ILivro>(
				this.livro.getLivros() );
		
		livrosFiltrados.sort((o1, o2) -> {
				return  Float.compare(o1.getNotaMedia(), o2.getNotaMedia()) ;
		});
		
		return livrosFiltrados;
	}
	
}
