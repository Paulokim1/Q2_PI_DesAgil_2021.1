package br.insper.edu.desagil.pi;

import java.util.HashMap;
import java.util.Map;

public class Video {
	private int id;
	private Usuario usuario;
	private Produto produto;
	private Map<Usuario, Integer> avaliacoes;
	
	public Video(int id, Usuario usuario, Produto produto) {
		this.id = id;
		this.usuario = usuario;
		this.produto = produto;
		this.avaliacoes = new HashMap<>();
	}
	
	public void adicionaAvaliacao(Usuario usuario, int avaliacao) {
		if (this.usuario.getNome() != usuario.getNome() & avaliacao >= 1 & avaliacao <= 5) {
			this.avaliacoes.put(usuario, avaliacao);
		}
	}
	
	public int mediaAvaliacoes() {
		double s = 0;
		for (Usuario usuario : this.avaliacoes.keySet()) {
			s += (double) this.avaliacoes.get(usuario);	
		}
		if (this.avaliacoes.size() == 0) {
			return 0;
		}
		double media = s/this.avaliacoes.size();
		int mediaFinal = (int) Math.round(media);
		return mediaFinal;
	}

}
