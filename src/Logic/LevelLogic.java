package Logic;

/**
 * @author Nicolas BLANCHARD, Alan PERRON , Simon PROVOT
 *
 */

public interface LevelLogic {
	/**
	 * 
	 * @return The number of rubbers not eaten in the level
	 * 
	 * @post result = self.number_rubbers
	 */
	public int getNbRubber();
	
	/**
	 * 
	 * @return The ID of the level
	 * 
	 * @post result = self.id
	 */
	public int getID();
	
	/**
	 * 
	 * @param new_nb_rubber The new number of rubber not eaten in the level
	 * 
	 * @pre new_nb_rubber >= 0
	 * @post self.number_rubbers = new_nb_rubber
	 */
	public void setNbRubber(int new_nb_rubber);
}
