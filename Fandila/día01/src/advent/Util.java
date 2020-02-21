package advent;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class Util {
	
	/***
	 * Metodo encargado de leer los inputs
	 * almacenados en la carpeta inputs.
	 * @param fileName nombre del archivo que se quiere leer.
	 * @return
	 * @throws IOException
	 */
	public static String readInputFile(String fileName) throws IOException {
				
		File file = new File(Util.class.getResource("inputs/" + fileName).getPath());
		System.out.println(file.getAbsolutePath());
		return new String(Files.readAllBytes(Paths.get(file.getAbsolutePath())));
		
	}
	
	public static char[] stringToCharArray(String text) {
		
		char[] chars = new char[text.length()];
		
		for (int i = 0; i < text.length(); i++) {
			chars[i] = text.charAt(i);
		}
		
		return chars;
	}
}
