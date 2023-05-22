package utilidad;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashSet;
import java.util.Iterator;

import cine.Cine;

public class ReadCine {

	private static final String FICHERO = "C:\\Users\\rrcar\\Desktop\\Datos\\cines.txt";

	public static HashSet<Cine> getDatos() {
		BufferedReader ficheroEntrada;
		HashSet<Cine> cines = new HashSet<Cine>();
		try {
			ficheroEntrada = new BufferedReader(new FileReader(FICHERO));

			String id = ficheroEntrada.readLine();

			while (id != null) {
				String nombre = ficheroEntrada.readLine();
				String numSalas = ficheroEntrada.readLine();
				String localidad = ficheroEntrada.readLine();

				cines.add(new Cine(id, nombre, Integer.parseInt(numSalas), localidad));
				id = ficheroEntrada.readLine();

			}
		} catch (IOException e) {
			System.out.println("Problemas: " + e.getMessage());
		} catch (Exception e) {
			// Otro fallos
			e.printStackTrace();
		}
		
		return cines;
	} 
}
