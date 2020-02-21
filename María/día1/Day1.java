import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Scanner;

public class Day1 {
	public static void main(String[] args) throws IOException {
		String up = "(", down = ")";
		Integer floor = 0;
		Integer positionCharacter = 0;
		String[] instructions = Files.readString(Paths.get("input.txt")).split("");

		Boolean isFirstTimeInBasement = true;
		for (String instruction : instructions) {
			Boolean isBasement = floor < 0;
			positionCharacter++;
			if (instruction.equals(up)) {
				floor++;
			} else if (instruction.equals(down)) {
				floor--;
			}
			if (isBasement && isFirstTimeInBasement) {
				System.out.println("Personaje sótano " + (positionCharacter));
				isFirstTimeInBasement = false;
			}
		}
		System.out.println("Posición final " + floor);
	}
}