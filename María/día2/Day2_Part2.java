package day2;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;

public class Day2_Part2 {

	public static void main(String[] args) throws IOException {
		Integer width = 0, height = 1 , large = 2;
		List<String> dimensions = Files.readAllLines(Paths.get("input-2.txt"));
		Integer total = 0;
		
		for(String dimension : dimensions) {
			int[] size = Arrays.stream(dimension.split("x"))
							.mapToInt(Integer::parseInt)
							.sorted().toArray();
			total += size[width] * size[large] * size[height];
			
			total += 2 * (size[width] + size[height]);		

		}
		
		System.out.println("Total: " + total);
	}

}
