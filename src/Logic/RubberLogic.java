package Logic;

/**
 * @author Nicolas BLANCHARD, Alan PERRON , Simon PROVOT
 */

public interface RubberLogic extends EntityLogic {
	public int getScore();
	
	public boolean getIsEaten();
	
	public void setIsEaten(boolean new_IsEaten);
}
