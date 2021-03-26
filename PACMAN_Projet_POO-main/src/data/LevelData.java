package data;

/**
 * LevelData allows to represent a Level from a specific file which defines it.
 * @author Nicolas BLANCHARD, Alan PERRON , Simon PROVOT
 */

public interface LevelData {
	/**
	 * Return The number of rubbers not eaten in the level
	 * @return The number of rubbers not eaten in the level
	 * @post result = self.number_rubbers
	 */
	public int getNbRubber();
	
	/**
	 * Return The ID of the level
	 * @return The ID of the level
	 * @post result = self.id
	 */
	public int getID();
}
