package solution;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import question.A874WalkingRobotSimulation;

public class A874 implements A874WalkingRobotSimulation {

	@Override
	public int robotSim(int[] commands, int[][] obstacles) {
		int direction = 0;
		int maximum = 0;

		int x = 0, y = 0;

		Map<Integer, List<Integer>> obstaclesPerRow = new HashMap<>();
		Map<Integer, List<Integer>> obstaclesPerColumn = new HashMap<>();

		if (obstacles.length > 0) {
			obstaclesPerRow = Arrays.stream(obstacles).collect(Collectors.groupingBy(obstacle -> obstacle[0],
					Collectors.mapping(obstacle -> obstacle[1], Collectors.toList())));
			obstaclesPerColumn = Arrays.stream(obstacles).collect(Collectors.groupingBy(obstacle -> obstacle[1],
					Collectors.mapping(obstacle -> obstacle[0], Collectors.toList())));
		}

		for (int command : commands) {
			int move = 0;
			if (command == -1) {
				direction = (direction + 1) % 4;
				continue;
			} else if (command == -2) {
				direction = (direction + 3) % 4;
				continue;
			} else if (command >= 1 && command <= 9) {
				move = command;
			} else {
				throw new IllegalArgumentException("Command not supported.");
			}

			int prevPos = 0, newPos = 0;
			switch (direction) {
			case 0:
				prevPos = Math.abs(y);
				y += move;
				newPos = Math.abs(y);
				break;
			case 1:
				prevPos = Math.abs(x);
				x += move;
				newPos = Math.abs(x);
				break;
			case 2:
				prevPos = Math.abs(y);
				y -= move;
				newPos = Math.abs(y);
				break;
			case 3:
				prevPos = Math.abs(x);
				x -= move;
				newPos = Math.abs(x);
				break;
			default:
				throw new IllegalArgumentException("Direction not supported.");
			}

			if (newPos - prevPos > 0) {
				maximum = Math.max(maximum, x * x + y * y);
			}
		}

		return maximum;
	}

}
