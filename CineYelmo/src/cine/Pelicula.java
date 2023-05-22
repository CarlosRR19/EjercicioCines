package cine;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;

public class Pelicula {

	private String titulo;
	private String director;
	private int year;
	private String[] codigos;
	
	public Pelicula(String titulo, String director, int year, String[] codigos) {
		this.titulo = titulo;
		this.director = director;
		this.year = year;
		this.codigos = codigos;
	}

	
	
	public String[] getCodigos() {
		return codigos;
	}



	public String getTitulo() {
		return titulo;
	}



	@Override
	public String toString() {
		return titulo;
	}
	
}
