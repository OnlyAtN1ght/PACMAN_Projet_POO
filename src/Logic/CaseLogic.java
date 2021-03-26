package logic;

/**
 * @author Nicolas BLANCHARD, Alan PERRON , Simon PROVOT
 * 
 * @inv Case.allInstances() -> forAll (c | c.entities -> forAll(e | e.x = c.x and e.y = c.y))
 */

public interface CaseLogic {
	public int getX();
	
	public int getY();
}
