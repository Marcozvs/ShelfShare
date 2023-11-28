package services;

import java.util.ArrayList;
import java.util.Comparator;
//import java.util.HashSet;
import java.util.List;

import models.entities.LivroModelo;
import models.interfaces.ILivro;
import repositories.LivroRepositorio;

public class LivroService {


    public LivroRepositorio livroRepositorio;
    
    public LivroService() {
        this.livroRepositorio = new LivroRepositorio();
    }


    public boolean cadastrarLivro(LivroModelo livro) {
        return livroRepositorio.cadastrarLivro(livro);
    }

    public boolean removerLivro(LivroModelo livro) {
        return livroRepositorio.removerLivro(livro);
    }

    public List<LivroModelo> visualizarLivros() {
        return livroRepositorio.visualizarLivros();
    }



     public List<ILivro> getAllLivrosOrdenados() {
        List<ILivro> livrosFiltrados = new ArrayList<>(livroRepositorio.visualizarLivros());

        livrosFiltrados.sort(Comparator.comparingDouble(ILivro::getNotaMedia).reversed());

        return livrosFiltrados;
    }

	
}
