package services;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

import models.entities.AvaliacaoModelo;
import models.entities.LivroModelo;
import models.interfaces.ILivro;
import repositories.BookRepositorio;

public class BookService {

    public BookRepositorio livroRepositorio;

    public BookService() {
        this.livroRepositorio = new BookRepositorio();
    }

    public LivroModelo cadastrarLivro(LivroModelo livro) {
        return livroRepositorio.cadastrarLivro(livro);
    }

    public boolean removerLivro(LivroModelo livro) {
        return livroRepositorio.removerLivro(livro);
    }

    public List<LivroModelo> visualizarLivros() {
        return livroRepositorio.visualizarLivros();
    }

    public boolean existeLivro(LivroModelo livro) {
        return livroRepositorio.existeLivro(livro);
    }

    public int getIdLivro(LivroModelo livro) {
        return livroRepositorio.getIdLivro(livro);
    }

    public LivroModelo getLivro(int IdLivro) {
        return livroRepositorio.getLivro(IdLivro);
    }

    public List<ILivro> getAllLivrosOrdenados() {
        List<ILivro> livrosFiltrados = new ArrayList<>(livroRepositorio.visualizarLivros());

        livrosFiltrados.sort(Comparator.comparingDouble(ILivro::getNotaMedia).reversed());

        return livrosFiltrados;
    }

    public boolean updateLivro(LivroModelo livro) {
        return livroRepositorio.updateLivro(livro);
    }

    public float calcularNotaMedia(LivroModelo livro) {

        AvaliacaoService avaliacaoService = new AvaliacaoService();

        List<AvaliacaoModelo> lstAvaliacaoModelos = avaliacaoService.getAvaliacoesLivro(livro.getId());

        if (lstAvaliacaoModelos.isEmpty()) {
            return 0;
        }

        float newMedia = 0;

        for (var avaliacao : lstAvaliacaoModelos) {
            newMedia += avaliacao.getNotaLivro();
        }
        return newMedia / lstAvaliacaoModelos.size();
    }

}
