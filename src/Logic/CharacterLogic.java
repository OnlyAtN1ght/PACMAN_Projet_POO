package Logic;

/**
 * @author Nicolas BLANCHARD, Alan PERRON , Simon PROVOT
 */

public interface CharacterLogic extends EntityLogic {
	/**
	 * @param dx Relative deplacement of the character on the X axis
	 * @param dy Relative deplacement of the character on the Y axis
	 * 
	 * @pre (dx = 1 and dy = 0) or (dx = 0 and dy = 1) or (dx = 0 and dy = -1) or (dx = -1 and dy = 0)
	 * @pre Wall.allInstances() -> select(self.x + dx = x and self.y + dy = y) -> isEmpty
	 * @post self.x = old self.x + dx 
	 * @post self.y = old self.y + dy
	 */
	public void move(int dx, int dy);
}
