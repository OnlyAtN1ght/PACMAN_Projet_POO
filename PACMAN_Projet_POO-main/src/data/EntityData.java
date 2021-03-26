package data;

/**
 * EntityData allows to represent an Entity used to initialize the game objects.
 * @author Nicolas BLANCHARD, Alan PERRON , Simon PROVOT
 */

public interface EntityData{
	/**
	 * Return the coordinate on the X axis of the EntityData
	 * @return The coordinate on the X axis of the EntityData 
	 * @post result = self.x
	 */
	public int getX();
	
	/**
	 * Return the coordinate on the Y axis of the EntityData
	 * @return The coordinate on the Y axis of the EntityData 
	 * @post result = self.y
	 */
	public int getY();
	
}
