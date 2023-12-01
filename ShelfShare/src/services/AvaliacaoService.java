package services;

import java.util.List;

import models.entities.AvaliacaoModelo;
import repositories.AvaliacaoRepositorio;

public class AvaliacaoService {

    public AvaliacaoRepositorio avaliacaoRepositorio;

    public AvaliacaoService() {
        this.avaliacaoRepositorio = new AvaliacaoRepositorio();
    }

    public boolean cadastrarAvaliacao(AvaliacaoModelo Avaliacao) {
        return avaliacaoRepositorio.cadastrarAvaliacao(Avaliacao);
    }

    public List<AvaliacaoModelo> getAvaliacoesLivro(int IdLivro) {
        return avaliacaoRepositorio.getAvaliacoesLivro(IdLivro);
    }

    /*
     * 
     * public boolean removerAvaliacao(AvaliacaoModelo Avaliacao) {
     * return avaliacaoRepositorio.removeAvaliacao(Avaliacao);
     * }
     * 
     * public List<AvaliacaoModelo> visualizarAvaliacaos() {
     * return avaliacaoRepositorio.visualizarAvaliacaos();
     * }
     * 
     * public List<IAvaliacao> getAllAvaliacaosOrdenados() {
     * List<IAvaliacao> AvaliacaosFiltrados = new
     * ArrayList<>(AvaliacaoRepositorio.visualizarAvaliacaos());
     * 
     * AvaliacaosFiltrados.sort(Comparator.comparingDouble(IAvaliacao::getNotaMedia)
     * .reversed());
     * 
     * return AvaliacaosFiltrados;
     * }
     */

}
