package day2;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;

public class Day2 {

	public static void main(String[] args) throws IOException {
		Integer width = 0, large = 1 , height = 2;
		List<String> dimensions = Files.readAllLines(Paths.get("input-2.txt"));
		Integer total = 0;
		
		for(String dimension : dimensions) {
			int[] size = Arrays.stream(dimension.split("x")).mapToInt(Integer::parseInt).toArray();
			Integer widthLarge = (size[width] * size[large]);
			Integer largeHeight = (size[large] * size[height]);
			Integer widthHeight = (size[width] * size[height]);
			
			total += 2 * (widthLarge+ widthHeight + largeHeight);
			List<Integer> areas = Arrays.asList(widthLarge, largeHeight, widthHeight);
		    total += areas.stream()
		      .mapToInt(area -> area)
		      .min()
		      .orElse(0);
		}
		
		System.out.println("Total: " + total);
	}

}
