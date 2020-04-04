package test;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import question.A874WalkingRobotSimulation;
import solution.A874;

public class A874Test {
	private A874WalkingRobotSimulation sol = new A874();

	@Test
	public void testNoObstacle() {
		int[] commands = { 4, -1, 3 };
		int[][] obstacles = { {} };
		assertEquals(25, sol.robotSim(commands, obstacles));
	}

	@Test
	public void testWithObstacles() {
		int[] commands = { 4, -1, 4, -2, 4 };
		int[][] obstacles = { { 2, 4 } };
		assertEquals(65, sol.robotSim(commands, obstacles));
	}
}
