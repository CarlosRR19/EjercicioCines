package utilidad;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashSet;
import java.util.Iterator;

import cine.Pelicula;

public class ReadPelicula {

	private static final String FICHERO = "C:\\Users\\rrcar\\Desktop\\Datos\\peliculas.txt";

	public static HashSet<Pelicula> getDatos() {
		BufferedReader ficheroEntrada;
		HashSet<Pelicula> peliculas = new HashSet<Pelicula>();
		
		try {
			ficheroEntrada = new BufferedReader(new FileReader(FICHERO));

			String titulo = ficheroEntrada.readLine();

			while (titulo != null) {
				String director = ficheroEntrada.readLine();
				String year = ficheroEntrada.readLine();
				String codigo = ficheroEntrada.readLine();
				String[] codigos = codigo.split("\\*");
				
				peliculas.add(new Pelicula(titulo, director, Integer.parseInt(year), codigos));

				titulo = ficheroEntrada.readLine();
			}
		} catch (IOException e) {
			System.out.println("Problemas: " + e.getMessage());
		} catch (Exception e) {
			// Otro fallos
			e.printStackTrace();
		}
		
		return peliculas;
	}
}
