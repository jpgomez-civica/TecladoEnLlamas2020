package Dia1;

import java.io.*;

public class Ejercicio1 {

	public static void main(String[] args) throws IOException{
		File fichero = new File("fichero.txt");
		int a = Leer(fichero);
		System.out.println("El Floor es "+a);
	}
	

	private static int Leer(File fichero) throws IOException {
		FileReader fich = new FileReader(fichero);
		int caract = 0;
		int piso = 0;
		if (fichero.exists()) {
			while (caract != -1) {
				caract = fich.read();
				if (((char) caract) == '(') {
					piso++;
				} else if (((char) caract) == ')') {
					piso--;
				}
			}
			fich.close();
		} else {
			System.out.println("El fichero no existe " + fichero.getAbsolutePath());
		}
		return piso;
	}
}
