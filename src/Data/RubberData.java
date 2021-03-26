package data;

/**
 * RubberData allows to represent a rubber entity which defines it.
 * @author Nicolas BLANCHARD, Alan PERRON , Simon PROVOT
 */

public interface RubberData extends EntityData {
	
	/**
	 * Return the score of a rubber
	 * @return the score of a rubber
	 * @post result = self.score
	 */
	public int getScore();
	
	/**
	 * Return the statement of a rubber (eaten or not)
	 * @return the statement of a rubber
	 * @post result = self.isEaten
	 */
	public boolean getIsEaten();
}
