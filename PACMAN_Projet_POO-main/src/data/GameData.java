package data;

/**
 *  GameData allows to represent a Game class used to initialize the game objects.
 * @author Nicolas BLANCHARD, Alan PERRON , Simon PROVOT
 */

public interface GameData {
	
	/**
	 * Return the high score of the e-sport player.
	 * @return The high score 
	 * @post result = self.high_score
	 */
	public int getHighScore();
}
