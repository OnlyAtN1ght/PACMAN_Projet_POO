package Logic;

/**
 * @author Nicolas BLANCHARD, Alan PERRON , Simon PROVOT
 */

public interface GameLogic {
	public void setHighScore(int new_high_score);
	
	/**
	 * 
	 * @return The high score 
	 * 
	 * @post result = self.high_score
	 */
	public int getHighScore();
}
