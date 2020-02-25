package Dia2;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class Ejercicio2 {

	public static void main(String[] args) throws IOException {
		File fichero = new File("input.txt");
		int a = Leer(fichero);
		System.out.println("El total es " + a);
	}

	private static int Leer(File fichero) throws IOException {
		FileReader fich = new FileReader(fichero);
		BufferedReader br = new BufferedReader(fich);
		String linea;
		int cuenta = 0;
		int cinta = 0;
		int l, w, h, menor, menor1 = 0;
		if (fichero.exists()) {
			while ((linea = br.readLine()) != null) {
				String[] trozos = linea.split("x");
				l = Integer.valueOf(trozos[0]);
				w = Integer.valueOf(trozos[1]);
				h = Integer.valueOf(trozos[2]);
				menor = l < w ? l : w;
				menor = menor < h ? menor : h;
				if (menor == l)
					menor1 = w < h ? w : h;
				else if (menor == w)
					menor1 = l < h ? l : h;
				else
					menor1 = l < w ? l : w;

				cinta = ((menor * 2) + (menor1 * 2)) + (l * w * h);
				cuenta = cuenta + cinta;
			}
			fich.close();
		} else {
			System.out.println("El fichero no existe " + fichero.getAbsolutePath());
		}
		return cuenta;
	}
}