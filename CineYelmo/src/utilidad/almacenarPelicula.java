package utilidad;

import java.util.HashSet;

import java.util.Iterator;

import cine.Cine;
import cine.Pelicula;

public class almacenarPelicula {

	public static HashSet<Cine> almacenar(HashSet<Cine> cines) {
		
		Iterator it = cines.iterator();
		
		while(it.hasNext()) {
			Cine cine = (Cine) it.next();
		
			HashSet<Pelicula> peliculas = ReadPelicula.getDatos();
			Iterator<Pelicula> pe = peliculas.iterator();
			
			while(pe.hasNext()) {
				Pelicula peli = (Pelicula) pe.next();
				String[] array = peli.getCodigos();
				
				for(int i = 0; i < array.length; i++) {
					if(array[i].equalsIgnoreCase(cine.getId()))
						cine.getPeliculas().add(peli);
				}
			}
		}
		
		return cines;
	}
	
	
	
	
	/*
	public static HashSet<Cine> almacenar(Iterator it) {
		Iterator ci = cines.iterator();
		
		while(ci.hasNext()) {
			Cine cine = (Cine) ci.next();
			
			HashSet<Pelicula> peliculas = ReadPelicula.getDatos();
			Iterator pe = peliculas.iterator();
			
			while(pe.hasNext()) {
				Pelicula peli = (Pelicula) pe.next();
				String[] array = peli.getCodigos();
				
				for(int i = 0; i < array.length; i++) {
					if(array[i].equalsIgnoreCase(cine.getId()))
						cine.getPeliculas().add(peli);
				}
			}
		}
		
		return cines;
	}
	*/
	
	
	
	
	
	/* public static void almacenarPelicula(HashSet<Cine> cines) {
		HashSet<Pelicula> peliculas = ReadPelicula.getDatos();

		Iterator it = peliculas.iterator();
		
		while(it.hasNext()) {
			Pelicula peli = (Pelicula) it.next();
			String[] array = peli.getCodigos();
			for(int i = 0; i < peli.getCodigos().length; i++) {
				if(cines.contains(array[i])) {
					
				}
			}
		}
		
	} */
}
