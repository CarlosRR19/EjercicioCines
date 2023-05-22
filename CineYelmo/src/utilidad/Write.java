package utilidad;

import java.io.FileWriter;
import java.io.IOException;
import java.util.HashSet;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Map;

import cine.Cine;

public class Write {

	public static void save() {
		
		
		HashSet<Cine> cines = almacenarPelicula.almacenar(ReadCine.getDatos());
		Iterator<Cine> it = cines.iterator();
		
		try {
			
			FileWriter file = new FileWriter("C:\\Users\\rrcar\\Desktop\\Datos\\ResultadoCines.txt");

			while (it.hasNext()) {
				Cine cine = (Cine) it.next();

				file.write("[Nombre: " + cine.getNombre() + "] [Localidad: " + cine.getLocalidad() + "] Peliculas: "
						+ cine.getPeliculas() + "\n");
			}

			/*
			 * 
			 * for (Map.Entry<String, Producto> entry : stock.entrySet()) { String key =
			 * entry.getKey(); Producto producto = stock.get(key);
			 * 
			 * file.write(producto.toString() + "\n"); }
			 */

			file.close(); // Se debe de cerrar el fichero
		} catch (IOException e) {
// TODO Auto-generated catch block
			e.printStackTrace();

		}

	}
}
