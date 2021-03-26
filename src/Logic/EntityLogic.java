package Logic;

/**
 * @author Nicolas BLANCHARD, Alan PERRON , Simon PROVOT
 */

public interface EntityLogic{
	/**
	 * @return The coordinate on the X axis of the Entity 
	 * 
	 * @post result = self.x
	 */
	public int getX();
	
	/**
	 * @return The coordinate on the Y axis of the Entity 
	 * 
	 * @post result = self.y
	 */
	public int getY();
	
	/**
	 * @param new_x The new coordinates of the entity on the X axis
	 * 
	 * @pre (new_x >= 0) and (new_x < 15)
	 */
	public void setX(int new_x);
	
	
	/**
	 * @param new_y The new coordinates of the entity on the Y axis
	 * 
	 * @pre (new_y >= 0) and (new_y < 15)
	 */
	public void setY(int new_y);
	
}
