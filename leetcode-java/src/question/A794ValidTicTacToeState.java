package question;

/**
 * <p>
 * A Tic-Tac-Toe board is given as a string array board. Return True if and only
 * if it is possible to reach this board position during the course of a valid
 * tic-tac-toe game.
 * </p>
 * <p>
 * The board is a 3 x 3 array, and consists of characters " ", "X", and "O". The
 * " " character represents an empty square.
 * </p>
 *
 * <p>
 * Here are the rules of Tic-Tac-Toe:
 * </p>
 * 
 * <ul>
 * <li>Players take turns placing characters into empty squares (" ").</li>
 * <li>The first player always places "X" characters, while the second player
 * always places "O" characters.</li>
 * <li>"X" and "O" characters are always placed into empty squares, never filled
 * ones.</li>
 * <li>The game ends when there are 3 of the same (non-empty) character filling
 * any row, column, or diagonal.</li>
 * <li>The game also ends if all squares are non-empty.</li>
 * <li>No more moves can be played if the game is over.</li>
 * </ul>
 * 
 * <p>
 * Example 1:
 * </p>
 * <p>
 * Input: board = ["O ", " ", " "]<br>
 * Output: false<br>
 * Explanation: The first player always plays "X".
 * </p>
 * 
 * <p>
 * Example 2:
 * </p>
 * <p>
 * Input: board = ["XOX", " X ", " "]<br>
 * Output: false<br>
 * Explanation:Players take turns making moves.
 * </p>
 * 
 * <p>
 * Example 3:
 * </p>
 * <p>
 * Input: board = ["XXX", " ", "OOO"]<br>
 * Output: false
 * </p>
 * 
 * <p>
 * Example 4:
 * </p>
 * <p>
 * Input: board = ["XOX", "O O", "XOX"]<br>
 * Output: true
 * </p>
 * 
 * <p>
 * Note:
 * </p>
 * 
 * <p>
 * board is a length-3 array of strings, where each string board[i] has length
 * 3. Each board[i][j] is a character in the set {" ", "X", "O"}.
 * </p>
 */
public interface A794ValidTicTacToeState {
	public boolean validTicTacToe(String[] board);
}
