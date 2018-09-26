package question;

/**
 * <p>
 * A robot on an infinite grid starts at point (0, 0) and faces north. The robot
 * can receive one of three possible types of commands:
 * </p>
 * 
 * <p>
 * -2: turn left 90 degrees<br>
 * -1: turn right 90 degrees<br>
 * 1 <= x <= 9: move forward x units
 * </p>
 * 
 * <p>
 * Some of the grid squares are obstacles.
 * </p>
 * <p>
 * The i-th obstacle is at grid point (obstacles[i][0], obstacles[i][1])
 * </p>
 * <p>
 * If the robot would try to move onto them, the robot stays on the previous
 * grid square instead (but still continues following the rest of the route.)
 * </p>
 * <p>
 * Return the square of the maximum Euclidean distance that the robot will be
 * from the origin.
 * </p>
 *
 */
public interface A874WalkingRobotSimulation {
	public int robotSim(int[] commands, int[][] obstacles);
}
