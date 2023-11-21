package repositories;

import java.util.HashSet;

import models.entities.AvaliacaoModelo;

public class AvaliacaoRepositorio {
    private HashSet<AvaliacaoModelo> avaliacoes;
	
	public AvaliacaoRepositorio() {
		this.avaliacoes = new HashSet<AvaliacaoModelo>();
    }

    public boolean addAvaliacaoModelo(AvaliacaoModelo avaliacao) {	
		return this.avaliacoes.add(avaliacao);
	}
	
	public boolean removeAvaliacaoModelo(AvaliacaoModelo avaliacao) {
		return this.avaliacoes.remove(avaliacao);
	}
	
	public HashSet<AvaliacaoModelo> getAvaliacoes(){
		return new HashSet<AvaliacaoModelo>(this.avaliacoes);
	}
}
