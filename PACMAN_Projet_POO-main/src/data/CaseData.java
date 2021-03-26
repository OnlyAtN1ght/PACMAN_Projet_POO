package data;

/**
 * @author Nicolas BLANCHARD, Alan PERRON , Simon PROVOT
 * 
 * @inv Case.allInstances() -> forAll (c | c.entities -> forAll(e | e.x = c.x and e.y = c.y))
 */

public interface CaseData {
	/**
	 * Return the value of X resp. the grid.
	 * @return x value
	 * @post result = self.x
	 */
	public int getX();
	
	/**
	 * Return the value of Y resp. the grid.
	 * @return y value
	 * @post result = self.y
	 */
	public int getY();
}
