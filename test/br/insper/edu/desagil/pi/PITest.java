package br.insper.edu.desagil.pi;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class PITest {
	
	@Test
	void test1() {
		Usuario usuario = new Usuario("Paulo");
		Produto produto = new Produto("Coxinha", 12.50);
		Video video = new Video(1, usuario, produto);
		
		Usuario usuario2 = new Usuario("Marcelo");
		Usuario usuario3 = new Usuario("Rodrigo");
		
		video.adicionaAvaliacao(usuario2, 0);
		video.adicionaAvaliacao(usuario3, 6);
		
		assertEquals(0, video.mediaAvaliacoes());
	
	}
	
	@Test
	void test2() {
		Usuario usuario = new Usuario("Paulo");
		Produto produto = new Produto("Coxinha", 12.50);
		Video video = new Video(1, usuario, produto);
		
		Usuario usuario2 = new Usuario("Marcelo");
		
		video.adicionaAvaliacao(usuario2, 3);
		
		assertEquals(3, video.mediaAvaliacoes());
			
	}
	
	@Test
	void test3() {
		Usuario usuario = new Usuario("Paulo");
		Produto produto = new Produto("Coxinha", 12.50);
		Video video = new Video(1, usuario, produto);
		
		Usuario usuario2 = new Usuario("Marcelo");
		Usuario usuario3 = new Usuario("Rodrigo");
		
		video.adicionaAvaliacao(usuario2, 2);
		video.adicionaAvaliacao(usuario3, 3);
		
		assertEquals(3, video.mediaAvaliacoes());
			
	}
	
	@Test
	void test4() {
		Usuario usuario = new Usuario("Paulo");
		Produto produto = new Produto("Coxinha", 12.50);
		Video video = new Video(1, usuario, produto);
		
		Usuario usuario2 = new Usuario("Marcelo");
		Usuario usuario3 = new Usuario("Rodrigo");
		Usuario usuario4 = new Usuario("Raphael");
		
		video.adicionaAvaliacao(usuario2, 2);
		video.adicionaAvaliacao(usuario3, 3);
		video.adicionaAvaliacao(usuario4, 3);
		
		assertEquals(3, video.mediaAvaliacoes());
			
	}
	
	@Test
	void test5() {
		Usuario usuario = new Usuario("Paulo");
		
		Produto produto1 = new Produto("Coxinha", 12.50);
		Video video1 = new Video(1, usuario, produto1);
		
		Produto produto2 = new Produto("Esfiha", 10.50);
		Video video2 = new Video(1, usuario, produto2);
		
		Usuario usuario2 = new Usuario("Marcelo");
		Usuario usuario3 = new Usuario("Rodrigo");
		Usuario usuario4 = new Usuario("Raphael");
		
		video1.adicionaAvaliacao(usuario2, 2);
		video1.adicionaAvaliacao(usuario3, 3);
		video2.adicionaAvaliacao(usuario4, 3);
		
		assertEquals(3, video1.mediaAvaliacoes());
		assertEquals(3, video2.mediaAvaliacoes());
	}
	
	
	

}
