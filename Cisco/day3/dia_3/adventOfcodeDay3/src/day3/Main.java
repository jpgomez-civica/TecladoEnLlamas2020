package day3;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.HashSet;
import java.util.Set;

public class Main {

	public static void main(String[] args) {

		String path = "src/day3/input.txt";
		File file = new File(path);

		Set<Position> positionSet = new HashSet<Position>();
		Position position = new Position(0, 0);
		positionSet.add(position);

		try {
			BufferedReader br = new BufferedReader(new FileReader(file));
			int c = 0;

			while ((c = br.read()) != -1) {
				char instruction = (char) c;
				position = Main.move(position, instruction);
				positionSet.add(position);
			}

		} catch (Exception e) {
			System.out.println(e);
		}
		System.out.println("Soution 1-->Santa has visited:" + positionSet.size() + " houses");

		Set<Position> positionSetSanta = new HashSet<Position>();
		Set<Position> positionSetRoboSanta = new HashSet<Position>();
		Set<Position> positionSetMerged = new HashSet<Position>();
		Position initialSantaPosition = new Position(0, 0);
		Position initialRoboSantaPosition = new Position(0, 0);
		positionSetSanta.add(initialSantaPosition);
		positionSetRoboSanta.add(initialRoboSantaPosition);

		int numberOfmoves = 0;
		try {
			BufferedReader br = new BufferedReader(new FileReader(file));
			int c = 0;
			while ((c = br.read()) != -1) {
				numberOfmoves++;
				char instruction = (char) c;

				if (numberOfmoves % 2 != 0) {// santa
					initialSantaPosition = Main.move(initialSantaPosition, instruction);
					positionSetSanta.add(initialSantaPosition);
				} else {// Robo-Santa
					initialRoboSantaPosition = Main.move(initialRoboSantaPosition, instruction);
					positionSetRoboSanta.add(initialRoboSantaPosition);
				}
			}

		} catch (Exception e) {
			System.out.println(e);
		}
		positionSetMerged.addAll(positionSetSanta);
		positionSetMerged.addAll(positionSetRoboSanta);

		System.out.println("Soution 2-->Santa and Robo-Santa have visited:" + positionSetMerged.size() + " houses");

	}

	public static Position move(Position actualPosition, char direction) {
		int actualYcoordenate = actualPosition.getyCoordenate();
		int actualXcoordenate = actualPosition.getxCoordenate();
		switch (direction) {
		case Constants.NORTH:
			actualYcoordenate += 1;
			break;
		case Constants.EAST:
			actualXcoordenate += 1;
			break;
		case Constants.SOUTH:
			actualYcoordenate -= 1;
			break;
		case Constants.WEST:
			actualXcoordenate -= 1;
			break;

		}

		return new Position(actualXcoordenate, actualYcoordenate);
	}

}
