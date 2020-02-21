package day1;

import java.util.HashMap;
import java.util.Map;

public class Utils {
	
	
	/**
	 * @param patron
	 * @param stopAtfloor
	 * @return map(key=Position of the character,value is the floor at this position)
	 */
	public static Map<Integer,Integer>  calcFloor(String patron,Integer stopAtfloor) {
		Map<Integer,Integer> floorMap=new HashMap<Integer,Integer>();
		int floor=0;
		int characterPosition=0;
		for(char instruction : patron.toCharArray()) {
			characterPosition++;
			if(instruction=='(') {
				floor+=1;
			}else {
				floor-=1;
			}
			if(stopAtfloor!=null && floor==stopAtfloor) {
				break;
			}
			
		}
		 floorMap.put(characterPosition,floor);
		 return floorMap;
	}
}
