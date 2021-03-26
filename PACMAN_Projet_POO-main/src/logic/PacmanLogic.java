package logic;

/**
 * @author Nicolas BLANCHARD, Alan PERRON , Simon PROVOT
 *  
 * @inv score >= 0
 * 
 * @inv Pacman.allInstances() -> forAll(p | p.nb_lives <= 0) implies (Game.allInstances() -> forAll(g | g.game_over = true))
 */
public interface PacmanLogic extends CharacterLogic {

	/**
	 * Update the score of the pacman
	 * @param new_score new_score represents the number of points to add to the score of Pacman
	 * 
	 * @pre new_score >= 0
	 * @post self.score = new_score + old self.score
	 */
	public void updateScore(int new_score);
	
	
	/**
	 * 
	 * @return The score of Pacman
	 * 
	 * @post result = self.score
	 */
	public int getScore();
	
	public void loseLife();
	
	public int getNbLife();
}
