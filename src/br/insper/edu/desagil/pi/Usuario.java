package br.insper.edu.desagil.pi;

import java.util.ArrayList;
import java.util.List;

public class Usuario {
	private String nome;
	private List<Video> videos;
	
	public Usuario(String nome) {
		this.nome = nome;
		this.videos = new ArrayList<>();
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public List<Video> getVideos() {
		return videos;
	}

	public void setVideos(List<Video> videos) {
		this.videos = videos;
	}
	
	public void postaVideo(int id, Produto produto) {
		Video video = new Video(id, this, produto);
		this.videos.add(video);
	}
	
	public int totalAvaliacoes() {
		int s = 0;
		
		for (Video video : this.videos) {
			s += video.mediaAvaliacoes();
		}
		return s;
		
	}
	
	
	
	
	
	

}
