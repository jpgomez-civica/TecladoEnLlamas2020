package advent.adv_1;

import java.io.IOException;

import advent.Util;

public class Main {

	public static void main(String[] args) throws IOException {
				
		String file = Util.readInputFile("1.txt");
		char[] chars = Util.stringToCharArray(file);
		int floor = 0;
		
		for (int i = 0; i < chars.length; i++) {
			if (chars[i] == '(') {
				floor++;
			} else {
				floor--;
			}
			
			if (floor == -1) {
				System.out.println(i + 1);
			}
		}
		
		System.out.println(floor);
		
	}

}
