package adventOfCodeDay2;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;



public class Main {

	public static void main(String[] args) {

		String path = "src/input.txt";
		File file = new File(path);
		int totalPaperNeeded=0;
		int totalribbonNeeded=0;
		try {
			BufferedReader br = new BufferedReader(new FileReader(file));
			String st;
			while ((st = br.readLine()) != null) {			
				String[] splitArray = st.split("x");		
				Present present = new Present(Integer.parseInt(splitArray[0]),Integer.parseInt(splitArray[1]),Integer.parseInt(splitArray[2]));
				totalPaperNeeded+=present.getTotalPaperNeded();
				totalribbonNeeded+=present.ribbonNeeded();
			}

			/*Present present = new Present(1,1,10);
			totalPaperNeeded+=present.getTotalPaperNeded();
			totalribbonNeeded+=present.ribbonNeeded();*/
		} catch (Exception e) {
			System.out.println(e);
		}
		System.out.println("Total paper needed: " + totalPaperNeeded);
		System.out.println("Total ribbon needed: " +totalribbonNeeded);
	}
}
