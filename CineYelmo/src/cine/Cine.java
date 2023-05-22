package cine;

import java.util.HashSet;

public class Cine {

	private String id;
	private String nombre;
	private int numSalas;
	private String localidad;
	private HashSet<Pelicula> peliculas;

	public Cine(String id, String nombre, int numSalas, String localidad) {
		this.id = id;
		this.nombre = nombre;
		this.numSalas = numSalas;
		this.localidad = localidad;
		peliculas = new HashSet<Pelicula>();
	}

	public HashSet<Pelicula> getPeliculas() {
		return peliculas;
	}

	public String getId() {
		return id;
	}

	public String getNombre() {
		return nombre;
	}

	public String getLocalidad() {
		return localidad;
	}

	@Override
	public String toString() {
		return "Cine [id=" + id + ", nombre=" + nombre + ", numSalas=" + numSalas + ", localidad=" + localidad
				+ ", peliculas=" + peliculas + "]";
	}

}
