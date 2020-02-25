package Dia2;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class Ejercicio1 {

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
		int l, w, h, menor, area1, area2, area3 = 0;
		if (fichero.exists()) {
			while ((linea = br.readLine()) != null) {
				String[] trozos = linea.split("x");
				l = Integer.valueOf(trozos[0]);
				w = Integer.valueOf(trozos[1]);
				h = Integer.valueOf(trozos[2]);
				area1 = l * w;
				area2 = w * h;
				area3 = h * l;
				menor = area1 < area2 ? area1 : area2;
				menor = menor < area3 ? menor : area3;
				cuenta = cuenta + ((2 * area1) + (2 * area2) + (2 * area3) + menor);
			}
			fich.close();
		} else {
			System.out.println("El fichero no existe " + fichero.getAbsolutePath());
		}
		return cuenta;
	}
}
